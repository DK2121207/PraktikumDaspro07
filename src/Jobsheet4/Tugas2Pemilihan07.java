package Jobsheet4;

import java.util.Scanner;

public class Tugas2Pemilihan07 {
    public static void main(String[] args) {
        Scanner davin = new Scanner(System.in);
        int jumlahSks;

        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = davin.nextInt();
        String pesan = (jumlahSks > 24) ? "Melebihi batas" : "KRS valid";

        System.out.println(pesan);
    }
}
