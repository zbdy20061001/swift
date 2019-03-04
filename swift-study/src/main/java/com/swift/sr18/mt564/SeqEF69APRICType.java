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
 * <p>SeqE_F69a_PRIC_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F69a_PRIC_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F69A" type="{urn:swift:xsd:fin.564.2018}F69A_Type"/>
 *         &lt;element name="F69B" type="{urn:swift:xsd:fin.564.2018}F69B_Type"/>
 *         &lt;element name="F69C" type="{urn:swift:xsd:fin.564.2018}F69C_4_Type"/>
 *         &lt;element name="F69D" type="{urn:swift:xsd:fin.564.2018}F69D_4_Type"/>
 *         &lt;element name="F69E" type="{urn:swift:xsd:fin.564.2018}F69E_4_Type"/>
 *         &lt;element name="F69F" type="{urn:swift:xsd:fin.564.2018}F69F_4_Type"/>
 *         &lt;element name="F69J" type="{urn:swift:xsd:fin.564.2018}F69J_4_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F69a_PRIC_Type", propOrder = {
    "f69A",
    "f69B",
    "f69C",
    "f69D",
    "f69E",
    "f69F",
    "f69J"
})
public class SeqEF69APRICType
    extends Qualifier
{

    @XmlElement(name = "F69A")
    protected F69AType f69A;
    @XmlElement(name = "F69B")
    protected F69BType f69B;
    @XmlElement(name = "F69C")
    protected F69C4Type f69C;
    @XmlElement(name = "F69D")
    protected F69D4Type f69D;
    @XmlElement(name = "F69E")
    protected F69E4Type f69E;
    @XmlElement(name = "F69F")
    protected F69F4Type f69F;
    @XmlElement(name = "F69J")
    protected F69J4Type f69J;

    /**
     * 获取f69A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69AType }
     *     
     */
    public F69AType getF69A() {
        return f69A;
    }

    /**
     * 设置f69A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69AType }
     *     
     */
    public void setF69A(F69AType value) {
        this.f69A = value;
    }

    /**
     * 获取f69B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69BType }
     *     
     */
    public F69BType getF69B() {
        return f69B;
    }

    /**
     * 设置f69B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69BType }
     *     
     */
    public void setF69B(F69BType value) {
        this.f69B = value;
    }

    /**
     * 获取f69C属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69C4Type }
     *     
     */
    public F69C4Type getF69C() {
        return f69C;
    }

    /**
     * 设置f69C属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69C4Type }
     *     
     */
    public void setF69C(F69C4Type value) {
        this.f69C = value;
    }

    /**
     * 获取f69D属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69D4Type }
     *     
     */
    public F69D4Type getF69D() {
        return f69D;
    }

    /**
     * 设置f69D属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69D4Type }
     *     
     */
    public void setF69D(F69D4Type value) {
        this.f69D = value;
    }

    /**
     * 获取f69E属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69E4Type }
     *     
     */
    public F69E4Type getF69E() {
        return f69E;
    }

    /**
     * 设置f69E属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69E4Type }
     *     
     */
    public void setF69E(F69E4Type value) {
        this.f69E = value;
    }

    /**
     * 获取f69F属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69F4Type }
     *     
     */
    public F69F4Type getF69F() {
        return f69F;
    }

    /**
     * 设置f69F属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69F4Type }
     *     
     */
    public void setF69F(F69F4Type value) {
        this.f69F = value;
    }

    /**
     * 获取f69J属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F69J4Type }
     *     
     */
    public F69J4Type getF69J() {
        return f69J;
    }

    /**
     * 设置f69J属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F69J4Type }
     *     
     */
    public void setF69J(F69J4Type value) {
        this.f69J = value;
    }

}
