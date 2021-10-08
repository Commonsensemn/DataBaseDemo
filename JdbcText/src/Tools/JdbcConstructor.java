package Tools;

import java.sql.*;

/**
 * @author: Common sense
 * @CreationTime: 2021/10/1 23:10 星期五
 * @ClassName: Tools.JdbcConstructor
 * @ClassDescription: Jdbc构造器（未实现连接池）
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
                //Commonsense家的MySQL环境
//                conn = DriverManager.getConnection("jdbc:mysql://localhost:8083/MySQL", "root", "root");
                //达内MySQL环境
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL", "root", "");
            } catch(Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return conn;
    }

    /**
     * jdbc连接器销毁方法，可以统一的销毁jdgc
     * @author: Common sense
     * @Date: 2021/10/6 21:07
     * @描述: jdbc连接器销毁器
     **/
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
