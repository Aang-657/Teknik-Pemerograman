import java.util.Random;

public class Tiket {
    private Film film;
    private String jadwal;
    private String nomorKursi;
    private String id;
    
    public Tiket(Film film, String jadwal, String nomorKursi) {
        //atribute
        this.film = film;
        this.jadwal = jadwal;
        this.nomorKursi = nomorKursi;
    }

    //method
    public Film getFilm() { return film; }
    public void setFilm(Film film) { this.film = film; }
    
    public String getJadwal() { return jadwal; }
    public void setJadwal(String jadwal) { this.jadwal = jadwal; }
    
    public String getNomorKursi() { return nomorKursi; }
    public void setNomorKursi(String nomorKursi) { this.nomorKursi = nomorKursi; }
}
