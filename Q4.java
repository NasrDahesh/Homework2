import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int A, B, C, D;
        System.out.println("Enter 3 number: ");
        A=input.nextInt();
        B=input.nextInt();
        C=input.nextInt();
        D=(A+B+C)/3;
        System.out.println("Average numbers = "+D+"%");
    }
}
