//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.04 at 08:23:44 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LongTermData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LongTermData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/diagnostic}ConstraintsConclusion">
 *       &lt;attribute name="SignatureId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongTermData")
public class XmlLongTermData
    extends XmlConstraintsConclusion
{

    @XmlAttribute(name = "SignatureId", required = true)
    protected String signatureId;

    /**
     * Gets the value of the signatureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureId() {
        return signatureId;
    }

    /**
     * Sets the value of the signatureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureId(String value) {
        this.signatureId = value;
    }

}
