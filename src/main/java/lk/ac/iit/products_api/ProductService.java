package lk.ac.iit.products_api;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {

    private ArrayList<Product> products = new ArrayList<>();
    private Long id = 1L;

    public ArrayList<Product> getAllProducts(){
        return products;
    }

    public Optional<Product> findByName(String name){
        return products.stream().filter(p->p.getName().equals(name)).findFirst();

    }

    public Optional<Product> getProductById(Long id){
        return products.stream().filter(p->p.getId().equals(id)).findFirst();

    }

    public Product addProduct(Product product){
        product.setId(id);
        id++;
        products.add(product);
        return product;
    }

    public String deleteProduct(Long id){
        boolean isDeleted= products.removeIf(p->p.getId().equals(id));

        if(isDeleted){
            return "Item deleted successfully";

        }
        else{
            return "Item not found";
        }

    }


}
