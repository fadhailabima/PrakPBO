/*
* Nama File : MTitik.java 
* Nama/NIM  : Fadhail Athaillah Bima/24060121140172
* Tanggal   : 22/02/2024
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik();

		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);

		t2.setAbsis(3.0);
		t2.setOrdinat(4.0);

		t3.setAbsis(5.0);
		t3.setOrdinat(6.0);

		System.out.println("Jumlah objek titik : "+ Titik.getCounterTitik());

		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");		
		System.out.println("t2("+ t2.getAbsis()+", "+t2.getOrdinat()+")");		
		System.out.println("t3("+ t3.getAbsis()+", "+t3.getOrdinat()+")");		
	}

}