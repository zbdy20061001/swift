//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.05 时间 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqD_F70a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F70a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="OFFO" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_OFFO_Type"/>
 *         &lt;element name="WEBB" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_WEBB_Type"/>
 *         &lt;element name="NAME" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_NAME_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F70a_Type", propOrder = {
    "offo",
    "webb",
    "name"
})
public class SeqDF70AType
    extends ISO15022Field
{

    @XmlElement(name = "OFFO")
    protected SeqDF70AOFFOType offo;
    @XmlElement(name = "WEBB")
    protected SeqDF70AWEBBType webb;
    @XmlElement(name = "NAME")
    protected SeqDF70ANAMEType name;

    /**
     * 获取offo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF70AOFFOType }
     *     
     */
    public SeqDF70AOFFOType getOFFO() {
        return offo;
    }

    /**
     * 设置offo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF70AOFFOType }
     *     
     */
    public void setOFFO(SeqDF70AOFFOType value) {
        this.offo = value;
    }

    /**
     * 获取webb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF70AWEBBType }
     *     
     */
    public SeqDF70AWEBBType getWEBB() {
        return webb;
    }

    /**
     * 设置webb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF70AWEBBType }
     *     
     */
    public void setWEBB(SeqDF70AWEBBType value) {
        this.webb = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF70ANAMEType }
     *     
     */
    public SeqDF70ANAMEType getNAME() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF70ANAMEType }
     *     
     */
    public void setNAME(SeqDF70ANAMEType value) {
        this.name = value;
    }

}
