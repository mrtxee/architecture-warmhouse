package mr.xe.wto.app.controller;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TemperatureController {

  private static final Random RANDOM = new Random();
  @GetMapping("temperature")
  public String getTemperature() {
    return String.valueOf(RANDOM.nextInt(-50, 50));
  }
}
