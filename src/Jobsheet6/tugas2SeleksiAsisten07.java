package Jobsheet6;

import java.util.Scanner;

public class tugas2SeleksiAsisten07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAktif, sedangSanksi, punyaSertif;
        int nilaiDasPro, nilaiMinimalDasPro = 82, nilaiWawancara, nilaiMinimalWawancara = 77;

        System.out.print("Apakah anda aktif sebagai mahasiswa? (true/false): ");
        isAktif = sc.nextBoolean();
        System.out.print("Apakah anda sedang menjalani sanksi akademik? (true/false): ");
        sedangSanksi = sc.nextBoolean();

        if (isAktif && !sedangSanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            nilaiDasPro = sc.nextInt();
            System.out.print("Apakah punya sertifikat kompetensi pemrograman? (true/false): ");
            punyaSertif = sc.nextBoolean();
            
            if (nilaiDasPro >= nilaiMinimalDasPro || punyaSertif) {
                System.out.print("Masukkan nilai wawancara: ");
                nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= nilaiMinimalWawancara) {
                    System.out.println("Selamat! Anda lolos seleksi asisten praktikum");
                    
                } else {
                    System.out.println("Anda gagal seleksi");
                    System.out.println("Alasan: nilai wawancara anda tidak memenuhi syarat");

                }
            } else {
                System.out.println("Anda gagal seleksi");
                System.out.println("Alasan: nilai Dasar Pemrograman anda tidak memenuhi syarat dan anda tidak punya sertifikat");

            }
        } else {
            System.out.println("Anda gagal seleksi");
            System.out.println("Alasan: status mahasiswa tidak memenuhi syarat");
            
        }
    }
}
