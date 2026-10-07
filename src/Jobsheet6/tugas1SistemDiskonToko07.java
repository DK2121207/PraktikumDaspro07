package Jobsheet6;

import java.util.Scanner;

public class tugas1SistemDiskonToko07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isRabu, jenisBuku;
        int jumlahBuku = 0;
        double diskon = 0, diskonTambahan = 0, totalBayarDalamPersen = 1, besarDiskon = 0;
        
        System.out.print("Apakah hari ini adalah hari Rabu? (y/N): ");
        isRabu = sc.nextLine();

        if (isRabu.equalsIgnoreCase("y")) {
            System.out.print("Masukkan jenis buku: ");
            jenisBuku = sc.nextLine();
            System.out.print("Masukkan jumlah buku: ");
            jumlahBuku = sc.nextInt();

            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskonTambahan = 0.02;
                if (jumlahBuku > 3) {
                    diskon = 0.1;
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.08;
                if (jumlahBuku > 4) {
                    diskonTambahan = 0.02;
                } else {
                    diskonTambahan = 0.01;
                }
            } else if(jumlahBuku > 4) {
                diskon = 0.06;
            }

            totalBayarDalamPersen = totalBayarDalamPersen * (1 - diskon) * (1 - diskonTambahan);
            besarDiskon = 1 - totalBayarDalamPersen;

            System.out.println(String.format("Total yang harus dibayar adalah: %.2f", (totalBayarDalamPersen * 100)).concat("%"));
            System.out.println(String.format("Besar diskon yang didapat adalah: %.2f", (besarDiskon * 100)).concat("%"));
        } else {
            System.out.println("Diskon diadakan di hari Rabu yah.");
        }
    }
}
