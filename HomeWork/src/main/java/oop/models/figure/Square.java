package oop.models.figure;

import oop.models.figure.enums.Colors;
import oop.models.figure.enums.Names;

public class Square extends Rectangle{


    public Square(long id, Names name, Colors color, int height){
        super(id,name,color,height,height);
    }

    public void setHeight(int height){
         setHeight(height);
        setWeight(getHeight());
    }



}
