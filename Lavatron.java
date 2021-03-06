import java.applet.*;
import java.awt.* ;
import java.io.*;
import java.awt.image.* ;
import java.lang.*;
/*<applet code=Lavatron.class width=1300 height=600>
<param name="img" value="swsm.jpg">
</applet>*/


public class Lavatron extends Applet implements Runnable 
{
int scrollX;
int bulbsW, bulbsH;
int bulbS = 8;
Dimension d;
Image offscreen, bulb, img;
Graphics offgraphics;
int pixels[];
int pixscan;
IntHash clut = new IntHash();
boolean stopFlag;
public void init()
 {
d = getSize();
int offw = (int) Math.ceil(d.width/bulbS) * bulbS;
int offh = (int) Math.ceil(d.height/bulbS) * bulbS;
offscreen = createImage(offw, offh);
offgraphics = offscreen.getGraphics();
bulbsW = offw/bulbS;
bulbsH = offh/bulbS;
bulb = createBulbs(bulbS, bulbsH*bulbS);
try {
img = getImage(getDocumentBase(), getParameter("img"));
MediaTracker t = new MediaTracker(this);
t.addImage(img, 0);
t.waitForID(0);//Thread.sleep(2000);
pixscan = img.getWidth(null);
int h = img.getHeight(null);
pixels = new int[pixscan * h];
PixelGrabber pg = new PixelGrabber(img, 0, 0, pixscan, h,
pixels, 0, pixscan);
pg.grabPixels();
} catch (InterruptedException e) { };
scrollX = 0;
// paint black bulbs on the offscreen image
offgraphics.setColor(Color.black);
offgraphics.fillRect(0, 0, d.width, d.height);
for (int x=0; x<bulbsW; x++)
offgraphics.drawImage(bulb, x*bulbS, 0, null);
}
Image createBulbs(int w, int h) {
int pixels[] = new int[w*h];
int bulbBits[] = {
0,0,1,1,1,1,0,0,
0,1,2,1,1,1,1,0,
1,2,1,1,1,1,1,1,
1,1,1,1,1,1,1,1,
1,1,1,1,1,1,1,1,
1,1,1,1,1,1,1,1,
0,1,1,1,1,1,1,0,
0,0,1,1,1,1,0,0
};
int bulbCLUT[] = { 0xff000000, 0x00c0c0c0, 0xffffffff };
for (int i=0; i<w*h; i++)
pixels[i] = bulbCLUT[bulbBits[i%bulbBits.length]];
return createImage(new MemoryImageSource(w, h, pixels, 0, w));
}
public final Color color(int x, int y) {
int p = pixels[y*pixscan+x];
Color c;
if ((c=(Color)clut.get(p)) == null)
clut.put(p, c = new Color(p));
return c;
}
public void update() {}
public void paint(Graphics g) {
offgraphics.copyArea(bulbS, 0, bulbsW*bulbS-bulbS, d.height,
-bulbS, 0);
for (int y=0; y<bulbsH; y++) {
offgraphics.setColor(color(scrollX, y));
offgraphics.fillRect(d.width-bulbS, y*bulbS, bulbS, bulbS);
}
offgraphics.drawImage(bulb, d.width-bulbS, 0, null);
g.drawImage(offscreen, 0, 0, null);
scrollX = (scrollX + 1) % pixscan;
}
Thread t;
public void run() {
while (true) {
paint(getGraphics());
try{new Thread().yield();}
 catch(IllegalThreadStateException e) { }
if(stopFlag)
break;
try{Thread.sleep(10);}catch(InterruptedException ee){}
}
}
public void start() {
t = new Thread(this);
t.setPriority(Thread.MIN_PRIORITY);
stopFlag = false;
t.start();
}
public void stop() {
stopFlag = true;
}
}




class IntHash {
private int capacity;
private int size;
private float load = 0.7F;
private int keys[];
private Object vals[];
public IntHash(int n) {
capacity = n;
size = 0;
keys = new int[n];
vals = new Object[n];
}
public IntHash() {
this(101);

}
private void rehash() {
int newcapacity = capacity * 2 + 1;
Object newvals[] = new Object[newcapacity];
int newkeys[] = new int[newcapacity];
for (int i = 0; i < capacity; i++) {
Object o = vals[i];
if (o != null) {
int k = keys[i];
int newi = (k & 0x7fffffff) % newcapacity;
while (newvals[newi] != null)
newi = (newi + 1) % newcapacity;
newkeys[newi] = k;
newvals[newi] = o;
}
}
capacity = newcapacity;
keys = newkeys;
vals = newvals;
}
public void put(int k, Object o) {
int i = (k & 0x7fffffff) % capacity;
while (vals[i] != null && k != keys[i]) // hash collision.
i = (i + 1) % capacity;
if (vals[i] == null)
size++;
keys[i] = k;
vals[i] = o;
if (size > (int)(capacity * load))
rehash();
}
public final Object get(int k) {
int i = (k & 0x7fffffff) % capacity;
while (vals[i] != null && k != keys[i]) // hash miss
i = (i + 1) % capacity;
return vals[i];
}
}