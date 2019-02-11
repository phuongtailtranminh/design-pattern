package net.jackietran.designpattern.singleton.eagerinit;

public class ApplicationConfig {

    private static final ApplicationConfig instance = new ApplicationConfig();

    // prevent client code to accidentally create new instance
    private ApplicationConfig() {
    }

    public static ApplicationConfig getInstance() {
        return instance;
    }

}
