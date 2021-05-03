package com.example.bitriseintegrationexercise

import io.kotlintest.specs.BehaviorSpec
import org.junit.jupiter.api.Assertions.assertTrue

class ExampleUnitTest2 : BehaviorSpec ({
    given("Given this") {
        `when`("When some situation") {
            then("Then verify something...") {
                assertTrue(true)
            }
        }
    }
})