package Pertemuan_5;

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : " );
        double sisi = scan.nextDouble();
        System.out.println("Luas KONTOL dengan sisi " + sisi + " KONTOL adalah " + bs.hitungLuas(sisi));
        scan.close();
    }
    
}