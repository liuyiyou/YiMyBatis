package cn.liuyiyou.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.hsqldb.jdbcDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/***
 * @author: liuyiyou
 * @date: 2018/1/23
 */
public class DBUtils {

    public static void initHSQLData(String fileName) {
        Connection connection = null;
        try {
            Properties jdbcProp = Resources.getResourceAsProperties("jdbc.properties");
            String driver = jdbcProp.getProperty("driver");
            String url = jdbcProp.getProperty("url");
            String username = jdbcProp.getProperty("username");
            String pwd = jdbcProp.getProperty("password");
            DriverManager.registerDriver(new jdbcDriver());
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, pwd);
            ScriptRunner runner = new ScriptRunner(connection);
            runner.runScript(new BufferedReader(Resources.getResourceAsReader(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static void initMySqlData(String fileName) {
        Connection connection = null;
        try {
            Properties jdbcProp = Resources.getResourceAsProperties("jdbc.properties");
            String driver = jdbcProp.getProperty("mysql.driver");
            String url = jdbcProp.getProperty("mysql.url");
            String username = jdbcProp.getProperty("mysql.username");
            String pwd = jdbcProp.getProperty("mysql.password");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, pwd);
            ScriptRunner runner = new ScriptRunner(connection);
            runner.runScript(new BufferedReader(Resources.getResourceAsReader(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

    public static void deleteData() {
        Connection connection = null;
        try {
            Properties jdbcProp = Resources.getResourceAsProperties("jdbc.properties");
            String driver = jdbcProp.getProperty("mysql.driver");
            String url = jdbcProp.getProperty("mysql.url");
            String username = jdbcProp.getProperty("mysql.username");
            String pwd = jdbcProp.getProperty("mysql.password");
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, pwd);
            connection.prepareStatement("DELETE FROM t_mybatis_user").execute();
            connection.prepareStatement("DROP TABLE t_mybatis_user").execute();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
