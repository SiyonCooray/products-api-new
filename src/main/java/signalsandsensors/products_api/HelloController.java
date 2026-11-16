package signalsandsensors.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController //Spring, this one handles web requests
public class HelloController {
    @GetMapping("/hello") // when someone visits /hello, run this method
    public String hello(){
        return "Hi! Java";
    }

    @GetMapping("/status")
    public String status(){
        return "API running - " + LocalDate.now().toString();

    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "Good bye";

    }
}
