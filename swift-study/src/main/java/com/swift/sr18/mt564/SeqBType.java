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
 * <p>SeqB_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqB_F16a_1_Type"/>
 *         &lt;element name="F35a" type="{urn:swift:xsd:fin.564.2018}SeqB_F35a_Type"/>
 *         &lt;element name="SeqB1" type="{urn:swift:xsd:fin.564.2018}SeqB1_Type" minOccurs="0"/>
 *         &lt;element name="SeqB2" type="{urn:swift:xsd:fin.564.2018}SeqB2_Type" maxOccurs="unbounded"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqB_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB_Type", propOrder = {
    "f16A1",
    "f35A",
    "seqB1",
    "seqB2",
    "f16A2"
})
public class SeqBType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqBF16A1Type f16A1;
    @XmlElement(name = "F35a", required = true)
    protected SeqBF35AType f35A;
    @XmlElement(name = "SeqB1")
    protected SeqB1Type seqB1;
    @XmlElement(name = "SeqB2", required = true)
    protected List<SeqB2Type> seqB2;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqBF16A2Type f16A2;

    /**
     * 获取f16A1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqBF16A1Type }
     *     
     */
    public SeqBF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * 设置f16A1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBF16A1Type }
     *     
     */
    public void setF16A1(SeqBF16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * 获取f35A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqBF35AType }
     *     
     */
    public SeqBF35AType getF35A() {
        return f35A;
    }

    /**
     * 设置f35A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBF35AType }
     *     
     */
    public void setF35A(SeqBF35AType value) {
        this.f35A = value;
    }

    /**
     * 获取seqB1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1Type }
     *     
     */
    public SeqB1Type getSeqB1() {
        return seqB1;
    }

    /**
     * 设置seqB1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1Type }
     *     
     */
    public void setSeqB1(SeqB1Type value) {
        this.seqB1 = value;
    }

    /**
     * Gets the value of the seqB2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqB2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqB2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB2Type }
     * 
     * 
     */
    public List<SeqB2Type> getSeqB2() {
        if (seqB2 == null) {
            seqB2 = new ArrayList<SeqB2Type>();
        }
        return this.seqB2;
    }

    /**
     * 获取f16A2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqBF16A2Type }
     *     
     */
    public SeqBF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * 设置f16A2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBF16A2Type }
     *     
     */
    public void setF16A2(SeqBF16A2Type value) {
        this.f16A2 = value;
    }

}
