package HomeWork4;



import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

    public static void copyFile(File original, File copy) {
        if (original == null || copy == null) {
            throw new IllegalArgumentException();
        }
        try {
            InputStream in = new FileInputStream(original);
            OutputStream out = new FileOutputStream(copy);

            byte[] buffer = new byte[1024*1024];
            int dates;

            for (; (dates = in.read(buffer)) > 0;) {
                out.write(buffer, 0, dates);
            }
            in.close();
            out.close();

            System.out.println("Is coping " + original.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFolder(File folderOrig, File folderCopy, FileFilter fileExtension) throws IOException {
        if (folderOrig == null || folderCopy == null || fileExtension == null) {
            throw new IllegalArgumentException("File not found!");
        }
        File[] files = folderOrig.listFiles(fileExtension);
        for (File file : files) {
            copyFile(file, new File(folderCopy, file.getName()));
        }

    }

}
