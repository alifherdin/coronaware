package cfour.haps.coronaware;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/info")
    public String index() {
        return "info";
    }

    @GetMapping("/langkah-pencegahan")
    public String langkahpecegahan() {
        return "langkah-pencegahan";
    }

    @GetMapping("/Statistik")
    public String statistik() {
        return "hasil-form-donasi";
    }
}