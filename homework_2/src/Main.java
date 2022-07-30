import java.util.Scanner;

public class Main {
    static void HW2(int a, int b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else{
            System.out.println("Error");
        }
        System.out.println("Enter b");
        if (sc.hasNextInt()){
            b = sc.nextInt();
        }
        else{
            System.out.println("Error");
        }
        if (a>b){
            System.out.println(a  + " > " + b);
        } else if (a<b) {
            System.out.println(a + " < " + b);
        } else if (a==b) {
            System.out.println(a + " = " + b
            );
        }
    }
    public static void main(String[] args) {
        HW2(0, 0);
    }
}
