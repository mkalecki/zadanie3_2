public class Circle {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    double calculateArea (){
        return (3.14*radius*radius);
    }

    double calculatePerimeter(){
        return (2*3.14*radius);
    }
}
