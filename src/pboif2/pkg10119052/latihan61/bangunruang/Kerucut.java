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
public class Kerucut implements BangunRuang{
    private int jari;
    private double phi;
    private int tinggi;
    
    public int getJari(){
        return jari;
    }
    public void setJari(int jari){
        this.jari = jari;
    }
    public double getPhi(){
        return phi;
    }
    public void setPhi(double phi){
        this.phi = phi;
    }
    public int getTinggi(){
        return tinggi;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    @Override
    public double hitungVolume(){
        return 0.33 * phi * jari * jari * tinggi;
        
    }
}
