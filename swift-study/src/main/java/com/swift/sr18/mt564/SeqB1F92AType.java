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
 * <p>SeqB1_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PRFC" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_PRFC_Type"/>
 *         &lt;element name="NWFC" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_NWFC_Type"/>
 *         &lt;element name="INTR" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_INTR_Type"/>
 *         &lt;element name="NXRT" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_NXRT_Type"/>
 *         &lt;element name="DECL" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_DECL_Type"/>
 *         &lt;element name="WAPA" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_WAPA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F92a_Type", propOrder = {
    "prfc",
    "nwfc",
    "intr",
    "nxrt",
    "decl",
    "wapa"
})
public class SeqB1F92AType
    extends ISO15022Field
{

    @XmlElement(name = "PRFC")
    protected SeqB1F92APRFCType prfc;
    @XmlElement(name = "NWFC")
    protected SeqB1F92ANWFCType nwfc;
    @XmlElement(name = "INTR")
    protected SeqB1F92AINTRType intr;
    @XmlElement(name = "NXRT")
    protected SeqB1F92ANXRTType nxrt;
    @XmlElement(name = "DECL")
    protected SeqB1F92ADECLType decl;
    @XmlElement(name = "WAPA")
    protected SeqB1F92AWAPAType wapa;

    /**
     * 获取prfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F92APRFCType }
     *     
     */
    public SeqB1F92APRFCType getPRFC() {
        return prfc;
    }

    /**
     * 设置prfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F92APRFCType }
     *     
     */
    public void setPRFC(SeqB1F92APRFCType value) {
        this.prfc = value;
    }

    /**
     * 获取nwfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F92ANWFCType }
     *     
     */
    public SeqB1F92ANWFCType getNWFC() {
        return nwfc;
    }

    /**
     * 设置nwfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F92ANWFCType }
     *     
     */
    public void setNWFC(SeqB1F92ANWFCType value) {
        this.nwfc = value;
    }

    /**
     * 获取intr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F92AINTRType }
     *     
     */
    public SeqB1F92AINTRType getINTR() {
        return intr;
    }

    /**
     * 设置intr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F92AINTRType }
     *     
     */
    public void setINTR(SeqB1F92AINTRType value) {
        this.intr = value;
    }

    /**
     * 获取nxrt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F92ANXRTType }
     *     
     */
    public SeqB1F92ANXRTType getNXRT() {
        return nxrt;
    }

    /**
     * 设置nxrt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F92ANXRTType }
     *     
     */
    public void setNXRT(SeqB1F92ANXRTType value) {
        this.nxrt = value;
    }

    /**
     * 获取decl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F92ADECLType }
     *     
     */
    public SeqB1F92ADECLType getDECL() {
        return decl;
    }

    /**
     * 设置decl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F92ADECLType }
     *     
     */
    public void setDECL(SeqB1F92ADECLType value) {
        this.decl = value;
    }

    /**
     * 获取wapa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F92AWAPAType }
     *     
     */
    public SeqB1F92AWAPAType getWAPA() {
        return wapa;
    }

    /**
     * 设置wapa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F92AWAPAType }
     *     
     */
    public void setWAPA(SeqB1F92AWAPAType value) {
        this.wapa = value;
    }

}
