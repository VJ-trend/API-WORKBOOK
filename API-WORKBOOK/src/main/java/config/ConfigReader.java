package config;

import java.util.ResourceBundle;

public class ConfigReader {
    private static final ResourceBundle rb = ResourceBundle.getBundle("config");

    public static String getBaseUrl() {
        return rb.getString("base_url");
    }
}
