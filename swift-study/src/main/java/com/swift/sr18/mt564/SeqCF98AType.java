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
 * <p>SeqC_F98a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqC_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="EXPI" type="{urn:swift:xsd:fin.564.2018}SeqC_F98a_EXPI_Type"/>
 *         &lt;element name="POST" type="{urn:swift:xsd:fin.564.2018}SeqC_F98a_POST_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F98a_Type", propOrder = {
    "expi",
    "post"
})
public class SeqCF98AType
    extends ISO15022Field
{

    @XmlElement(name = "EXPI")
    protected SeqCF98AEXPIType expi;
    @XmlElement(name = "POST")
    protected SeqCF98APOSTType post;

    /**
     * 获取expi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF98AEXPIType }
     *     
     */
    public SeqCF98AEXPIType getEXPI() {
        return expi;
    }

    /**
     * 设置expi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF98AEXPIType }
     *     
     */
    public void setEXPI(SeqCF98AEXPIType value) {
        this.expi = value;
    }

    /**
     * 获取post属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF98APOSTType }
     *     
     */
    public SeqCF98APOSTType getPOST() {
        return post;
    }

    /**
     * 设置post属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF98APOSTType }
     *     
     */
    public void setPOST(SeqCF98APOSTType value) {
        this.post = value;
    }

}
