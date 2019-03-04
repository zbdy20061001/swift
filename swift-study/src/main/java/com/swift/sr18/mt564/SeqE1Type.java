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
 * <p>SeqE1_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqE1_F16a_1_Type"/>
 *         &lt;element name="F22a_1" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_1_Type" maxOccurs="unbounded"/>
 *         &lt;element name="F35a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F35a_Type"/>
 *         &lt;element name="SeqE1a" type="{urn:swift:xsd:fin.564.2018}SeqE1a_Type" minOccurs="0"/>
 *         &lt;element name="F36a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F36a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F94a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F22a_2" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_2_Type" minOccurs="0"/>
 *         &lt;element name="F11a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F11a_Type" minOccurs="0"/>
 *         &lt;element name="F69a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F69a_Type" minOccurs="0"/>
 *         &lt;element name="F90a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_Type" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="F92a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_Type" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_Type" maxOccurs="6"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqE1_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_Type", propOrder = {
    "f16A1",
    "f22A1",
    "f35A",
    "seqE1A",
    "f36A",
    "f94A",
    "f22A2",
    "f11A",
    "f69A",
    "f90A",
    "f92A",
    "f98A",
    "f16A2"
})
public class SeqE1Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqE1F16A1Type f16A1;
    @XmlElement(name = "F22a_1", required = true)
    protected List<SeqE1F22A1Type> f22A1;
    @XmlElement(name = "F35a", required = true)
    protected SeqE1F35AType f35A;
    @XmlElement(name = "SeqE1a")
    protected SeqE1AType seqE1A;
    @XmlElement(name = "F36a")
    protected List<SeqE1F36AType> f36A;
    @XmlElement(name = "F94a")
    protected List<SeqE1F94AType> f94A;
    @XmlElement(name = "F22a_2")
    protected SeqE1F22A2Type f22A2;
    @XmlElement(name = "F11a")
    protected SeqE1F11AType f11A;
    @XmlElement(name = "F69a")
    protected SeqE1F69AType f69A;
    @XmlElement(name = "F90a")
    protected List<SeqE1F90AType> f90A;
    @XmlElement(name = "F92a")
    protected List<SeqE1F92AType> f92A;
    @XmlElement(name = "F98a", required = true)
    protected List<SeqE1F98AType> f98A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqE1F16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F16A1Type }
     *     
     */
    public SeqE1F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F16A1Type }
     *     
     */
    public void setF16A1(SeqE1F16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * Gets the value of the f22A1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f22A1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF22A1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE1F22A1Type }
     * 
     * 
     */
    public List<SeqE1F22A1Type> getF22A1() {
        if (f22A1 == null) {
            f22A1 = new ArrayList<SeqE1F22A1Type>();
        }
        return this.f22A1;
    }

    /**
     * 获取f35A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F35AType }
     *     
     */
    public SeqE1F35AType getF35A() {
        return f35A;
    }

    /**
     * 设置f35A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F35AType }
     *     
     */
    public void setF35A(SeqE1F35AType value) {
        this.f35A = value;
    }

    /**
     * 获取seqE1A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AType }
     *     
     */
    public SeqE1AType getSeqE1A() {
        return seqE1A;
    }

    /**
     * 设置seqE1A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AType }
     *     
     */
    public void setSeqE1A(SeqE1AType value) {
        this.seqE1A = value;
    }

    /**
     * Gets the value of the f36A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f36A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF36A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE1F36AType }
     * 
     * 
     */
    public List<SeqE1F36AType> getF36A() {
        if (f36A == null) {
            f36A = new ArrayList<SeqE1F36AType>();
        }
        return this.f36A;
    }

    /**
     * Gets the value of the f94A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f94A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF94A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE1F94AType }
     * 
     * 
     */
    public List<SeqE1F94AType> getF94A() {
        if (f94A == null) {
            f94A = new ArrayList<SeqE1F94AType>();
        }
        return this.f94A;
    }

    /**
     * 获取f22A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A2Type }
     *     
     */
    public SeqE1F22A2Type getF22A2() {
        return f22A2;
    }

    /**
     * 设置f22A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A2Type }
     *     
     */
    public void setF22A2(SeqE1F22A2Type value) {
        this.f22A2 = value;
    }

    /**
     * 获取f11A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F11AType }
     *     
     */
    public SeqE1F11AType getF11A() {
        return f11A;
    }

    /**
     * 设置f11A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F11AType }
     *     
     */
    public void setF11A(SeqE1F11AType value) {
        this.f11A = value;
    }

    /**
     * 获取f69A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F69AType }
     *     
     */
    public SeqE1F69AType getF69A() {
        return f69A;
    }

    /**
     * 设置f69A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F69AType }
     *     
     */
    public void setF69A(SeqE1F69AType value) {
        this.f69A = value;
    }

    /**
     * Gets the value of the f90A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f90A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF90A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE1F90AType }
     * 
     * 
     */
    public List<SeqE1F90AType> getF90A() {
        if (f90A == null) {
            f90A = new ArrayList<SeqE1F90AType>();
        }
        return this.f90A;
    }

    /**
     * Gets the value of the f92A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f92A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF92A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE1F92AType }
     * 
     * 
     */
    public List<SeqE1F92AType> getF92A() {
        if (f92A == null) {
            f92A = new ArrayList<SeqE1F92AType>();
        }
        return this.f92A;
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
     * {@link SeqE1F98AType }
     * 
     * 
     */
    public List<SeqE1F98AType> getF98A() {
        if (f98A == null) {
            f98A = new ArrayList<SeqE1F98AType>();
        }
        return this.f98A;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F16A2Type }
     *     
     */
    public SeqE1F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F16A2Type }
     *     
     */
    public void setF16A2(SeqE1F16A2Type value) {
        this.f16A2 = value;
    }

}
