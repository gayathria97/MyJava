package ECIMS;
import java.util.*;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) throws ProductNotFoundException{

        Scanner sc=new Scanner(System.in);
        ProductManager pm=new ProductManager();
        while (true){

            System.out.println("Enter the number of operation to perform: ");
            System.out.println("Inventory Management System ");
            System.out.println("1.Adding: ");
            System.out.println("2.Remove: ");
            System.out.println("3.Update: ");
            System.out.println("4.View last 5 products: ");
            System.out.println("5.Display all products: ");
            System.out.println("6.Exit: ");
            System.out.println("Enter the choice which you want to do: ");
            int choice= sc.nextInt();
            switch (choice){

                case 1:
                    System.out.println("enter Product id: ");
                    int id= sc.nextInt();

                    System.out.println("enter Prodoct name: ");
                    String name=sc.next();

                    System.out.println("enter Product price: ");
                    double price=sc.nextDouble();

                    System.out.println("enter Product quantity: ");
                    int quantity=sc.nextInt();

                    Product p1=new Product();
                    p1.setPrice(price);
                    p1.setId(id);
                    p1.setName(name);
                    p1.setQuantity(quantity);
                    pm.addProduct(p1);
                    pm.addRecentlyViewedProduct(p1);

                    break;

                case 2:
                    System.out.println("enter the product id you want to remove: ");
                    int productid= sc.nextInt();
                    pm.removeProduct(productid);

                    break;

                case 3:
                    System.out.println("enter the product you want to update: ");
                    System.out.println("enter product id where you want to update: ");
                    int id2=sc.nextInt();

                    System.out.println("enter product name: ");
                    String name2=sc.next();

                    System.out.println("enter product price: ");
                    double price2=sc.nextDouble();

                    System.out.println("enter product quqntity: ");
                    int quantity2=sc.nextInt();



                    break;

                case 4:
                    pm.displayRecenctlyViewedProducts();
                    break;

                case 5:
                    pm.displayProduct();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("enter valid choice: ");



            }

        }

    }
}
