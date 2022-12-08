package Section2_lambda表达式.C2_lambda表达式的语法;

/**
 * Created with IntelliJ IDEA.
 * User: coachhe
 * Date: 2022/12/8
 * Time: 20:03
 * Description:
 */
public class TestGrammar {
    public static void main(String[] args) {
        
    }
}

class ClassB {
    public void printClassB(String s, InterA interA) {
        interA.printHi(s);
    }
}

class ClassA implements InterA {

    @Override
    public void printHi(String str) {
        System.out.println("I am " + str);
    }
}

interface InterA {
    void printHi(String str);
}