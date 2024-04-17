/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.dao;

import AYM.model.AYmember;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER1
 */
public class UserDAO {
    
    private String jdcbUrl="jdbc:postgresql://localhost:5432/ay_management_db";
    private String dbUsername="Cedrick";
    private String dbPasswd = "amandine";
    
    public int createUser(AYmember member){
        try{
        Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "INSERT INTO AYmember (ayusername,ayphonenumber,ayrole,ayclub,"
                + "aypassword) VALUES(?,?,?,?,?)";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1,member.getUserName());
            prst.setString(2,member.getPhonenumber());
            prst.setString(3,member.getRole());
            prst.setString(4,member.getClub());
            prst.setString(5,member.getPassword());
            int rowAffected =prst.executeUpdate();
            con.close();
             return rowAffected;
        }catch(Exception ex)
        {ex.printStackTrace();}
       
    return 0;
    }
    
    
    public String authenticateUser(AYmember member) {
        String role = null;
        try {
            Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
            String sql = "SELECT ayrole FROM AYmember WHERE ayusername = ? AND aypassword = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, member.getUserName());
            pstmt.setString(2, member.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                role = rs.getString("ayrole");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return role;
    }


    public boolean updatePassword(AYmember member) {
        try {
            Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
            String sql = "UPDATE AYmember SET aypassword = ? WHERE ayusername = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, member.getPassword());
            pstmt.setString(2, member.getUserName());
            int rowsAffected = pstmt.executeUpdate();
            con.close();
            return rowsAffected > 0; 
        } catch (Exception ex) {
            ex.printStackTrace();
            return false; 
        }
    }
public boolean checkUserExists(AYmember member) {
    boolean exists = false;
    try {
        Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "SELECT COUNT(*) FROM AYmember WHERE ayusername = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, member.getUserName());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                exists = true;
            }
        }
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return exists;
}

public List<AYmember> retrieveallusers(){
    try{
    Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
     String sql = "SELECT ayusername,ayphonenumber,ayrole,ayclub,aypassword FROM AYmember";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet  rs = pst.executeQuery();
          List<AYmember> aymemberlist = new ArrayList<>();
          while(rs.next()){
          AYmember themember = new AYmember();
          themember.setUserName(rs.getString("ayusername"));
           themember.setPhonenumber(rs.getString("ayphonenumber"));
            themember.setRole(rs.getString("ayrole"));
            themember.setClub(rs.getString("ayclub"));
              themember.setPassword(rs.getString("aypassword"));
              aymemberlist.add(themember);
          }
        conn.close();
        return aymemberlist;
    }catch(Exception ex ){
    ex.printStackTrace();
    }
     return null;
}


public Integer updateUser(AYmember member){
        try{
            Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
            String sql = "UPDATE AYmember SET ayphonenumber=?, ayrole=?, ayclub=?  WHERE ayusername=?";
            PreparedStatement prst = con.prepareStatement(sql);
            prst.setString(1, member.getPhonenumber());
            prst.setString(2, member.getRole());
            prst.setString(3, member.getClub());
            prst.setString(4, member.getUserName());
            Integer rowAffected = prst.executeUpdate();
            con.close();
            return rowAffected;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

public AYmember findMemberByUsername(AYmember member) {
    try {
        Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "SELECT * FROM AYmember WHERE ayusername = ?";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, member.getUserName());
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            AYmember foundMember = new AYmember();
            foundMember.setUserName(rs.getString("ayusername"));
            foundMember.setPhonenumber(rs.getString("ayphonenumber"));
            foundMember.setRole(rs.getString("ayrole"));
            foundMember.setClub(rs.getString("ayclub"));
            foundMember.setPassword(rs.getString("aypassword"));
            return foundMember;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
public int deleteUser(AYmember member) {
    try {
        Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "DELETE FROM AYmember WHERE ayusername = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, member.getUserName());
        int rowsAffected = pst.executeUpdate();
        conn.close();
        return rowsAffected;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0; 
}

public AYmember findMemberByUsernameAndClub(String username, String club) {
    try {
        Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "SELECT * FROM AYmember WHERE ayusername = ? AND ayclub = ?";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, username);
        prst.setString(2, club);
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            AYmember foundMember = new AYmember();
            foundMember.setUserName(rs.getString("ayusername"));
            foundMember.setPhonenumber(rs.getString("ayphonenumber"));
            foundMember.setRole(rs.getString("ayrole"));
            foundMember.setClub(rs.getString("ayclub"));
            foundMember.setPassword(rs.getString("aypassword"));
            return foundMember;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

public List<AYmember> retrieveAllRegularUsers() {
    try {
        Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "SELECT ayusername, ayphonenumber, ayrole, ayclub, aypassword FROM AYmember WHERE ayrole = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, "Regular User"); 
        ResultSet rs = pst.executeQuery();
        List<AYmember> aymemberlist = new ArrayList<>();
        while (rs.next()) {
            AYmember member = new AYmember();
            member.setUserName(rs.getString("ayusername"));
            member.setPhonenumber(rs.getString("ayphonenumber"));
            member.setRole(rs.getString("ayrole"));
            member.setClub(rs.getString("ayclub"));
            member.setPassword(rs.getString("aypassword"));
            aymemberlist.add(member);
        }
        conn.close();
        return aymemberlist;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}




}


