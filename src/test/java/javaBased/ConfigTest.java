package javaBased;

import com.example.bobo.ServiceFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import static org.mockito.Mockito.mock;

@Configuration
@ImportResource("file:src/test/resources/app-test-min-context.xml")
public class ConfigTest {
    @Bean
    public ServiceFacade serviceFacade() {
        return new ServiceFacade();
    }
}
