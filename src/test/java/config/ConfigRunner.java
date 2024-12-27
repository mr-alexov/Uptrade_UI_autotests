package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ConfigRunner {
    private final WebDriverConfig config;

    Logger logger = LoggerFactory.getLogger(ConfigRunner.class);

    public ConfigRunner() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        createDriver();
    }

    private void createDriver() {

        Configuration.browser = config.getBrowserName();

        logger.info("Browser: " + Configuration.browser);

        Configuration.browserVersion = config.getBrowserVersion();

        logger.info("Browser version: " + Configuration.browserVersion);

        Configuration.browserSize = config.getBrowserSize();

        logger.info("Browser size: " + Configuration.browserSize);

        logger.info("Remote URL: " + config.getRemoteURL());

        if (config.getRemoteURL() != null) {
            Configuration.remote = config.getRemoteURL().toString();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));

            Configuration.browserCapabilities = capabilities;
        }
    }
}

