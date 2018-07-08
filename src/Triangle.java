public class Triangle {
    double base;
    double height;
    double sideA;
    double sideB;
    double sideC;

    Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    Triangle (double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    double calculatePerimeter (){
        return(sideA + sideB + sideC);
    }
}
