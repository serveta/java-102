package InputOutput;

import java.io.File;
import java.io.IOException;

public class FileClassApp {
    public static void main(String[] args) {
        File file = new File("src/InputOutput");
        File file1 = new File("src/InputOutput/file.md");
        File file2 = new File("src/InputOutput/file2.md");

        System.out.println(" *Creation of the files.");
        createNewFile(file1);
        createNewFile(file2);

        System.out.println("\n *List of the files.");
        String[] list = file.list();
        for (String val : list){
            System.out.println(val);
        }

        System.out.println("\n *Deletion of the files.");
        deleteFile(file1);
        deleteFile(file2);

    }

    private static void createNewFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println(file.getName() + " created.");
            } else {
                System.out.println(file.getName() + " already exist.");
            }
        } catch (IOException e) {
            if (file.mkdirs()){
                createNewFile(file);
            } else {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    private static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println(file.getName() + " has been deleted.");
        } else {
            System.out.println("Deletion failed.");
        }
    }
}
