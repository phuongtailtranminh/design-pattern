package net.jackietran.designpattern.singleton.lazyinit;

public class ApplicationConfig {

    private static ApplicationConfig instance;

    private ApplicationConfig() {
    }

    public static ApplicationConfig getInstance() {
        if (instance == null) {
            instance = new ApplicationConfig();
        }
        return instance;
    }

}
