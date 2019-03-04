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
 * <p>SeqE1a_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PRFC" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_PRFC_Type"/>
 *         &lt;element name="NWFC" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_NWFC_Type"/>
 *         &lt;element name="INTR" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_INTR_Type"/>
 *         &lt;element name="NXRT" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_NXRT_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F92a_Type", propOrder = {
    "prfc",
    "nwfc",
    "intr",
    "nxrt"
})
public class SeqE1AF92AType
    extends ISO15022Field
{

    @XmlElement(name = "PRFC")
    protected SeqE1AF92APRFCType prfc;
    @XmlElement(name = "NWFC")
    protected SeqE1AF92ANWFCType nwfc;
    @XmlElement(name = "INTR")
    protected SeqE1AF92AINTRType intr;
    @XmlElement(name = "NXRT")
    protected SeqE1AF92ANXRTType nxrt;

    /**
     * 获取prfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92APRFCType }
     *     
     */
    public SeqE1AF92APRFCType getPRFC() {
        return prfc;
    }

    /**
     * 设置prfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92APRFCType }
     *     
     */
    public void setPRFC(SeqE1AF92APRFCType value) {
        this.prfc = value;
    }

    /**
     * 获取nwfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92ANWFCType }
     *     
     */
    public SeqE1AF92ANWFCType getNWFC() {
        return nwfc;
    }

    /**
     * 设置nwfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92ANWFCType }
     *     
     */
    public void setNWFC(SeqE1AF92ANWFCType value) {
        this.nwfc = value;
    }

    /**
     * 获取intr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92AINTRType }
     *     
     */
    public SeqE1AF92AINTRType getINTR() {
        return intr;
    }

    /**
     * 设置intr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92AINTRType }
     *     
     */
    public void setINTR(SeqE1AF92AINTRType value) {
        this.intr = value;
    }

    /**
     * 获取nxrt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92ANXRTType }
     *     
     */
    public SeqE1AF92ANXRTType getNXRT() {
        return nxrt;
    }

    /**
     * 设置nxrt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92ANXRTType }
     *     
     */
    public void setNXRT(SeqE1AF92ANXRTType value) {
        this.nxrt = value;
    }

}
