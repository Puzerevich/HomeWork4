package HomeWork4;


import javax.swing.*;
import java.io.File;

/**
 * Created by Konstantin on 11.04.2018.
 */
public class Main {

    public static void main(String[] args) {
        java.io.FileFilter fileExtension = new FileFilter("txt");

        File fileOrig = new File("folder1\\file1.txt");
        File fileCopy = new File("folder2\\file2.txt");

        try {
            CopyFile.copyFile(fileOrig, fileCopy);
            // Copy.copyFolder(folderOrig, folderCopy, fileExtension); // Копирование папок
        } catch (Exception e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "The system finished copying your files!", null, JOptionPane.INFORMATION_MESSAGE);
    }
}
