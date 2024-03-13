/**
 * File : PersegiPanjang.java
 * Penulis : Fadhail Athaillah Bima
 * Deskripsi : representasi dasar dari objek persegi panjang, turunan kelas poligon
 */
package Pertemuan_4.org.bangundatar;
import Pertemuan_4.org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang Berisi" + this.getJumlahSisi());
    }
}
