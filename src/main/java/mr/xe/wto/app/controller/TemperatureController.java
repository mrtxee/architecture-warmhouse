package mr.xe.wto.app.controller;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TemperatureController {

  private static final Random RANDOM = new Random();

  @RequestMapping(
      value = {"/temperature", "/temperature/**"},
      method = {RequestMethod.GET, RequestMethod.PATCH}
  )
  public String getTemperature() {
    return String.valueOf(RANDOM.nextInt(-50, 50));
  }
}
