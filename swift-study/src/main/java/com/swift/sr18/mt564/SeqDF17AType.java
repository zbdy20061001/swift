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
 * <p>SeqD_F17a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F17a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CERT" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_CERT_Type"/>
 *         &lt;element name="RCHG" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_RCHG_Type"/>
 *         &lt;element name="COMP" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_COMP_Type"/>
 *         &lt;element name="ACIN" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_ACIN_Type"/>
 *         &lt;element name="LEOG" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_LEOG_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F17a_Type", propOrder = {
    "cert",
    "rchg",
    "comp",
    "acin",
    "leog"
})
public class SeqDF17AType
    extends ISO15022Field
{

    @XmlElement(name = "CERT")
    protected SeqDF17ACERTType cert;
    @XmlElement(name = "RCHG")
    protected SeqDF17ARCHGType rchg;
    @XmlElement(name = "COMP")
    protected SeqDF17ACOMPType comp;
    @XmlElement(name = "ACIN")
    protected SeqDF17AACINType acin;
    @XmlElement(name = "LEOG")
    protected SeqDF17ALEOGType leog;

    /**
     * 获取cert属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ACERTType }
     *     
     */
    public SeqDF17ACERTType getCERT() {
        return cert;
    }

    /**
     * 设置cert属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ACERTType }
     *     
     */
    public void setCERT(SeqDF17ACERTType value) {
        this.cert = value;
    }

    /**
     * 获取rchg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ARCHGType }
     *     
     */
    public SeqDF17ARCHGType getRCHG() {
        return rchg;
    }

    /**
     * 设置rchg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ARCHGType }
     *     
     */
    public void setRCHG(SeqDF17ARCHGType value) {
        this.rchg = value;
    }

    /**
     * 获取comp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ACOMPType }
     *     
     */
    public SeqDF17ACOMPType getCOMP() {
        return comp;
    }

    /**
     * 设置comp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ACOMPType }
     *     
     */
    public void setCOMP(SeqDF17ACOMPType value) {
        this.comp = value;
    }

    /**
     * 获取acin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17AACINType }
     *     
     */
    public SeqDF17AACINType getACIN() {
        return acin;
    }

    /**
     * 设置acin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17AACINType }
     *     
     */
    public void setACIN(SeqDF17AACINType value) {
        this.acin = value;
    }

    /**
     * 获取leog属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ALEOGType }
     *     
     */
    public SeqDF17ALEOGType getLEOG() {
        return leog;
    }

    /**
     * 设置leog属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ALEOGType }
     *     
     */
    public void setLEOG(SeqDF17ALEOGType value) {
        this.leog = value;
    }

}
