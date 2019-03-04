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
 * <p>SeqE2_F90a_OFFR_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F90a_OFFR_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F90A" type="{urn:swift:xsd:fin.564.2018}F90A_2_Type"/>
 *         &lt;element name="F90B" type="{urn:swift:xsd:fin.564.2018}F90B_7_Type"/>
 *         &lt;element name="F90E" type="{urn:swift:xsd:fin.564.2018}F90E_9_Type"/>
 *         &lt;element name="F90F" type="{urn:swift:xsd:fin.564.2018}F90F_2_Type"/>
 *         &lt;element name="F90J" type="{urn:swift:xsd:fin.564.2018}F90J_2_Type"/>
 *         &lt;element name="F90L" type="{urn:swift:xsd:fin.564.2018}F90L_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F90a_OFFR_Type", propOrder = {
    "f90A",
    "f90B",
    "f90E",
    "f90F",
    "f90J",
    "f90L"
})
public class SeqE2F90AOFFRType
    extends Qualifier
{

    @XmlElement(name = "F90A")
    protected F90A2Type f90A;
    @XmlElement(name = "F90B")
    protected F90B7Type f90B;
    @XmlElement(name = "F90E")
    protected F90E9Type f90E;
    @XmlElement(name = "F90F")
    protected F90F2Type f90F;
    @XmlElement(name = "F90J")
    protected F90J2Type f90J;
    @XmlElement(name = "F90L")
    protected F90LType f90L;

    /**
     * 获取f90A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90A2Type }
     *     
     */
    public F90A2Type getF90A() {
        return f90A;
    }

    /**
     * 设置f90A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90A2Type }
     *     
     */
    public void setF90A(F90A2Type value) {
        this.f90A = value;
    }

    /**
     * 获取f90B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90B7Type }
     *     
     */
    public F90B7Type getF90B() {
        return f90B;
    }

    /**
     * 设置f90B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90B7Type }
     *     
     */
    public void setF90B(F90B7Type value) {
        this.f90B = value;
    }

    /**
     * 获取f90E属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90E9Type }
     *     
     */
    public F90E9Type getF90E() {
        return f90E;
    }

    /**
     * 设置f90E属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90E9Type }
     *     
     */
    public void setF90E(F90E9Type value) {
        this.f90E = value;
    }

    /**
     * 获取f90F属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90F2Type }
     *     
     */
    public F90F2Type getF90F() {
        return f90F;
    }

    /**
     * 设置f90F属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90F2Type }
     *     
     */
    public void setF90F(F90F2Type value) {
        this.f90F = value;
    }

    /**
     * 获取f90J属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90J2Type }
     *     
     */
    public F90J2Type getF90J() {
        return f90J;
    }

    /**
     * 设置f90J属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90J2Type }
     *     
     */
    public void setF90J(F90J2Type value) {
        this.f90J = value;
    }

    /**
     * 获取f90L属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90LType }
     *     
     */
    public F90LType getF90L() {
        return f90L;
    }

    /**
     * 设置f90L属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90LType }
     *     
     */
    public void setF90L(F90LType value) {
        this.f90L = value;
    }

}
