import java.util.*;


public class LineComparison {
public static double lengthCalculation() {
    Scanner input = new Scanner(System.in);

    //co-ordinates for line1
    System.out.println("Enter the value of x2 ");
    int x2 = input.nextInt();

    System.out.println("Enter the value of y2");
    int y2 = input.nextInt();

    //co-ordinates for line2
    System.out.println("Enter the value of a2 ");
    int a2 = input.nextInt();

    System.out.println("Enter the value of b2");
    int b2 = input.nextInt();

    int x1 = 0;
    int y1 = 0;
    int a1 = 0;
    int b1 = 0;

    //calculation part
    double line1_length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    double line2_length = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
    System.out.println("Length of line is " + line1_length + " length of line 2 is: " + line2_length);


    System.out.println(Objects.equals(line1_length, line2_length));
    return line1_length;
}
        public static void main(String args[]){
        lengthCalculation();
        }


}
