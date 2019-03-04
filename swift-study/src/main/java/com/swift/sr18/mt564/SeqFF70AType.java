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
 * <p>SeqF_F70a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqF_F70a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ADTX" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_ADTX_Type"/>
 *         &lt;element name="TXNR" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_TXNR_Type"/>
 *         &lt;element name="REGI" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_REGI_Type"/>
 *         &lt;element name="INCO" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_INCO_Type"/>
 *         &lt;element name="COMP" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_COMP_Type"/>
 *         &lt;element name="PACO" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_PACO_Type"/>
 *         &lt;element name="TAXE" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_TAXE_Type"/>
 *         &lt;element name="DISC" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_DISC_Type"/>
 *         &lt;element name="BAIN" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_BAIN_Type"/>
 *         &lt;element name="CETI" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_CETI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqF_F70a_Type", propOrder = {
    "adtx",
    "txnr",
    "regi",
    "inco",
    "comp",
    "paco",
    "taxe",
    "disc",
    "bain",
    "ceti"
})
public class SeqFF70AType
    extends ISO15022Field
{

    @XmlElement(name = "ADTX")
    protected SeqFF70AADTXType adtx;
    @XmlElement(name = "TXNR")
    protected SeqFF70ATXNRType txnr;
    @XmlElement(name = "REGI")
    protected SeqFF70AREGIType regi;
    @XmlElement(name = "INCO")
    protected SeqFF70AINCOType inco;
    @XmlElement(name = "COMP")
    protected SeqFF70ACOMPType comp;
    @XmlElement(name = "PACO")
    protected SeqFF70APACOType paco;
    @XmlElement(name = "TAXE")
    protected SeqFF70ATAXEType taxe;
    @XmlElement(name = "DISC")
    protected SeqFF70ADISCType disc;
    @XmlElement(name = "BAIN")
    protected SeqFF70ABAINType bain;
    @XmlElement(name = "CETI")
    protected SeqFF70ACETIType ceti;

    /**
     * 获取adtx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70AADTXType }
     *     
     */
    public SeqFF70AADTXType getADTX() {
        return adtx;
    }

    /**
     * 设置adtx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70AADTXType }
     *     
     */
    public void setADTX(SeqFF70AADTXType value) {
        this.adtx = value;
    }

    /**
     * 获取txnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ATXNRType }
     *     
     */
    public SeqFF70ATXNRType getTXNR() {
        return txnr;
    }

    /**
     * 设置txnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ATXNRType }
     *     
     */
    public void setTXNR(SeqFF70ATXNRType value) {
        this.txnr = value;
    }

    /**
     * 获取regi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70AREGIType }
     *     
     */
    public SeqFF70AREGIType getREGI() {
        return regi;
    }

    /**
     * 设置regi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70AREGIType }
     *     
     */
    public void setREGI(SeqFF70AREGIType value) {
        this.regi = value;
    }

    /**
     * 获取inco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70AINCOType }
     *     
     */
    public SeqFF70AINCOType getINCO() {
        return inco;
    }

    /**
     * 设置inco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70AINCOType }
     *     
     */
    public void setINCO(SeqFF70AINCOType value) {
        this.inco = value;
    }

    /**
     * 获取comp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ACOMPType }
     *     
     */
    public SeqFF70ACOMPType getCOMP() {
        return comp;
    }

    /**
     * 设置comp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ACOMPType }
     *     
     */
    public void setCOMP(SeqFF70ACOMPType value) {
        this.comp = value;
    }

    /**
     * 获取paco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70APACOType }
     *     
     */
    public SeqFF70APACOType getPACO() {
        return paco;
    }

    /**
     * 设置paco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70APACOType }
     *     
     */
    public void setPACO(SeqFF70APACOType value) {
        this.paco = value;
    }

    /**
     * 获取taxe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ATAXEType }
     *     
     */
    public SeqFF70ATAXEType getTAXE() {
        return taxe;
    }

    /**
     * 设置taxe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ATAXEType }
     *     
     */
    public void setTAXE(SeqFF70ATAXEType value) {
        this.taxe = value;
    }

    /**
     * 获取disc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ADISCType }
     *     
     */
    public SeqFF70ADISCType getDISC() {
        return disc;
    }

    /**
     * 设置disc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ADISCType }
     *     
     */
    public void setDISC(SeqFF70ADISCType value) {
        this.disc = value;
    }

    /**
     * 获取bain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ABAINType }
     *     
     */
    public SeqFF70ABAINType getBAIN() {
        return bain;
    }

    /**
     * 设置bain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ABAINType }
     *     
     */
    public void setBAIN(SeqFF70ABAINType value) {
        this.bain = value;
    }

    /**
     * 获取ceti属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ACETIType }
     *     
     */
    public SeqFF70ACETIType getCETI() {
        return ceti;
    }

    /**
     * 设置ceti属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ACETIType }
     *     
     */
    public void setCETI(SeqFF70ACETIType value) {
        this.ceti = value;
    }

}
