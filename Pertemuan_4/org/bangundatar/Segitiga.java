/**
 * File : PersegiPanjang.java
 * Penulis : Fadhail Athaillah Bima
 * Deskripsi : representasi dasar dari objek segitiga, turunan kelas poligon
 */

package Pertemuan_4.org.bangundatar;
import Pertemuan_4.org.poligon.Poligon;
public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return 0.5 * this.alas * this.tinggi;
    }
    public void printInfo(){
        System.out.println("Bangun Segitiga Berisi" + this.getJumlahSisi());
    }
    
}
