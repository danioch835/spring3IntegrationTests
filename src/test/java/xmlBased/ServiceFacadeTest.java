package xmlBased;

import com.example.bobo.ServiceFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/test/resources/app-test-full-context.xml")
@Transactional
public class ServiceFacadeTest {

    @Autowired
    private ServiceFacade facade;

    @Test
    public void updateCountryName() {
        System.out.println(facade.updateCountryName(1L, "Polska1"));
    }

    @Test
    public void getCountryAndPrice() {
        System.out.println(facade.getCountryAndPrice());
    }

}