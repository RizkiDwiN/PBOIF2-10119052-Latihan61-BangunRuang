package pboif2.pkg10119052.latihan61.bangunruang;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Bangun ruang dengan metode Inheritance
 * 
 */
public class PBOIF210119052Latihan61BangunRuang {

    public static void main(String[] args) {
        //Disini kalian akan mengeksekusi kode/logika
        Bola bola = new Bola();
        bola.setJari(7);
        bola.setPhi(3.14);
        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setPhi(3.14);
        tabung.setTinggi(21);
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setPhi(3.14);
        kerucut.setTinggi(9);
        System.out.println("Volume Bola  : "+ Math.ceil(bola.hitungVolume())+" cm3");
        System.out.println("Volume Tabung  : "+ Math.ceil(tabung.hitungVolume())+" cm3");
        System.out.println("Volume Kerucut  : "+ Math.ceil(kerucut.hitungVolume())+" cm3");
    }
    
}
