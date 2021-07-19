package com.spring.strategy.springstrategydesignpattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SomeService {

    @Autowired
    private StrategyFactory strategyFactory;

    public void findSome(){

        // Now get the strategy by passing the name
        Optional<Strategy> strategy =
                strategyFactory.findStrategy(StrategyName.StrategyD);
        // you can now call the methods defined in strategy.
        strategy.get().doStuff();
    }
}