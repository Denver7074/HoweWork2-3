package oop.models.figure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.models.figure.enums.Colors;
import oop.models.figure.enums.Names;
import oop.repositories.Figure2D;

import javax.naming.Name;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Figure2D {


    private long id;
   private Names name;
   private Colors color;
   private int weight;
   private int height;

    @Override
    public void draw() {
        System.out.println("\nName: " + getName() + " Color: " + getColor() +"\n");
    }

    @Override
    public double square() {
        return getHeight()*getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Rectangle)) return false; //проверяем если null значение на входе или если объект не является наследником
        Rectangle rectangle = (Rectangle) o;
        return square() == rectangle.square();                    // сравнение по площади фигуры;
    }

    @Override
    public int hashCode() {
        return Objects.hash(square());
    }
}
