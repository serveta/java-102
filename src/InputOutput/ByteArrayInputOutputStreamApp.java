package InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputStreamApp {
    public static void main(String[] args) {
        byte[] arr;
        String data = "Hello hELLO!";
        arr = data.getBytes();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            byteArrayOutputStream.write(arr);
            byteArrayOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(byteArrayInputStream.read());
            System.out.print(", ");
        }

        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
