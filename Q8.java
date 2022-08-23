import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int A= input.nextInt();

        //مربع الرقم
        System.out.println("Number box"+A*A);
        //مكعب الرقم
        System.out.println("Number Cube"+A*A*A);
        //الطاقة الرابعة
        System.out.println("The Fourth Power Is = " + (Math.pow(A, 4)));
    }
}
