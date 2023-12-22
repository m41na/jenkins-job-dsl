package works.hop.jenkins;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HelloJenkinsTest {

    @Test
    public void testGreeting() {
        assertThat(new HelloJenkins().greeting()).isEqualTo("Hello there");
    }
}
