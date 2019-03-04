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
 * <p>SeqE_F69a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F69a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PRIC" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_PRIC_Type"/>
 *         &lt;element name="REVO" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_REVO_Type"/>
 *         &lt;element name="PWAL" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_PWAL_Type"/>
 *         &lt;element name="PARL" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_PARL_Type"/>
 *         &lt;element name="SUSP" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_SUSP_Type"/>
 *         &lt;element name="AREV" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_AREV_Type"/>
 *         &lt;element name="DSWO" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_DSWO_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F69a_Type", propOrder = {
    "pric",
    "revo",
    "pwal",
    "parl",
    "susp",
    "arev",
    "dswo"
})
public class SeqEF69AType
    extends ISO15022Field
{

    @XmlElement(name = "PRIC")
    protected SeqEF69APRICType pric;
    @XmlElement(name = "REVO")
    protected SeqEF69AREVOType revo;
    @XmlElement(name = "PWAL")
    protected SeqEF69APWALType pwal;
    @XmlElement(name = "PARL")
    protected SeqEF69APARLType parl;
    @XmlElement(name = "SUSP")
    protected SeqEF69ASUSPType susp;
    @XmlElement(name = "AREV")
    protected SeqEF69AAREVType arev;
    @XmlElement(name = "DSWO")
    protected SeqEF69ADSWOType dswo;

    /**
     * 获取pric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69APRICType }
     *     
     */
    public SeqEF69APRICType getPRIC() {
        return pric;
    }

    /**
     * 设置pric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69APRICType }
     *     
     */
    public void setPRIC(SeqEF69APRICType value) {
        this.pric = value;
    }

    /**
     * 获取revo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69AREVOType }
     *     
     */
    public SeqEF69AREVOType getREVO() {
        return revo;
    }

    /**
     * 设置revo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69AREVOType }
     *     
     */
    public void setREVO(SeqEF69AREVOType value) {
        this.revo = value;
    }

    /**
     * 获取pwal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69APWALType }
     *     
     */
    public SeqEF69APWALType getPWAL() {
        return pwal;
    }

    /**
     * 设置pwal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69APWALType }
     *     
     */
    public void setPWAL(SeqEF69APWALType value) {
        this.pwal = value;
    }

    /**
     * 获取parl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69APARLType }
     *     
     */
    public SeqEF69APARLType getPARL() {
        return parl;
    }

    /**
     * 设置parl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69APARLType }
     *     
     */
    public void setPARL(SeqEF69APARLType value) {
        this.parl = value;
    }

    /**
     * 获取susp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69ASUSPType }
     *     
     */
    public SeqEF69ASUSPType getSUSP() {
        return susp;
    }

    /**
     * 设置susp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69ASUSPType }
     *     
     */
    public void setSUSP(SeqEF69ASUSPType value) {
        this.susp = value;
    }

    /**
     * 获取arev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69AAREVType }
     *     
     */
    public SeqEF69AAREVType getAREV() {
        return arev;
    }

    /**
     * 设置arev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69AAREVType }
     *     
     */
    public void setAREV(SeqEF69AAREVType value) {
        this.arev = value;
    }

    /**
     * 获取dswo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69ADSWOType }
     *     
     */
    public SeqEF69ADSWOType getDSWO() {
        return dswo;
    }

    /**
     * 设置dswo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69ADSWOType }
     *     
     */
    public void setDSWO(SeqEF69ADSWOType value) {
        this.dswo = value;
    }

}
