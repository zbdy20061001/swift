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
 * <p>SeqA1_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqA1_F16a_1_Type"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqA1_F22a_Type" minOccurs="0"/>
 *         &lt;element name="F13a" type="{urn:swift:xsd:fin.564.2018}SeqA1_F13a_Type" minOccurs="0"/>
 *         &lt;element name="F20a" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_Type"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqA1_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_Type", propOrder = {
    "f16A1",
    "f22A",
    "f13A",
    "f20A",
    "f16A2"
})
public class SeqA1Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqA1F16A1Type f16A1;
    @XmlElement(name = "F22a")
    protected SeqA1F22AType f22A;
    @XmlElement(name = "F13a")
    protected SeqA1F13AType f13A;
    @XmlElement(name = "F20a", required = true)
    protected SeqA1F20AType f20A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqA1F16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F16A1Type }
     *     
     */
    public SeqA1F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F16A1Type }
     *     
     */
    public void setF16A1(SeqA1F16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * 获取f22A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F22AType }
     *     
     */
    public SeqA1F22AType getF22A() {
        return f22A;
    }

    /**
     * 设置f22A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F22AType }
     *     
     */
    public void setF22A(SeqA1F22AType value) {
        this.f22A = value;
    }

    /**
     * 获取f13A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F13AType }
     *     
     */
    public SeqA1F13AType getF13A() {
        return f13A;
    }

    /**
     * 设置f13A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F13AType }
     *     
     */
    public void setF13A(SeqA1F13AType value) {
        this.f13A = value;
    }

    /**
     * 获取f20A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20AType }
     *     
     */
    public SeqA1F20AType getF20A() {
        return f20A;
    }

    /**
     * 设置f20A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20AType }
     *     
     */
    public void setF20A(SeqA1F20AType value) {
        this.f20A = value;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F16A2Type }
     *     
     */
    public SeqA1F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F16A2Type }
     *     
     */
    public void setF16A2(SeqA1F16A2Type value) {
        this.f16A2 = value;
    }

}
