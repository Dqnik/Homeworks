import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ffff {
//    static void deleteA(List<String> list) {
//        List<String> list1 = new ArrayList<>();
//        for (int i = list.size(); i < list.size(); i--) {
//            if (list.get(i).contains("A") || list.get(i).contains("a")) {
//                list1.add(list.get(i));
//            }
//        }
//    }

//        static int[] findMax(List<Integer> list, Set<Integer> set, Queue<Integer> queue){
//            int x[] = new int[3];
//            x[0] = 0;
//            x[1] = 0;
//            x[2] = 0;
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i)>x[0]){
//                    x[0] = list.get(i);
//                }
//            }
//            for (int i = 0; i < set.size(); i++) {
//
//            }
//            return x;
//        }

//

    static boolean isPalindrom(String s) {
        boolean x = false;
        StringBuilder c = new StringBuilder(new StringBuilder(s).reverse().toString());
        if(s = c){
            x = true;
        }
      return x;
    }
}
