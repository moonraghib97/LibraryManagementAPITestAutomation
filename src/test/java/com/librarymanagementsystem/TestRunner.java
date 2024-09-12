package com.librarymanagementsystem;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/java/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)
public class TestRunner {
}
