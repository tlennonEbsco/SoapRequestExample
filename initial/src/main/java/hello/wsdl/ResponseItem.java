//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.26 at 10:34:50 AM EDT 
//


package hello.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}ResponseComponent">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseItem")
@XmlSeeAlso({
    ProfileInfoResponse.class,
    FilterCollectionIdResponse.class,
    ProfileAttributeResponse.class,
    UserGroupDatabasesResponse.class,
    InterfaceNameResponse.class,
    LanguageTextResponse.class,
    ProfileSearchDatabasesResponse.class,
    UserDisplayLimitersResponse.class,
    ProfileSearchDatabaseDetailsResponse.class
})
public class ResponseItem
    extends ResponseComponent
{


}
