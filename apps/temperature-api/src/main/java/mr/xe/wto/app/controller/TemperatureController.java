package mr.xe.wto.app.controller;

import java.util.Random;
import mr.xe.wto.app.dto.TemperatureResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class TemperatureController {

  private static final Random RANDOM = new Random();

  @RequestMapping(
      value = {"/temperature", "/temperature/**"}
  )
  public TemperatureResponse getTemperature() {
    Float temperature = (float) RANDOM.nextInt(-50, 50);
    System.out.println(" >>> Temperature request: " + temperature);
    return new TemperatureResponse(temperature);
  }


}
