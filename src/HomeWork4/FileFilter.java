package HomeWork4;



import java.io.File;

public class FileFilter implements java.io.FileFilter {
    private String[] arr;

    public FileFilter(String... arr) {
        super();
        this.arr = arr;
    }
    public FileFilter(FileFilter fileExtension, String string) {
    }
    private boolean check(String ext) {
        for (String stringExt : arr) {
            if (stringExt.equals(ext)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }

}
