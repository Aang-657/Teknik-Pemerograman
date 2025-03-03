// Abstract Class: Hantu digunakan sebagai dasar untuk semua jenis hantu
abstract class Hantu {
    private String nama;
    private int kekuatan;
    private String elemen;

    public Hantu(String nama, int kekuatan, String elemen) {
        this.nama = nama;
        this.kekuatan = kekuatan;
        this.elemen = elemen;
    }

    public String getNama() { return nama; }
    public int getKekuatan() { return kekuatan; }
    public String getElemen() { return elemen; }

    // Abstract Method: Harus diimplementasikan oleh subclass
    public abstract void menghantui();

    public void infoHantu(){
        System.out.println(nama + "(Elemen: " + elemen + ", Kekuatan: " + kekuatan + ")");
    }

} 