package Serializacja;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Tire[] tires = new Tire[] {new Tire(16), new Tire(16), new Tire(16), new Tire(16)};
        Engine engine = new Engine("some model");
        Car serializedCar = new Car(tires, engine);


        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object-graph.bin"))) {
            outputStream.writeObject(serializedCar);
        }
        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }
        catch(IOException e){
            System.out.println("IOException");
        }

        Car deserializedCar = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object-graph.bin"))) {
            deserializedCar = (Car) inputStream.readObject();
            System.out.println(deserializedCar.getEngine().getName());
            System.out.println(deserializedCar.getTires().length);
        }
        catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException ");
        }
        catch (IOException e){
            System.out.println("IOException");
        }

        System.out.println(serializedCar == deserializedCar);



    }
}
