package Test1;

import java.io.*;
import java.util.Properties;

/**
 * ZengJunxian
 * 2019/4/2 14:54
 */
public class SmallRoom implements Hotel {
    static private Properties pro = new Properties();
    static private int price;
static {
    try {
        InputStream in = new BufferedInputStream(new FileInputStream("config.properties"));
        pro.load(in);
        price = Integer.parseInt(pro.getProperty("smallroomprice"));
    } catch (IOException e) {
        e.printStackTrace();
    }

}
    @Override
    public void Book(int q, int d) {
        System.out.println("类型：小床房");
        System.out.println("数量：" + q);
        System.out.println("天数" + d);
        System.out.println("价格" + price);
        System.out.println("总金额：" + price * d * q);
    }

    @Override
    public void UnBook() {
        System.out.println("取消小床房");
    }


}
