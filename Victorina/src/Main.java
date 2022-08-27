import java.util.*;

public class Main {
    static void deleteA(List<String> list){
        String x;
        char[] a = {'a','A'};
        for (int i = list.size()-1; i >= 0; i--) {
            x = list.get(i);
            for (char c : a) {
                for (int j = 0; j < x.length(); j++) {
                    if (c == x.charAt(j)) {
                        list.remove(x);
                    }
                }
            }
        }
    }

    static int[] findMax(List<Integer> list, Set<Integer> set,Queue<Integer> queue) {
        int[] x = new int[3];
        for (Integer integer : list){
            if (integer > x[0]){
                x[0] = integer;
            }
        }
        for (Integer integer : set) {
            if (integer > x[1]){
                x[1] = integer;
            }
        }

        for (Integer integer: queue) {
            if (integer > x[2]){
                x[2] = integer;
            }
        }
        return x;
    }

   static boolean isSimple(int number){
        boolean x = true;
       for (int i = 2; i < number; i++) {
           if (number % i == 0){
               x = false;
           }
       }
       return x;
   }

    static boolean isPalindrom(String s) {
        boolean x = false;
        StringBuilder c = new StringBuilder(new StringBuilder(s).reverse().toString());
        if (s.contentEquals(c)){
            x = true;
        }
        return x;
    }



//    static boolean isPalindrom(String s) {
//        return s.equals(new StringBuilder().append(s).reverse().toString());
//    }

    public static void main(String[] args) {
    }
}
