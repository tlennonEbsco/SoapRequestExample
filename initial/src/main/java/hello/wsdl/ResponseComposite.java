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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ResponseComponent">
 *       &lt;sequence>
 *         &lt;element name="ResponseComponents" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ArrayOfResponseComponent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseComposite", propOrder = {
    "responseComponents"
})
@XmlSeeAlso({
    AuthHelperTextResponses.class,
    LinkTextResponses.class,
    ProfileAttributeResponses.class,
    FilterCollectionIdResponses.class,
    MouseOverTextResponses.class,
    CustomLinkResponse.class,
    CustomLinkResponses.class
})
public class ResponseComposite
    extends ResponseComponent
{

    @XmlElementRef(name = "ResponseComponents", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<ArrayOfResponseComponent> responseComponents;

    /**
     * Gets the value of the responseComponents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseComponent }{@code >}
     *     
     */
    public JAXBElement<ArrayOfResponseComponent> getResponseComponents() {
        return responseComponents;
    }

    /**
     * Sets the value of the responseComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfResponseComponent }{@code >}
     *     
     */
    public void setResponseComponents(JAXBElement<ArrayOfResponseComponent> value) {
        this.responseComponents = ((JAXBElement<ArrayOfResponseComponent> ) value);
    }

}
