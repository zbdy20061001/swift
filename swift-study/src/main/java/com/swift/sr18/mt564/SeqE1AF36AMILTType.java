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
 * <p>SeqE1a_F36a_MILT_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F36a_MILT_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F36B" type="{urn:swift:xsd:fin.564.2018}F36B_4_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F36a_MILT_Type", propOrder = {
    "f36B"
})
public class SeqE1AF36AMILTType
    extends Qualifier
{

    @XmlElement(name = "F36B")
    protected F36B4Type f36B;

    /**
     * 获取f36B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F36B4Type }
     *     
     */
    public F36B4Type getF36B() {
        return f36B;
    }

    /**
     * 设置f36B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F36B4Type }
     *     
     */
    public void setF36B(F36B4Type value) {
        this.f36B = value;
    }

}
