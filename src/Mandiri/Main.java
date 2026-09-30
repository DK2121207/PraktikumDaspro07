package Mandiri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int x;
        // sc.close();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan nilai x (integer): ");
            x = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}