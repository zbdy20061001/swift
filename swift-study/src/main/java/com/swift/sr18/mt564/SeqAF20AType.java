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
 * <p>SeqA_F20a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA_F20a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CORP" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_CORP_Type"/>
 *         &lt;element name="SEME" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_SEME_Type"/>
 *         &lt;element name="COAF" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_COAF_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F20a_Type", propOrder = {
    "corp",
    "seme",
    "coaf"
})
public class SeqAF20AType
    extends ISO15022Field
{

    @XmlElement(name = "CORP")
    protected SeqAF20ACORPType corp;
    @XmlElement(name = "SEME")
    protected SeqAF20ASEMEType seme;
    @XmlElement(name = "COAF")
    protected SeqAF20ACOAFType coaf;

    /**
     * 获取corp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF20ACORPType }
     *     
     */
    public SeqAF20ACORPType getCORP() {
        return corp;
    }

    /**
     * 设置corp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF20ACORPType }
     *     
     */
    public void setCORP(SeqAF20ACORPType value) {
        this.corp = value;
    }

    /**
     * 获取seme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF20ASEMEType }
     *     
     */
    public SeqAF20ASEMEType getSEME() {
        return seme;
    }

    /**
     * 设置seme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF20ASEMEType }
     *     
     */
    public void setSEME(SeqAF20ASEMEType value) {
        this.seme = value;
    }

    /**
     * 获取coaf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF20ACOAFType }
     *     
     */
    public SeqAF20ACOAFType getCOAF() {
        return coaf;
    }

    /**
     * 设置coaf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF20ACOAFType }
     *     
     */
    public void setCOAF(SeqAF20ACOAFType value) {
        this.coaf = value;
    }

}
