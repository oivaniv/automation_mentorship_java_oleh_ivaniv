package EqualsInJava;

import java.util.Objects;

public class Car {

    private String owner;
    private String manufactured;
    private String color;

    public Car (String owner, String manufactured, String color){
        this.owner = owner;
        this.manufactured = manufactured;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(owner, car.owner) && Objects.equals(manufactured, car.manufactured) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, manufactured, color);
    }
}
