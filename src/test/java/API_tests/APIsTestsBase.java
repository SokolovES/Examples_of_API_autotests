package API_tests;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static java.lang.System.getProperty;

/**
 * Add config file, where can change Entry Point.
 */

public class APIsTestsBase {

    public static Properties API_tests_config = new Properties();

    @BeforeTest
    public void setConfig() throws IOException {
        String target = getProperty("target", "API_tests_config");
        API_tests_config.load(new FileReader(new File(String.format("src/test/resources/API_data/%s.properties", target))));
    }
}