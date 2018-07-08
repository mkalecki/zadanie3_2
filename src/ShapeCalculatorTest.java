public class ShapeCalculatorTest {
    public static void main(String[] args) {

        ShapeCalculator shapeCalc = new ShapeCalculator();

        Square square = new Square(10);
//        double sqArea = shapeCalc.squareArea(square);
        System.out.println("Pole kwadratu o boku " + square.side + " = " + shapeCalc.squareArea(square));
        System.out.println("Pole kwadratu o boku " + square.side + " = " + square.calculateArea()); //z metody klasy Square


        Triangle triangle = new Triangle (10,20,30);
        double trPery = shapeCalc.trianglePerimeter(triangle);
        System.out.printf("Obwód trójkąta o bbokach %s, %s, %s = %s\n", triangle.sideA, triangle.sideB, triangle.sideC, trPery);
        trPery = triangle.calculatePerimeter(); //z metody klasy Triangle
        System.out.printf("Obwód trójkąta o bbokach %s, %s, %s = %s\n", triangle.sideA, triangle.sideB, triangle.sideC, trPery);


        Rectangle rect = new Rectangle(4, 5);
        System.out.printf("Obwód prostokąta o bokach %s i %s = %s\n", rect.sideA, rect.sideB, shapeCalc.rectPerimeter(rect) );
        double rectArea = rect.calculatePerimeter(); //metoda klasy Rectangle
        System.out.printf("Obwód prostokąta o bokach %s i %s = %s\n", rect.sideA, rect.sideB, rectArea); //wynik metoda klasy Rectangle


        Circle circle = new Circle(10);
        double cArea = shapeCalc.circleArea(circle); //z metody klasy ShapeCalculator
        System.out.println("Pole koła o promieniu " + circle.radius + " = " + cArea);
        cArea = circle.calculateArea(); //z metody klasy Circle
        System.out.println("Pole koła o promieniu " + circle.radius + " = " + cArea);
        System.out.println("A obwód koła o promieniu " + circle.radius + " = " + circle.calculatePerimeter());






    }
}
