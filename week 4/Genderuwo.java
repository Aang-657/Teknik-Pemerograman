// Inheritance: Genderuwo merupakan subclass dari Hantu
// Implements Interface: Genderuwo mengimplementasikan Menakuti
class Genderuwo extends Hantu implements MenakutiBaru  {
    public Genderuwo(String nama, int kekuatan) {
        super(nama, kekuatan, "Api");
    }

    // Polymorphism: Implementasi dari metode abstrak menghantui() dengan cara berbeda dari Pocong/Kuntilanak
    @Override
    public void menghantui() {
        System.out.println(getNama() + " berubah menjadi bayangan besar dan menakuti korbannya!");
    }

    // Implementasi dari interface Menakuti
    @Override
    public void menyerang() {
        System.out.println(getNama() + " melemparkan bayangan hitam yang mengikat korbannya!");
    }
}
