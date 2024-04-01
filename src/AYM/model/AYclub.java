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
public class AYclub {
   private String clubname;
   private int clubId;
   private String description;

    public AYclub() {
        
    }

    public AYclub(String clubname, int clubId, String description) {
        this.clubname = clubname;
        this.clubId = clubId;
        this.description = description;
      
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
   
}
