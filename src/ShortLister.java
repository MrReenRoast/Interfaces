import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        File workingDirectory = new File(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(workingDirectory);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            ShortWordFilter filter = new ShortWordFilter();

            try (Scanner scanner = new Scanner(file)) {
                System.out.println("Short words from file: ");

                // Read the file word by word
                while (scanner.hasNext()) {
                    String word = scanner.next();

                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            }
        } else {
            System.out.println("No file selected.");
        }
    }
}