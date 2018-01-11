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
    }
}
