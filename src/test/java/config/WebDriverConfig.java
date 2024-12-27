package config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources({
        "system:properties",
        "classpath:properties/${env}.properties",
        "classpath:properties/local.properties"
})

public interface WebDriverConfig extends Config {
    @Key("browser.name")
    @Config.DefaultValue("chrome")
    String getBrowserName();

    @Key("browser.version")
    @DefaultValue("120.0")
    String getBrowserVersion();

    @Key("browser.size")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remoteUrl")
    URL getRemoteURL();
}
