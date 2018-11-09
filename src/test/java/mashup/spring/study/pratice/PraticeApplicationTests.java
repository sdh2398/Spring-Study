package mashup.spring.study.pratice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class PraticeApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void ProfileTest () {
        String profile = this.restTemplate.getForObject("/profile",String.class);

        assertThat(profile).isEqualTo("local");
    }
}
