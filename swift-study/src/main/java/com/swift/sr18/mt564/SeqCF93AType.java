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
 * <p>SeqC_F93a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqC_F93a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="UNBA" type="{urn:swift:xsd:fin.564.2018}SeqC_F93a_UNBA_Type"/>
 *         &lt;element name="INBA" type="{urn:swift:xsd:fin.564.2018}SeqC_F93a_INBA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F93a_Type", propOrder = {
    "unba",
    "inba"
})
public class SeqCF93AType
    extends ISO15022Field
{

    @XmlElement(name = "UNBA")
    protected SeqCF93AUNBAType unba;
    @XmlElement(name = "INBA")
    protected SeqCF93AINBAType inba;

    /**
     * 获取unba属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF93AUNBAType }
     *     
     */
    public SeqCF93AUNBAType getUNBA() {
        return unba;
    }

    /**
     * 设置unba属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF93AUNBAType }
     *     
     */
    public void setUNBA(SeqCF93AUNBAType value) {
        this.unba = value;
    }

    /**
     * 获取inba属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF93AINBAType }
     *     
     */
    public SeqCF93AINBAType getINBA() {
        return inba;
    }

    /**
     * 设置inba属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF93AINBAType }
     *     
     */
    public void setINBA(SeqCF93AINBAType value) {
        this.inba = value;
    }

}
