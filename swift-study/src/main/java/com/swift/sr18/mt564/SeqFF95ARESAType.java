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
 * <p>SeqF_F95a_RESA_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqF_F95a_RESA_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F95P" type="{urn:swift:xsd:fin.564.2018}F95P_12_Type"/>
 *         &lt;element name="F95Q" type="{urn:swift:xsd:fin.564.2018}F95Q_Type"/>
 *         &lt;element name="F95R" type="{urn:swift:xsd:fin.564.2018}F95R_4_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqF_F95a_RESA_Type", propOrder = {
    "f95P",
    "f95Q",
    "f95R"
})
public class SeqFF95ARESAType
    extends Qualifier
{

    @XmlElement(name = "F95P")
    protected F95P12Type f95P;
    @XmlElement(name = "F95Q")
    protected F95QType f95Q;
    @XmlElement(name = "F95R")
    protected F95R4Type f95R;

    /**
     * 获取f95P属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F95P12Type }
     *     
     */
    public F95P12Type getF95P() {
        return f95P;
    }

    /**
     * 设置f95P属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F95P12Type }
     *     
     */
    public void setF95P(F95P12Type value) {
        this.f95P = value;
    }

    /**
     * 获取f95Q属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F95QType }
     *     
     */
    public F95QType getF95Q() {
        return f95Q;
    }

    /**
     * 设置f95Q属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F95QType }
     *     
     */
    public void setF95Q(F95QType value) {
        this.f95Q = value;
    }

    /**
     * 获取f95R属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F95R4Type }
     *     
     */
    public F95R4Type getF95R() {
        return f95R;
    }

    /**
     * 设置f95R属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F95R4Type }
     *     
     */
    public void setF95R(F95R4Type value) {
        this.f95R = value;
    }

}
