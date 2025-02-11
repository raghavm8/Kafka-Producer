package kafkademo.producer.Configurations;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
    
    @Bean
    public NewTopic GetTopic() {
        return TopicBuilder.name(ConfigurationConstants.Topic_Name_For_Update_Data).build();
    }
}
