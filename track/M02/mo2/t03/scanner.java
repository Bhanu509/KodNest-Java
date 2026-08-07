
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter byte  value: ");
        byte a = scan.nextByte();
        System.out.println("Byte value is: " + a);

        System.out.println("Enter a short value: ");
        short b = scan.nextShort();
        System.out.println("Short value is: " + b);

        System.out.println("Enter a int value: ");
        int c = scan.nextInt();
        System.out.println("int value is: " + c);

        System.out.println("Enter a long Value: ");
        long d = scan.nextLong();
        System.out.println("long value is: " + d);

        System.out.println("Enter a float value: ");
        float e = scan.nextFloat();
        System.out.println("Float value is:  " + e);

        System.out.println("Enter a double value: ");
        double f = scan.nextDouble();
        System.out.println("Double value is: " + f);

        System.out.println("Enter a boolean value: ");
        boolean g = scan.nextBoolean();
        System.out.println("boolean value is:" + g);

    }
}
