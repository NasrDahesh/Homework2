import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner A=new Scanner(System.in);
        double W, L, D;
        System.out.println("Enter the length of the rectangle");
        L=A.nextDouble();
        System.out.println("Enter the width of the rectangle");
        W=A.nextDouble();
        D=W*L;
        System.out.println("Rectangle area = "+D);
        D=2*(L+W);
        System.out.println("Rectangular perimeter = "+D);
    }
}
