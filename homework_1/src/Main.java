import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        short y = 0;
        byte c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("Error");
        }
        System.out.println("Enter y");
        if (sc.hasNextShort()) {
            y = sc.nextShort();
        }
        else {
            System.out.println("Error");
        }
        System.out.println("Enter c");
        if (sc.hasNextByte()) {
            c = sc.nextByte();
        }
        else {
            System.out.println("Error");
        }
        System.out.println(x + y + c);
        System.out.println(x - y - c);
        System.out.println(x * y * c);
        System.out.println((x / y) / c);
    }
}