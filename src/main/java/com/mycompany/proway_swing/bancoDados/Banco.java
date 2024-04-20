/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proway_swing.bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 74703
 */
public class Banco {
    
    public static Connection conectar() throws SQLException {
        var jdbcUrl = "jdbc:mysql://localhost:3306/locadora";
            var jdbcUsuario = "root";
            var jdbcSenha = "admin";
            
            return DriverManager.getConnection(jdbcUrl, jdbcUsuario, jdbcSenha
            );
    }
    
}
