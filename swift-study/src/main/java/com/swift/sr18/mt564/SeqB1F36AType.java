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
 * <p>SeqB1_F36a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F36a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MINO" type="{urn:swift:xsd:fin.564.2018}SeqB1_F36a_MINO_Type"/>
 *         &lt;element name="SIZE" type="{urn:swift:xsd:fin.564.2018}SeqB1_F36a_SIZE_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F36a_Type", propOrder = {
    "mino",
    "size"
})
public class SeqB1F36AType
    extends ISO15022Field
{

    @XmlElement(name = "MINO")
    protected SeqB1F36AMINOType mino;
    @XmlElement(name = "SIZE")
    protected SeqB1F36ASIZEType size;

    /**
     * 获取mino属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F36AMINOType }
     *     
     */
    public SeqB1F36AMINOType getMINO() {
        return mino;
    }

    /**
     * 设置mino属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F36AMINOType }
     *     
     */
    public void setMINO(SeqB1F36AMINOType value) {
        this.mino = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F36ASIZEType }
     *     
     */
    public SeqB1F36ASIZEType getSIZE() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F36ASIZEType }
     *     
     */
    public void setSIZE(SeqB1F36ASIZEType value) {
        this.size = value;
    }

}
