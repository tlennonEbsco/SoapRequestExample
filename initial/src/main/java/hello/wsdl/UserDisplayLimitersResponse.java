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
 * <p>Java class for UserDisplayLimitersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDisplayLimitersResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ResponseItem">
 *       &lt;sequence>
 *         &lt;element name="UserDisplayLimiters" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data}UserDisplayLimiters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDisplayLimitersResponse", propOrder = {
    "userDisplayLimiters"
})
public class UserDisplayLimitersResponse
    extends ResponseItem
{

    @XmlElementRef(name = "UserDisplayLimiters", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<UserDisplayLimiters> userDisplayLimiters;

    /**
     * Gets the value of the userDisplayLimiters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDisplayLimiters }{@code >}
     *     
     */
    public JAXBElement<UserDisplayLimiters> getUserDisplayLimiters() {
        return userDisplayLimiters;
    }

    /**
     * Sets the value of the userDisplayLimiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDisplayLimiters }{@code >}
     *     
     */
    public void setUserDisplayLimiters(JAXBElement<UserDisplayLimiters> value) {
        this.userDisplayLimiters = ((JAXBElement<UserDisplayLimiters> ) value);
    }

}