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
 * <p>SeqD_F36a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F36a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MQSO" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_MQSO_Type"/>
 *         &lt;element name="QTSO" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_QTSO_Type"/>
 *         &lt;element name="NBLT" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_NBLT_Type"/>
 *         &lt;element name="NEWD" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_NEWD_Type"/>
 *         &lt;element name="BASE" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_BASE_Type"/>
 *         &lt;element name="INCR" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_INCR_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F36a_Type", propOrder = {
    "mqso",
    "qtso",
    "nblt",
    "newd",
    "base",
    "incr"
})
public class SeqDF36AType
    extends ISO15022Field
{

    @XmlElement(name = "MQSO")
    protected SeqDF36AMQSOType mqso;
    @XmlElement(name = "QTSO")
    protected SeqDF36AQTSOType qtso;
    @XmlElement(name = "NBLT")
    protected SeqDF36ANBLTType nblt;
    @XmlElement(name = "NEWD")
    protected SeqDF36ANEWDType newd;
    @XmlElement(name = "BASE")
    protected SeqDF36ABASEType base;
    @XmlElement(name = "INCR")
    protected SeqDF36AINCRType incr;

    /**
     * 获取mqso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36AMQSOType }
     *     
     */
    public SeqDF36AMQSOType getMQSO() {
        return mqso;
    }

    /**
     * 设置mqso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36AMQSOType }
     *     
     */
    public void setMQSO(SeqDF36AMQSOType value) {
        this.mqso = value;
    }

    /**
     * 获取qtso属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36AQTSOType }
     *     
     */
    public SeqDF36AQTSOType getQTSO() {
        return qtso;
    }

    /**
     * 设置qtso属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36AQTSOType }
     *     
     */
    public void setQTSO(SeqDF36AQTSOType value) {
        this.qtso = value;
    }

    /**
     * 获取nblt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36ANBLTType }
     *     
     */
    public SeqDF36ANBLTType getNBLT() {
        return nblt;
    }

    /**
     * 设置nblt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36ANBLTType }
     *     
     */
    public void setNBLT(SeqDF36ANBLTType value) {
        this.nblt = value;
    }

    /**
     * 获取newd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36ANEWDType }
     *     
     */
    public SeqDF36ANEWDType getNEWD() {
        return newd;
    }

    /**
     * 设置newd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36ANEWDType }
     *     
     */
    public void setNEWD(SeqDF36ANEWDType value) {
        this.newd = value;
    }

    /**
     * 获取base属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36ABASEType }
     *     
     */
    public SeqDF36ABASEType getBASE() {
        return base;
    }

    /**
     * 设置base属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36ABASEType }
     *     
     */
    public void setBASE(SeqDF36ABASEType value) {
        this.base = value;
    }

    /**
     * 获取incr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36AINCRType }
     *     
     */
    public SeqDF36AINCRType getINCR() {
        return incr;
    }

    /**
     * 设置incr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36AINCRType }
     *     
     */
    public void setINCR(SeqDF36AINCRType value) {
        this.incr = value;
    }

}
