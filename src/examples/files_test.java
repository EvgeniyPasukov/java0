package examples;
import java.io.*;

public class files_test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        try {
            File file = new File("111.txt");

            if (!file.exists())
                file.createNewFile();


            PrintWriter pw = new PrintWriter(file);
            pw.println("Ok");
            pw.close();
        br = new BufferedReader(new FileReader("111.txt"));
        String line;
        while ((line=br.readLine()) != null){
            System.out.println(line);
        }
        } catch (IOException e){
            System.out.println("error");
        }finally {
           br.close();
        }


    }
}
