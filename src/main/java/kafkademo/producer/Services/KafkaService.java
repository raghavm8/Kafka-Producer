package kafkademo.producer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import kafkademo.producer.Configurations.ConfigurationConstants;

@Service
public class KafkaService {
    
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    
    public boolean UpdateData(String data) {
        this.kafkaTemplate.send(ConfigurationConstants.Topic_Name_For_Update_Data, data);
        return true;
    }
}
 