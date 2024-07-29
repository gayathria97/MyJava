package ECIMS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {


     private ArrayList<Product> Products;
     private LinkedList<Product> recentlyViewedProducts;

    public ProductManager(int quantity,ArrayList<Product> products, LinkedList<Product> recentlyViewedProducts) {

        this.Products = products;
        this.recentlyViewedProducts = recentlyViewedProducts;
    }

    public void addProduct(Product product){
        if(product.getPrice() < 0){
            throw new IllegalArgumentException("product value can't be negative.");
        }
        addProduct(product);
    }
    public void removeProduct(int id) throws ProductNotFoundException{
        boolean found=false;

        Iterator<Product> it = productList().iterator();
         for (Product p:)

         removeProduct();
    }

    private void removeProduct() {
    }

    public void updateProduct(){

    }
    public List<Product> productList(){

        return List.of();
    }






    public void findProductById(String Id) throws ProductNotFoundException{

    }
}
