package Pertemuan7;

import java.util.Scanner;

public class StudiKasus107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup =  15000 + (7 % 6) * 1000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup\t: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar\t: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= (80000 + (7 % 5) * 10000)) {
            diskon = totalHarga * (5 + (7 % 6)) / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga\t\t: " + totalHarga);
        System.out.println("Diskon\t\t\t: " + diskon);
        System.out.println("Total bayar\t\t: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t\t: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
    }
}
