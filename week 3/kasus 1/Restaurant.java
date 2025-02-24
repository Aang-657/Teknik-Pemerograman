/*public class Restaurant {
    private final String[] nama_makanan;
    private final double[] harga_makanan;
    private int[] stok;
    private static byte id=0;

    public Restaurant(){
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan (String nama, double harga, int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void nextId(){
        id++;
    }    
}
*/

// Kelas ini bertanggung jawab untuk mengelola menu, memisahkan tanggung jawab dari item individu.
public class Restaurant {
    private final MenuItem[] menu;
    private int itemCount;

    public Restaurant(int capacity) {
        menu = new MenuItem[capacity];
        itemCount = 0;
    }

    public void addMenuItem(String name, double price, int stock) {
        if (itemCount < menu.length) {
            menu[itemCount++] = new MenuItem(name, price, stock);
        }
    }

    public void displayMenu() {
        for (int i = 0; i < itemCount; i++) {
            if (menu[i].getStock() > 0) {
                System.out.println(menu[i].getName() + " [" + menu[i].getStock() + "]\tRp. " + menu[i].getPrice());
            }
        }
    }

    // Metode ini ditambahkan untuk menangani pemesanan dan mengurangi stok secara otomatis.
    public boolean orderItem(String name, int quantity) {
        for (int i = 0; i < itemCount; i++) {
            if (menu[i].getName().equals(name) && menu[i].getStock() >= quantity) {
                menu[i].reduceStock(quantity);
                return true;
            }
        }
        return false;
    }
}




