/*
 * Created on 10 Jan 2017 ( Time 17:58:54 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.bean;

import java.io.Serializable;

import javax.validation.constraints.*;


public class EmployeeGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    @Size( min = 1, max = 4 )
    private String employeeCode;
    @NotNull
    private Short groupId;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    


    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setEmployeeCode( String employeeCode ) {
        this.employeeCode = employeeCode ;
    }

    public String getEmployeeCode() {
        return this.employeeCode;
    }

    public void setGroupId( Short groupId ) {
        this.groupId = groupId ;
    }

    public Short getGroupId() {
        return this.groupId;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(employeeCode);
        sb.append("|");
        sb.append(groupId);
        return sb.toString(); 
    } 


}
