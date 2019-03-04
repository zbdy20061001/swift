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
 * <p>SeqF_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqF_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqF_F16a_1_Type"/>
 *         &lt;element name="F70a" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F95a" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqF_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqF_Type", propOrder = {
    "f16A1",
    "f70A",
    "f95A",
    "f16A2"
})
public class SeqFType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqFF16A1Type f16A1;
    @XmlElement(name = "F70a")
    protected List<SeqFF70AType> f70A;
    @XmlElement(name = "F95a")
    protected List<SeqFF95AType> f95A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqFF16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF16A1Type }
     *     
     */
    public SeqFF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF16A1Type }
     *     
     */
    public void setF16A1(SeqFF16A1Type value) {
        this.f16A1 = value;
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
     * {@link SeqFF70AType }
     * 
     * 
     */
    public List<SeqFF70AType> getF70A() {
        if (f70A == null) {
            f70A = new ArrayList<SeqFF70AType>();
        }
        return this.f70A;
    }

    /**
     * Gets the value of the f95A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f95A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF95A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqFF95AType }
     * 
     * 
     */
    public List<SeqFF95AType> getF95A() {
        if (f95A == null) {
            f95A = new ArrayList<SeqFF95AType>();
        }
        return this.f95A;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF16A2Type }
     *     
     */
    public SeqFF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF16A2Type }
     *     
     */
    public void setF16A2(SeqFF16A2Type value) {
        this.f16A2 = value;
    }

}
