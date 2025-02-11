package kafkademo.producer.Controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kafkademo.producer.Services.KafkaService;

@RestController
@RequestMapping("/Data")
public class DataController {

    private KafkaService kafkaService;

    public DataController(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @PostMapping("/updateData")
    public ResponseEntity<?> UpdateData() {

        String data = "( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )";
        this.kafkaService.UpdateData(data);

        return new ResponseEntity<>(Map.of("message", "Data Updated"), HttpStatus.OK);
    }
}
