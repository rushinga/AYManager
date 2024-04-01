/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.dao;

import AYM.model.AYclub;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER1
 */
public class ClubDAO {
    
    private String jdcbUrl="jdbc:postgresql://localhost:5432/ay_management_db";
    private String dbUsername="Cedrick";
    private String dbPasswd = "amandine";
    
    public int createClub(AYclub club){
        try{
        Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "INSERT INTO AYclub (ayclubid,ayclubname,ayclubdescription) VALUES(?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setInt(1,club.getClubId());
            prst.setString(2,club.getClubname());
            prst.setString(3,club.getDescription());
            int rowAffected =prst.executeUpdate();
            con.close();
             return rowAffected;
        }catch(Exception ex)
        {ex.printStackTrace();}
       
    return 0;
    }
    
    public List<AYclub> retrieveallclubs(){
    try{
    Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
     String sql = "SELECT ayclubid,ayclubname,ayclubdescription FROM AYclub";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet  rs = pst.executeQuery();
          List<AYclub> ayclublist = new ArrayList<>();
          while(rs.next()){
          AYclub theclub = new AYclub();
          theclub.setClubId(rs.getInt("ayclubid"));
           theclub.setClubname(rs.getString("ayclubname"));
            theclub.setDescription(rs.getString("ayclubdescription"));
              ayclublist.add(theclub);
          }
        conn.close();
        return ayclublist;
    }catch(Exception ex ){
    ex.printStackTrace();
    }
     return null;
}
public Integer findClubById(AYclub club) {
    try {
        Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "SELECT ayclubid, ayclubname, ayclubdescription FROM AYclub WHERE ayclubid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, club.getClubId()); 
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            club.setClubname(rs.getString("ayclubname"));
            club.setDescription(rs.getString("ayclubdescription"));
            conn.close();
            return 1;
        }
        conn.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0; 
}

public Integer updateclub(AYclub club){
        try{
            Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
            String sql = "UPDATE AYclub SET ayclubname=?, ayclubdescription=? WHERE ayclubid=?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, club.getClubname());
            prst.setString(2, club.getDescription());
            prst.setInt(3, club.getClubId());
            Integer rowAffected = prst.executeUpdate();
            con.close();
            return rowAffected;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

public int deleteClub(AYclub club) {
    try {
        Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "DELETE FROM AYclub WHERE ayclubid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, club.getClubId()); 
        int rowsAffected = pst.executeUpdate();
        conn.close();
        return rowsAffected;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;}


}
