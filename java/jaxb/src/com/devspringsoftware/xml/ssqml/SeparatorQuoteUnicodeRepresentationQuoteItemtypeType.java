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
 * <p>Java class for SeparatorQuoteUnicodeRepresentationQuoteItemtypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeparatorQuoteUnicodeRepresentationQuoteItemtypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}Separator"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Quote"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnicodeRepresentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Quote"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeparatorQuoteUnicodeRepresentationQuoteItemtypeType", propOrder = {
    "content"
})
public class SeparatorQuoteUnicodeRepresentationQuoteItemtypeType {

    @XmlElementRefs({
        @XmlElementRef(name = "Separator", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UnicodeRepresentation", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Quote", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Quote" is used by two different parts of a schema. See: 
     * line 14596 of file:/C:/Users/Donald%20L.%20Tiffany%20Jr/Documents/NetBeansProjects/SSQML/src/ssqml/trunk/xsd/ssqml.xsd
     * line 14594 of file:/C:/Users/Donald%20L.%20Tiffany%20Jr/Documents/NetBeansProjects/SSQML/src/ssqml/trunk/xsd/ssqml.xsd
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link SeparatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnicodeRepresentationType }{@code >}
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
