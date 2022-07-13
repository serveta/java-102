package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamApp {
    public static void main(String[] args) {
        File file = new File("src/InputOutput/patika.md");
        String myData = "This is my data...\nHello from patika.dev :)";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(myData.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        getMyDataFromFile(file);
    }

    static void getMyDataFromFile(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            System.out.println(" *Data in the file;");
            int getDataByByte = fileInputStream.read();

            while (getDataByByte != -1) {
                System.out.print((char) getDataByByte);
                getDataByByte = fileInputStream.read();
            }

            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
