import Model.Clouthes;
import Model.RainClouthes;
import Model.SummerClouthes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Main {
    private static String season;
    private static Clouthes clouthes;

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        Main main = new Main();
        File file = main.getFileFromResources("application.properties");
        properties.load(new FileInputStream(file));
        season = properties.getProperty("season");
        switch (season) {
            case ("Summer"):
                clouthes = new SummerClouthes();
                break;
            case ("Winter"):
                clouthes = new RainClouthes();
                break;
        }
        clouthes.putOn();
        clouthes.takeWith();
    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }

}
