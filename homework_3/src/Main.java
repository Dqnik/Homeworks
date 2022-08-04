import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int[] y = new int[50];
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
        for (int i = 0; i < 50; i++) {
            y[i] = i*2 + 1;
        }

        for (int a: y) {
            System.out.println(a);
        }
    }
}