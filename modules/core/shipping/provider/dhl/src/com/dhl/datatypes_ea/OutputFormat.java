//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:07:03 PM MSK 
//

package com.dhl.datatypes_ea;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for OutputFormat.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="OutputFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EPL2"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="ZPL2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutputFormat")
@XmlEnum
public enum OutputFormat {

    @XmlEnumValue("EPL2")
    EPL_2("EPL2"), PDF("PDF"), @XmlEnumValue("ZPL2")
    ZPL_2("ZPL2");
    private final String value;

    OutputFormat(String v) {
	value = v;
    }

    public String value() {
	return value;
    }

    public static OutputFormat fromValue(String v) {
	for (OutputFormat c : OutputFormat.values()) {
	    if (c.value.equals(v)) {
		return c;
	    }
	}
	throw new IllegalArgumentException(v);
    }

}
