import java.util.Scanner;
public class Main {
    static void HW() {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("Error");
        }
        System.out.println("Enter y");
        if (sc.hasNextInt()) {
            y = sc.nextInt();
        } else {
            System.out.println("Error");
        }
        System.out.println("x*y-3=" + (x*y-3));
    }
    static int resolveSquare(){
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else {
            System.out.println("Error");
        }
        System.out.println("Enter b");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        else {
            System.out.println("Error");
        }
        System.out.println("Enter c");
        if (sc.hasNextInt()) {
            c = sc.nextInt();
        }
        else {
            System.out.println("Error");
        }
        int i = (b * b) - 4 * (a * c);
        System.out.println("D = " + i);
        System.out.println("x1 = " + ((-b + i) / (2*a)));
        System.out.println("x2 = " + ((-b - i) / (2*a)));
        return i;
    }
        public static void main (String[]args){
            int x = 0;
            short y = 0;
            byte c = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
            }
            else {
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
            System.out.println("x + y + c = " + (x + y + c));
            System.out.println("x - y - c = " + (x - y - c));
            System.out.println("x * y * c = " + (x * y * c));
            System.out.println("x : y : c = " + (x / y / c));
            System.out.println();
            HW();
            System.out.println();
            resolveSquare();
            sc.close();
        }
    }