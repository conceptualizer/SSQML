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
 * <p>Java class for Current_transform_group_for_typeStaticStringType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Current_transform_group_for_typeStaticStringType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value=" CURRENT_TRANSFORM_GROUP_FOR_TYPE "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Current_transform_group_for_typeStaticStringType")
@XmlEnum
public enum CurrentTransformGroupForTypeStaticStringType {

    @XmlEnumValue(" CURRENT_TRANSFORM_GROUP_FOR_TYPE ")
    CURRENT_TRANSFORM_GROUP_FOR_TYPE(" CURRENT_TRANSFORM_GROUP_FOR_TYPE ");
    private final String value;

    CurrentTransformGroupForTypeStaticStringType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrentTransformGroupForTypeStaticStringType fromValue(String v) {
        for (CurrentTransformGroupForTypeStaticStringType c: CurrentTransformGroupForTypeStaticStringType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
