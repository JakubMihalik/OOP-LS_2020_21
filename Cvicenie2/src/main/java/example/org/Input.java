package example.org;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cislo = 0;

        System.out.print("Zadaj cislo: ");
        cislo = scanner.nextInt();

        System.out.println("Zadal si cislo: " + cislo);
    }
}
