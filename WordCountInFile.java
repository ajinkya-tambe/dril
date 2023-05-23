import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountInFile {

  public static void main(String[] args) {
    try {
      File file = new File("./words.txt");

      Scanner scanner = new Scanner(file);
      int wordCount = 0;

      while (scanner.hasNext()) {
        String word = scanner.next();
        wordCount++;
      }

      scanner.close();

      System.out.println("Number of words in the file: " + wordCount);
    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }
  }
}
