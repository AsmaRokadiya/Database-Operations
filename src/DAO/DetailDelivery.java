/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author 1895321
 */
import net.sf.json.JSONObject;
public class DetailDelivery {
    public void ddinsert(Connection con,PreparedStatement stm,int nodelivery, int noorder, int noitem,int quantitydelivery) throws SQLException{
        
        String sql="insert into Detaildelivery values (?,?,?,?)";
        stm=con.prepareStatement(sql);
        stm.setInt(1, nodelivery);
        stm.setInt(2, noorder);
        stm.setInt(3, noitem);
        stm.setInt(4, quantitydelivery);
        
        int rs= stm.executeUpdate();
        JSONObject mainObject=new JSONObject();
        String str= rs + " row(s) inserted";
        mainObject.accumulate("message", str);
        System.out.println(mainObject);
        
         stm.close();
      // stmt.close();
        con.close();  
        
    }
    
}
