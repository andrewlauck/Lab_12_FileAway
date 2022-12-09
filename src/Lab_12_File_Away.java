import java.io.*;
import javax.swing.JFileChooser;

public class Lab_12_File_Away {
    public static void main(String[] args)
    {

        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            System.out.println("File: " + file.getName());

            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    lineCount++;

                    String[] words = line.split("\\s+");
                    wordCount += words.length;

                    charCount += line.length();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
        }
    }
}
