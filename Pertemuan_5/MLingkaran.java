package Pertemuan_5;

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari Lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan Jejari" + jejari + " Adalah " + l.hitungLuas());
        scan.close();
    }
}