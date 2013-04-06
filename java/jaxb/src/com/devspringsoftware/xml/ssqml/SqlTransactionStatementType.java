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
 * <p>Java class for SqlTransactionStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlTransactionStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}StartTransactionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetTransactionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetConstraintsModeStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SavepointStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReleaseSavepointStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommitStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RollbackStatement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlTransactionStatementType", propOrder = {
    "startTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement"
})
public class SqlTransactionStatementType {

    @XmlElements({
        @XmlElement(name = "StartTransactionStatement", type = StartTransactionStatementType.class),
        @XmlElement(name = "SetTransactionStatement", type = SetTransactionStatementType.class),
        @XmlElement(name = "SetConstraintsModeStatement", type = SetConstraintsModeStatementType.class),
        @XmlElement(name = "SavepointStatement", type = SavepointStatementType.class),
        @XmlElement(name = "ReleaseSavepointStatement", type = ReleaseSavepointStatementType.class),
        @XmlElement(name = "CommitStatement", type = CommitStatementType.class),
        @XmlElement(name = "RollbackStatement", type = RollbackStatementType.class)
    })
    protected Object startTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement;

    /**
     * Gets the value of the startTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement property.
     * 
     * @return
     *     possible object is
     *     {@link StartTransactionStatementType }
     *     {@link SetTransactionStatementType }
     *     {@link SetConstraintsModeStatementType }
     *     {@link SavepointStatementType }
     *     {@link ReleaseSavepointStatementType }
     *     {@link CommitStatementType }
     *     {@link RollbackStatementType }
     *     
     */
    public Object getStartTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement() {
        return startTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement;
    }

    /**
     * Sets the value of the startTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTransactionStatementType }
     *     {@link SetTransactionStatementType }
     *     {@link SetConstraintsModeStatementType }
     *     {@link SavepointStatementType }
     *     {@link ReleaseSavepointStatementType }
     *     {@link CommitStatementType }
     *     {@link RollbackStatementType }
     *     
     */
    public void setStartTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement(Object value) {
        this.startTransactionStatementOrSetTransactionStatementOrSetConstraintsModeStatement = value;
    }

}
