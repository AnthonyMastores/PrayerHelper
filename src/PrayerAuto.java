import java.io.*;
import java.nio.charset.Charset;
public class PrayerAuto {

    public static void main(String[] args) {
        printPrayerLines();
    }
    private static void printPrayerLines() {
        String line;
       String root = "C:\\Users\\Anthony\\eclipse-workspace\\PrayerHelper\\prayers.txt";
        try {
            try (
                    InputStream fis = new FileInputStream(root);
                    InputStreamReader isr = new InputStreamReader(fis, Charset.forName("Cp1252"));
                    BufferedReader br = new BufferedReader(isr);
            ) {
                while ((line = br.readLine()) != null) {
                    // Deal with the line
                    System.out.println(line);
                   

                    try {
                        System.out.print("\n\n");
                       // Thread.sleep(10000);
                        Thread.sleep(60000); // every 60 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


