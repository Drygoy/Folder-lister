import java.io.File;

public class Files {
    public static void main(String[] args) {
        // Replace --F-- to disk name like: C:// F:// D:// E:// P://
        String path = "F:\\";

        File directory = new File(path);

        File[] fileList = directory.listFiles();

        for (File file : fileList) {
            if (file != null && file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                listFolders(file);
            }
        }
    }

   
    public static void listFolders(File directory) {

        File[] fileList = directory.listFiles();

        if (fileList != null) {
            for (File file : fileList) {
                if (file != null && file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    listFolders(file);
                }
            }
        }
    }
}
