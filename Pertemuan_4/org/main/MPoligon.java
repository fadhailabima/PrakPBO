/**
 * File : PersegiPanjang.java
 * Penulis : Fadhail Athaillah Bima
 * Deskripsi : driver class untuk poligon dan bangun datar
 */

package Pertemuan_4.org.main;
import Pertemuan_4.org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
    }
    
}
