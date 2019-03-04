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
 * <p>MT564_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MT564_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Message">
 *       &lt;sequence>
 *         &lt;element name="SeqA" type="{urn:swift:xsd:fin.564.2018}SeqA_Type"/>
 *         &lt;element name="SeqB" type="{urn:swift:xsd:fin.564.2018}SeqB_Type"/>
 *         &lt;element name="SeqC" type="{urn:swift:xsd:fin.564.2018}SeqC_Type" minOccurs="0"/>
 *         &lt;element name="SeqD" type="{urn:swift:xsd:fin.564.2018}SeqD_Type" minOccurs="0"/>
 *         &lt;element name="SeqE" type="{urn:swift:xsd:fin.564.2018}SeqE_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeqF" type="{urn:swift:xsd:fin.564.2018}SeqF_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT564_Type", propOrder = {
    "seqA",
    "seqB",
    "seqC",
    "seqD",
    "seqE",
    "seqF"
})
public class MT564Type
    extends ISO15022Message
{

    @XmlElement(name = "SeqA", required = true)
    protected SeqAType seqA;
    @XmlElement(name = "SeqB", required = true)
    protected SeqBType seqB;
    @XmlElement(name = "SeqC")
    protected SeqCType seqC;
    @XmlElement(name = "SeqD")
    protected SeqDType seqD;
    @XmlElement(name = "SeqE")
    protected List<SeqEType> seqE;
    @XmlElement(name = "SeqF")
    protected SeqFType seqF;

    /**
     * 获取seqA属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAType }
     *     
     */
    public SeqAType getSeqA() {
        return seqA;
    }

    /**
     * 设置seqA属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAType }
     *     
     */
    public void setSeqA(SeqAType value) {
        this.seqA = value;
    }

    /**
     * 获取seqB属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqBType }
     *     
     */
    public SeqBType getSeqB() {
        return seqB;
    }

    /**
     * 设置seqB属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBType }
     *     
     */
    public void setSeqB(SeqBType value) {
        this.seqB = value;
    }

    /**
     * 获取seqC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCType }
     *     
     */
    public SeqCType getSeqC() {
        return seqC;
    }

    /**
     * 设置seqC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCType }
     *     
     */
    public void setSeqC(SeqCType value) {
        this.seqC = value;
    }

    /**
     * 获取seqD属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDType }
     *     
     */
    public SeqDType getSeqD() {
        return seqD;
    }

    /**
     * 设置seqD属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDType }
     *     
     */
    public void setSeqD(SeqDType value) {
        this.seqD = value;
    }

    /**
     * Gets the value of the seqE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqEType }
     * 
     * 
     */
    public List<SeqEType> getSeqE() {
        if (seqE == null) {
            seqE = new ArrayList<SeqEType>();
        }
        return this.seqE;
    }

    /**
     * 获取seqF属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFType }
     *     
     */
    public SeqFType getSeqF() {
        return seqF;
    }

    /**
     * 设置seqF属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFType }
     *     
     */
    public void setSeqF(SeqFType value) {
        this.seqF = value;
    }

}
