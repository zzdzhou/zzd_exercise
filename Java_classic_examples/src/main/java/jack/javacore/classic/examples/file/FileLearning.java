package jack.javacore.classic.examples.file;

/*import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;*/

public class FileLearning {

   /* String fileName = "";

    public static void main(String[] args) {
        try {
            String filename = "D:\\Software_files\\zzd_note\\Z_Other\\Not_Resolved.sql";
            new FileLearning().getFileStatus(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void getFileStatus(String filename) throws IOException{

        File file = new File(filename);
        String name = file.getName();

        if (!file.exists()) {
            System.out.println(name + " is not existing.");
            return;
        }

        if (file.isFile()) {
            System.out.println(name + " is a file.");
            System.out.println(name + "'s parent directory is " + file.getParent());
        } else if (file.isDirectory()) {
            System.out.println(name + " is a directory.");
        }

        System.out.println("Canonical path is " + file.getCanonicalPath() + ".");

        System.out.println("This file can be read: " + file.canRead());
        System.out.println("This file can be wrote: " + file.canWrite());
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(file.lastModified()), ZoneId.systemDefault());
        System.out.println("This file was last modified at "
                + dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }*/
}
