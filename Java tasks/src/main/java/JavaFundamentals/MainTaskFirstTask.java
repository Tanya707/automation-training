package JavaFundamentals;

import java.util.Scanner;


public class MainTaskFirstTask {
    public static void main (String[] args) {
        System.out.println("Введите своё имя:");
        Scanner input=new Scanner(System.in);
        String name=input.next();
        System.out.println("Привет, " + name + "!");
    }
}