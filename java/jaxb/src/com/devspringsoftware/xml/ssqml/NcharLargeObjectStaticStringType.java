//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NcharLargeObjectStaticStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NcharLargeObjectStaticStringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=" NCHAR LARGE OBJECT "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NcharLargeObjectStaticStringType")
@XmlEnum
public enum NcharLargeObjectStaticStringType {

    @XmlEnumValue(" NCHAR LARGE OBJECT ")
    NCHAR_LARGE_OBJECT(" NCHAR LARGE OBJECT ");
    private final String value;

    NcharLargeObjectStaticStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NcharLargeObjectStaticStringType fromValue(String v) {
        for (NcharLargeObjectStaticStringType c: NcharLargeObjectStaticStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
