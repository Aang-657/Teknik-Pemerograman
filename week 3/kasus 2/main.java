
public class main {
    public static void main(String[] args) {
        //constructor
        Film film1 = new Film("Doraemon", "Fantasy", 120, 45000, 12);
        Pelanggan pelanggan1 = new Pelanggan("Isana", "isananura098@gmail.com");
        Tiket tiket1 = new Tiket(film1, "09:00 WIB", "A12 & A13");
        Pemesanan pemesanan1 = new Pemesanan(pelanggan1, tiket1, 2);
        
        //menampilkan informasi film dan pemesanan 
        pemesanan1.tampilkanDetailPemesanan();
        
    }
}
