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
 * <p>SeqA1_F20a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA1_F20a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CORP" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_CORP_Type"/>
 *         &lt;element name="PREV" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_PREV_Type"/>
 *         &lt;element name="RELA" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_RELA_Type"/>
 *         &lt;element name="CACN" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_CACN_Type"/>
 *         &lt;element name="COAF" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_COAF_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_F20a_Type", propOrder = {
    "corp",
    "prev",
    "rela",
    "cacn",
    "coaf"
})
public class SeqA1F20AType
    extends ISO15022Field
{

    @XmlElement(name = "CORP")
    protected SeqA1F20ACORPType corp;
    @XmlElement(name = "PREV")
    protected SeqA1F20APREVType prev;
    @XmlElement(name = "RELA")
    protected SeqA1F20ARELAType rela;
    @XmlElement(name = "CACN")
    protected SeqA1F20ACACNType cacn;
    @XmlElement(name = "COAF")
    protected SeqA1F20ACOAFType coaf;

    /**
     * 获取corp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20ACORPType }
     *     
     */
    public SeqA1F20ACORPType getCORP() {
        return corp;
    }

    /**
     * 设置corp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20ACORPType }
     *     
     */
    public void setCORP(SeqA1F20ACORPType value) {
        this.corp = value;
    }

    /**
     * 获取prev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20APREVType }
     *     
     */
    public SeqA1F20APREVType getPREV() {
        return prev;
    }

    /**
     * 设置prev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20APREVType }
     *     
     */
    public void setPREV(SeqA1F20APREVType value) {
        this.prev = value;
    }

    /**
     * 获取rela属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20ARELAType }
     *     
     */
    public SeqA1F20ARELAType getRELA() {
        return rela;
    }

    /**
     * 设置rela属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20ARELAType }
     *     
     */
    public void setRELA(SeqA1F20ARELAType value) {
        this.rela = value;
    }

    /**
     * 获取cacn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20ACACNType }
     *     
     */
    public SeqA1F20ACACNType getCACN() {
        return cacn;
    }

    /**
     * 设置cacn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20ACACNType }
     *     
     */
    public void setCACN(SeqA1F20ACACNType value) {
        this.cacn = value;
    }

    /**
     * 获取coaf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20ACOAFType }
     *     
     */
    public SeqA1F20ACOAFType getCOAF() {
        return coaf;
    }

    /**
     * 设置coaf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20ACOAFType }
     *     
     */
    public void setCOAF(SeqA1F20ACOAFType value) {
        this.coaf = value;
    }

}
