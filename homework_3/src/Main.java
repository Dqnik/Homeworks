import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int[] y = new int[100];
        System.out.println("Enter x");
        if(sc.hasNextInt()){
            x = sc.nextInt();
        }
        else{
            System.out.println("Error");
        }
        for (int i = 0; i <= x; i+=2) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            if (i % 2 !=0){
                y[i] = i;
            }
        }
        for (int i = 1; i < 100; i+=2) {
            if (i == 99)
                System.out.println(y[i]);
            else {
                System.out.print(y[i] + ",");
            }
        }
    }
}