package yinjianjun.r8_3;

import javafx.scene.control.CustomMenuItem;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by yinjianjun on 17-1-8.
 */
public class Customer {
    public/* private */ Customer(String name){
        _name = name;
    }
    public String getName(){
        return _name;
    }

    private final String _name;

    // 添加工厂函数
    public static Customer create /* getNamed */ (String name){
        return new Customer(name);

        // 返回预先创建好的Customer对象
        // return (Customer) _instances.get(name);
    }

    // 注册表访问点
    private static Dictionary _instances = new Hashtable();
    private void store(){
        _instances.put(this.getName(), this);
    }


    // 预先创建好
    static void loadCustomers(){
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilstom Gasworks").store();
    }


}
