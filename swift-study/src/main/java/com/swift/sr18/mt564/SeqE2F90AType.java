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
 * <p>SeqE2_F90a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="OFFR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F90a_OFFR_Type"/>
 *         &lt;element name="PRPP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F90a_PRPP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F90a_Type", propOrder = {
    "offr",
    "prpp"
})
public class SeqE2F90AType
    extends ISO15022Field
{

    @XmlElement(name = "OFFR")
    protected SeqE2F90AOFFRType offr;
    @XmlElement(name = "PRPP")
    protected SeqE2F90APRPPType prpp;

    /**
     * 获取offr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F90AOFFRType }
     *     
     */
    public SeqE2F90AOFFRType getOFFR() {
        return offr;
    }

    /**
     * 设置offr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F90AOFFRType }
     *     
     */
    public void setOFFR(SeqE2F90AOFFRType value) {
        this.offr = value;
    }

    /**
     * 获取prpp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F90APRPPType }
     *     
     */
    public SeqE2F90APRPPType getPRPP() {
        return prpp;
    }

    /**
     * 设置prpp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F90APRPPType }
     *     
     */
    public void setPRPP(SeqE2F90APRPPType value) {
        this.prpp = value;
    }

}
