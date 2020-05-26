package com.hrdata.demo.util;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class AccessDbConnection {
    /**
     *
     * 对于人事司给的*.mdb老格式的access库，需要新建一个07版*.accdb格式的空access库，然后在新库中选择使用access库导入就行了。
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //连接Access数据库
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        //这个url就是前面的ucanaccess://+ 数据库存储路径
        String url = "jdbc:ucanaccess://C:\\Users\\Lenovo\\Documents\\Database1.accdb";
        String username = "";
        String password = "posthrp2000";
        return DriverManager.getConnection(url, username, password);
        //return DriverManager.getConnection(url);
    }

    public static void release(Connection connection, Statement statement) throws SQLException {
        if(connection!=null){
            connection.close();
        }
        if(statement!=null){
            statement.close();

        }

    }
}
