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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserDbLimiter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserDbLimiter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserDbLimiter" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data}UserDbLimiter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserDbLimiter", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.Domain.UserProfile.Contracts.Data", propOrder = {
    "userDbLimiter"
})
public class ArrayOfUserDbLimiter {

    @XmlElement(name = "UserDbLimiter", nillable = true)
    protected List<UserDbLimiter> userDbLimiter;

    /**
     * Gets the value of the userDbLimiter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDbLimiter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDbLimiter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDbLimiter }
     * 
     * 
     */
    public List<UserDbLimiter> getUserDbLimiter() {
        if (userDbLimiter == null) {
            userDbLimiter = new ArrayList<UserDbLimiter>();
        }
        return this.userDbLimiter;
    }

}
