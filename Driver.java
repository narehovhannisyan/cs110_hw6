import shapes.Rectangle;
import shapes.Square;
import utils.math;

public class Driver { 

public static void main(String[] args) {
        Square mySquare = new Square(100);
        System.out.println(mySquare.getArea());
        Rectangle myRectangle = new Rectangle(50, 80);
        System.out.println(myRectangle.getArea());
        double number = 15.6;
        int parsedNumber = (int) number;
        System.out.println(math.factorial(parsedNumber));
        System.out.println(math.factorialLoop(parsedNumber));
    }
}

	