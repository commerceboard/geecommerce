//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:11:11 PM MSK 
//

package com.dhl.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Contact complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://www.dhl.com/datatypes}PersonName"/>
 *         &lt;element name="PhoneNumber" type="{http://www.dhl.com/datatypes}PhoneNumber"/>
 *         &lt;element name="PhoneExtension" type="{http://www.dhl.com/datatypes}PhoneExtension" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://www.dhl.com/datatypes}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="Telex" type="{http://www.dhl.com/datatypes}Telex" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.dhl.com/datatypes}Email" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = { "personName", "phoneNumber", "phoneExtension", "faxNumber", "telex", "email" })
public class Contact {

    @XmlElement(name = "PersonName", required = true)
    protected String personName;
    @XmlElement(name = "PhoneNumber", required = true)
    protected String phoneNumber;
    @XmlElement(name = "PhoneExtension")
    protected String phoneExtension;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "Telex")
    protected String telex;
    @XmlElement(name = "Email")
    protected Email email;

    /**
     * Gets the value of the personName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPersonName() {
	return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPersonName(String value) {
	this.personName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPhoneNumber() {
	return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPhoneNumber(String value) {
	this.phoneNumber = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPhoneExtension() {
	return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPhoneExtension(String value) {
	this.phoneExtension = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFaxNumber() {
	return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFaxNumber(String value) {
	this.faxNumber = value;
    }

    /**
     * Gets the value of the telex property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTelex() {
	return telex;
    }

    /**
     * Sets the value of the telex property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setTelex(String value) {
	this.telex = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return possible object is {@link Email }
     * 
     */
    public Email getEmail() {
	return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *            allowed object is {@link Email }
     * 
     */
    public void setEmail(Email value) {
	this.email = value;
    }

}
