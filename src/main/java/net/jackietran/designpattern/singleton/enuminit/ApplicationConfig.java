package net.jackietran.designpattern.singleton.enuminit;

public enum ApplicationConfig {

    INSTANCE;

    private static final String EMPTY = "";

    public static String getConfig() {
        return EMPTY;
    }

}