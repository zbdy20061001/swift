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
 * <p>SeqE1_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ADEX" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_ADEX_Type"/>
 *         &lt;element name="NEWO" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_NEWO_Type"/>
 *         &lt;element name="ADSR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_ADSR_Type"/>
 *         &lt;element name="TRAT" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_TRAT_Type"/>
 *         &lt;element name="CHAR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_CHAR_Type"/>
 *         &lt;element name="FISC" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_FISC_Type"/>
 *         &lt;element name="RATE" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_RATE_Type"/>
 *         &lt;element name="TAXC" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_TAXC_Type"/>
 *         &lt;element name="TRAX" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_TRAX_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F92a_Type", propOrder = {
    "adex",
    "newo",
    "adsr",
    "trat",
    "_char",
    "fisc",
    "rate",
    "taxc",
    "trax"
})
public class SeqE1F92AType
    extends ISO15022Field
{

    @XmlElement(name = "ADEX")
    protected SeqE1F92AADEXType adex;
    @XmlElement(name = "NEWO")
    protected SeqE1F92ANEWOType newo;
    @XmlElement(name = "ADSR")
    protected SeqE1F92AADSRType adsr;
    @XmlElement(name = "TRAT")
    protected SeqE1F92ATRATType trat;
    @XmlElement(name = "CHAR")
    protected SeqE1F92ACHARType _char;
    @XmlElement(name = "FISC")
    protected SeqE1F92AFISCType fisc;
    @XmlElement(name = "RATE")
    protected SeqE1F92ARATEType rate;
    @XmlElement(name = "TAXC")
    protected SeqE1F92ATAXCType taxc;
    @XmlElement(name = "TRAX")
    protected SeqE1F92ATRAXType trax;

    /**
     * 获取adex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92AADEXType }
     *     
     */
    public SeqE1F92AADEXType getADEX() {
        return adex;
    }

    /**
     * 设置adex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92AADEXType }
     *     
     */
    public void setADEX(SeqE1F92AADEXType value) {
        this.adex = value;
    }

    /**
     * 获取newo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ANEWOType }
     *     
     */
    public SeqE1F92ANEWOType getNEWO() {
        return newo;
    }

    /**
     * 设置newo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ANEWOType }
     *     
     */
    public void setNEWO(SeqE1F92ANEWOType value) {
        this.newo = value;
    }

    /**
     * 获取adsr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92AADSRType }
     *     
     */
    public SeqE1F92AADSRType getADSR() {
        return adsr;
    }

    /**
     * 设置adsr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92AADSRType }
     *     
     */
    public void setADSR(SeqE1F92AADSRType value) {
        this.adsr = value;
    }

    /**
     * 获取trat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ATRATType }
     *     
     */
    public SeqE1F92ATRATType getTRAT() {
        return trat;
    }

    /**
     * 设置trat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ATRATType }
     *     
     */
    public void setTRAT(SeqE1F92ATRATType value) {
        this.trat = value;
    }

    /**
     * 获取char属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ACHARType }
     *     
     */
    public SeqE1F92ACHARType getCHAR() {
        return _char;
    }

    /**
     * 设置char属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ACHARType }
     *     
     */
    public void setCHAR(SeqE1F92ACHARType value) {
        this._char = value;
    }

    /**
     * 获取fisc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92AFISCType }
     *     
     */
    public SeqE1F92AFISCType getFISC() {
        return fisc;
    }

    /**
     * 设置fisc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92AFISCType }
     *     
     */
    public void setFISC(SeqE1F92AFISCType value) {
        this.fisc = value;
    }

    /**
     * 获取rate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ARATEType }
     *     
     */
    public SeqE1F92ARATEType getRATE() {
        return rate;
    }

    /**
     * 设置rate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ARATEType }
     *     
     */
    public void setRATE(SeqE1F92ARATEType value) {
        this.rate = value;
    }

    /**
     * 获取taxc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ATAXCType }
     *     
     */
    public SeqE1F92ATAXCType getTAXC() {
        return taxc;
    }

    /**
     * 设置taxc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ATAXCType }
     *     
     */
    public void setTAXC(SeqE1F92ATAXCType value) {
        this.taxc = value;
    }

    /**
     * 获取trax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ATRAXType }
     *     
     */
    public SeqE1F92ATRAXType getTRAX() {
        return trax;
    }

    /**
     * 设置trax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ATRAXType }
     *     
     */
    public void setTRAX(SeqE1F92ATRAXType value) {
        this.trax = value;
    }

}
