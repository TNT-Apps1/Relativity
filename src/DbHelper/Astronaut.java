/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbHelper;

/**
 *
 * @author Grant Thompson <adin.tocc@gmail.com>
 * ITDEV 140 THUR EVE ASSIGNMENT #9
 */
public class Astronaut {
    
    private String firstName = "";
    
    private String lastName = "";
    
    private String mission = "";
    
    private String yearOfMission = "";

    public Astronaut() {
    }
    
    

    /**
     * Get the value of yearOfMission
     *
     * @return the value of yearOfMission
     */
    public String getYearOfMission() {
        return yearOfMission;
    }

    /**
     * Set the value of yearOfMission
     *
     * @param yearOfMission new value of yearOfMission
     */
    public void setYearOfMission(String yearOfMission) {
        this.yearOfMission = yearOfMission;
    }


    /**
     * Get the value of mission
     *
     * @return the value of mission
     */
    public String getMission() {
        return mission;
    }

    /**
     * Set the value of mission
     *
     * @param mission new value of mission
     */
    public void setMission(String mission) {
        this.mission = mission;
    }


    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
}
