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
 * <p>SeqE_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="GRSS" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_GRSS_Type"/>
 *         &lt;element name="TAXR" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_TAXR_Type"/>
 *         &lt;element name="ATAX" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_ATAX_Type"/>
 *         &lt;element name="INDX" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_INDX_Type"/>
 *         &lt;element name="OVEP" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_OVEP_Type"/>
 *         &lt;element name="PROR" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_PROR_Type"/>
 *         &lt;element name="INTP" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_INTP_Type"/>
 *         &lt;element name="TDMT" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_TDMT_Type"/>
 *         &lt;element name="NETT" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_NETT_Type"/>
 *         &lt;element name="IDFX" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_IDFX_Type"/>
 *         &lt;element name="TXIN" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_TXIN_Type"/>
 *         &lt;element name="WITL" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_WITL_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F92a_Type", propOrder = {
    "grss",
    "taxr",
    "atax",
    "indx",
    "ovep",
    "pror",
    "intp",
    "tdmt",
    "nett",
    "idfx",
    "txin",
    "witl"
})
public class SeqEF92AType
    extends ISO15022Field
{

    @XmlElement(name = "GRSS")
    protected SeqEF92AGRSSType grss;
    @XmlElement(name = "TAXR")
    protected SeqEF92ATAXRType taxr;
    @XmlElement(name = "ATAX")
    protected SeqEF92AATAXType atax;
    @XmlElement(name = "INDX")
    protected SeqEF92AINDXType indx;
    @XmlElement(name = "OVEP")
    protected SeqEF92AOVEPType ovep;
    @XmlElement(name = "PROR")
    protected SeqEF92APRORType pror;
    @XmlElement(name = "INTP")
    protected SeqEF92AINTPType intp;
    @XmlElement(name = "TDMT")
    protected SeqEF92ATDMTType tdmt;
    @XmlElement(name = "NETT")
    protected SeqEF92ANETTType nett;
    @XmlElement(name = "IDFX")
    protected SeqEF92AIDFXType idfx;
    @XmlElement(name = "TXIN")
    protected SeqEF92ATXINType txin;
    @XmlElement(name = "WITL")
    protected SeqEF92AWITLType witl;

    /**
     * 获取grss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AGRSSType }
     *     
     */
    public SeqEF92AGRSSType getGRSS() {
        return grss;
    }

    /**
     * 设置grss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AGRSSType }
     *     
     */
    public void setGRSS(SeqEF92AGRSSType value) {
        this.grss = value;
    }

    /**
     * 获取taxr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ATAXRType }
     *     
     */
    public SeqEF92ATAXRType getTAXR() {
        return taxr;
    }

    /**
     * 设置taxr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ATAXRType }
     *     
     */
    public void setTAXR(SeqEF92ATAXRType value) {
        this.taxr = value;
    }

    /**
     * 获取atax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AATAXType }
     *     
     */
    public SeqEF92AATAXType getATAX() {
        return atax;
    }

    /**
     * 设置atax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AATAXType }
     *     
     */
    public void setATAX(SeqEF92AATAXType value) {
        this.atax = value;
    }

    /**
     * 获取indx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AINDXType }
     *     
     */
    public SeqEF92AINDXType getINDX() {
        return indx;
    }

    /**
     * 设置indx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AINDXType }
     *     
     */
    public void setINDX(SeqEF92AINDXType value) {
        this.indx = value;
    }

    /**
     * 获取ovep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AOVEPType }
     *     
     */
    public SeqEF92AOVEPType getOVEP() {
        return ovep;
    }

    /**
     * 设置ovep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AOVEPType }
     *     
     */
    public void setOVEP(SeqEF92AOVEPType value) {
        this.ovep = value;
    }

    /**
     * 获取pror属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92APRORType }
     *     
     */
    public SeqEF92APRORType getPROR() {
        return pror;
    }

    /**
     * 设置pror属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92APRORType }
     *     
     */
    public void setPROR(SeqEF92APRORType value) {
        this.pror = value;
    }

    /**
     * 获取intp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AINTPType }
     *     
     */
    public SeqEF92AINTPType getINTP() {
        return intp;
    }

    /**
     * 设置intp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AINTPType }
     *     
     */
    public void setINTP(SeqEF92AINTPType value) {
        this.intp = value;
    }

    /**
     * 获取tdmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ATDMTType }
     *     
     */
    public SeqEF92ATDMTType getTDMT() {
        return tdmt;
    }

    /**
     * 设置tdmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ATDMTType }
     *     
     */
    public void setTDMT(SeqEF92ATDMTType value) {
        this.tdmt = value;
    }

    /**
     * 获取nett属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ANETTType }
     *     
     */
    public SeqEF92ANETTType getNETT() {
        return nett;
    }

    /**
     * 设置nett属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ANETTType }
     *     
     */
    public void setNETT(SeqEF92ANETTType value) {
        this.nett = value;
    }

    /**
     * 获取idfx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AIDFXType }
     *     
     */
    public SeqEF92AIDFXType getIDFX() {
        return idfx;
    }

    /**
     * 设置idfx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AIDFXType }
     *     
     */
    public void setIDFX(SeqEF92AIDFXType value) {
        this.idfx = value;
    }

    /**
     * 获取txin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ATXINType }
     *     
     */
    public SeqEF92ATXINType getTXIN() {
        return txin;
    }

    /**
     * 设置txin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ATXINType }
     *     
     */
    public void setTXIN(SeqEF92ATXINType value) {
        this.txin = value;
    }

    /**
     * 获取witl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AWITLType }
     *     
     */
    public SeqEF92AWITLType getWITL() {
        return witl;
    }

    /**
     * 设置witl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AWITLType }
     *     
     */
    public void setWITL(SeqEF92AWITLType value) {
        this.witl = value;
    }

}
