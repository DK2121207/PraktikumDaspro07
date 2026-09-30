package Jobsheet2;

import java.util.Scanner;;

public class StudiKasus207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lebarTanah = 30, panjangTanah = 100, diameterKolam = 5, sisiTamanPersegi = 2;
        double pi = 3.14, luasTanahTakTerpakai;
        System.out.print("Masukkan lebar tanah: ");
        lebarTanah = sc.nextInt();
        System.out.print("Masukkan panjang tanah: ");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan diameter kolam: ");
        diameterKolam = sc.nextInt();
        System.out.print("Masukkan panjang sisi taman persegi: ");
        sisiTamanPersegi = sc.nextInt();
        luasTanahTakTerpakai = lebarTanah * panjangTanah - pi * (diameterKolam / 2) * (diameterKolam / 2) - sisiTamanPersegi * sisiTamanPersegi;

        System.out.println("Luas tanah tak terpakai: " + luasTanahTakTerpakai);
    }
}
