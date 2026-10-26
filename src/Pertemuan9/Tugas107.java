package Pertemuan9;

import java.util.Scanner;

// hitung total tiket yang terjual dalam 1 hari
// pembeli tidak hanya 1
public class Tugas107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 40000 + (7 % 6) * 2000;
        // 40000 + (7 % 6) * 2000 = 42000
        int tiket, totalTiket = 0;
        double totalPenjualan = 0, penjualan;
        String namaPelanggan;

        while (true) {
            System.out.println("Masukkan \"done\" untuk menyelesaikan input");
            System.out.print("Masukkan nama pelanggan: ");
            namaPelanggan = sc.nextLine().trim();

            if (namaPelanggan.equalsIgnoreCase("done")) {
                System.out.println("Input data selesai");
                break;
            }

            while (true) {
                System.out.print("Jumlah tiket yang dibeli " + namaPelanggan + ": ");
                tiket = sc.nextInt();
                sc.nextLine();
                if (tiket < 0) {
                    System.out.println("Data tidak valid, silahkan input ulang");
                    continue;
                } else {
                    break;
                }
            }

            totalTiket += tiket;
            if (tiket > (8 + (7 % 4))) {
                // 8 + (7 % 4) = 11
                penjualan = tiket * (hargaTiket * (1 - (15 + (double)(7 % 4))/100)); // 15 + (7 % 4) = 18
                totalPenjualan += penjualan;
            } else if (tiket > (3 + (7 % 3))) {
                // 3 + (7 % 3) = 4
                penjualan = tiket * (hargaTiket * (1 - (8 + (double)(7 % 5))/100)); // 8 + (7 % 5) = 10
                totalPenjualan += penjualan;
            } else {
                penjualan = tiket * hargaTiket;
                totalPenjualan += penjualan;
            }
            System.out.println("-----------------------------");
            System.out.println("Nama Pembeli\t: " + namaPelanggan);
            System.out.println("Jumlah tiket\t: " + tiket);
            System.out.println("Total harga\t: " + penjualan);
            System.out.println("-----------------------------");

        }
        System.out.println("Jumlah tiket terjual hari ini\t: " + totalTiket);
        System.out.println("Total penjualan hari ini\t: Rp" + totalPenjualan);
    }
}
