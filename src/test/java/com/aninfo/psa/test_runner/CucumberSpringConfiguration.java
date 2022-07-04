package com.aninfo.psa.test_runner;


import com.aninfo.psa.PsaProyectosApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest(classes = PsaProyectosApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(Cucumber.class)
@CucumberOptions
@CucumberContextConfiguration
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
public class CucumberSpringConfiguration {

}
