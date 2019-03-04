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
 * <p>SeqD_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqD_F16a_1_Type"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_Type" maxOccurs="37" minOccurs="0"/>
 *         &lt;element name="F69a" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_Type" maxOccurs="16" minOccurs="0"/>
 *         &lt;element name="F99a" type="{urn:swift:xsd:fin.564.2018}SeqD_F99a_Type" minOccurs="0"/>
 *         &lt;element name="F92a" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_Type" maxOccurs="11" minOccurs="0"/>
 *         &lt;element name="F90a" type="{urn:swift:xsd:fin.564.2018}SeqD_F90a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F36a" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_Type" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="F13a" type="{urn:swift:xsd:fin.564.2018}SeqD_F13a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F17a" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_Type" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_Type" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="F70a" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqD_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_Type", propOrder = {
    "f16A1",
    "f98A",
    "f69A",
    "f99A",
    "f92A",
    "f90A",
    "f36A",
    "f13A",
    "f17A",
    "f22A",
    "f94A",
    "f70A",
    "f16A2"
})
public class SeqDType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqDF16A1Type f16A1;
    @XmlElement(name = "F98a")
    protected List<SeqDF98AType> f98A;
    @XmlElement(name = "F69a")
    protected List<SeqDF69AType> f69A;
    @XmlElement(name = "F99a")
    protected SeqDF99AType f99A;
    @XmlElement(name = "F92a")
    protected List<SeqDF92AType> f92A;
    @XmlElement(name = "F90a")
    protected List<SeqDF90AType> f90A;
    @XmlElement(name = "F36a")
    protected List<SeqDF36AType> f36A;
    @XmlElement(name = "F13a")
    protected List<SeqDF13AType> f13A;
    @XmlElement(name = "F17a")
    protected List<SeqDF17AType> f17A;
    @XmlElement(name = "F22a")
    protected List<SeqDF22AType> f22A;
    @XmlElement(name = "F94a")
    protected List<SeqDF94AType> f94A;
    @XmlElement(name = "F70a")
    protected List<SeqDF70AType> f70A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqDF16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF16A1Type }
     *     
     */
    public SeqDF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF16A1Type }
     *     
     */
    public void setF16A1(SeqDF16A1Type value) {
        this.f16A1 = value;
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
     * {@link SeqDF98AType }
     * 
     * 
     */
    public List<SeqDF98AType> getF98A() {
        if (f98A == null) {
            f98A = new ArrayList<SeqDF98AType>();
        }
        return this.f98A;
    }

    /**
     * Gets the value of the f69A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f69A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF69A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqDF69AType }
     * 
     * 
     */
    public List<SeqDF69AType> getF69A() {
        if (f69A == null) {
            f69A = new ArrayList<SeqDF69AType>();
        }
        return this.f69A;
    }

    /**
     * 获取f99A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF99AType }
     *     
     */
    public SeqDF99AType getF99A() {
        return f99A;
    }

    /**
     * 设置f99A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF99AType }
     *     
     */
    public void setF99A(SeqDF99AType value) {
        this.f99A = value;
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
     * {@link SeqDF92AType }
     * 
     * 
     */
    public List<SeqDF92AType> getF92A() {
        if (f92A == null) {
            f92A = new ArrayList<SeqDF92AType>();
        }
        return this.f92A;
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
     * {@link SeqDF90AType }
     * 
     * 
     */
    public List<SeqDF90AType> getF90A() {
        if (f90A == null) {
            f90A = new ArrayList<SeqDF90AType>();
        }
        return this.f90A;
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
     * {@link SeqDF36AType }
     * 
     * 
     */
    public List<SeqDF36AType> getF36A() {
        if (f36A == null) {
            f36A = new ArrayList<SeqDF36AType>();
        }
        return this.f36A;
    }

    /**
     * Gets the value of the f13A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f13A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF13A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqDF13AType }
     * 
     * 
     */
    public List<SeqDF13AType> getF13A() {
        if (f13A == null) {
            f13A = new ArrayList<SeqDF13AType>();
        }
        return this.f13A;
    }

    /**
     * Gets the value of the f17A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f17A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF17A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqDF17AType }
     * 
     * 
     */
    public List<SeqDF17AType> getF17A() {
        if (f17A == null) {
            f17A = new ArrayList<SeqDF17AType>();
        }
        return this.f17A;
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
     * {@link SeqDF22AType }
     * 
     * 
     */
    public List<SeqDF22AType> getF22A() {
        if (f22A == null) {
            f22A = new ArrayList<SeqDF22AType>();
        }
        return this.f22A;
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
     * {@link SeqDF94AType }
     * 
     * 
     */
    public List<SeqDF94AType> getF94A() {
        if (f94A == null) {
            f94A = new ArrayList<SeqDF94AType>();
        }
        return this.f94A;
    }

    /**
     * Gets the value of the f70A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f70A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF70A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqDF70AType }
     * 
     * 
     */
    public List<SeqDF70AType> getF70A() {
        if (f70A == null) {
            f70A = new ArrayList<SeqDF70AType>();
        }
        return this.f70A;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF16A2Type }
     *     
     */
    public SeqDF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF16A2Type }
     *     
     */
    public void setF16A2(SeqDF16A2Type value) {
        this.f16A2 = value;
    }

}
