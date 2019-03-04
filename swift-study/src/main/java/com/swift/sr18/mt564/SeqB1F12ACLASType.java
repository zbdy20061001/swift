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
 * <p>SeqB1_F12a_CLAS_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F12a_CLAS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F12A" type="{urn:swift:xsd:fin.564.2018}F12A_Type"/>
 *         &lt;element name="F12C" type="{urn:swift:xsd:fin.564.2018}F12C_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F12a_CLAS_Type", propOrder = {
    "f12A",
    "f12C"
})
public class SeqB1F12ACLASType
    extends Qualifier
{

    @XmlElement(name = "F12A")
    protected F12AType f12A;
    @XmlElement(name = "F12C")
    protected F12CType f12C;

    /**
     * 获取f12A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F12AType }
     *     
     */
    public F12AType getF12A() {
        return f12A;
    }

    /**
     * 设置f12A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F12AType }
     *     
     */
    public void setF12A(F12AType value) {
        this.f12A = value;
    }

    /**
     * 获取f12C属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F12CType }
     *     
     */
    public F12CType getF12C() {
        return f12C;
    }

    /**
     * 设置f12C属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F12CType }
     *     
     */
    public void setF12C(F12CType value) {
        this.f12C = value;
    }

}
