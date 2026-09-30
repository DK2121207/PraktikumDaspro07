package Jobsheet3;

import java.util.Scanner;

public class MenghitungTotalBayar07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        double harga;
        double potongan, jumlahBayar, diskon = 0.15;

        harga = davin.nextDouble();
        potongan = harga * diskon;
        jumlahBayar = harga - potongan;

        System.out.println("Jumlah yang harus anda bayar adalah RP. " + jumlahBayar);
    }
}
