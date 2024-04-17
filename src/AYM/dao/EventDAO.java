/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.dao;

import AYM.model.AYevent;
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
public class EventDAO {
    private String jdcbUrl="jdbc:postgresql://localhost:5432/ay_management_db";
    private String dbUsername="Cedrick";
    private String dbPasswd = "amandine";
    
    public int createEvent(AYevent event) {
    
        try {
          Connection con = DriverManager.getConnection(jdcbUrl,dbUsername, dbPasswd);
          String sql= "INSERT INTO ayevents (eventid,eventname,eventdate,eventlocation,"
                  + "eventorganiser )VALUES (?,?,?,?,?)";
          PreparedStatement pst = con.prepareStatement(sql);
          pst.setInt(1, event.getEventId());
          pst.setString(2,event.getEventName());
          pst.setString(3, event.getEventdate());
          pst.setString(4,event.getEventlocation());
          pst.setString(5, event.getEventorganiser());
          int rowAffected = pst.executeUpdate();
          con.close();
          return rowAffected;
        } catch (Exception e) {
        e.printStackTrace();
        }
//    
   return 0;

}

 public Integer updateevent(AYevent event) {
    try {
        Connection con = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "UPDATE AYevents SET eventname=?, eventdate=?, eventlocation=?, eventorganiser=? WHERE eventid=?";
        PreparedStatement prst = con.prepareStatement(sql);
        prst.setString(1, event.getEventName());
        prst.setString(2, event.getEventdate());
        prst.setString(3, event.getEventlocation());
        prst.setString(4, event.getEventorganiser());
        prst.setInt(5, event.getEventId());
        Integer rowAffected = prst.executeUpdate();
        con.close();
        return rowAffected;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}


 
 public Integer findEventById(AYevent event) {
    try {
        Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
        String sql = "SELECT eventname, eventdate,eventlocation,eventorganiser FROM ayevents WHERE eventid=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, event.getEventId()); 
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            event.setEventName(rs.getString("eventname"));
            event.setEventdate(rs.getString("eventdate"));
            event.setEventlocation(rs.getString("eventlocation"));
            event.setEventorganiser(rs.getString("eventorganiser"));
            conn.close();
            return 1;
        }
        conn.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0; 
}
 
 public List<AYevent> retrieveallevents(){
    try{
    Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd);
     String sql = "SELECT eventname,eventid,eventdate,eventlocation,eventorganiser FROM AYevents";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet  rs = pst.executeQuery();
          List<AYevent> ayeventlist = new ArrayList<>();
          while(rs.next()){
          AYevent theevent = new AYevent();
          theevent.setEventId(rs.getInt("eventid"));
           theevent.setEventName(rs.getString("eventname"));
            theevent.setEventdate(rs.getString("eventdate"));
            theevent.setEventlocation(rs.getString("eventlocation"));
            theevent.setEventorganiser(rs.getString("eventorganiser"));
              ayeventlist.add(theevent);
          }
        conn.close();
        return ayeventlist;
    }catch(Exception ex ){
    ex.printStackTrace();
    }
     return null;
}
 public int deleteEvent(AYevent event) {
    try (Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd)) {
        String sql = "DELETE FROM AYevents WHERE eventid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, event.getEventId());
        return pst.executeUpdate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}

}
