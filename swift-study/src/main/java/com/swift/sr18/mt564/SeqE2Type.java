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
 * <p>SeqE2_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqE2_F16a_1_Type"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_Type" maxOccurs="unbounded"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F94a_Type" minOccurs="0"/>
 *         &lt;element name="F97a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F97a_Type" minOccurs="0"/>
 *         &lt;element name="F19a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_Type" maxOccurs="46" minOccurs="0"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F98a_Type" maxOccurs="4"/>
 *         &lt;element name="F92a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F90a" type="{urn:swift:xsd:fin.564.2018}SeqE2_F90a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqE2_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_Type", propOrder = {
    "f16A1",
    "f22A",
    "f94A",
    "f97A",
    "f19A",
    "f98A",
    "f92A",
    "f90A",
    "f16A2"
})
public class SeqE2Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqE2F16A1Type f16A1;
    @XmlElement(name = "F22a", required = true)
    protected List<SeqE2F22AType> f22A;
    @XmlElement(name = "F94a")
    protected SeqE2F94AType f94A;
    @XmlElement(name = "F97a")
    protected SeqE2F97AType f97A;
    @XmlElement(name = "F19a")
    protected List<SeqE2F19AType> f19A;
    @XmlElement(name = "F98a", required = true)
    protected List<SeqE2F98AType> f98A;
    @XmlElement(name = "F92a")
    protected List<SeqE2F92AType> f92A;
    @XmlElement(name = "F90a")
    protected List<SeqE2F90AType> f90A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqE2F16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F16A1Type }
     *     
     */
    public SeqE2F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F16A1Type }
     *     
     */
    public void setF16A1(SeqE2F16A1Type value) {
        this.f16A1 = value;
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
     * {@link SeqE2F22AType }
     * 
     * 
     */
    public List<SeqE2F22AType> getF22A() {
        if (f22A == null) {
            f22A = new ArrayList<SeqE2F22AType>();
        }
        return this.f22A;
    }

    /**
     * 获取f94A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F94AType }
     *     
     */
    public SeqE2F94AType getF94A() {
        return f94A;
    }

    /**
     * 设置f94A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F94AType }
     *     
     */
    public void setF94A(SeqE2F94AType value) {
        this.f94A = value;
    }

    /**
     * 获取f97A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F97AType }
     *     
     */
    public SeqE2F97AType getF97A() {
        return f97A;
    }

    /**
     * 设置f97A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F97AType }
     *     
     */
    public void setF97A(SeqE2F97AType value) {
        this.f97A = value;
    }

    /**
     * Gets the value of the f19A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f19A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF19A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE2F19AType }
     * 
     * 
     */
    public List<SeqE2F19AType> getF19A() {
        if (f19A == null) {
            f19A = new ArrayList<SeqE2F19AType>();
        }
        return this.f19A;
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
     * {@link SeqE2F98AType }
     * 
     * 
     */
    public List<SeqE2F98AType> getF98A() {
        if (f98A == null) {
            f98A = new ArrayList<SeqE2F98AType>();
        }
        return this.f98A;
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
     * {@link SeqE2F92AType }
     * 
     * 
     */
    public List<SeqE2F92AType> getF92A() {
        if (f92A == null) {
            f92A = new ArrayList<SeqE2F92AType>();
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
     * {@link SeqE2F90AType }
     * 
     * 
     */
    public List<SeqE2F90AType> getF90A() {
        if (f90A == null) {
            f90A = new ArrayList<SeqE2F90AType>();
        }
        return this.f90A;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F16A2Type }
     *     
     */
    public SeqE2F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F16A2Type }
     *     
     */
    public void setF16A2(SeqE2F16A2Type value) {
        this.f16A2 = value;
    }

}
