

public class Film {
    private String judul;
    private String genre;
    private int durasi;
    private double harga;
    private int rating;

    public Film(String judul, String genre, int durasi, double harga, int rating) {
        //atribute
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.harga = harga;
        this.rating = rating;
    }
    //method 
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public int getDurasi() { return durasi; }
    public void setDurasi(int durasi) { this.durasi = durasi; }
    
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public double getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

}
