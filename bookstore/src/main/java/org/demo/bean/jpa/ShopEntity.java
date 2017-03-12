/*
 * Created on 10 Jan 2017 ( Time 17:59:52 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "SHOP"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="SHOP", schema="ROOT" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="ShopEntity.countAll", query="SELECT COUNT(x) FROM ShopEntity x" )
} )
public class ShopEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="CODE", nullable=false, length=3)
    private String     code         ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", length=80)
    private String     name         ;

    @Column(name="ADDRESS_1", length=80)
    private String     address1     ;

    @Column(name="ADDRESS_2", length=80)
    private String     address2     ;

    @Column(name="ZIP_CODE")
    private Integer    zipCode      ;

    @Column(name="CITY", length=45)
    private String     city         ;

    @Column(name="PHONE", length=14)
    private String     phone        ;

    @Column(name="EMAIL", length=50)
    private String     email        ;

	// "countryCode" (column "COUNTRY_CODE") is not defined by itself because used as FK in a link 
	// "executive" (column "EXECUTIVE") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="EXECUTIVE", referencedColumnName="CODE")
    private EmployeeEntity employee    ;

    @OneToMany(mappedBy="shop", targetEntity=BookOrderEntity.class)
    private List<BookOrderEntity> listOfBookOrder;

    @OneToMany(mappedBy="shop", targetEntity=EmployeeEntity.class)
    private List<EmployeeEntity> listOfEmployee;

    @ManyToOne
    @JoinColumn(name="COUNTRY_CODE", referencedColumnName="CODE")
    private CountryEntity country     ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public ShopEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setCode( String code ) {
        this.code = code ;
    }
    public String getCode() {
        return this.code;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : NAME ( VARCHAR ) 
    public void setName( String name ) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    //--- DATABASE MAPPING : ADDRESS_1 ( VARCHAR ) 
    public void setAddress1( String address1 ) {
        this.address1 = address1;
    }
    public String getAddress1() {
        return this.address1;
    }

    //--- DATABASE MAPPING : ADDRESS_2 ( VARCHAR ) 
    public void setAddress2( String address2 ) {
        this.address2 = address2;
    }
    public String getAddress2() {
        return this.address2;
    }

    //--- DATABASE MAPPING : ZIP_CODE ( INTEGER ) 
    public void setZipCode( Integer zipCode ) {
        this.zipCode = zipCode;
    }
    public Integer getZipCode() {
        return this.zipCode;
    }

    //--- DATABASE MAPPING : CITY ( VARCHAR ) 
    public void setCity( String city ) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }

    //--- DATABASE MAPPING : PHONE ( VARCHAR ) 
    public void setPhone( String phone ) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }

    //--- DATABASE MAPPING : EMAIL ( VARCHAR ) 
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setEmployee( EmployeeEntity employee ) {
        this.employee = employee;
    }
    public EmployeeEntity getEmployee() {
        return this.employee;
    }

    public void setListOfBookOrder( List<BookOrderEntity> listOfBookOrder ) {
        this.listOfBookOrder = listOfBookOrder;
    }
    public List<BookOrderEntity> getListOfBookOrder() {
        return this.listOfBookOrder;
    }

    public void setListOfEmployee( List<EmployeeEntity> listOfEmployee ) {
        this.listOfEmployee = listOfEmployee;
    }
    public List<EmployeeEntity> getListOfEmployee() {
        return this.listOfEmployee;
    }

    public void setCountry( CountryEntity country ) {
        this.country = country;
    }
    public CountryEntity getCountry() {
        return this.country;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(code);
        sb.append("]:"); 
        sb.append(name);
        sb.append("|");
        sb.append(address1);
        sb.append("|");
        sb.append(address2);
        sb.append("|");
        sb.append(zipCode);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(email);
        return sb.toString(); 
    } 

}
