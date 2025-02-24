/*public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
    }
    
}
*/

public class RestaurantMain {
    // Metode utama digunakan untuk menguji fungsi penambahan menu, tampilan, dan pemesanan.
public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(10);
        restaurant.addMenuItem("Bala-Bala", 1000, 20);
        restaurant.addMenuItem("Gehu", 1000, 5);
        restaurant.addMenuItem("Molen", 1000, 20);
        restaurant.addMenuItem("Teh Manis", 500, 10);
        
        restaurant.displayMenu();
        
        System.out.println("\nMelakukan pemesanan Bala-Bala sebanyak 5...");
        restaurant.orderItem("Bala-Bala", 5);
        
        restaurant.displayMenu();
    }
}
