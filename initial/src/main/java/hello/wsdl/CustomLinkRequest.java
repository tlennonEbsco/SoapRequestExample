//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.26 at 10:34:50 AM EDT 
//


package hello.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomLinkRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomLinkRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}RequestComposite">
 *       &lt;sequence>
 *         &lt;element name="CustomLinkCompositeExcludeFlag" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}CustomLinkExcludeFlag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomLinkRequest", propOrder = {
    "customLinkCompositeExcludeFlag"
})
public class CustomLinkRequest
    extends RequestComposite
{

    @XmlList
    @XmlElement(name = "CustomLinkCompositeExcludeFlag")
    protected List<String> customLinkCompositeExcludeFlag;

    /**
     * Gets the value of the customLinkCompositeExcludeFlag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customLinkCompositeExcludeFlag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomLinkCompositeExcludeFlag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomLinkCompositeExcludeFlag() {
        if (customLinkCompositeExcludeFlag == null) {
            customLinkCompositeExcludeFlag = new ArrayList<String>();
        }
        return this.customLinkCompositeExcludeFlag;
    }

}
