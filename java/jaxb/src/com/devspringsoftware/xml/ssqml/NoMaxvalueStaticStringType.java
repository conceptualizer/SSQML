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
 * <p>Java class for NoMaxvalueStaticStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoMaxvalueStaticStringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=" NO MAXVALUE "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoMaxvalueStaticStringType")
@XmlEnum
public enum NoMaxvalueStaticStringType {

    @XmlEnumValue(" NO MAXVALUE ")
    NO_MAXVALUE(" NO MAXVALUE ");
    private final String value;

    NoMaxvalueStaticStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoMaxvalueStaticStringType fromValue(String v) {
        for (NoMaxvalueStaticStringType c: NoMaxvalueStaticStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
