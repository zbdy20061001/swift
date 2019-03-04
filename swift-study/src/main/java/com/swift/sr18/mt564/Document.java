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
 * <p>Document complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MT564" type="{urn:swift:xsd:fin.564.2018}MT564_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mt564"
})
public class Document {

    @XmlElement(name = "MT564", required = true)
    protected MT564Type mt564;

    /**
     * 获取mt564属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MT564Type }
     *     
     */
    public MT564Type getMT564() {
        return mt564;
    }

    /**
     * 设置mt564属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MT564Type }
     *     
     */
    public void setMT564(MT564Type value) {
        this.mt564 = value;
    }

}
