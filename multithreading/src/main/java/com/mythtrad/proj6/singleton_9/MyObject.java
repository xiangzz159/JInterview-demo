package com.mythtrad.proj6.singleton_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author：Yerik Xiang
 * @Date：2020/10/20 20:00
 * @Desc：枚举enum和静态代码块特性相似，在使用枚举类时，构造方法会被自动调用，也可以应用其这个特性实现单例设计模式
 */
public enum MyObject {
    connectionFactory;
    private Connection connection;
    private MyObject() {
        try {
            System.out.println("调用了MyObject的构造");
            String url = "jdbc:sqlserver://localhost:3306?databaseName=test";
            String username="root";
            String password="root";
            String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driverName);
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
