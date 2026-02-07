package io.matoshri.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Demo2ApplicationTests {

    @Test
    void contextLoads() {
        boolean condition = true;
        // This is the core assertion to make the test "pass" based on a true value
        assertTrue(condition, "Optional message if it fails");
    }

}
