package lk.ac.iit.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
    private String email="spring@gmail.com";
    @GetMapping("/getEmail")

    public String  getEmail(){
        return this.email;
    }
}
