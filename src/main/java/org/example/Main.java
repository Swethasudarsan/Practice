package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main {
    int val = 10;
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Main main = new Main();
        System.out.println(main.val);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("Helloagain!");
        }
    }
}