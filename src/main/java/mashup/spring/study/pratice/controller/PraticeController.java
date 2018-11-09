package mashup.spring.study.pratice.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class PraticeController {

    private Environment env;

    public PraticeController(Environment env) {
        this.env = env;
    }

    @RequestMapping("/")
    public String index() {
        return "build passed !!!!";
    }


    @GetMapping("/profile")
    public String getProfile() {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}
