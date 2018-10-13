package math;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/square")
    public Square square(@RequestParam(value="value", defaultValue="2") String input) {
        return new Square(counter.incrementAndGet(), Long.parseLong(input));
    }
}
