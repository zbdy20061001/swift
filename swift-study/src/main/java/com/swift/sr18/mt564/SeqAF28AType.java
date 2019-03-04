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
 * <p>SeqA_F28a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA_F28a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}MTField">
 *       &lt;choice>
 *         &lt;element name="F28E" type="{urn:swift:xsd:fin.564.2018}F28E_2_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F28a_Type", propOrder = {
    "f28E"
})
public class SeqAF28AType
    extends MTField
{

    @XmlElement(name = "F28E")
    protected F28E2Type f28E;

    /**
     * 获取f28E属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F28E2Type }
     *     
     */
    public F28E2Type getF28E() {
        return f28E;
    }

    /**
     * 设置f28E属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F28E2Type }
     *     
     */
    public void setF28E(F28E2Type value) {
        this.f28E = value;
    }

}
