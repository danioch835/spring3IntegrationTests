package javaBased;

import com.example.bobo.CountryRepository;
import com.example.bobo.CountryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;

@Configuration
public class ConfigCountry {

    @Bean
    public CountryService bookService() {
        return new CountryService();
    }

    @Bean
    public CountryRepository bookRepository() {
        return new CountryRepository();
    }

}
