

public class Pelanggan {
    private String nama;
    private String email;
    
    public Pelanggan(String nama, String email) {
        //atribute
        this.nama = nama;
        this.email = email;
    }
    
    //method
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
