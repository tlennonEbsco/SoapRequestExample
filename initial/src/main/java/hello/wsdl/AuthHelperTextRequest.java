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
 * <p>Java class for AuthHelperTextRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthHelperTextRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}RequestItem">
 *       &lt;sequence>
 *         &lt;element name="CustomLinkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthHelperTextRequest", propOrder = {
    "customLinkId"
})
public class AuthHelperTextRequest
    extends RequestItem
{

    @XmlElementRef(name = "CustomLinkId", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> customLinkId;

    /**
     * Gets the value of the customLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomLinkId() {
        return customLinkId;
    }

    /**
     * Sets the value of the customLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomLinkId(JAXBElement<String> value) {
        this.customLinkId = ((JAXBElement<String> ) value);
    }

}
