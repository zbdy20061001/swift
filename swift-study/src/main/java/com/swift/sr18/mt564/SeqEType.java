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
 * <p>SeqE_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqE_F16a_1_Type"/>
 *         &lt;element name="F13a" type="{urn:swift:xsd:fin.564.2018}SeqE_F13a_Type"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_Type" maxOccurs="unbounded"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqE_F94a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F11a" type="{urn:swift:xsd:fin.564.2018}SeqE_F11a_Type" minOccurs="0"/>
 *         &lt;element name="F17a" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_Type" maxOccurs="6"/>
 *         &lt;element name="F35a" type="{urn:swift:xsd:fin.564.2018}SeqE_F35a_Type" minOccurs="0"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F69a" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_Type" maxOccurs="7" minOccurs="0"/>
 *         &lt;element name="F92a" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F90a" type="{urn:swift:xsd:fin.564.2018}SeqE_F90a_Type" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="F36a" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_Type" maxOccurs="7" minOccurs="0"/>
 *         &lt;element name="SeqE1" type="{urn:swift:xsd:fin.564.2018}SeqE1_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeqE2" type="{urn:swift:xsd:fin.564.2018}SeqE2_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F70a" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqE_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_Type", propOrder = {
    "f16A1",
    "f13A",
    "f22A",
    "f94A",
    "f11A",
    "f17A",
    "f35A",
    "f98A",
    "f69A",
    "f92A",
    "f90A",
    "f36A",
    "seqE1",
    "seqE2",
    "f70A",
    "f16A2"
})
public class SeqEType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqEF16A1Type f16A1;
    @XmlElement(name = "F13a", required = true)
    protected SeqEF13AType f13A;
    @XmlElement(name = "F22a", required = true)
    protected List<SeqEF22AType> f22A;
    @XmlElement(name = "F94a")
    protected List<SeqEF94AType> f94A;
    @XmlElement(name = "F11a")
    protected SeqEF11AType f11A;
    @XmlElement(name = "F17a", required = true)
    protected List<SeqEF17AType> f17A;
    @XmlElement(name = "F35a")
    protected SeqEF35AType f35A;
    @XmlElement(name = "F98a")
    protected List<SeqEF98AType> f98A;
    @XmlElement(name = "F69a")
    protected List<SeqEF69AType> f69A;
    @XmlElement(name = "F92a")
    protected List<SeqEF92AType> f92A;
    @XmlElement(name = "F90a")
    protected List<SeqEF90AType> f90A;
    @XmlElement(name = "F36a")
    protected List<SeqEF36AType> f36A;
    @XmlElement(name = "SeqE1")
    protected List<SeqE1Type> seqE1;
    @XmlElement(name = "SeqE2")
    protected List<SeqE2Type> seqE2;
    @XmlElement(name = "F70a")
    protected List<SeqEF70AType> f70A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqEF16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF16A1Type }
     *     
     */
    public SeqEF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF16A1Type }
     *     
     */
    public void setF16A1(SeqEF16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * 获取f13A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF13AType }
     *     
     */
    public SeqEF13AType getF13A() {
        return f13A;
    }

    /**
     * 设置f13A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF13AType }
     *     
     */
    public void setF13A(SeqEF13AType value) {
        this.f13A = value;
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
     * {@link SeqEF22AType }
     * 
     * 
     */
    public List<SeqEF22AType> getF22A() {
        if (f22A == null) {
            f22A = new ArrayList<SeqEF22AType>();
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
     * {@link SeqEF94AType }
     * 
     * 
     */
    public List<SeqEF94AType> getF94A() {
        if (f94A == null) {
            f94A = new ArrayList<SeqEF94AType>();
        }
        return this.f94A;
    }

    /**
     * 获取f11A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF11AType }
     *     
     */
    public SeqEF11AType getF11A() {
        return f11A;
    }

    /**
     * 设置f11A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF11AType }
     *     
     */
    public void setF11A(SeqEF11AType value) {
        this.f11A = value;
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
     * {@link SeqEF17AType }
     * 
     * 
     */
    public List<SeqEF17AType> getF17A() {
        if (f17A == null) {
            f17A = new ArrayList<SeqEF17AType>();
        }
        return this.f17A;
    }

    /**
     * 获取f35A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF35AType }
     *     
     */
    public SeqEF35AType getF35A() {
        return f35A;
    }

    /**
     * 设置f35A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF35AType }
     *     
     */
    public void setF35A(SeqEF35AType value) {
        this.f35A = value;
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
     * {@link SeqEF98AType }
     * 
     * 
     */
    public List<SeqEF98AType> getF98A() {
        if (f98A == null) {
            f98A = new ArrayList<SeqEF98AType>();
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
     * {@link SeqEF69AType }
     * 
     * 
     */
    public List<SeqEF69AType> getF69A() {
        if (f69A == null) {
            f69A = new ArrayList<SeqEF69AType>();
        }
        return this.f69A;
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
     * {@link SeqEF92AType }
     * 
     * 
     */
    public List<SeqEF92AType> getF92A() {
        if (f92A == null) {
            f92A = new ArrayList<SeqEF92AType>();
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
     * {@link SeqEF90AType }
     * 
     * 
     */
    public List<SeqEF90AType> getF90A() {
        if (f90A == null) {
            f90A = new ArrayList<SeqEF90AType>();
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
     * {@link SeqEF36AType }
     * 
     * 
     */
    public List<SeqEF36AType> getF36A() {
        if (f36A == null) {
            f36A = new ArrayList<SeqEF36AType>();
        }
        return this.f36A;
    }

    /**
     * Gets the value of the seqE1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqE1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqE1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE1Type }
     * 
     * 
     */
    public List<SeqE1Type> getSeqE1() {
        if (seqE1 == null) {
            seqE1 = new ArrayList<SeqE1Type>();
        }
        return this.seqE1;
    }

    /**
     * Gets the value of the seqE2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqE2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqE2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqE2Type }
     * 
     * 
     */
    public List<SeqE2Type> getSeqE2() {
        if (seqE2 == null) {
            seqE2 = new ArrayList<SeqE2Type>();
        }
        return this.seqE2;
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
     * {@link SeqEF70AType }
     * 
     * 
     */
    public List<SeqEF70AType> getF70A() {
        if (f70A == null) {
            f70A = new ArrayList<SeqEF70AType>();
        }
        return this.f70A;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF16A2Type }
     *     
     */
    public SeqEF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF16A2Type }
     *     
     */
    public void setF16A2(SeqEF16A2Type value) {
        this.f16A2 = value;
    }

}
