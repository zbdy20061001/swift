//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.05 时间 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqE2_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ATAX" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_ATAX_Type"/>
 *         &lt;element name="CHAR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_CHAR_Type"/>
 *         &lt;element name="EQUL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_EQUL_Type"/>
 *         &lt;element name="ESOF" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_ESOF_Type"/>
 *         &lt;element name="FISC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_FISC_Type"/>
 *         &lt;element name="GRSS" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_GRSS_Type"/>
 *         &lt;element name="EXCH" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_EXCH_Type"/>
 *         &lt;element name="INCE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_INCE_Type"/>
 *         &lt;element name="INTP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_INTP_Type"/>
 *         &lt;element name="NETT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_NETT_Type"/>
 *         &lt;element name="RATE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_RATE_Type"/>
 *         &lt;element name="SOFE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_SOFE_Type"/>
 *         &lt;element name="TAXC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TAXC_Type"/>
 *         &lt;element name="TAXR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TAXR_Type"/>
 *         &lt;element name="TXIN" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TXIN_Type"/>
 *         &lt;element name="TXPR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TXPR_Type"/>
 *         &lt;element name="TXRC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TXRC_Type"/>
 *         &lt;element name="WITL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_WITL_Type"/>
 *         &lt;element name="DEEM" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_DEEM_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F92a_Type", propOrder = {
    "atax",
    "_char",
    "equl",
    "esof",
    "fisc",
    "grss",
    "exch",
    "ince",
    "intp",
    "nett",
    "rate",
    "sofe",
    "taxc",
    "taxr",
    "txin",
    "txpr",
    "txrc",
    "witl",
    "deem"
})
public class SeqE2F92AType
    extends ISO15022Field
{

    @XmlElement(name = "ATAX")
    protected SeqE2F92AATAXType atax;
    @XmlElement(name = "CHAR")
    protected SeqE2F92ACHARType _char;
    @XmlElement(name = "EQUL")
    protected SeqE2F92AEQULType equl;
    @XmlElement(name = "ESOF")
    protected SeqE2F92AESOFType esof;
    @XmlElement(name = "FISC")
    protected SeqE2F92AFISCType fisc;
    @XmlElement(name = "GRSS")
    protected SeqE2F92AGRSSType grss;
    @XmlElement(name = "EXCH")
    protected SeqE2F92AEXCHType exch;
    @XmlElement(name = "INCE")
    protected SeqE2F92AINCEType ince;
    @XmlElement(name = "INTP")
    protected SeqE2F92AINTPType intp;
    @XmlElement(name = "NETT")
    protected SeqE2F92ANETTType nett;
    @XmlElement(name = "RATE")
    protected SeqE2F92ARATEType rate;
    @XmlElement(name = "SOFE")
    protected SeqE2F92ASOFEType sofe;
    @XmlElement(name = "TAXC")
    protected SeqE2F92ATAXCType taxc;
    @XmlElement(name = "TAXR")
    protected SeqE2F92ATAXRType taxr;
    @XmlElement(name = "TXIN")
    protected SeqE2F92ATXINType txin;
    @XmlElement(name = "TXPR")
    protected SeqE2F92ATXPRType txpr;
    @XmlElement(name = "TXRC")
    protected SeqE2F92ATXRCType txrc;
    @XmlElement(name = "WITL")
    protected SeqE2F92AWITLType witl;
    @XmlElement(name = "DEEM")
    protected SeqE2F92ADEEMType deem;

    /**
     * 获取atax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AATAXType }
     *     
     */
    public SeqE2F92AATAXType getATAX() {
        return atax;
    }

    /**
     * 设置atax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AATAXType }
     *     
     */
    public void setATAX(SeqE2F92AATAXType value) {
        this.atax = value;
    }

    /**
     * 获取char属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ACHARType }
     *     
     */
    public SeqE2F92ACHARType getCHAR() {
        return _char;
    }

    /**
     * 设置char属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ACHARType }
     *     
     */
    public void setCHAR(SeqE2F92ACHARType value) {
        this._char = value;
    }

    /**
     * 获取equl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AEQULType }
     *     
     */
    public SeqE2F92AEQULType getEQUL() {
        return equl;
    }

    /**
     * 设置equl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AEQULType }
     *     
     */
    public void setEQUL(SeqE2F92AEQULType value) {
        this.equl = value;
    }

    /**
     * 获取esof属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AESOFType }
     *     
     */
    public SeqE2F92AESOFType getESOF() {
        return esof;
    }

    /**
     * 设置esof属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AESOFType }
     *     
     */
    public void setESOF(SeqE2F92AESOFType value) {
        this.esof = value;
    }

    /**
     * 获取fisc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AFISCType }
     *     
     */
    public SeqE2F92AFISCType getFISC() {
        return fisc;
    }

    /**
     * 设置fisc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AFISCType }
     *     
     */
    public void setFISC(SeqE2F92AFISCType value) {
        this.fisc = value;
    }

    /**
     * 获取grss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AGRSSType }
     *     
     */
    public SeqE2F92AGRSSType getGRSS() {
        return grss;
    }

    /**
     * 设置grss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AGRSSType }
     *     
     */
    public void setGRSS(SeqE2F92AGRSSType value) {
        this.grss = value;
    }

    /**
     * 获取exch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AEXCHType }
     *     
     */
    public SeqE2F92AEXCHType getEXCH() {
        return exch;
    }

    /**
     * 设置exch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AEXCHType }
     *     
     */
    public void setEXCH(SeqE2F92AEXCHType value) {
        this.exch = value;
    }

    /**
     * 获取ince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AINCEType }
     *     
     */
    public SeqE2F92AINCEType getINCE() {
        return ince;
    }

    /**
     * 设置ince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AINCEType }
     *     
     */
    public void setINCE(SeqE2F92AINCEType value) {
        this.ince = value;
    }

    /**
     * 获取intp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AINTPType }
     *     
     */
    public SeqE2F92AINTPType getINTP() {
        return intp;
    }

    /**
     * 设置intp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AINTPType }
     *     
     */
    public void setINTP(SeqE2F92AINTPType value) {
        this.intp = value;
    }

    /**
     * 获取nett属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ANETTType }
     *     
     */
    public SeqE2F92ANETTType getNETT() {
        return nett;
    }

    /**
     * 设置nett属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ANETTType }
     *     
     */
    public void setNETT(SeqE2F92ANETTType value) {
        this.nett = value;
    }

    /**
     * 获取rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ARATEType }
     *     
     */
    public SeqE2F92ARATEType getRATE() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ARATEType }
     *     
     */
    public void setRATE(SeqE2F92ARATEType value) {
        this.rate = value;
    }

    /**
     * 获取sofe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ASOFEType }
     *     
     */
    public SeqE2F92ASOFEType getSOFE() {
        return sofe;
    }

    /**
     * 设置sofe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ASOFEType }
     *     
     */
    public void setSOFE(SeqE2F92ASOFEType value) {
        this.sofe = value;
    }

    /**
     * 获取taxc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATAXCType }
     *     
     */
    public SeqE2F92ATAXCType getTAXC() {
        return taxc;
    }

    /**
     * 设置taxc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATAXCType }
     *     
     */
    public void setTAXC(SeqE2F92ATAXCType value) {
        this.taxc = value;
    }

    /**
     * 获取taxr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATAXRType }
     *     
     */
    public SeqE2F92ATAXRType getTAXR() {
        return taxr;
    }

    /**
     * 设置taxr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATAXRType }
     *     
     */
    public void setTAXR(SeqE2F92ATAXRType value) {
        this.taxr = value;
    }

    /**
     * 获取txin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATXINType }
     *     
     */
    public SeqE2F92ATXINType getTXIN() {
        return txin;
    }

    /**
     * 设置txin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATXINType }
     *     
     */
    public void setTXIN(SeqE2F92ATXINType value) {
        this.txin = value;
    }

    /**
     * 获取txpr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATXPRType }
     *     
     */
    public SeqE2F92ATXPRType getTXPR() {
        return txpr;
    }

    /**
     * 设置txpr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATXPRType }
     *     
     */
    public void setTXPR(SeqE2F92ATXPRType value) {
        this.txpr = value;
    }

    /**
     * 获取txrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATXRCType }
     *     
     */
    public SeqE2F92ATXRCType getTXRC() {
        return txrc;
    }

    /**
     * 设置txrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATXRCType }
     *     
     */
    public void setTXRC(SeqE2F92ATXRCType value) {
        this.txrc = value;
    }

    /**
     * 获取witl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AWITLType }
     *     
     */
    public SeqE2F92AWITLType getWITL() {
        return witl;
    }

    /**
     * 设置witl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AWITLType }
     *     
     */
    public void setWITL(SeqE2F92AWITLType value) {
        this.witl = value;
    }

    /**
     * 获取deem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ADEEMType }
     *     
     */
    public SeqE2F92ADEEMType getDEEM() {
        return deem;
    }

    /**
     * 设置deem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ADEEMType }
     *     
     */
    public void setDEEM(SeqE2F92ADEEMType value) {
        this.deem = value;
    }

}
