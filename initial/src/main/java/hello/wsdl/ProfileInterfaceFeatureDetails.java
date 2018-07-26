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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileInterfaceFeatureDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileInterfaceFeatureDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribs" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ArrayOfProfileAttribute" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Items" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ArrayOfInterfaceFeatureItemInfo" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileInterfaceFeatureKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}StatusCodes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileInterfaceFeatureDetails", propOrder = {
    "attribs",
    "errorDescription",
    "featureType",
    "items",
    "name",
    "profileInterfaceFeatureKey",
    "statusCode"
})
public class ProfileInterfaceFeatureDetails {

    @XmlElementRef(name = "Attribs", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfProfileAttribute> attribs;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "FeatureType", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> featureType;
    @XmlElementRef(name = "Items", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfInterfaceFeatureItemInfo> items;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ProfileInterfaceFeatureKey", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> profileInterfaceFeatureKey;
    @XmlElement(name = "StatusCode")
    protected StatusCodes statusCode;

    /**
     * Gets the value of the attribs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProfileAttribute }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProfileAttribute> getAttribs() {
        return attribs;
    }

    /**
     * Sets the value of the attribs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProfileAttribute }{@code >}
     *     
     */
    public void setAttribs(JAXBElement<ArrayOfProfileAttribute> value) {
        this.attribs = ((JAXBElement<ArrayOfProfileAttribute> ) value);
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescription(JAXBElement<String> value) {
        this.errorDescription = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeatureType(JAXBElement<String> value) {
        this.featureType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInterfaceFeatureItemInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInterfaceFeatureItemInfo> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInterfaceFeatureItemInfo }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfInterfaceFeatureItemInfo> value) {
        this.items = ((JAXBElement<ArrayOfInterfaceFeatureItemInfo> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profileInterfaceFeatureKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileInterfaceFeatureKey() {
        return profileInterfaceFeatureKey;
    }

    /**
     * Sets the value of the profileInterfaceFeatureKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileInterfaceFeatureKey(JAXBElement<String> value) {
        this.profileInterfaceFeatureKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodes }
     *     
     */
    public StatusCodes getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodes }
     *     
     */
    public void setStatusCode(StatusCodes value) {
        this.statusCode = value;
    }

}
