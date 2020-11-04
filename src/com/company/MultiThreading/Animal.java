package com.company.MultiThreading;

public class Animal extends Thread{

    private final String espece;
    private static final int distance=100;
    private final int vitesse;

    public Animal(String espece, int vitesse) {
        this.espece = espece;
        this.vitesse = vitesse;
    }

    @Override
    public void run() {
        boolean endormi = false;
        for (int distParc = 0; distParc <= distance; distParc += vitesse) {
            System.out.println(espece + " : distance= " + distParc);
            if (distParc >= 30 && espece.equals("lièvre") && !endormi) {
                try {
                    System.out.println("le lièvre dort");
                    sleep(2000);
                    System.out.println("le lièvre ne dort plus");
                    endormi = true;
                }
                catch (InterruptedException ie) {
                    return;
                }
            }
        }
        System.out.println(espece + " a fini la course!");
    }

    public static void main(String[] args) {
        Animal lievre = new Animal("lièvre", 10);
        Animal tortue = new Animal("tortue", 5);
        lievre.start();
        tortue.start();
    }
}
