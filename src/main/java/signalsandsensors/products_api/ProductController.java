package signalsandsensors.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RequestMapping("/products")  +  @GetMapping("/{id}")  =  /products/{id}
@RequestMapping("/products")
public class ProductController {
    @Autowired //@Autowired tells Spring: “hand me the object you built, don’t make me create it.”
    private ProductService productService; // Why no new? Because @Service on ProductService told Spring to create one at startup. @Autowired just asks for it.

//    @GetMapping("/{id}")
//    // @PathVariable delivers it. This annotation tells Spring: “take the {id} part of the URL and put it into this parameter.” Spring also converts the text "1" into a Long for you. So inside the method, id holds 1.

    /// /    public Product getById(@PathVariable Long id) {
    /// /        return new Product(id, "Laptop", 999.99);
    /// /    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
