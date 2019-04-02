package Test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ZengJunxian
 * 2019/4/2 15:02
 */
public class Main {
    private static String path="src/Test1/config.properties";
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Properties pro=new Properties();
        pro.load(new FileInputStream(new File(path)));
        Hotel user=Factory.getRoom(pro.getProperty("bigroom"));
        user.Book(1,2);
    }
}
