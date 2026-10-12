package lk.ac.iit.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public ArrayList<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")

    public Product getProduct(@PathVariable Long id){

        return productService.getProductById(id).orElse(null);

    }
    @PostMapping()
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);

    }

    @GetMapping("/byName")
    public Product findByName(@RequestParam String name){
        return productService.findByName(name).orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }


}

