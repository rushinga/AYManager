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

/**
 *
 * @author USER1
 */
public class EventDAO {
    private String jdcbUrl="jdbc:postgresql://localhost:5432/ay_management_db";
    private String dbUsername="Cedrick";
    private String dbPasswd = "amandine";
    
    public int createEvent(AYevent event) {
        int rowAffected = 0;
        try (Connection conn = DriverManager.getConnection(jdcbUrl, dbUsername, dbPasswd)) {
            String sql = "INSERT INTO AYevents (eventid, eventname, eventdatetime, eventlocation, eventorganizer) " +
                         "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, event.getEventId());
            pst.setString(2, event.getEvemtName());
            pst.setString(3, event.getEventdate());
            pst.setString(4, event.getEventlocation());
            pst.setString(5, event.getEventorganiser());
            rowAffected = pst.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return rowAffected;
    }
    
}
