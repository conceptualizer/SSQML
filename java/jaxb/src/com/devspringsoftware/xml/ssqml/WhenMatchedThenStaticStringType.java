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
 * <p>Java class for WhenMatchedThenStaticStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WhenMatchedThenStaticStringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=" WHEN MATCHED THEN "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WhenMatchedThenStaticStringType")
@XmlEnum
public enum WhenMatchedThenStaticStringType {

    @XmlEnumValue(" WHEN MATCHED THEN ")
    WHEN_MATCHED_THEN(" WHEN MATCHED THEN ");
    private final String value;

    WhenMatchedThenStaticStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WhenMatchedThenStaticStringType fromValue(String v) {
        for (WhenMatchedThenStaticStringType c: WhenMatchedThenStaticStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
