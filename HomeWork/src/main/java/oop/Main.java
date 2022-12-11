package oop;

import oop.models.figure.Circle;
import oop.models.figure.Rectangle;
import oop.models.figure.Square;
import oop.models.figure.enums.Colors;
import oop.models.figure.enums.Names;
import oop.repositories.Figure2D;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
       //System.out.println(HomeWork.Valid("[]{}(){gjhg"));
        //HomeWork.WordCount2("Hello, hello, world unworlds!");

        Rectangle rectangle = new Rectangle(22, Names.RECTANGLE, Colors.BLACK,4,4);

        Square square = new Square(25,Names.SQUARE,Colors.BLUE,4);

        Circle circle = new Circle(25,Names.SQUARE,Colors.BLUE,4);

        System.out.println(rectangle.equals(square));




    }







}
