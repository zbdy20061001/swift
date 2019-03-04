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
 * <p>SeqE1_F90a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="INDC" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_INDC_Type"/>
 *         &lt;element name="MRKT" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_MRKT_Type"/>
 *         &lt;element name="CINL" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_CINL_Type"/>
 *         &lt;element name="OFFR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_OFFR_Type"/>
 *         &lt;element name="PRPP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_PRPP_Type"/>
 *         &lt;element name="CAVA" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_CAVA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F90a_Type", propOrder = {
    "indc",
    "mrkt",
    "cinl",
    "offr",
    "prpp",
    "cava"
})
public class SeqE1F90AType
    extends ISO15022Field
{

    @XmlElement(name = "INDC")
    protected SeqE1F90AINDCType indc;
    @XmlElement(name = "MRKT")
    protected SeqE1F90AMRKTType mrkt;
    @XmlElement(name = "CINL")
    protected SeqE1F90ACINLType cinl;
    @XmlElement(name = "OFFR")
    protected SeqE1F90AOFFRType offr;
    @XmlElement(name = "PRPP")
    protected SeqE1F90APRPPType prpp;
    @XmlElement(name = "CAVA")
    protected SeqE1F90ACAVAType cava;

    /**
     * 获取indc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90AINDCType }
     *     
     */
    public SeqE1F90AINDCType getINDC() {
        return indc;
    }

    /**
     * 设置indc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90AINDCType }
     *     
     */
    public void setINDC(SeqE1F90AINDCType value) {
        this.indc = value;
    }

    /**
     * 获取mrkt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90AMRKTType }
     *     
     */
    public SeqE1F90AMRKTType getMRKT() {
        return mrkt;
    }

    /**
     * 设置mrkt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90AMRKTType }
     *     
     */
    public void setMRKT(SeqE1F90AMRKTType value) {
        this.mrkt = value;
    }

    /**
     * 获取cinl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90ACINLType }
     *     
     */
    public SeqE1F90ACINLType getCINL() {
        return cinl;
    }

    /**
     * 设置cinl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90ACINLType }
     *     
     */
    public void setCINL(SeqE1F90ACINLType value) {
        this.cinl = value;
    }

    /**
     * 获取offr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90AOFFRType }
     *     
     */
    public SeqE1F90AOFFRType getOFFR() {
        return offr;
    }

    /**
     * 设置offr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90AOFFRType }
     *     
     */
    public void setOFFR(SeqE1F90AOFFRType value) {
        this.offr = value;
    }

    /**
     * 获取prpp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90APRPPType }
     *     
     */
    public SeqE1F90APRPPType getPRPP() {
        return prpp;
    }

    /**
     * 设置prpp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90APRPPType }
     *     
     */
    public void setPRPP(SeqE1F90APRPPType value) {
        this.prpp = value;
    }

    /**
     * 获取cava属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90ACAVAType }
     *     
     */
    public SeqE1F90ACAVAType getCAVA() {
        return cava;
    }

    /**
     * 设置cava属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90ACAVAType }
     *     
     */
    public void setCAVA(SeqE1F90ACAVAType value) {
        this.cava = value;
    }

}
