/**
 * lsy create in 2021/05/04/12:45
 */
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * butcher create in 2021/03/04/21:17,
 * <p>
 * 数据库连接工具类，可实现数据库一键连接，一键关闭流
 */
public class Util {

    private String path = "";
    private String username = "";
    private String password = "";
    private String url = "";
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    /**
     * 构造方法，在new对象的时候读取配置文件中的数据库连接信息，创建连接
     */
    public Util() {
        Properties properties = new Properties();
        try {
//            加载配置文件
            properties.load(this.getClass().getResourceAsStream("/ConnectionConfig.properties"));//线上
            this.path = properties.getProperty("path");
            this.username = properties.getProperty("username");
            this.password = properties.getProperty("password");
            this.url = properties.getProperty("url");
            Class.forName(path);
            this.conn = DriverManager.getConnection(url, username, password);

        } catch (IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接之后的Connection,可以通过它开启事务，回滚事务......
     *
     * @return 连接器
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * 创建预查询器对象
     *
     * @param sql 要查询的SQL语句
     * @return 返回查询查询器对象，如果没有就返回null
     */
    public PreparedStatement getPs(String sql) {
        try {
            ps = conn.prepareStatement(sql);
            return ps;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取结果集,这样的目的是为了可以一键关闭流
     *
     * @param rs ResultSet
     * @return 结果集 ResultSet
     */
    public ResultSet getRs(ResultSet rs) {
        return this.rs = rs;
    }


    /**
     * 关闭所有流
     */
    public void closeAll() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}