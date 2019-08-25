/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DAO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1895321
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Client c=new Client();
        
         try{
          Connection con=null;
            PreparedStatement stm=null;
            Statement stmt=null;
            
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            
            con=DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE", "sales", "anypw");
             
          //CLIENT CLASS
           /* 
                 Double noclient2=97.0;
            String nameclient2="Asma";
            String notelephone2= "12345678";
            
            c.clientInsert(con, stm, noclient2, nameclient2, notelephone2);
             
            String nameclient =  "ASMAROKADIYA";
            String notelephone ="789654123";
            Double noclient=97.0;
            
            c.clientUpdate(con, stm, nameclient, notelephone, noclient);
            
       
            int noclient3 = 97;
            c.clientDelete(con, stm, noclient3);
             
            c.clientList(con, stmt);   
             
             int noclient4=60;
             c.clientSingle(con, stm, noclient4);
             */
             DetailDelivery dd=new DetailDelivery();
             
             int nodelivery=0004;
             int noorder=30;
             int noitem=50;
             int qdelivery=80;             
             
             dd.ddinsert(con, stm, nodelivery, noorder, noitem, qdelivery);
       
             
             
        } catch (SQLException ex) {
            Logger.getLogger(DAO.Client.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
        
        
    }
   
