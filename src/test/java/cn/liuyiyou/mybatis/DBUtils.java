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

    public static void initData(String fileName) throws SQLException, IOException {
        Properties jdbcProp = Resources.getResourceAsProperties("jdbc.properties");
        String driver =jdbcProp.getProperty("driver");
        String url = jdbcProp.getProperty("url");
        String username = jdbcProp.getProperty("username");
        String pwd = jdbcProp.getProperty("password");
        DriverManager.registerDriver(new jdbcDriver());
        Connection connection = DriverManager.getConnection(url,username,pwd);
        ScriptRunner runner = new ScriptRunner(connection);
        runner.runScript(new BufferedReader(Resources.getResourceAsReader(fileName)));
    }
}
