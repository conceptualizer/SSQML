//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementInformationItemNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatementInformationItemNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="MORE"/>
 *     &lt;enumeration value="COMMAND_FUNCTION"/>
 *     &lt;enumeration value="COMMAND_FUNCTION_CODE"/>
 *     &lt;enumeration value="DYNAMIC_FUNCTION"/>
 *     &lt;enumeration value="DYNAMIC_FUNCTION_CODE"/>
 *     &lt;enumeration value="ROW_COUNT"/>
 *     &lt;enumeration value="TRANSACTIONS_COMMITTED"/>
 *     &lt;enumeration value="TRANSACTIONS_ROLLED_BACK"/>
 *     &lt;enumeration value="TRANSACTION_ACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatementInformationItemNameType")
@XmlEnum
public enum StatementInformationItemNameType {

    NUMBER,
    MORE,
    COMMAND_FUNCTION,
    COMMAND_FUNCTION_CODE,
    DYNAMIC_FUNCTION,
    DYNAMIC_FUNCTION_CODE,
    ROW_COUNT,
    TRANSACTIONS_COMMITTED,
    TRANSACTIONS_ROLLED_BACK,
    TRANSACTION_ACTIVE;

    public String value() {
        return name();
    }

    public static StatementInformationItemNameType fromValue(String v) {
        return valueOf(v);
    }

}
