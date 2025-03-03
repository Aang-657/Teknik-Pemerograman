// Inheritance: Pocong merupakan subclass dari Hantu dan mewarisi semua atribut serta metode dari Hantu
// Implements Interface: Pocong mengimplementasikan Menakuti sehingga harus memiliki metode menyerang()
class Pocong extends Hantu implements Menakuti {
    public Pocong(String nama, int kekuatan) {
        super(nama, kekuatan, "Tanah");
    }

    // Polymorphism: Implementasi dari metode abstrak menghantui() dengan cara berbeda dari Kuntilanak/Genderuwo
    @Override
    public void menghantui() {
        System.out.println(getNama() + " melompat-lompat dan menatap dengan mata kosong!");
    }

    // Implementasi dari interface Menakuti
    @Override
    public void menyerang() {
        System.out.println(getNama() + " tiba-tiba muncul di belakang korban dan membuatnya pingsan!");
    }
}
