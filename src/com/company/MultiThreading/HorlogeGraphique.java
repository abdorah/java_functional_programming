package com.company.MultiThreading;

import javax.swing.*;

public class HorlogeGraphique extends JLabel {

    private int sec;
    private String secString;
    private int min;
    private String minString;
    private int hr;
    private String hrString;

    public HorlogeGraphique() {
        this.setVerticalAlignment(CENTER);
        this.setHorizontalAlignment(CENTER);
        this.sec = 0;
        this.min = 0;
        this.hr = 0;

        Thread counter = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ie){
                    return;
                }
                sec++;
                if (sec == 60) {
                    sec = 0;
                    min++;
                }
                if (min == 60) {
                    min = 0;
                    hr++;
                }
                if (sec < 10) {
                    secString = "0" + sec;
                }
                else secString = String.valueOf(sec);

                if (min < 10) {
                    minString = "0" + min;
                }
                else minString = String.valueOf(min);

                hrString = String.valueOf(hr);

                this.setText(hrString + ":" + minString + ":" + secString);
            }
        });
        counter.start();
    }

    public static void main(String[] args) {
        JFrame horloge = new JFrame("Horloge");
        horloge.setContentPane(new HorlogeGraphique());
        horloge.setSize(200, 200);
        horloge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        horloge.setVisible(true);
    }
}
