package InputOutput;

import java.io.*;

public class BufferedReaderWriterApp {
    public static void main(String[] args) {
        String data = "Java-102 | PATİKA.dev\n123456\n7890";

        File file = new File("src/InputOutput/patika.md");

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(data);

            bufferedWriter.close();
            fileWriter.close();
            System.out.println("bufferedWriter is completed its mission.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
            System.out.println("bufferedReader is completed its mission.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
