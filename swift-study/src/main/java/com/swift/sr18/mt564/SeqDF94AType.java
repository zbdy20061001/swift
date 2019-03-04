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
 * <p>SeqD_F94a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F94a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MEET" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_MEET_Type"/>
 *         &lt;element name="MET2" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_MET2_Type"/>
 *         &lt;element name="MET3" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_MET3_Type"/>
 *         &lt;element name="NPLI" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_NPLI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F94a_Type", propOrder = {
    "meet",
    "met2",
    "met3",
    "npli"
})
public class SeqDF94AType
    extends ISO15022Field
{

    @XmlElement(name = "MEET")
    protected SeqDF94AMEETType meet;
    @XmlElement(name = "MET2")
    protected SeqDF94AMET2Type met2;
    @XmlElement(name = "MET3")
    protected SeqDF94AMET3Type met3;
    @XmlElement(name = "NPLI")
    protected SeqDF94ANPLIType npli;

    /**
     * 获取meet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94AMEETType }
     *     
     */
    public SeqDF94AMEETType getMEET() {
        return meet;
    }

    /**
     * 设置meet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94AMEETType }
     *     
     */
    public void setMEET(SeqDF94AMEETType value) {
        this.meet = value;
    }

    /**
     * 获取met2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94AMET2Type }
     *     
     */
    public SeqDF94AMET2Type getMET2() {
        return met2;
    }

    /**
     * 设置met2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94AMET2Type }
     *     
     */
    public void setMET2(SeqDF94AMET2Type value) {
        this.met2 = value;
    }

    /**
     * 获取met3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94AMET3Type }
     *     
     */
    public SeqDF94AMET3Type getMET3() {
        return met3;
    }

    /**
     * 设置met3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94AMET3Type }
     *     
     */
    public void setMET3(SeqDF94AMET3Type value) {
        this.met3 = value;
    }

    /**
     * 获取npli属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94ANPLIType }
     *     
     */
    public SeqDF94ANPLIType getNPLI() {
        return npli;
    }

    /**
     * 设置npli属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94ANPLIType }
     *     
     */
    public void setNPLI(SeqDF94ANPLIType value) {
        this.npli = value;
    }

}
