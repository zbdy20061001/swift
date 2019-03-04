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
 * <p>SeqE1_F92a_NEWO_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F92a_NEWO_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92D" type="{urn:swift:xsd:fin.564.2018}F92D_1_Type"/>
 *         &lt;element name="F92K" type="{urn:swift:xsd:fin.564.2018}F92K_6_Type"/>
 *         &lt;element name="F92L" type="{urn:swift:xsd:fin.564.2018}F92L_1_Type"/>
 *         &lt;element name="F92M" type="{urn:swift:xsd:fin.564.2018}F92M_Type"/>
 *         &lt;element name="F92N" type="{urn:swift:xsd:fin.564.2018}F92N_1_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F92a_NEWO_Type", propOrder = {
    "f92D",
    "f92K",
    "f92L",
    "f92M",
    "f92N"
})
public class SeqE1F92ANEWOType
    extends Qualifier
{

    @XmlElement(name = "F92D")
    protected F92D1Type f92D;
    @XmlElement(name = "F92K")
    protected F92K6Type f92K;
    @XmlElement(name = "F92L")
    protected F92L1Type f92L;
    @XmlElement(name = "F92M")
    protected F92MType f92M;
    @XmlElement(name = "F92N")
    protected F92N1Type f92N;

    /**
     * 获取f92D属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92D1Type }
     *     
     */
    public F92D1Type getF92D() {
        return f92D;
    }

    /**
     * 设置f92D属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92D1Type }
     *     
     */
    public void setF92D(F92D1Type value) {
        this.f92D = value;
    }

    /**
     * 获取f92K属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92K6Type }
     *     
     */
    public F92K6Type getF92K() {
        return f92K;
    }

    /**
     * 设置f92K属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92K6Type }
     *     
     */
    public void setF92K(F92K6Type value) {
        this.f92K = value;
    }

    /**
     * 获取f92L属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92L1Type }
     *     
     */
    public F92L1Type getF92L() {
        return f92L;
    }

    /**
     * 设置f92L属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92L1Type }
     *     
     */
    public void setF92L(F92L1Type value) {
        this.f92L = value;
    }

    /**
     * 获取f92M属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92MType }
     *     
     */
    public F92MType getF92M() {
        return f92M;
    }

    /**
     * 设置f92M属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92MType }
     *     
     */
    public void setF92M(F92MType value) {
        this.f92M = value;
    }

    /**
     * 获取f92N属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92N1Type }
     *     
     */
    public F92N1Type getF92N() {
        return f92N;
    }

    /**
     * 设置f92N属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92N1Type }
     *     
     */
    public void setF92N(F92N1Type value) {
        this.f92N = value;
    }

}
