/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rupanshu
 */

public class DatabaseDetails {
    private static String PASSWORD = "1234";
    static Connection establishConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC", "root", PASSWORD);
    }
}
