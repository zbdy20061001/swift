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
 * <p>SeqE1_F94a_SAFE_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F94a_SAFE_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F94B" type="{urn:swift:xsd:fin.564.2018}F94B_20_Type"/>
 *         &lt;element name="F94C" type="{urn:swift:xsd:fin.564.2018}F94C_Type"/>
 *         &lt;element name="F94F" type="{urn:swift:xsd:fin.564.2018}F94F_3_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F94a_SAFE_Type", propOrder = {
    "f94B",
    "f94C",
    "f94F"
})
public class SeqE1F94ASAFEType
    extends Qualifier
{

    @XmlElement(name = "F94B")
    protected F94B20Type f94B;
    @XmlElement(name = "F94C")
    protected F94CType f94C;
    @XmlElement(name = "F94F")
    protected F94F3Type f94F;

    /**
     * 获取f94B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F94B20Type }
     *     
     */
    public F94B20Type getF94B() {
        return f94B;
    }

    /**
     * 设置f94B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F94B20Type }
     *     
     */
    public void setF94B(F94B20Type value) {
        this.f94B = value;
    }

    /**
     * 获取f94C属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F94CType }
     *     
     */
    public F94CType getF94C() {
        return f94C;
    }

    /**
     * 设置f94C属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F94CType }
     *     
     */
    public void setF94C(F94CType value) {
        this.f94C = value;
    }

    /**
     * 获取f94F属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F94F3Type }
     *     
     */
    public F94F3Type getF94F() {
        return f94F;
    }

    /**
     * 设置f94F属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F94F3Type }
     *     
     */
    public void setF94F(F94F3Type value) {
        this.f94F = value;
    }

}
