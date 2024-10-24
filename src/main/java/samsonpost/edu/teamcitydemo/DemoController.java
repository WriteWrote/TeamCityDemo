package samsonpost.edu.teamcitydemo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {
    @GetMapping("/helloworld")
    public String returnHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/goodbye")
    public String returnGoodByeHuman(){
        return "Good Bye Human!";
    }
}
