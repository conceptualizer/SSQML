//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlConnectionStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlConnectionStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ConnectStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetConnectionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DisconnectStatement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlConnectionStatementType", propOrder = {
    "connectStatementOrSetConnectionStatementOrDisconnectStatement"
})
public class SqlConnectionStatementType {

    @XmlElements({
        @XmlElement(name = "ConnectStatement", type = ConnectStatementType.class),
        @XmlElement(name = "SetConnectionStatement", type = SetConnectionStatementType.class),
        @XmlElement(name = "DisconnectStatement", type = DisconnectStatementType.class)
    })
    protected Object connectStatementOrSetConnectionStatementOrDisconnectStatement;

    /**
     * Gets the value of the connectStatementOrSetConnectionStatementOrDisconnectStatement property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectStatementType }
     *     {@link SetConnectionStatementType }
     *     {@link DisconnectStatementType }
     *     
     */
    public Object getConnectStatementOrSetConnectionStatementOrDisconnectStatement() {
        return connectStatementOrSetConnectionStatementOrDisconnectStatement;
    }

    /**
     * Sets the value of the connectStatementOrSetConnectionStatementOrDisconnectStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectStatementType }
     *     {@link SetConnectionStatementType }
     *     {@link DisconnectStatementType }
     *     
     */
    public void setConnectStatementOrSetConnectionStatementOrDisconnectStatement(Object value) {
        this.connectStatementOrSetConnectionStatementOrDisconnectStatement = value;
    }

}
