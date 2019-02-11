package net.jackietran.designpattern.singleton.staticblock;

public class ApplicationConfig {

    private static ApplicationConfig instance;

    static {
        try {
            instance = new ApplicationConfig();
            // get db connection
            // get file descriptor
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // clean up
        }
    }

    private ApplicationConfig() {
    }

    public static ApplicationConfig getInstance() {
        return instance;
    }

}
