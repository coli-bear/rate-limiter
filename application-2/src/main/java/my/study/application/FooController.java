package my.study.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @GetMapping("/foo")
    public String foo() {
        return "foo";
    }
}
