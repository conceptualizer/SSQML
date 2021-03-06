//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternallyInvokedProcedureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternallyInvokedProcedureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ProcedureStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ProcedureName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}HostParameterDeclarationList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Semicolon"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlProcedureStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Semicolon"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternallyInvokedProcedureType", propOrder = {
    "content"
})
public class ExternallyInvokedProcedureType {

    @XmlElementRefs({
        @XmlElementRef(name = "SqlProcedureStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProcedureStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Semicolon", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "HostParameterDeclarationList", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProcedureName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Semicolon" is used by two different parts of a schema. See: 
     * line 10258 of file:/C:/Users/Donald%20L.%20Tiffany%20Jr/Documents/NetBeansProjects/SSQML/src/ssqml/trunk/xsd/ssqml.xsd
     * line 10256 of file:/C:/Users/Donald%20L.%20Tiffany%20Jr/Documents/NetBeansProjects/SSQML/src/ssqml/trunk/xsd/ssqml.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SqlExecutableStatementType }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlExecutableStatementType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcedureStaticStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlExecutableStatementType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link HostParameterDeclarationListType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlExecutableStatementType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
