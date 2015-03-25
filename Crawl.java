import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
 
/**
*
* @author vimal
*/
public class Crawl {
 
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args)  {
        try {
            URL my_url = new URL("http://www.vimalkumarpatel.blogspot.com/");
            BufferedReader br = new BufferedReader(new InputStreamReader(my_url.openStream()));
            String strTemp = "";
            while(null != (strTemp = br.readLine())){
            System.out.println(strTemp);
        }
        } catch (java.lang.Throwable ex) {
//            ex.printStackTrace();
        }
    }
}