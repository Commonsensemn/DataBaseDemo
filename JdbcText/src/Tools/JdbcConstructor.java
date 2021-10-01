package Tools;

import java.sql.*;
import java.util.Collection;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 23:10 星期五
 * @ClassName: Tools.JdbcConstructor
 * @ClassDescription: Jdbc构造器
 */
public class JdbcConstructor {
    private static Connection conn = null;
    /**
     * @author: Common sense
     * @Date: 2021/10/1 23:40
     * @描述: 单例模式
     * 什么是单例模式
     * 当你第一次调用时，创建实例，再次调用时，返回，且只返回该实例
     * 直到该实例销毁
     * @return java.sql.Connection
     **/
    public static Connection getConnection() {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:8083/MySQL", "root", "root");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void destoryConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }
}
