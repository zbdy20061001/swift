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
 * <p>SeqC_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqC_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="RTUN" type="{urn:swift:xsd:fin.564.2018}SeqC_F92a_RTUN_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F92a_Type", propOrder = {
    "rtun"
})
public class SeqCF92AType
    extends ISO15022Field
{

    @XmlElement(name = "RTUN")
    protected SeqCF92ARTUNType rtun;

    /**
     * 获取rtun属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqCF92ARTUNType }
     *     
     */
    public SeqCF92ARTUNType getRTUN() {
        return rtun;
    }

    /**
     * 设置rtun属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF92ARTUNType }
     *     
     */
    public void setRTUN(SeqCF92ARTUNType value) {
        this.rtun = value;
    }

}
