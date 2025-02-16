import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
    
    class InventoryManagementSystem{
        private ArrayList<Product> products;
        
        public InventoryManagementSystem() {
            products = new ArrayList<>();
        }
        
        public void addProduct(String name, double price) {
            Product newProduct = new Product(name, price);
            products.add(newProduct);
            System.out.println("Product Added: " + name + ", Price: "+ price);
        }
        
        public void displayProducts() {
            if(products.isEmpty()) {
                System.out.println("No Products Available.");
            }else {
                System.out.println("Product List:");
                for (Product product : products) {
                    System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice());
                }
            }
        }
    }
    
    class InventoryManagementApp {
        public static void main (String [] args){
            InventoryManagementSystem inventory = new InventoryManagementSystem();
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("**************************************************");
            System.out.println("Welcome To Inventory Management System");
            System.out.println("BY: John Cedric A. Cabillon ");
            System.out.println("**************************************************");
            
            while(true){
                System.out.println("\nMenu:");
                System.out.println("1. Add Products.");
                System.out.println("2. Display Products.");
                System.out.println("3. Exit.");
                System.out.print("Enter youc choice: ");
                
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice){
                    case 1:
                        System.out.print("Enter product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter product price: ");
                        double price = scanner.nextDouble();
                        inventory.addProduct(name, price);
                        break;
                        
                    case 2:
                        inventory.displayProducts();
                        break;
                        
                    case 3:
                        System.out.println("Thankyou For your Time:)");
                        scanner.close();
                        return;
                        
                    default:
                        System.out.println("Invalid Choice, Please Try Again");
                }
            }
        }
    }