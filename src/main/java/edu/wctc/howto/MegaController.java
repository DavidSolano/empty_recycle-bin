package edu.wctc.howto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MegaController {

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/first-step")
    public String getFirstStep(){
        return "pages/part-one";
    }

    @GetMapping("/second-step")
    public String getSecondStep(){
        return "pages/part-two";
    }

    @GetMapping("/third-step")
    public String getThirdStep(){
        return "pages/part-three";
    }
}
