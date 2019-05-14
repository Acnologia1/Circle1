package Lession3;

public class SimpleCircle {
    double radius;
    //Contruct a circle width radius
    SimpleCircle(){
        radius = 1;
    }
    //Contruct a circle width a specified radius
    SimpleCircle(double newRadius){
        radius = newRadius;
    }
    //Return the area of the this circle
    double getArea(){
        return radius* radius* Math.PI;
    }
    //Return the perimeter of this circle
    double getPerimeter(){
        return 2*radius* Math.PI;
    }
    //Set a new radius for this circle
    void setRadius(double newRadius){
        radius = newRadius;
    }
}
