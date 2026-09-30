package Jobsheet2;

public class ContohVariabel07 {
    public static void main(String[] args) {
        String hobi ="Bermain vidio gim";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 18;
        double ipk = 4.00, tinggi = 1.73;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
