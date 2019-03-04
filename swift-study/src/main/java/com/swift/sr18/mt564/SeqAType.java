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
 * <p>SeqA_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqA_F16a_1_Type"/>
 *         &lt;element name="F28a" type="{urn:swift:xsd:fin.564.2018}SeqA_F28a_Type" minOccurs="0"/>
 *         &lt;element name="F20a" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_Type" maxOccurs="3" minOccurs="2"/>
 *         &lt;element name="F23a" type="{urn:swift:xsd:fin.564.2018}SeqA_F23a_Type"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_Type" maxOccurs="3" minOccurs="2"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqA_F98a_Type" minOccurs="0"/>
 *         &lt;element name="F25a" type="{urn:swift:xsd:fin.564.2018}SeqA_F25a_Type"/>
 *         &lt;element name="SeqA1" type="{urn:swift:xsd:fin.564.2018}SeqA1_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqA_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_Type", propOrder = {
    "f16A1",
    "f28A",
    "f20A",
    "f23A",
    "f22A",
    "f98A",
    "f25A",
    "seqA1",
    "f16A2"
})
public class SeqAType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqAF16A1Type f16A1;
    @XmlElement(name = "F28a")
    protected SeqAF28AType f28A;
    @XmlElement(name = "F20a", required = true)
    protected List<SeqAF20AType> f20A;
    @XmlElement(name = "F23a", required = true)
    protected SeqAF23AType f23A;
    @XmlElement(name = "F22a", required = true)
    protected List<SeqAF22AType> f22A;
    @XmlElement(name = "F98a")
    protected SeqAF98AType f98A;
    @XmlElement(name = "F25a", required = true)
    protected SeqAF25AType f25A;
    @XmlElement(name = "SeqA1")
    protected List<SeqA1Type> seqA1;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqAF16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF16A1Type }
     *     
     */
    public SeqAF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF16A1Type }
     *     
     */
    public void setF16A1(SeqAF16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * 获取f28A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF28AType }
     *     
     */
    public SeqAF28AType getF28A() {
        return f28A;
    }

    /**
     * 设置f28A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF28AType }
     *     
     */
    public void setF28A(SeqAF28AType value) {
        this.f28A = value;
    }

    /**
     * Gets the value of the f20A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f20A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF20A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqAF20AType }
     * 
     * 
     */
    public List<SeqAF20AType> getF20A() {
        if (f20A == null) {
            f20A = new ArrayList<SeqAF20AType>();
        }
        return this.f20A;
    }

    /**
     * 获取f23A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF23AType }
     *     
     */
    public SeqAF23AType getF23A() {
        return f23A;
    }

    /**
     * 设置f23A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF23AType }
     *     
     */
    public void setF23A(SeqAF23AType value) {
        this.f23A = value;
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
     * {@link SeqAF22AType }
     * 
     * 
     */
    public List<SeqAF22AType> getF22A() {
        if (f22A == null) {
            f22A = new ArrayList<SeqAF22AType>();
        }
        return this.f22A;
    }

    /**
     * 获取f98A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF98AType }
     *     
     */
    public SeqAF98AType getF98A() {
        return f98A;
    }

    /**
     * 设置f98A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF98AType }
     *     
     */
    public void setF98A(SeqAF98AType value) {
        this.f98A = value;
    }

    /**
     * 获取f25A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF25AType }
     *     
     */
    public SeqAF25AType getF25A() {
        return f25A;
    }

    /**
     * 设置f25A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF25AType }
     *     
     */
    public void setF25A(SeqAF25AType value) {
        this.f25A = value;
    }

    /**
     * Gets the value of the seqA1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqA1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqA1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqA1Type }
     * 
     * 
     */
    public List<SeqA1Type> getSeqA1() {
        if (seqA1 == null) {
            seqA1 = new ArrayList<SeqA1Type>();
        }
        return this.seqA1;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF16A2Type }
     *     
     */
    public SeqAF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF16A2Type }
     *     
     */
    public void setF16A2(SeqAF16A2Type value) {
        this.f16A2 = value;
    }

}
