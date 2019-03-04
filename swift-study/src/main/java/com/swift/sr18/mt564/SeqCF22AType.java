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
 * <p>SeqC_F22a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqC_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DISF" type="{urn:swift:xsd:fin.564.2018}SeqC_F22a_DISF_Type"/>
 *         &lt;element name="SELL" type="{urn:swift:xsd:fin.564.2018}SeqC_F22a_SELL_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F22a_Type", propOrder = {
    "disf",
    "sell"
})
public class SeqCF22AType
    extends ISO15022Field
{

    @XmlElement(name = "DISF")
    protected SeqCF22ADISFType disf;
    @XmlElement(name = "SELL")
    protected SeqCF22ASELLType sell;

    /**
     * 获取disf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF22ADISFType }
     *     
     */
    public SeqCF22ADISFType getDISF() {
        return disf;
    }

    /**
     * 设置disf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF22ADISFType }
     *     
     */
    public void setDISF(SeqCF22ADISFType value) {
        this.disf = value;
    }

    /**
     * 获取sell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF22ASELLType }
     *     
     */
    public SeqCF22ASELLType getSELL() {
        return sell;
    }

    /**
     * 设置sell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF22ASELLType }
     *     
     */
    public void setSELL(SeqCF22ASELLType value) {
        this.sell = value;
    }

}
