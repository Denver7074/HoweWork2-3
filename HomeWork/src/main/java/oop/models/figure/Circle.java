package oop.models.figure;

import lombok.Data;
import lombok.NoArgsConstructor;
import oop.models.figure.enums.Colors;
import oop.models.figure.enums.Names;

@Data
public class Circle extends Rectangle {

    int radius;

    public Circle(long id, Names name, Colors color, int radius){
       super.getColor();
       super.getId();
       super.getName();
       this.radius = radius;
    }


    public double square() {
        return Math.PI * Math.pow(radius,2);
    }


}
