public class Rectangle {
    double sideA;
    double sideB;

    Rectangle (double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea (){
        return (sideA+sideB);

    }

    double calculatePerimeter() {
        return (2*sideA+2*sideB);
    }


}
