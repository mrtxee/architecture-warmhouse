package mr.xe.wto.app.controller;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import mr.xe.wto.app.dto.TemperatureResponse;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TemperatureController {

  private static final Random RANDOM = new Random();

  @RequestMapping(
      value = {"/temperature", "/temperature/**"}
  )
  public TemperatureResponse getTemperature() {
    final float temperature = RANDOM.nextFloat(-50, 50);
    log.debug(" >>> Temperature request: {}", temperature);
    return new TemperatureResponse(temperature);
  }

}
