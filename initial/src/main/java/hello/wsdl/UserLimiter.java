//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.26 at 10:34:50 AM EDT 
//


package hello.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserLimiter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserLimiter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlDefault" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hidden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LimiterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserLimiter", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data", propOrder = {
    "caption",
    "controlDefault",
    "hidden",
    "limiterID"
})
public class UserLimiter {

    @XmlElementRef(name = "Caption", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> caption;
    @XmlElementRef(name = "ControlDefault", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> controlDefault;
    @XmlElementRef(name = "Hidden", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> hidden;
    @XmlElementRef(name = "LimiterID", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> limiterID;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaption(JAXBElement<String> value) {
        this.caption = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the controlDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getControlDefault() {
        return controlDefault;
    }

    /**
     * Sets the value of the controlDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setControlDefault(JAXBElement<String> value) {
        this.controlDefault = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHidden(JAXBElement<String> value) {
        this.hidden = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the limiterID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimiterID() {
        return limiterID;
    }

    /**
     * Sets the value of the limiterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimiterID(JAXBElement<String> value) {
        this.limiterID = ((JAXBElement<String> ) value);
    }

}