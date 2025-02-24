
// Dibuat sebagai representasi dari satu item menu agar data makanan lebih terstruktur dan sesuai dengan prinsip OOP.
public class MenuItem {
    // Variabel dibuat private dan final untuk menjaga enkapsulasi serta memastikan nama makanan tidak berubah setelah dibuat.
    private final String name;
    private final double price;
    private int stock;

    public MenuItem(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Metode ini memungkinkan pengurangan stok dengan memastikan jumlah yang valid, meningkatkan fleksibilitas program.
    public void reduceStock(int quantity) {
        if (quantity > 0 && stock >= quantity) {
            stock -= quantity;
        }
    }
}