/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYM.model;

/**
 *
 * @author USER1
 */
public class AYevent {
    private String evemtName;
    private int eventId;
    private String eventdate;
    private String eventlocation;
    private String eventorganiser;

    public AYevent() {
    }

    public AYevent(String evemtName, int eventId, String eventdate, String eventlocation, String eventorganiser) {
        this.evemtName = evemtName;
        this.eventId = eventId;
        this.eventdate = eventdate;
        this.eventlocation = eventlocation;
        this.eventorganiser = eventorganiser;
    }

    public String getEvemtName() {
        return evemtName;
    }

    public void setEvemtName(String evemtName) {
        this.evemtName = evemtName;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setEventdate(String eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventlocation() {
        return eventlocation;
    }

    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }

    public String getEventorganiser() {
        return eventorganiser;
    }

    public void setEventorganiser(String eventorganiser) {
        this.eventorganiser = eventorganiser;
    }
    

    
}
