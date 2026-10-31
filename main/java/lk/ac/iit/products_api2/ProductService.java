package lk.ac.iit.products_api2;

import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id){
        return products.stream() //
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name){
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    public List<String> getAllSummaries(){
        List<String> summaries = new ArrayList<>();
        for (Product p: products){
            summaries.add(p.getSummary());

            if(p instanceof Discountable discountable){
                discountable.applyDiscount(0.10);
            }
        }
        return summaries;
    }
}
