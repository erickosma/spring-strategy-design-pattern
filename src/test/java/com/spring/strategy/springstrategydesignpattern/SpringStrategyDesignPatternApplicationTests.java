package com.spring.strategy.springstrategydesignpattern;

import com.spring.strategy.springstrategydesignpattern.strategy.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringStrategyDesignPatternApplicationTests {

    @Autowired
    SomeService someService;

    @Test
    void contextLoads() {
        someService.findSome();
    }

}
