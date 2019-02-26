/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollo_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.metal.MetalIconFactory;

/**
 *
 * @author Student
 */
public class SQLiteDBConnection {

    public static Connection connect() {
        Connection conn = null;

        if (conn == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                String dbUrl = "jdbc:sqlite:src/db/ApolloDB.db";

                conn = DriverManager.getConnection(dbUrl);
                System.out.println("Connection Established");
                return conn;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            } 
        } else {
            return conn;
        }

    }

}
