// Inheritance: Kuntilanak merupakan subclass dari Hantu
// Implements Multiple Interfaces: Kuntilanak mengimplementasikan Menakuti dan BisaTerbang
class Kuntilanak extends Hantu implements BisaTerbang, Menakuti {
    public Kuntilanak(String nama, int kekuatan) {
        super(nama, kekuatan, "Angin");
    }

    // Polymorphism: Implementasi dari metode abstrak menghantui() dengan cara berbeda dari Pocong/Genderuwo
    @Override
    public void menghantui() {
        System.out.println(getNama() + " tertawa menyeramkan dan tiba-tiba menghilang!");
    }

    // Implementasi dari interface Menakuti
    @Override
    public void menyerang() {
        System.out.println(getNama() + " meniup angin dingin yang membuat korban merinding ketakutan!");
    }

    // Implementasi dari interface BisaTerbang
    @Override
    public void terbang() {
        System.out.println(getNama() + " melayang di udara dengan suara angin kencang!");
    }
}
