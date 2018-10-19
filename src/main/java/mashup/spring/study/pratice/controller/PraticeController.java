package mashup.spring.study.pratice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PraticeController {

    @RequestMapping("/")
    public String index() {
        return "ㅎ2ㅎ2 Greetings from Spring Boot!!!";
    }
}
