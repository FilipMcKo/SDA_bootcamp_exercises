package Serializacja;

import java.io.Serializable;

public class Car implements Serializable {
    private Tire[] tires;
    private Engine engine;

    public Car(Tire[] tires, Engine engine) {
        this.tires = tires;
        this.engine = engine;
    }

    public Tire[] getTires() {
        return tires;
    }

    public Engine getEngine() {
        return engine;
    }
}
