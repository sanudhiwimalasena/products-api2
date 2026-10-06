package lk.ac.iit.products_api2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/products")
    public class ProductController{

        @GetMapping("/{id}")
        public Product getById(@PathVariable Long id){
            return new Product(id, "laptop", 999.99); //Jackson library will convert this java object to json
        }
    }

