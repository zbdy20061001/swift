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
 * <p>SeqA1_F13a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA1_F13a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="LINK" type="{urn:swift:xsd:fin.564.2018}SeqA1_F13a_LINK_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_F13a_Type", propOrder = {
    "link"
})
public class SeqA1F13AType
    extends ISO15022Field
{

    @XmlElement(name = "LINK")
    protected SeqA1F13ALINKType link;

    /**
     * 获取link属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F13ALINKType }
     *     
     */
    public SeqA1F13ALINKType getLINK() {
        return link;
    }

    /**
     * 设置link属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F13ALINKType }
     *     
     */
    public void setLINK(SeqA1F13ALINKType value) {
        this.link = value;
    }

}
