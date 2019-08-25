/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 1895321
 */
public class Client {
    
    public void clientUpdate(Connection con, PreparedStatement stm, String nameclient, String notelephone, Double noclient) throws SQLException {
        String sql;
        
        sql="update Client set nameclient=?, notelephone=? where noclient=?";
        stm=con.prepareStatement(sql);
        stm.setString(1, nameclient);
        stm.setString(2, notelephone);
        stm.setDouble(3, noclient);
        int rs=stm.executeUpdate();
        System.out.println(rs);
      //  stm.close();
      //  con.close();
    }

    public void clientInsert(Connection con,PreparedStatement stm, Double noclient, String nameclient, String notelephone ) throws SQLException {
        String sql;
    
        sql="insert into client values (?,?,?) ";
        stm=con.prepareStatement(sql);
        stm.setDouble(1,noclient);
        stm.setString(2, nameclient);
        stm.setString(3, notelephone);
        int rs=stm.executeUpdate();
        System.out.println(rs);
       // stm.close();
       // con.close();
        
    }
    
    
    public void clientDelete(Connection con, PreparedStatement stm, int noclient ) throws SQLException{
        
        String sql = "delete from client where noclient =?";
        
        stm=con.prepareStatement(sql);
        stm.setInt(1,noclient);
        int rs=stm.executeUpdate();
        System.out.println(rs);
     //   stm.close();
      //  con.close();
        
    }
    
    
      public void clientList(Connection con,Statement stmt ) throws SQLException{
        
        String sql = "Select * from Client" ;
        
        stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1) + " - " + rs.getString(2)+ " - " + rs.getString(3));
        }
         //  stmt.close();
       // con.close();
        
    }
    public void clientSingle(Connection con, PreparedStatement stm,int noclient) throws SQLException  {
    
    String sql="Select * from Client where noclient=?";
    
    stm=con.prepareStatement(sql);
    stm.setInt(1, noclient);
   // stmt=con.createStatement();
    ResultSet rs=stm.executeQuery();
    while(rs.next()){
        System.out.println(rs.getInt("noclient") + " " + rs.getString("nameclient") + " " + rs.getString("notelephone"));
    }
       stm.close();
      // stmt.close();
        con.close();  
        
    }
          
}


