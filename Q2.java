import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double A, B ;
        System.out.println("Enter the half diameter of the circle");
        A= input.nextDouble();
        B=A*A*3.14;
        System.out.println("Circle area = "+B);
        B=2*A*3.14;
        System.out.println("Circumference of the circle"+B);
    }
}
