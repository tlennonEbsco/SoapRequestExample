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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetInterfaceFeatureResult" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ProfileInterfaceFeatureDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getInterfaceFeatureResult"
})
@XmlRootElement(name = "GetInterfaceFeatureResponse", namespace = "http://tempuri.org/")
public class GetInterfaceFeatureResponse {

    @XmlElementRef(name = "GetInterfaceFeatureResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ProfileInterfaceFeatureDetails> getInterfaceFeatureResult;

    /**
     * Gets the value of the getInterfaceFeatureResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileInterfaceFeatureDetails }{@code >}
     *     
     */
    public JAXBElement<ProfileInterfaceFeatureDetails> getGetInterfaceFeatureResult() {
        return getInterfaceFeatureResult;
    }

    /**
     * Sets the value of the getInterfaceFeatureResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileInterfaceFeatureDetails }{@code >}
     *     
     */
    public void setGetInterfaceFeatureResult(JAXBElement<ProfileInterfaceFeatureDetails> value) {
        this.getInterfaceFeatureResult = ((JAXBElement<ProfileInterfaceFeatureDetails> ) value);
    }

}
