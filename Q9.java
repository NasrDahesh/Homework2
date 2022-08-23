import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        int array[] = new int[2];
        Scanner in = new Scanner (System.in);

        System.out.println("Enter 2 Numbers: ");

        System.out.print("Number 1 = ");
        array[0] = in.nextInt();
        System.out.print("Number 2 = ");
        array[1] = in.nextInt();

        // The Sum
        System.out.println("The Sum = " + (array[0] + array[1]));
        // The Difference
        System.out.println("The Difference = " + (array[0] - array[1]));
        // The Product
        System.out.println("The Product = " + (array[0] * array[1]));
        // The Average
        System.out.println("The Average = " + (((float)array[0] - array[1])/2));
        // The Distance (Absolute Value Of The Difference)
        System.out.println("The Distance = " + (Math.abs(array[0] - array[1])));
        // The Larger
        if (array[0] > array[1])
            System.out.println("The Max = " + array[0]);
        else
            System.out.println("The Max = " + array[1]);
        // The Smaller
        if (array[0] < array[1])
            System.out.println("The Min = " + array[0]);
        else
            System.out.println("The Min = " + array[1]);
    }
}
