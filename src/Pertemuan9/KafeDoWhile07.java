package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        int hargaKopi = 10000 + (7 % 5) * 1000,
        // 10000 + (7 % 5) * 1000 = 12000
        hargaTeh = 5000 + (7 % 4) * 1000,
        // 5000 + (7 % 4) * 1000 = 8000
        hargaRoti = 15000 + (7 % 6) * 1000;
        // 15000 + (7 % 6) * 1000 = 16000
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
