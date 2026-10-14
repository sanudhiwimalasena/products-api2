package lk.ac.iit.products_api2;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @Autowired //
    private ProductService productService;

    /*@Service	@Autowired	Result
    Present  	Present	    Spring detects the service and injects it. Works as intended.
    Missing	    Present	    Usually fails at startup because Spring cannot find a ProductService bean.
    Present	    Missing	    The service exists, but the controller field remains null.
    Missing    	Missing	    The service is not automatically registered, and the controller field remains null.*/

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/ {id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id).orElse(null); //because we used optional class in the method
    }

    @PostMapping("/products")
    public Product addProduct (@RequestBody Product product){
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/ {id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<Product> search (@RequestParam String name){
        return productService.findByName(name);
    }
}