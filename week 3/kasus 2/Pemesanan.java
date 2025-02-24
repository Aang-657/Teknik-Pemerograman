

public class Pemesanan {
    private Pelanggan pelanggan;
    private Tiket tiket;
    private int jumlahTiket;
    private double totalHarga;
    
    public Pemesanan(Pelanggan pelanggan, Tiket tiket, int jumlahTiket) {
        //atribute
        this.pelanggan = pelanggan;
        this.tiket = tiket;
        this.jumlahTiket = jumlahTiket;
        this.totalHarga = jumlahTiket * tiket.getFilm().getHarga();
    }
    
    //message 
    public void tampilkanDetailPemesanan() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Pelanggan: " + pelanggan.getNama() + " (" + pelanggan.getEmail() + ")");
        System.out.println("======================================================================");
        System.out.println("Film: " + tiket.getFilm().getJudul() + " | Genre: " + tiket.getFilm().getGenre() + " | Rating: " + tiket.getFilm().getRating()+"++");
        System.out.println("======================================================================");
        System.out.println("Jadwal: " + tiket.getJadwal() + " | Nomor Kursi: " + tiket.getNomorKursi());
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("-----------------------------------------------------------------------");
    }

}
