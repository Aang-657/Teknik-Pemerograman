public class Main {
    public static void main(String[] args) {
        DuniaGaib dunia = new DuniaGaib();

        // Inheritance: Objek Pocong, Kuntilanak, dan Genderuwo merupakan turunan dari Hantu
        Hantu hantu1 = new Pocong("Pocong Lari", 80);
        Hantu hantu2 = new Kuntilanak("Kunti Tertawa", 95);
        Hantu hantu3 = new Genderuwo("Genderuwo Raksasa", 120);

        dunia.tambahkanHantu(hantu1);
        dunia.tambahkanHantu(hantu2);
        dunia.tambahkanHantu(hantu3);
    
        dunia.mulaiMenghantui();
    }    
}