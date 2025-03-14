package pattern.factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    // 加載配置文件，獲取配置文件中配置的全類名，並創建該類的物件進行存儲
    // 1. 定義容器物件，儲存咖啡物件
    private static HashMap<String, Coffee> map = new HashMap<>();

    // 2. 加載配置文件，只需要加載一次
    static {
        // 2.1 創建 Properties 物件
        Properties p = new Properties();
        // 2.2 調用 p 物件中的 load 方法進行配置文件的加載
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            // 從 p 集合中獲取全類名並創建物件
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String)key);
                // 通過反射創建物件
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 將名稱和物件儲存到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 根據名稱獲取物件
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
