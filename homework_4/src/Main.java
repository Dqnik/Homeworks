
import java.util.Scanner;

public class Main {
    static void UPP(){
        System.out.println("Enter x");
       String x = "";
        String y = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()){
            x = sc.nextLine();
        }
        else{
            System.out.println("Error");
        }
        System.out.println("Enter y");
        if (sc.hasNextLine()){
            y = sc.nextLine();
        }
        else {
            System.out.println("Error");
        }
        System.out.println(x.toUpperCase() + y.toUpperCase());
    }

    static StringBuilder deleteChars(StringBuilder builder) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = {'a', 'e', 'i', 'o', 'y'};
        for (int i = 0; i < builder.length(); i++) {
            int counter = 0;
            for (char c : arr) {
                if (builder.charAt(i) == c) {
                    counter = 1;
                    break;
                }
            }
            if (counter == 0) {
                stringBuilder.append(builder.charAt(i));
            }
        }
        return stringBuilder;
    }

    static void reverse(){
        String x, y = " ";
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter text");
        x = sc.nextLine();
        int len = x.length();
        for(int i=len-1;i>=0;i--)
            y = y + x.charAt(i);
        System.out.println("Reversed text: " + y);
    }

    public static void main(String[] args) {
        UPP();
        System.out.println();
        String x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        x = sc.nextLine();
        StringBuilder builder = new StringBuilder(x);
        System.out.println(deleteChars(builder));
        System.out.println();
        reverse();
    }
}
