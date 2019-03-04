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
 * <p>SeqE1_F90a_CAVA_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F90a_CAVA_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F90B" type="{urn:swift:xsd:fin.564.2018}F90B_6_Type"/>
 *         &lt;element name="F90E" type="{urn:swift:xsd:fin.564.2018}F90E_8_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F90a_CAVA_Type", propOrder = {
    "f90B",
    "f90E"
})
public class SeqE1F90ACAVAType
    extends Qualifier
{

    @XmlElement(name = "F90B")
    protected F90B6Type f90B;
    @XmlElement(name = "F90E")
    protected F90E8Type f90E;

    /**
     * 获取f90B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90B6Type }
     *     
     */
    public F90B6Type getF90B() {
        return f90B;
    }

    /**
     * 设置f90B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90B6Type }
     *     
     */
    public void setF90B(F90B6Type value) {
        this.f90B = value;
    }

    /**
     * 获取f90E属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F90E8Type }
     *     
     */
    public F90E8Type getF90E() {
        return f90E;
    }

    /**
     * 设置f90E属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F90E8Type }
     *     
     */
    public void setF90E(F90E8Type value) {
        this.f90E = value;
    }

}
