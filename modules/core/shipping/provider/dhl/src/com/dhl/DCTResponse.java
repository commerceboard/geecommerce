//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:11:11 PM MSK 
//

package com.dhl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.dhl.dctresponsedatatypes.BkgDetailsType;
import com.dhl.dctresponsedatatypes.NoteType;
import com.dhl.dctresponsedatatypes.SrvType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="GetQuoteResponse">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Response">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ServiceHeader" type="{http://www.dhl.com}ServiceHeader"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="BkgDetails" type="{http://www.dhl.com/DCTResponsedatatypes}BkgDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="Srvs" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Srv" type="{http://www.dhl.com/DCTResponsedatatypes}SrvType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Note" type="{http://www.dhl.com/DCTResponsedatatypes}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="GetCapabilityResponse">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Response">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ServiceHeader" type="{http://www.dhl.com}ServiceHeader"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="BkgDetails" type="{http://www.dhl.com/DCTResponsedatatypes}BkgDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="Srvs" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Srv" type="{http://www.dhl.com/DCTResponsedatatypes}SrvType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Note" type="{http://www.dhl.com/DCTResponsedatatypes}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getQuoteResponse", "getCapabilityResponse" })
@XmlRootElement(name = "DCTResponse")
public class DCTResponse {

    @XmlElement(name = "GetQuoteResponse")
    protected DCTResponse.GetQuoteResponse getQuoteResponse;
    @XmlElement(name = "GetCapabilityResponse")
    protected DCTResponse.GetCapabilityResponse getCapabilityResponse;

    /**
     * Gets the value of the getQuoteResponse property.
     * 
     * @return possible object is {@link DCTResponse.GetQuoteResponse }
     * 
     */
    public DCTResponse.GetQuoteResponse getGetQuoteResponse() {
        return getQuoteResponse;
    }

    /**
     * Sets the value of the getQuoteResponse property.
     * 
     * @param value
     *            allowed object is {@link DCTResponse.GetQuoteResponse }
     * 
     */
    public void setGetQuoteResponse(DCTResponse.GetQuoteResponse value) {
        this.getQuoteResponse = value;
    }

    /**
     * Gets the value of the getCapabilityResponse property.
     * 
     * @return possible object is {@link DCTResponse.GetCapabilityResponse }
     * 
     */
    public DCTResponse.GetCapabilityResponse getGetCapabilityResponse() {
        return getCapabilityResponse;
    }

    /**
     * Sets the value of the getCapabilityResponse property.
     * 
     * @param value
     *            allowed object is {@link DCTResponse.GetCapabilityResponse }
     * 
     */
    public void setGetCapabilityResponse(DCTResponse.GetCapabilityResponse value) {
        this.getCapabilityResponse = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Response">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ServiceHeader" type="{http://www.dhl.com}ServiceHeader"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BkgDetails" type="{http://www.dhl.com/DCTResponsedatatypes}BkgDetailsType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Srvs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Srv" type="{http://www.dhl.com/DCTResponsedatatypes}SrvType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Note" type="{http://www.dhl.com/DCTResponsedatatypes}NoteType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "response", "bkgDetails", "srvs", "note" })
    public static class GetCapabilityResponse {

        @XmlElement(name = "Response", required = true)
        protected DCTResponse.GetCapabilityResponse.Response response;
        @XmlElement(name = "BkgDetails")
        protected List<BkgDetailsType> bkgDetails;
        @XmlElement(name = "Srvs")
        protected DCTResponse.GetCapabilityResponse.Srvs srvs;
        @XmlElement(name = "Note")
        protected List<NoteType> note;

        /**
         * Gets the value of the response property.
         * 
         * @return possible object is
         *         {@link DCTResponse.GetCapabilityResponse.Response }
         * 
         */
        public DCTResponse.GetCapabilityResponse.Response getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         * 
         * @param value
         *            allowed object is
         *            {@link DCTResponse.GetCapabilityResponse.Response }
         * 
         */
        public void setResponse(DCTResponse.GetCapabilityResponse.Response value) {
            this.response = value;
        }

        /**
         * Gets the value of the bkgDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the bkgDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getBkgDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BkgDetailsType }
         * 
         * 
         */
        public List<BkgDetailsType> getBkgDetails() {
            if (bkgDetails == null) {
                bkgDetails = new ArrayList<BkgDetailsType>();
            }
            return this.bkgDetails;
        }

        /**
         * Gets the value of the srvs property.
         * 
         * @return possible object is
         *         {@link DCTResponse.GetCapabilityResponse.Srvs }
         * 
         */
        public DCTResponse.GetCapabilityResponse.Srvs getSrvs() {
            return srvs;
        }

        /**
         * Sets the value of the srvs property.
         * 
         * @param value
         *            allowed object is
         *            {@link DCTResponse.GetCapabilityResponse.Srvs }
         * 
         */
        public void setSrvs(DCTResponse.GetCapabilityResponse.Srvs value) {
            this.srvs = value;
        }

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NoteType }
         * 
         * 
         */
        public List<NoteType> getNote() {
            if (note == null) {
                note = new ArrayList<NoteType>();
            }
            return this.note;
        }

        /**
         * Generic response header
         * 
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ServiceHeader" type="{http://www.dhl.com}ServiceHeader"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "serviceHeader" })
        public static class Response {

            @XmlElement(name = "ServiceHeader", required = true)
            protected ServiceHeader serviceHeader;

            /**
             * Gets the value of the serviceHeader property.
             * 
             * @return possible object is {@link ServiceHeader }
             * 
             */
            public ServiceHeader getServiceHeader() {
                return serviceHeader;
            }

            /**
             * Sets the value of the serviceHeader property.
             * 
             * @param value
             *            allowed object is {@link ServiceHeader }
             * 
             */
            public void setServiceHeader(ServiceHeader value) {
                this.serviceHeader = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Srv" type="{http://www.dhl.com/DCTResponsedatatypes}SrvType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "srv" })
        public static class Srvs {

            @XmlElement(name = "Srv")
            protected List<SrvType> srv;

            /**
             * Gets the value of the srv property.
             * 
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the srv property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getSrv().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SrvType }
             * 
             * 
             */
            public List<SrvType> getSrv() {
                if (srv == null) {
                    srv = new ArrayList<SrvType>();
                }
                return this.srv;
            }

        }

    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained
     * within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Response">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ServiceHeader" type="{http://www.dhl.com}ServiceHeader"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BkgDetails" type="{http://www.dhl.com/DCTResponsedatatypes}BkgDetailsType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Srvs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Srv" type="{http://www.dhl.com/DCTResponsedatatypes}SrvType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Note" type="{http://www.dhl.com/DCTResponsedatatypes}NoteType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "response", "bkgDetails", "srvs", "note" })
    public static class GetQuoteResponse {

        @XmlElement(name = "Response", required = true)
        protected DCTResponse.GetQuoteResponse.Response response;
        @XmlElement(name = "BkgDetails")
        protected List<BkgDetailsType> bkgDetails;
        @XmlElement(name = "Srvs")
        protected DCTResponse.GetQuoteResponse.Srvs srvs;
        @XmlElement(name = "Note")
        protected List<NoteType> note;

        /**
         * Gets the value of the response property.
         * 
         * @return possible object is
         *         {@link DCTResponse.GetQuoteResponse.Response }
         * 
         */
        public DCTResponse.GetQuoteResponse.Response getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         * 
         * @param value
         *            allowed object is
         *            {@link DCTResponse.GetQuoteResponse.Response }
         * 
         */
        public void setResponse(DCTResponse.GetQuoteResponse.Response value) {
            this.response = value;
        }

        /**
         * Gets the value of the bkgDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the bkgDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getBkgDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BkgDetailsType }
         * 
         * 
         */
        public List<BkgDetailsType> getBkgDetails() {
            if (bkgDetails == null) {
                bkgDetails = new ArrayList<BkgDetailsType>();
            }
            return this.bkgDetails;
        }

        /**
         * Gets the value of the srvs property.
         * 
         * @return possible object is {@link DCTResponse.GetQuoteResponse.Srvs }
         * 
         */
        public DCTResponse.GetQuoteResponse.Srvs getSrvs() {
            return srvs;
        }

        /**
         * Sets the value of the srvs property.
         * 
         * @param value
         *            allowed object is
         *            {@link DCTResponse.GetQuoteResponse.Srvs }
         * 
         */
        public void setSrvs(DCTResponse.GetQuoteResponse.Srvs value) {
            this.srvs = value;
        }

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NoteType }
         * 
         * 
         */
        public List<NoteType> getNote() {
            if (note == null) {
                note = new ArrayList<NoteType>();
            }
            return this.note;
        }

        /**
         * Generic response header
         * 
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ServiceHeader" type="{http://www.dhl.com}ServiceHeader"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "serviceHeader" })
        public static class Response {

            @XmlElement(name = "ServiceHeader", required = true)
            protected ServiceHeader serviceHeader;

            /**
             * Gets the value of the serviceHeader property.
             * 
             * @return possible object is {@link ServiceHeader }
             * 
             */
            public ServiceHeader getServiceHeader() {
                return serviceHeader;
            }

            /**
             * Sets the value of the serviceHeader property.
             * 
             * @param value
             *            allowed object is {@link ServiceHeader }
             * 
             */
            public void setServiceHeader(ServiceHeader value) {
                this.serviceHeader = value;
            }

        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content
         * contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Srv" type="{http://www.dhl.com/DCTResponsedatatypes}SrvType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "srv" })
        public static class Srvs {

            @XmlElement(name = "Srv")
            protected List<SrvType> srv;

            /**
             * Gets the value of the srv property.
             * 
             * <p>
             * This accessor method returns a reference to the live list, not a
             * snapshot. Therefore any modification you make to the returned
             * list will be present inside the JAXB object. This is why there is
             * not a <CODE>set</CODE> method for the srv property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getSrv().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SrvType }
             * 
             * 
             */
            public List<SrvType> getSrv() {
                if (srv == null) {
                    srv = new ArrayList<SrvType>();
                }
                return this.srv;
            }

        }

    }

}
