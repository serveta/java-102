package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamApp {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/InputOutput/patika.md");

            System.out.println(" *Number of remaining bytes " + fileInputStream.available());

            System.out.println(" *Data in the file;");

            // get the first byte from the file...
            int getDataByByte = fileInputStream.read();

            // if the first byte is not -1 we can continue to read with the while loop...
            while (getDataByByte != -1) {
                // if we want to read as letters we have to change the type of data from int to char...
                System.out.print((char) getDataByByte);
                // if the next byte is -1 the loop will end.
                getDataByByte = fileInputStream.read();
            }

            // finally, we have to close the stream.
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
