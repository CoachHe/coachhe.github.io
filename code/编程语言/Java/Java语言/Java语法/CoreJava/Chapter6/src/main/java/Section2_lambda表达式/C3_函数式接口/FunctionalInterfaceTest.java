package Section2_lambda表达式.C3_函数式接口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author CoachHe
 * @date 2022/12/9 00:14
 **/
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc", "abcdedefcd", "fslaf", "cdfe"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Arrays.sort(arr, (String o1, String o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> intArr = new ArrayList<>();

    }
}
