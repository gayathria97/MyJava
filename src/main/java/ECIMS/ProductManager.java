package ECIMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

     private ArrayList<Product> Products;
     private LinkedList<Product> recentlyViewedProducts;

    public ProductManager(int quantity,ArrayList<Product> products, LinkedList<Product> recentlyViewedProducts) {

        this.Products = products;
        this.recentlyViewedProducts = recentlyViewedProducts;
    }

    public ProductManager() {

    }

    public void addProduct(Product product){
        if(product.getPrice() < 0){
            throw new IllegalArgumentException("product value can't be negative.");
        }
        else{
            Products = new ArrayList<>();
            Products.add(product);
        }
    }
    public void removeProduct(int id) throws ProductNotFoundException{

        try {
            for (Product product:productList()){
                if (product.getId() == id){
                        System.out.println("product is removed: ");
                        productList().remove(product);
                    }
                    else {
                        System.out.println("product not removed: ");
                    }
                }
            }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(double price,int id) throws ProductNotFoundException{

        try {
           for (Product p:productList()){
               if (p.getId() == id){
                   System.out.println("product price is updated: ");
                   p.setPrice(price);
               }
               else {
                   System.out.println("product price isnot updated: ");
               }
           }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Product> productList(){

        return Products;
    }
    public void displayProduct(){
        System.out.println("display all products: ");
        for (Product p:productList()){
            System.out.println(p);
        }
    }
    public void addRecentlyViewedProduct(Product product){
        recentlyViewedProducts = new LinkedList<>();
        if (recentlyViewedProducts.size() >= 5){
            recentlyViewedProducts.removeFirst();
        }
        recentlyViewedProducts.add(product);
    }
    public void displayRecenctlyViewedProducts(){
        System.out.println("recenctly viewed products: ");
        for (Product product : recentlyViewedProducts){
            System.out.println(product);
        }
    }





    public void findProductById(String Id) throws ProductNotFoundException{

    }
}
