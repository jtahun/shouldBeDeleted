package gen.com.igorzhuley;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


/**
 * Created by Jtahun on 15.06.2022.
 */

public class Test {
  public static void main(String[] args) {
    
    try (Scanner cin = new Scanner(System.in);
         BufferedReader reader = new BufferedReader(new FileReader("./logFile.txt"));
          BufferedWriter writer = new BufferedWriter(new FileWriter("./logFile.txt"))){
           
      writer.write("SomeText\n");
      int s;
      while ((s = reader.read()) != -1){
        System.out.println((char)s);
      }     
      
    } catch (IOException e) {
      e.printStackTrace();
    }        
  }
}


