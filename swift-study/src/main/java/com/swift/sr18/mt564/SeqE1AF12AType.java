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
 * <p>SeqE1a_F12a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F12a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CLAS" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F12a_CLAS_Type"/>
 *         &lt;element name="OPST" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F12a_OPST_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F12a_Type", propOrder = {
    "clas",
    "opst"
})
public class SeqE1AF12AType
    extends ISO15022Field
{

    @XmlElement(name = "CLAS")
    protected SeqE1AF12ACLASType clas;
    @XmlElement(name = "OPST")
    protected SeqE1AF12AOPSTType opst;

    /**
     * 获取clas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF12ACLASType }
     *     
     */
    public SeqE1AF12ACLASType getCLAS() {
        return clas;
    }

    /**
     * 设置clas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF12ACLASType }
     *     
     */
    public void setCLAS(SeqE1AF12ACLASType value) {
        this.clas = value;
    }

    /**
     * 获取opst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF12AOPSTType }
     *     
     */
    public SeqE1AF12AOPSTType getOPST() {
        return opst;
    }

    /**
     * 设置opst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF12AOPSTType }
     *     
     */
    public void setOPST(SeqE1AF12AOPSTType value) {
        this.opst = value;
    }

}
