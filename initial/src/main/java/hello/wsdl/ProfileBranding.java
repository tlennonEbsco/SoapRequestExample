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
 * <p>Java class for ProfileBranding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileBranding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrandCustBGColor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandCustBGColor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandCustTxtLnkColor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandCustTxtLnkColor2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeTextForReviseRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustProductLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FooterBranding" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}FooterBranding" minOccurs="0"/>
 *         &lt;element name="LibImageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LibName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LibURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MenuHeaderFullTextFinder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileBrandingKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowReviseRequestLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data}StatusCodes" minOccurs="0"/>
 *         &lt;element name="TBLibLogoImgURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TBLibLogoImgURLAltText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TBLibLogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileBranding", propOrder = {
    "brandCustBGColor1",
    "brandCustBGColor2",
    "brandCustTxtLnkColor1",
    "brandCustTxtLnkColor2",
    "changeTextForReviseRequest",
    "custProductLabel",
    "errorDescription",
    "footerBranding",
    "libImageURL",
    "libName",
    "libURL",
    "menuHeaderFullTextFinder",
    "profileBrandingKey",
    "showReviseRequestLink",
    "statusCode",
    "tbLibLogoImgURL",
    "tbLibLogoImgURLAltText",
    "tbLibLogoURL"
})
public class ProfileBranding {

    @XmlElementRef(name = "BrandCustBGColor1", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> brandCustBGColor1;
    @XmlElementRef(name = "BrandCustBGColor2", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> brandCustBGColor2;
    @XmlElementRef(name = "BrandCustTxtLnkColor1", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> brandCustTxtLnkColor1;
    @XmlElementRef(name = "BrandCustTxtLnkColor2", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> brandCustTxtLnkColor2;
    @XmlElementRef(name = "ChangeTextForReviseRequest", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> changeTextForReviseRequest;
    @XmlElementRef(name = "CustProductLabel", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> custProductLabel;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "FooterBranding", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<FooterBranding> footerBranding;
    @XmlElementRef(name = "LibImageURL", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> libImageURL;
    @XmlElementRef(name = "LibName", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> libName;
    @XmlElementRef(name = "LibURL", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> libURL;
    @XmlElementRef(name = "MenuHeaderFullTextFinder", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> menuHeaderFullTextFinder;
    @XmlElementRef(name = "ProfileBrandingKey", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> profileBrandingKey;
    @XmlElement(name = "ShowReviseRequestLink")
    protected Boolean showReviseRequestLink;
    @XmlElement(name = "StatusCode")
    protected StatusCodes statusCode;
    @XmlElementRef(name = "TBLibLogoImgURL", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> tbLibLogoImgURL;
    @XmlElementRef(name = "TBLibLogoImgURLAltText", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> tbLibLogoImgURLAltText;
    @XmlElementRef(name = "TBLibLogoURL", namespace = "http://schemas.datacontract.org/2004/07/EP.Core.Services.AdminGatewayService.API.Contracts.Data", type = JAXBElement.class)
    protected JAXBElement<String> tbLibLogoURL;

    /**
     * Gets the value of the brandCustBGColor1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandCustBGColor1() {
        return brandCustBGColor1;
    }

    /**
     * Sets the value of the brandCustBGColor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandCustBGColor1(JAXBElement<String> value) {
        this.brandCustBGColor1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the brandCustBGColor2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandCustBGColor2() {
        return brandCustBGColor2;
    }

    /**
     * Sets the value of the brandCustBGColor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandCustBGColor2(JAXBElement<String> value) {
        this.brandCustBGColor2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the brandCustTxtLnkColor1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandCustTxtLnkColor1() {
        return brandCustTxtLnkColor1;
    }

    /**
     * Sets the value of the brandCustTxtLnkColor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandCustTxtLnkColor1(JAXBElement<String> value) {
        this.brandCustTxtLnkColor1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the brandCustTxtLnkColor2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandCustTxtLnkColor2() {
        return brandCustTxtLnkColor2;
    }

    /**
     * Sets the value of the brandCustTxtLnkColor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandCustTxtLnkColor2(JAXBElement<String> value) {
        this.brandCustTxtLnkColor2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the changeTextForReviseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChangeTextForReviseRequest() {
        return changeTextForReviseRequest;
    }

    /**
     * Sets the value of the changeTextForReviseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChangeTextForReviseRequest(JAXBElement<String> value) {
        this.changeTextForReviseRequest = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the custProductLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustProductLabel() {
        return custProductLabel;
    }

    /**
     * Sets the value of the custProductLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustProductLabel(JAXBElement<String> value) {
        this.custProductLabel = ((JAXBElement<String> ) value);
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
     * Gets the value of the footerBranding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FooterBranding }{@code >}
     *     
     */
    public JAXBElement<FooterBranding> getFooterBranding() {
        return footerBranding;
    }

    /**
     * Sets the value of the footerBranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FooterBranding }{@code >}
     *     
     */
    public void setFooterBranding(JAXBElement<FooterBranding> value) {
        this.footerBranding = ((JAXBElement<FooterBranding> ) value);
    }

    /**
     * Gets the value of the libImageURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLibImageURL() {
        return libImageURL;
    }

    /**
     * Sets the value of the libImageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLibImageURL(JAXBElement<String> value) {
        this.libImageURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the libName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLibName() {
        return libName;
    }

    /**
     * Sets the value of the libName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLibName(JAXBElement<String> value) {
        this.libName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the libURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLibURL() {
        return libURL;
    }

    /**
     * Sets the value of the libURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLibURL(JAXBElement<String> value) {
        this.libURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the menuHeaderFullTextFinder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMenuHeaderFullTextFinder() {
        return menuHeaderFullTextFinder;
    }

    /**
     * Sets the value of the menuHeaderFullTextFinder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMenuHeaderFullTextFinder(JAXBElement<String> value) {
        this.menuHeaderFullTextFinder = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profileBrandingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileBrandingKey() {
        return profileBrandingKey;
    }

    /**
     * Sets the value of the profileBrandingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileBrandingKey(JAXBElement<String> value) {
        this.profileBrandingKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the showReviseRequestLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowReviseRequestLink() {
        return showReviseRequestLink;
    }

    /**
     * Sets the value of the showReviseRequestLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowReviseRequestLink(Boolean value) {
        this.showReviseRequestLink = value;
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

    /**
     * Gets the value of the tbLibLogoImgURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTBLibLogoImgURL() {
        return tbLibLogoImgURL;
    }

    /**
     * Sets the value of the tbLibLogoImgURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTBLibLogoImgURL(JAXBElement<String> value) {
        this.tbLibLogoImgURL = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbLibLogoImgURLAltText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTBLibLogoImgURLAltText() {
        return tbLibLogoImgURLAltText;
    }

    /**
     * Sets the value of the tbLibLogoImgURLAltText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTBLibLogoImgURLAltText(JAXBElement<String> value) {
        this.tbLibLogoImgURLAltText = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tbLibLogoURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTBLibLogoURL() {
        return tbLibLogoURL;
    }

    /**
     * Sets the value of the tbLibLogoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTBLibLogoURL(JAXBElement<String> value) {
        this.tbLibLogoURL = ((JAXBElement<String> ) value);
    }

}