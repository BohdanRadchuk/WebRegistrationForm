package com.trainings.util;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;

public class DbConnectionHolder {

        void getConnection(){
            Connection connection;

            try {
                Driver driver = new FabricMySQLDriver();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

}
