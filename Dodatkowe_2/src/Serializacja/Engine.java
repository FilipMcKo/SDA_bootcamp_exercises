package Serializacja;

import java.io.Serializable;

public class Engine implements Serializable {
    String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
