package day02;

public class Rectangle {
    double sideA;
    double sideB;
    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double calculateArea(){
        return sideA*sideB;
    }
}
