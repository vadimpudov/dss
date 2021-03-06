//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.26 at 09:19:39 AM CET 
//


package eu.europa.esig.dss.jaxb.diagnostic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicSignature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EncryptionAlgoUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyLengthUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigestAlgoUsedToSignThisToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenceDataFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReferenceDataIntact" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SignatureIntact" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SignatureValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSignature", propOrder = {
    "encryptionAlgoUsedToSignThisToken",
    "keyLengthUsedToSignThisToken",
    "digestAlgoUsedToSignThisToken",
    "referenceDataFound",
    "referenceDataIntact",
    "signatureIntact",
    "signatureValid"
})
public class XmlBasicSignature {

    @XmlElement(name = "EncryptionAlgoUsedToSignThisToken")
    protected String encryptionAlgoUsedToSignThisToken;
    @XmlElement(name = "KeyLengthUsedToSignThisToken")
    protected String keyLengthUsedToSignThisToken;
    @XmlElement(name = "DigestAlgoUsedToSignThisToken")
    protected String digestAlgoUsedToSignThisToken;
    @XmlElement(name = "ReferenceDataFound")
    protected boolean referenceDataFound;
    @XmlElement(name = "ReferenceDataIntact")
    protected boolean referenceDataIntact;
    @XmlElement(name = "SignatureIntact")
    protected boolean signatureIntact;
    @XmlElement(name = "SignatureValid")
    protected boolean signatureValid;

    /**
     * Gets the value of the encryptionAlgoUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionAlgoUsedToSignThisToken() {
        return encryptionAlgoUsedToSignThisToken;
    }

    /**
     * Sets the value of the encryptionAlgoUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionAlgoUsedToSignThisToken(String value) {
        this.encryptionAlgoUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the keyLengthUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLengthUsedToSignThisToken() {
        return keyLengthUsedToSignThisToken;
    }

    /**
     * Sets the value of the keyLengthUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLengthUsedToSignThisToken(String value) {
        this.keyLengthUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the digestAlgoUsedToSignThisToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigestAlgoUsedToSignThisToken() {
        return digestAlgoUsedToSignThisToken;
    }

    /**
     * Sets the value of the digestAlgoUsedToSignThisToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigestAlgoUsedToSignThisToken(String value) {
        this.digestAlgoUsedToSignThisToken = value;
    }

    /**
     * Gets the value of the referenceDataFound property.
     * 
     */
    public boolean isReferenceDataFound() {
        return referenceDataFound;
    }

    /**
     * Sets the value of the referenceDataFound property.
     * 
     */
    public void setReferenceDataFound(boolean value) {
        this.referenceDataFound = value;
    }

    /**
     * Gets the value of the referenceDataIntact property.
     * 
     */
    public boolean isReferenceDataIntact() {
        return referenceDataIntact;
    }

    /**
     * Sets the value of the referenceDataIntact property.
     * 
     */
    public void setReferenceDataIntact(boolean value) {
        this.referenceDataIntact = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     */
    public boolean isSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     */
    public void setSignatureIntact(boolean value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the signatureValid property.
     * 
     */
    public boolean isSignatureValid() {
        return signatureValid;
    }

    /**
     * Sets the value of the signatureValid property.
     * 
     */
    public void setSignatureValid(boolean value) {
        this.signatureValid = value;
    }

}
