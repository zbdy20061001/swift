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
 * <p>SeqB2_F97a_SAFE_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB2_F97a_SAFE_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F97A" type="{urn:swift:xsd:fin.564.2018}F97A_Type"/>
 *         &lt;element name="F97C" type="{urn:swift:xsd:fin.564.2018}F97C_2_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_F97a_SAFE_Type", propOrder = {
    "f97A",
    "f97C"
})
public class SeqB2F97ASAFEType
    extends Qualifier
{

    @XmlElement(name = "F97A")
    protected F97AType f97A;
    @XmlElement(name = "F97C")
    protected F97C2Type f97C;

    /**
     * 获取f97A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F97AType }
     *     
     */
    public F97AType getF97A() {
        return f97A;
    }

    /**
     * 设置f97A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F97AType }
     *     
     */
    public void setF97A(F97AType value) {
        this.f97A = value;
    }

    /**
     * 获取f97C属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F97C2Type }
     *     
     */
    public F97C2Type getF97C() {
        return f97C;
    }

    /**
     * 设置f97C属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F97C2Type }
     *     
     */
    public void setF97C(F97C2Type value) {
        this.f97C = value;
    }

}
