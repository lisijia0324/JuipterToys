package com.planittesting.automation.tests.cucumber;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:${mypath}/environmentProperties/${env}.properties"
})

public interface Environment extends Config {
    String url();

    String username();

    String password();

    @Key("db.hostname")
    String getDBHostname();

    @Key("db.port")
    int getDBPort();

    @Key("db.username")
    String getDBUsername();

    @Key("db.password")
    String getDBPassword();
}
