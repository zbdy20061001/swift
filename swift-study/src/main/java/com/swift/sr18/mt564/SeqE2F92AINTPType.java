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
 * <p>SeqE2_F92a_INTP_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F92a_INTP_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92A" type="{urn:swift:xsd:fin.564.2018}F92A_Type"/>
 *         &lt;element name="F92F" type="{urn:swift:xsd:fin.564.2018}F92F_Type"/>
 *         &lt;element name="F92J" type="{urn:swift:xsd:fin.564.2018}F92J_20_Type"/>
 *         &lt;element name="F92K" type="{urn:swift:xsd:fin.564.2018}F92K_8_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F92a_INTP_Type", propOrder = {
    "f92A",
    "f92F",
    "f92J",
    "f92K"
})
public class SeqE2F92AINTPType
    extends Qualifier
{

    @XmlElement(name = "F92A")
    protected F92AType f92A;
    @XmlElement(name = "F92F")
    protected F92FType f92F;
    @XmlElement(name = "F92J")
    protected F92J20Type f92J;
    @XmlElement(name = "F92K")
    protected F92K8Type f92K;

    /**
     * 获取f92A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92AType }
     *     
     */
    public F92AType getF92A() {
        return f92A;
    }

    /**
     * 设置f92A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92AType }
     *     
     */
    public void setF92A(F92AType value) {
        this.f92A = value;
    }

    /**
     * 获取f92F属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92FType }
     *     
     */
    public F92FType getF92F() {
        return f92F;
    }

    /**
     * 设置f92F属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92FType }
     *     
     */
    public void setF92F(F92FType value) {
        this.f92F = value;
    }

    /**
     * 获取f92J属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92J20Type }
     *     
     */
    public F92J20Type getF92J() {
        return f92J;
    }

    /**
     * 设置f92J属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92J20Type }
     *     
     */
    public void setF92J(F92J20Type value) {
        this.f92J = value;
    }

    /**
     * 获取f92K属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92K8Type }
     *     
     */
    public F92K8Type getF92K() {
        return f92K;
    }

    /**
     * 设置f92K属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92K8Type }
     *     
     */
    public void setF92K(F92K8Type value) {
        this.f92K = value;
    }

}
