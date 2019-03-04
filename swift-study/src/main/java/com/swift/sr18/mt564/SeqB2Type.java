//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.05 时间 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqB2_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqB2_F16a_1_Type"/>
 *         &lt;element name="F95a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F95a_Type" minOccurs="0"/>
 *         &lt;element name="F97a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F97a_Type"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F94a_Type" minOccurs="0"/>
 *         &lt;element name="F93a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqB2_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_Type", propOrder = {
    "f16A1",
    "f95A",
    "f97A",
    "f94A",
    "f93A",
    "f16A2"
})
public class SeqB2Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqB2F16A1Type f16A1;
    @XmlElement(name = "F95a")
    protected SeqB2F95AType f95A;
    @XmlElement(name = "F97a", required = true)
    protected SeqB2F97AType f97A;
    @XmlElement(name = "F94a")
    protected SeqB2F94AType f94A;
    @XmlElement(name = "F93a")
    protected List<SeqB2F93AType> f93A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqB2F16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F16A1Type }
     *     
     */
    public SeqB2F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F16A1Type }
     *     
     */
    public void setF16A1(SeqB2F16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * 获取f95A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F95AType }
     *     
     */
    public SeqB2F95AType getF95A() {
        return f95A;
    }

    /**
     * 设置f95A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F95AType }
     *     
     */
    public void setF95A(SeqB2F95AType value) {
        this.f95A = value;
    }

    /**
     * 获取f97A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F97AType }
     *     
     */
    public SeqB2F97AType getF97A() {
        return f97A;
    }

    /**
     * 设置f97A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F97AType }
     *     
     */
    public void setF97A(SeqB2F97AType value) {
        this.f97A = value;
    }

    /**
     * 获取f94A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F94AType }
     *     
     */
    public SeqB2F94AType getF94A() {
        return f94A;
    }

    /**
     * 设置f94A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F94AType }
     *     
     */
    public void setF94A(SeqB2F94AType value) {
        this.f94A = value;
    }

    /**
     * Gets the value of the f93A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f93A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF93A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB2F93AType }
     * 
     * 
     */
    public List<SeqB2F93AType> getF93A() {
        if (f93A == null) {
            f93A = new ArrayList<SeqB2F93AType>();
        }
        return this.f93A;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F16A2Type }
     *     
     */
    public SeqB2F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F16A2Type }
     *     
     */
    public void setF16A2(SeqB2F16A2Type value) {
        this.f16A2 = value;
    }

}
