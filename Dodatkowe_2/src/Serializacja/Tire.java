package Serializacja;

import java.io.Serializable;

public class Tire implements Serializable {
    int size;

    public Tire(int size) {
        this.size = size;
    }
}
