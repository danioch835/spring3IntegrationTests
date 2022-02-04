package javaBased;

import com.example.bobo.PriceRepository;
import com.example.bobo.PriceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Configuration
public class ConfigPrice {

    @Bean
    public PriceService priceService() {
        PriceService mock = mock(PriceService.class);
        when(mock.getPrice()).thenReturn(1.0);
        return mock;
    }

    @Bean
    public PriceRepository priceRepository() {
        PriceRepository mock = mock(PriceRepository.class);
        return mock;
    }

}
