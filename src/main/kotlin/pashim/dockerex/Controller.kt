package pashim.dockerex

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Controller {

    @GetMapping("/asd")
    fun home(): String {
        return "home"
    }

    @GetMapping("/")
    fun index(): String {
        return "index"
    }
}
