 
import java.io.*;
public class Main2 {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String arr[]=line.split(" ");
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            // Process line of input Here
        }
    }
}
