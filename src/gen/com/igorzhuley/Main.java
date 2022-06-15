package gen.com.igorzhuley;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by Jtahun on 15.06.2022.
 */
public class Main {
  public static void main(String[] args) {
    try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./myLogFile.txt"), StandardCharsets.UTF_8))) {
      writer.write(" write log to file");
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }

  }
}

