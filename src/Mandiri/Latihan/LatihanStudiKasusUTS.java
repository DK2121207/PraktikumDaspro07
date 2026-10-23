package Mandiri.Latihan;

import java.util.Scanner;

public class LatihanStudiKasusUTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pengguna, statusPengguna, keperluan, suratIzin;
        boolean isBebasKompen;
        

        System.out.print("Masukkan kategori pengguna (dosen/mahasiswa):");
        pengguna = sc.nextLine().trim();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.print("Masukkan status pengguna (Aktif/Cuti/Skorsing): ");
            statusPengguna = sc.nextLine().trim();

            if (statusPengguna.equalsIgnoreCase("aktif")) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak, akun dosen sedang non-aktif");
                return;
            }

        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan status aktif pengguna (true/false): ");
            statusPengguna = sc.nextLine().trim();
            System.out.print("Apakah bebas kompen? (true/false): ");
            isBebasKompen = sc.nextBoolean();
            sc.nextLine();

            if (statusPengguna.equalsIgnoreCase("true") && isBebasKompen) {
                System.out.print("Masukkan keperluan (Skripsi/Tugas Akhir/Ormawa/Lainnya): ");
                keperluan = sc.nextLine().trim();

                if (keperluan.equalsIgnoreCase("skripsi") || keperluan.equalsIgnoreCase("tugas akhir")) {
                    System.out.print("Apakah ada surat izin pembimbing? (Y/n): ");
                    suratIzin = sc.nextLine().trim();

                    if (suratIzin.equalsIgnoreCase("y")) {
                        System.out.println("Akses diberikan");
                    } else {
                        System.out.println("Akses ditolak");
                    }
                } else if (keperluan.equalsIgnoreCase("ormawa")) {
                    System.out.print("Apakah ada surat izin pembina? (Y/n): ");
                    suratIzin = sc.nextLine().trim();

                    if (suratIzin.equalsIgnoreCase("y")) {
                        System.out.println("Akses diberikan");
                    } else {
                        System.out.println("Akses ditolak");
                    }
                    
                } else {
                    System.out.println("Akses ditolak");
                }
            } else {
                System.out.println("Akses ditolak, mahasiswa tidak aktif atau memliki tanggungan kompen");
            }

        } else {
            System.out.println("Kategori pengguna tidak valid");
        }
    }
}
