package Jobsheet3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, luas;
        panjang = sc.nextInt();
        lebar = sc.nextInt();
        luas = panjang * lebar;

        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}
