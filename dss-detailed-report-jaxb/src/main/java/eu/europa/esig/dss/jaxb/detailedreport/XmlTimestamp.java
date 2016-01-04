//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.04 at 08:23:44 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Timestamp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Timestamp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BasicBuildingBlocks" type="{http://dss.esig.europa.eu/validation/diagnostic}BasicBuildingBlocks"/>
 *         &lt;element name="Constraints" type="{http://dss.esig.europa.eu/validation/diagnostic}ConstraintsConclusion" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SignatureId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timestamp", propOrder = {
    "basicBuildingBlocks",
    "constraints"
})
public class XmlTimestamp {

    @XmlElement(name = "BasicBuildingBlocks")
    protected XmlBasicBuildingBlocks basicBuildingBlocks;
    @XmlElement(name = "Constraints")
    protected List<XmlConstraintsConclusion> constraints;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "SignatureId", required = true)
    protected String signatureId;

    /**
     * Gets the value of the basicBuildingBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link XmlBasicBuildingBlocks }
     *     
     */
    public XmlBasicBuildingBlocks getBasicBuildingBlocks() {
        return basicBuildingBlocks;
    }

    /**
     * Sets the value of the basicBuildingBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlBasicBuildingBlocks }
     *     
     */
    public void setBasicBuildingBlocks(XmlBasicBuildingBlocks value) {
        this.basicBuildingBlocks = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlConstraintsConclusion }
     * 
     * 
     */
    public List<XmlConstraintsConclusion> getConstraints() {
        if (constraints == null) {
            constraints = new ArrayList<XmlConstraintsConclusion>();
        }
        return this.constraints;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

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
