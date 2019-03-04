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
 * <p>SeqD_F90a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MAXP" type="{urn:swift:xsd:fin.564.2018}SeqD_F90a_MAXP_Type"/>
 *         &lt;element name="MINP" type="{urn:swift:xsd:fin.564.2018}SeqD_F90a_MINP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F90a_Type", propOrder = {
    "maxp",
    "minp"
})
public class SeqDF90AType
    extends ISO15022Field
{

    @XmlElement(name = "MAXP")
    protected SeqDF90AMAXPType maxp;
    @XmlElement(name = "MINP")
    protected SeqDF90AMINPType minp;

    /**
     * 获取maxp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF90AMAXPType }
     *     
     */
    public SeqDF90AMAXPType getMAXP() {
        return maxp;
    }

    /**
     * 设置maxp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF90AMAXPType }
     *     
     */
    public void setMAXP(SeqDF90AMAXPType value) {
        this.maxp = value;
    }

    /**
     * 获取minp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF90AMINPType }
     *     
     */
    public SeqDF90AMINPType getMINP() {
        return minp;
    }

    /**
     * 设置minp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF90AMINPType }
     *     
     */
    public void setMINP(SeqDF90AMINPType value) {
        this.minp = value;
    }

}
