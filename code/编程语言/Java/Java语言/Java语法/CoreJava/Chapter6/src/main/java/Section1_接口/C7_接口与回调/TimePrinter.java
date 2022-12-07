package Section1_接口.C7_接口与回调;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author CoachHe
 * @date 2022/12/8 01:28
 **/
public class TimePrinter {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Begin");
        TimePrinterClass listener = new TimePrinterClass();
        Timer t = new Timer(1000, listener);
        t.start();
        Thread.sleep(10000);
    }
}

class TimePrinterClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is "
                + Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
