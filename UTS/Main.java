import java.util.ArrayList;
import java.util.Scanner;

// Class Item sebagai kelas dasar untuk menu (enkapsulasi dan inheritance)
class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Class Drink sebagai subclass dari Item untuk minuman
class Drink extends Item {
    public Drink(String name, double price) {
        super(name, price);
    }
}

// Class Snack sebagai subclass dari Item untuk snack
class Snack extends Item {
    public Snack(String name, double price) {
        super(name, price);
    }
}

// Class MenuManager untuk mengelola daftar menu minuman dan snack
class MenuManager {
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Snack> snacks = new ArrayList<>();

    public void addDrink(String name, double price) {
        drinks.add(new Drink(name, price));
    }

    public void addSnack(String name, double price) {
        snacks.add(new Snack(name, price));
    }

    public void showMenu() {
        System.out.println("\nDaftar Menu Minuman:");
        for (Drink drink : drinks) {
            System.out.println("- " + drink.getName() + ": Rp " + drink.getPrice());
        }

        System.out.println("\nDaftar Menu Snack:");
        for (Snack snack : snacks) {
            System.out.println("- " + snack.getName() + ": Rp " + snack.getPrice());
        }
    }
}

// Class utama untuk menjalankan aplikasi
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuManager menuManager = new MenuManager();
        
        System.out.println("Selamat datang di Aplikasi Input Menu Minuman dan Snack!");

        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Tambah Minuman");
            System.out.println("2. Tambah Snack");
            System.out.println("3. Tampilkan Menu");
            System.out.println("4. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Masukkan nama minuman: ");
                String drinkName = scanner.nextLine();
                System.out.print("Masukkan harga minuman: ");
                double drinkPrice = scanner.nextDouble();
                menuManager.addDrink(drinkName, drinkPrice);
                System.out.println("Minuman berhasil ditambahkan!");

            } else if (choice == 2) {
                System.out.print("Masukkan nama snack: ");
                String snackName = scanner.nextLine();
                System.out.print("Masukkan harga snack: ");
                double snackPrice = scanner.nextDouble();
                menuManager.addSnack(snackName, snackPrice);
                System.out.println("Snack berhasil ditambahkan!");

            } else if (choice == 3) {
                menuManager.showMenu();

            } else if (choice == 4) {
                System.out.println("Terima kasih! Sampai jumpa!");
                break;

            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
