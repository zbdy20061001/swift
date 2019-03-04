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
 * <p>SeqE_F70a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F70a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ADTX" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_ADTX_Type"/>
 *         &lt;element name="TXNR" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_TXNR_Type"/>
 *         &lt;element name="INCO" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_INCO_Type"/>
 *         &lt;element name="COMP" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_COMP_Type"/>
 *         &lt;element name="NSER" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_NSER_Type"/>
 *         &lt;element name="TAXE" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_TAXE_Type"/>
 *         &lt;element name="DISC" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_DISC_Type"/>
 *         &lt;element name="CETI" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_CETI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F70a_Type", propOrder = {
    "adtx",
    "txnr",
    "inco",
    "comp",
    "nser",
    "taxe",
    "disc",
    "ceti"
})
public class SeqEF70AType
    extends ISO15022Field
{

    @XmlElement(name = "ADTX")
    protected SeqEF70AADTXType adtx;
    @XmlElement(name = "TXNR")
    protected SeqEF70ATXNRType txnr;
    @XmlElement(name = "INCO")
    protected SeqEF70AINCOType inco;
    @XmlElement(name = "COMP")
    protected SeqEF70ACOMPType comp;
    @XmlElement(name = "NSER")
    protected SeqEF70ANSERType nser;
    @XmlElement(name = "TAXE")
    protected SeqEF70ATAXEType taxe;
    @XmlElement(name = "DISC")
    protected SeqEF70ADISCType disc;
    @XmlElement(name = "CETI")
    protected SeqEF70ACETIType ceti;

    /**
     * 获取adtx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70AADTXType }
     *     
     */
    public SeqEF70AADTXType getADTX() {
        return adtx;
    }

    /**
     * 设置adtx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70AADTXType }
     *     
     */
    public void setADTX(SeqEF70AADTXType value) {
        this.adtx = value;
    }

    /**
     * 获取txnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ATXNRType }
     *     
     */
    public SeqEF70ATXNRType getTXNR() {
        return txnr;
    }

    /**
     * 设置txnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ATXNRType }
     *     
     */
    public void setTXNR(SeqEF70ATXNRType value) {
        this.txnr = value;
    }

    /**
     * 获取inco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70AINCOType }
     *     
     */
    public SeqEF70AINCOType getINCO() {
        return inco;
    }

    /**
     * 设置inco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70AINCOType }
     *     
     */
    public void setINCO(SeqEF70AINCOType value) {
        this.inco = value;
    }

    /**
     * 获取comp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ACOMPType }
     *     
     */
    public SeqEF70ACOMPType getCOMP() {
        return comp;
    }

    /**
     * 设置comp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ACOMPType }
     *     
     */
    public void setCOMP(SeqEF70ACOMPType value) {
        this.comp = value;
    }

    /**
     * 获取nser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ANSERType }
     *     
     */
    public SeqEF70ANSERType getNSER() {
        return nser;
    }

    /**
     * 设置nser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ANSERType }
     *     
     */
    public void setNSER(SeqEF70ANSERType value) {
        this.nser = value;
    }

    /**
     * 获取taxe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ATAXEType }
     *     
     */
    public SeqEF70ATAXEType getTAXE() {
        return taxe;
    }

    /**
     * 设置taxe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ATAXEType }
     *     
     */
    public void setTAXE(SeqEF70ATAXEType value) {
        this.taxe = value;
    }

    /**
     * 获取disc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ADISCType }
     *     
     */
    public SeqEF70ADISCType getDISC() {
        return disc;
    }

    /**
     * 设置disc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ADISCType }
     *     
     */
    public void setDISC(SeqEF70ADISCType value) {
        this.disc = value;
    }

    /**
     * 获取ceti属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ACETIType }
     *     
     */
    public SeqEF70ACETIType getCETI() {
        return ceti;
    }

    /**
     * 设置ceti属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ACETIType }
     *     
     */
    public void setCETI(SeqEF70ACETIType value) {
        this.ceti = value;
    }

}
