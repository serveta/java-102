package InputOutput;

import java.io.*;

public class SerializationAndObjectStreamApp {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla");
        File file = new File("src/InputOutput/objectOutput.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(car);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Car newCarObj = (Car) objectInputStream.readObject();
            System.out.println("Brand: " + newCarObj.getBrand());
            System.out.println("Model: " + newCarObj.getModel());

            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
