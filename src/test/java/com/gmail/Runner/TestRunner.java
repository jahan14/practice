package com.gmail.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Features",glue = "com\\gmail\\main",
dryRun = false,monochrome = true,plugin = {"pretty","html:src\\report.html","json:src\\repor.json","junit:src\\rep.xml"},tags = "@saleem")



public class TestRunner
{

}
