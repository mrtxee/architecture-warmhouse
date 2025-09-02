package mr.xe.wto.app.dto;

import java.time.Instant;
import lombok.Data;

@Data
public class TemperatureResponse {
  Float value;
  Instant timestamp;
  String unit;
  String location;
  String status;
  String sensor_id;
  String sensor_type;
  String description;

  public TemperatureResponse(Float value) {
    this.value = value;
    this.timestamp = Instant.now();
    this.unit = "degree";
    this.location = "location";
    this.status = "active";
    this.sensor_id = "sensor_id";
    this.sensor_type = "sensor_type";
    this.description = "description";
  }
}
