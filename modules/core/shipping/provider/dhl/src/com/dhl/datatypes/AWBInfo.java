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
 * Java class for AWBInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AWBInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AWBNumber" type="{http://www.dhl.com/datatypes}AWBNumber"/>
 *         &lt;element name="Status" type="{http://www.dhl.com/datatypes}Status"/>
 *         &lt;element name="ShipmentInfo" type="{http://www.dhl.com/datatypes}ShipmentInfo" minOccurs="0"/>
 *         &lt;element name="Pieces" type="{http://www.dhl.com/datatypes}TrackingPieces" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AWBInfo", propOrder = { "awbNumber", "status", "shipmentInfo", "pieces" })
public class AWBInfo {

    @XmlElement(name = "AWBNumber", required = true)
    protected String awbNumber;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "ShipmentInfo")
    protected ShipmentInfo shipmentInfo;
    @XmlElement(name = "Pieces")
    protected TrackingPieces pieces;

    /**
     * Gets the value of the awbNumber property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAWBNumber() {
	return awbNumber;
    }

    /**
     * Sets the value of the awbNumber property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAWBNumber(String value) {
	this.awbNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link Status }
     * 
     */
    public Status getStatus() {
	return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link Status }
     * 
     */
    public void setStatus(Status value) {
	this.status = value;
    }

    /**
     * Gets the value of the shipmentInfo property.
     * 
     * @return possible object is {@link ShipmentInfo }
     * 
     */
    public ShipmentInfo getShipmentInfo() {
	return shipmentInfo;
    }

    /**
     * Sets the value of the shipmentInfo property.
     * 
     * @param value
     *            allowed object is {@link ShipmentInfo }
     * 
     */
    public void setShipmentInfo(ShipmentInfo value) {
	this.shipmentInfo = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     * @return possible object is {@link TrackingPieces }
     * 
     */
    public TrackingPieces getPieces() {
	return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     * @param value
     *            allowed object is {@link TrackingPieces }
     * 
     */
    public void setPieces(TrackingPieces value) {
	this.pieces = value;
    }

}
