package net.jackietran.designpattern.singleton.threadsafe;

public class ApplicationConfig {

    private static volatile ApplicationConfig instance;

    private ApplicationConfig() {
    }

    public static ApplicationConfig getInstance() {
        if (instance == null) {
            synchronized (ApplicationConfig.class) {
                if (instance == null) {
                    instance = new ApplicationConfig();
                }
            }
        }
        return instance;
    }

}
