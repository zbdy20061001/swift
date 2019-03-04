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
 * <p>SeqA_F22a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CAEP" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_CAEP_Type"/>
 *         &lt;element name="CAEV" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_CAEV_Type"/>
 *         &lt;element name="CAMV" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_CAMV_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F22a_Type", propOrder = {
    "caep",
    "caev",
    "camv"
})
public class SeqAF22AType
    extends ISO15022Field
{

    @XmlElement(name = "CAEP")
    protected SeqAF22ACAEPType caep;
    @XmlElement(name = "CAEV")
    protected SeqAF22ACAEVType caev;
    @XmlElement(name = "CAMV")
    protected SeqAF22ACAMVType camv;

    /**
     * 获取caep属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF22ACAEPType }
     *     
     */
    public SeqAF22ACAEPType getCAEP() {
        return caep;
    }

    /**
     * 设置caep属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF22ACAEPType }
     *     
     */
    public void setCAEP(SeqAF22ACAEPType value) {
        this.caep = value;
    }

    /**
     * 获取caev属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF22ACAEVType }
     *     
     */
    public SeqAF22ACAEVType getCAEV() {
        return caev;
    }

    /**
     * 设置caev属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF22ACAEVType }
     *     
     */
    public void setCAEV(SeqAF22ACAEVType value) {
        this.caev = value;
    }

    /**
     * 获取camv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqAF22ACAMVType }
     *     
     */
    public SeqAF22ACAMVType getCAMV() {
        return camv;
    }

    /**
     * 设置camv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF22ACAMVType }
     *     
     */
    public void setCAMV(SeqAF22ACAMVType value) {
        this.camv = value;
    }

}
