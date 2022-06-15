package gen.com.igorzhuley;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * Created by Jtahun on 15.06.2022.
 */

public class Main {
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    try {
      BufferedReader in = new BufferedReader(new FileReader("./logfile.txt"));
      String str;

      while ((str = in.readLine()) != null) {
        System.out.println(str);
      }
      System.out.println(str);
      in.close();
    } catch (IOException e) {
    }

    try {
      Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./logFile.txt",true), StandardCharsets.UTF_8));
      //writer.write("  ");
      writer.write("\t\n");
      writer.write((cin.nextLine())); //не допетрил как символ новой строки прикрутить

      writer.close();
      cin.close();
    } catch (IOException ex) {
      ex.printStackTrace();

    }
  }
}


