package Mandiri.Latihan;

import java.util.Scanner;

public class LatihanStudiKasusUTS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int penghasilanOrangTua, nominalBop;
        double ipk, potonganBop = 0.0;
        String jenjangPendidikan;
        boolean isAktifOrganisasi;

        System.out.print("Masukkan jenjang pendidikan (D3/D4): ");
        jenjangPendidikan = sc.nextLine();

        if (jenjangPendidikan.equalsIgnoreCase("D3")) {
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            if (ipk >= 3.25) {
                System.out.print("Masukkan penghasilan orang tua: ");
                penghasilanOrangTua = sc.nextInt();
                if (penghasilanOrangTua < 3_000_000) {
                    potonganBop = 0.50;
                } else {
                    potonganBop = 0.20;
                }
            } else {
                System.out.println("IPK tidak memenuhi syarat minimal jenjang D3");
            }
        } else if (jenjangPendidikan.equalsIgnoreCase("D4")) {
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();
            
            if (ipk >= 3.50) {
                System.out.print("Apakah kamu aktif dalam organisasi? (true/false): ");
                isAktifOrganisasi = sc.nextBoolean();
                if (isAktifOrganisasi) {
                    System.out.print("Masukkan penghasilan orang tua: ");
                    penghasilanOrangTua = sc.nextInt();
                    
                    if (penghasilanOrangTua < 5_000_000) {
                        potonganBop = 0.75;
                    } else {
                        potonganBop = 0.40;
                    }
                } else {
                    potonganBop = 0.25;
                }
            } else {
                System.out.println("IPK tidak memenuhi syarat minimal jenjang D4");
            }
            
        } else {
            System.out.println("Jenjang pendidikan tidak valid");
        }

        if (potonganBop != 0.0) {
            System.out.print("Masukkan nominal BOP: ");
            nominalBop = sc.nextInt();

            System.out.println("Persentase keringanan yang diperoleh: " + (potonganBop * 100) + "%");
            System.out.println("Potongan BOP: " + (nominalBop * potonganBop));
            System.out.println("Biaya BOP yang harus dibayar: " + (nominalBop - nominalBop * potonganBop));
        }

    }
}
