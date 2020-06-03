package cfour.haps.coronaware;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/info")
    public String index() {
        return "info";
    }
}