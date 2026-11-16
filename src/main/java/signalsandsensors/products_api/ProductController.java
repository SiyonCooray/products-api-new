package signalsandsensors.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/products")  +  @GetMapping("/{id}")  =  /products/{id}
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    // @PathVariable delivers it. This annotation tells Spring: “take the {id} part of the URL and put it into this parameter.” Spring also converts the text "1" into a Long for you. So inside the method, id holds 1.
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);
    }
}
