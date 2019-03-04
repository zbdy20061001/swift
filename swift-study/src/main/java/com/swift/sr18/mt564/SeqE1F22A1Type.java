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
 * <p>SeqE1_F22a_1_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F22a_1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CRDB" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_CRDB_Type"/>
 *         &lt;element name="TEMP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_TEMP_Type"/>
 *         &lt;element name="NELP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_NELP_Type"/>
 *         &lt;element name="TXAP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_TXAP_Type"/>
 *         &lt;element name="NSIS" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_NSIS_Type"/>
 *         &lt;element name="ITYP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_ITYP_Type"/>
 *         &lt;element name="ETYP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_ETYP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F22a_1_Type", propOrder = {
    "crdb",
    "temp",
    "nelp",
    "txap",
    "nsis",
    "ityp",
    "etyp"
})
public class SeqE1F22A1Type
    extends ISO15022Field
{

    @XmlElement(name = "CRDB")
    protected SeqE1F22A1CRDBType crdb;
    @XmlElement(name = "TEMP")
    protected SeqE1F22A1TEMPType temp;
    @XmlElement(name = "NELP")
    protected SeqE1F22A1NELPType nelp;
    @XmlElement(name = "TXAP")
    protected SeqE1F22A1TXAPType txap;
    @XmlElement(name = "NSIS")
    protected SeqE1F22A1NSISType nsis;
    @XmlElement(name = "ITYP")
    protected SeqE1F22A1ITYPType ityp;
    @XmlElement(name = "ETYP")
    protected SeqE1F22A1ETYPType etyp;

    /**
     * 获取crdb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1CRDBType }
     *     
     */
    public SeqE1F22A1CRDBType getCRDB() {
        return crdb;
    }

    /**
     * 设置crdb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1CRDBType }
     *     
     */
    public void setCRDB(SeqE1F22A1CRDBType value) {
        this.crdb = value;
    }

    /**
     * 获取temp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1TEMPType }
     *     
     */
    public SeqE1F22A1TEMPType getTEMP() {
        return temp;
    }

    /**
     * 设置temp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1TEMPType }
     *     
     */
    public void setTEMP(SeqE1F22A1TEMPType value) {
        this.temp = value;
    }

    /**
     * 获取nelp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1NELPType }
     *     
     */
    public SeqE1F22A1NELPType getNELP() {
        return nelp;
    }

    /**
     * 设置nelp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1NELPType }
     *     
     */
    public void setNELP(SeqE1F22A1NELPType value) {
        this.nelp = value;
    }

    /**
     * 获取txap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1TXAPType }
     *     
     */
    public SeqE1F22A1TXAPType getTXAP() {
        return txap;
    }

    /**
     * 设置txap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1TXAPType }
     *     
     */
    public void setTXAP(SeqE1F22A1TXAPType value) {
        this.txap = value;
    }

    /**
     * 获取nsis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1NSISType }
     *     
     */
    public SeqE1F22A1NSISType getNSIS() {
        return nsis;
    }

    /**
     * 设置nsis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1NSISType }
     *     
     */
    public void setNSIS(SeqE1F22A1NSISType value) {
        this.nsis = value;
    }

    /**
     * 获取ityp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1ITYPType }
     *     
     */
    public SeqE1F22A1ITYPType getITYP() {
        return ityp;
    }

    /**
     * 设置ityp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1ITYPType }
     *     
     */
    public void setITYP(SeqE1F22A1ITYPType value) {
        this.ityp = value;
    }

    /**
     * 获取etyp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A1ETYPType }
     *     
     */
    public SeqE1F22A1ETYPType getETYP() {
        return etyp;
    }

    /**
     * 设置etyp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A1ETYPType }
     *     
     */
    public void setETYP(SeqE1F22A1ETYPType value) {
        this.etyp = value;
    }

}
