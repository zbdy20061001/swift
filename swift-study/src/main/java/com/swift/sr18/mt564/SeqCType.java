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
 * <p>SeqC_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqC_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqC_F16a_1_Type"/>
 *         &lt;element name="F35a" type="{urn:swift:xsd:fin.564.2018}SeqC_F35a_Type"/>
 *         &lt;element name="F36a" type="{urn:swift:xsd:fin.564.2018}SeqC_F36a_Type" minOccurs="0"/>
 *         &lt;element name="F93a" type="{urn:swift:xsd:fin.564.2018}SeqC_F93a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqC_F22a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F92a" type="{urn:swift:xsd:fin.564.2018}SeqC_F92a_Type" minOccurs="0"/>
 *         &lt;element name="F90a" type="{urn:swift:xsd:fin.564.2018}SeqC_F90a_Type" minOccurs="0"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqC_F98a_Type" maxOccurs="2" minOccurs="2"/>
 *         &lt;element name="F69a" type="{urn:swift:xsd:fin.564.2018}SeqC_F69a_Type" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqC_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_Type", propOrder = {
    "f16A1",
    "f35A",
    "f36A",
    "f93A",
    "f22A",
    "f92A",
    "f90A",
    "f98A",
    "f69A",
    "f16A2"
})
public class SeqCType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqCF16A1Type f16A1;
    @XmlElement(name = "F35a", required = true)
    protected SeqCF35AType f35A;
    @XmlElement(name = "F36a")
    protected SeqCF36AType f36A;
    @XmlElement(name = "F93a")
    protected List<SeqCF93AType> f93A;
    @XmlElement(name = "F22a")
    protected List<SeqCF22AType> f22A;
    @XmlElement(name = "F92a")
    protected SeqCF92AType f92A;
    @XmlElement(name = "F90a")
    protected SeqCF90AType f90A;
    @XmlElement(name = "F98a", required = true)
    protected List<SeqCF98AType> f98A;
    @XmlElement(name = "F69a")
    protected SeqCF69AType f69A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqCF16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF16A1Type }
     *     
     */
    public SeqCF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF16A1Type }
     *     
     */
    public void setF16A1(SeqCF16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * 获取f35A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF35AType }
     *     
     */
    public SeqCF35AType getF35A() {
        return f35A;
    }

    /**
     * 设置f35A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF35AType }
     *     
     */
    public void setF35A(SeqCF35AType value) {
        this.f35A = value;
    }

    /**
     * 获取f36A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF36AType }
     *     
     */
    public SeqCF36AType getF36A() {
        return f36A;
    }

    /**
     * 设置f36A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF36AType }
     *     
     */
    public void setF36A(SeqCF36AType value) {
        this.f36A = value;
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
     * {@link SeqCF93AType }
     * 
     * 
     */
    public List<SeqCF93AType> getF93A() {
        if (f93A == null) {
            f93A = new ArrayList<SeqCF93AType>();
        }
        return this.f93A;
    }

    /**
     * Gets the value of the f22A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f22A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF22A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqCF22AType }
     * 
     * 
     */
    public List<SeqCF22AType> getF22A() {
        if (f22A == null) {
            f22A = new ArrayList<SeqCF22AType>();
        }
        return this.f22A;
    }

    /**
     * 获取f92A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF92AType }
     *     
     */
    public SeqCF92AType getF92A() {
        return f92A;
    }

    /**
     * 设置f92A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF92AType }
     *     
     */
    public void setF92A(SeqCF92AType value) {
        this.f92A = value;
    }

    /**
     * 获取f90A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF90AType }
     *     
     */
    public SeqCF90AType getF90A() {
        return f90A;
    }

    /**
     * 设置f90A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF90AType }
     *     
     */
    public void setF90A(SeqCF90AType value) {
        this.f90A = value;
    }

    /**
     * Gets the value of the f98A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f98A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF98A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqCF98AType }
     * 
     * 
     */
    public List<SeqCF98AType> getF98A() {
        if (f98A == null) {
            f98A = new ArrayList<SeqCF98AType>();
        }
        return this.f98A;
    }

    /**
     * 获取f69A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF69AType }
     *     
     */
    public SeqCF69AType getF69A() {
        return f69A;
    }

    /**
     * 设置f69A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF69AType }
     *     
     */
    public void setF69A(SeqCF69AType value) {
        this.f69A = value;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF16A2Type }
     *     
     */
    public SeqCF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF16A2Type }
     *     
     */
    public void setF16A2(SeqCF16A2Type value) {
        this.f16A2 = value;
    }

}
