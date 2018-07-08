public class ShapeCalculator {

    double squareArea(Square square) {
        double sa;
        sa = square.side*square.side;
        return sa;
    }

    double trianglePerimeter (Triangle triangle) {
        double tp;
        tp = triangle.sideA+triangle.sideB+triangle.sideC;
        return tp;
    }

    double rectPerimeter (Rectangle rectangle) {
        return (2*rectangle.sideA+2*rectangle.sideB);
    }

    double circleArea (Circle circle){
        return (3.14*circle.radius*circle.radius);
    }

}
