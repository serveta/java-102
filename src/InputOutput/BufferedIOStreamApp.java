package InputOutput;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedIOStreamApp {
    public static void main(String[] args) {

        /*

            This is just to see the differences between file input stream and buffered input stream.

         */

        File file = new File("src/InputOutput/patika.md");

        inputStream(file);

        bufferedInputStream(file);

    }

    static void inputStream(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            long a1 = System.nanoTime();

            int read = fileInputStream.read();

            while (read != -1) {
                System.out.print((char) read);

                read = fileInputStream.read();
            }

            long a2 = System.nanoTime();

            System.out.println("\nThe passing time: " + (a2 - a1));

            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void bufferedInputStream(File file) {


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            long b1 = System.nanoTime();

            int readBuff = bufferedInputStream.read();

            while (readBuff != -1) {
                System.out.print((char) readBuff);

                readBuff = bufferedInputStream.read();
            }

            long b2 = System.nanoTime();

            System.out.println("\nThe passing time (with buffered): " + (b2 - b1));

            bufferedInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
