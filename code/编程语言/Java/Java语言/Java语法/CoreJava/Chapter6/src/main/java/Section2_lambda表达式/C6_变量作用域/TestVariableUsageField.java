package Section2_lambda表达式.C6_变量作用域;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author CoachHe
 * @date 2022/12/10 18:00
 **/
public class TestVariableUsageField {
    public static void main(String[] args) throws InterruptedException {
        repeatMessage("Hello", 1000);
        Thread.sleep(500000);
    }

    public static void repeatMessage(String text, int delay) {
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay, listener).start();
    }
}
