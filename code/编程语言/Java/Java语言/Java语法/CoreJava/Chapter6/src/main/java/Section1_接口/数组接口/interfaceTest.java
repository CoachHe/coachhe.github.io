package Section1_接口.数组接口;

/**
 * @author CoachHe
 * @date 2022/12/6 01:42
 **/
@SuppressWarnings("all")
public class interfaceTest implements Comparable<Integer>{
    @Override
    public int compareTo(Integer o) {
        return 0;
    }
    public static void main(String[] args) {
        classA testclass = new classA();
        System.out.println(testclass instanceof interfaceA);
    }
}

interface interfaceA {}

class classA implements interfaceA{}