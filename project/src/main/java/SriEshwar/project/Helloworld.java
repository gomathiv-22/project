package SriEshwar.project;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Helloworld {
    @GetMapping()
    public String getMethodName() {
        return "Hello World";
    }

}