public class Main {

    public static void main(String args[]){

        Assignment1 test = new Assignment1();

        //Single asterisk
        System.out.println("Printing a single asterisk:");
        test.printAsterisk();
        System.out.println();

        //Horizontal line
        System.out.println("Printing a horizontal line");
        test.printHorizontalLine(5);
        System.out.println();

        //Vertical line
        System.out.println("Printing a vertical line");
        test.printVerticalLine(5);
        System.out.println();

        //Right Triangle
        System.out.println("Printing a right triangle");
        test.printRightTriangle(5);
        System.out.println();

        //Isosceles Triangle
        System.out.println("Printing an isosceles triangle");
        test.printIsoscelesTriangle(5);
        System.out.println();

        //Diamond
        System.out.println("Print a diamond");
        test.printDiamond(5);
        System.out.println();

        //Diamond With Name
        System.out.println("Print a diamond with the name in the middle");
        test.printDiamondWithName(3);
        System.out.println();

        //FizzBuzz
        test.FizzBuzz();
        System.out.println();

        //Generate
        test.generate(30);
        System.out.println();
    }
}
