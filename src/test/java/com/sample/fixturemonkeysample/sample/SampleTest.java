package com.sample.fixturemonkeysample.sample;

import com.navercorp.fixturemonkey.ArbitraryBuilder;
import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.experimental.JavaGetterMethodPropertySelector;
import com.navercorp.fixturemonkey.api.introspector.ConstructorPropertiesArbitraryIntrospector;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import lombok.Getter;
import lombok.Value;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssertions;
import org.assertj.core.util.Streams;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void tests() {

        FixtureMonkey fixtureMonkey = FixtureMonkey.builder()
//                .objectIntrospector(ConstructorPropertiesArbitraryIntrospector.INSTANCE)
                .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
                .defaultNotNull(true)
                .build();


        ArbitraryBuilder<Order> hello = fixtureMonkey.giveMeBuilder(Order.class);

        for (int i = 0; i< 3; i++) {
            System.out.println(hello.sample().name);
        }
    }
}


