import java.util.ArrayList;

// Kelas untuk mengelola daftar hantu dan mengaktifkan aksi mereka
class DuniaGaib {
    private ArrayList<Hantu> daftarHantu = new ArrayList<>();

    public void tambahkanHantu(Hantu h) {
        daftarHantu.add(h);
    }

    public void mulaiMenghantui() {
        for (Hantu h : daftarHantu) {
            h.infoHantu();
            // Polymorphism: Memanggil metode menghantui() yang berbeda untuk setiap subclass
            h.menghantui();

            // Polymorphism dengan Instanceof: Mengecek apakah objek bisa menggunakan metode dari interface tertentu
            if (h instanceof Menakuti) {
                ((Menakuti) h).menyerang();
            }

            if (h instanceof BisaTerbang) {
                ((BisaTerbang) h).terbang();
            }

            System.out.println();
        }
    }
}
