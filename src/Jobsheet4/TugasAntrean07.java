package Jobsheet4;

import java.util.Scanner;

public class TugasAntrean07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        int kodeLayanan;
        String layanan;
        char loket;

        System.out.print("Masukkan kode layanan: ");
        kodeLayanan = davin.nextInt();

        switch (kodeLayanan) {
            case 1:
                layanan = "Legalisir ijazah";
                loket = 'A';
                break;
            case 2:
                layanan = "Surat Keterangan Aktif Kuliah";
                loket = 'B';
                break;
            case 3:
                layanan = "Pembayaran UKT";
                loket = 'C';
                break;
            case 4:
                layanan = "Pengajuan Cuti Akademik";
                loket = 'D';
                break;
        
            default:
                System.out.println("Kode layanan tidak tersedia");
                return;
        }
        System.out.println("Layanan yang anda pilih: " + layanan);
        System.out.println("Loket tujuan: Loket " + loket);
    }
}
