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
 * <p>SeqE1a_F98a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="COUP" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_COUP_Type"/>
 *         &lt;element name="FRNR" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_FRNR_Type"/>
 *         &lt;element name="MATU" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_MATU_Type"/>
 *         &lt;element name="ISSU" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_ISSU_Type"/>
 *         &lt;element name="CALD" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_CALD_Type"/>
 *         &lt;element name="PUTT" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_PUTT_Type"/>
 *         &lt;element name="DDTE" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_DDTE_Type"/>
 *         &lt;element name="CONV" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_CONV_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F98a_Type", propOrder = {
    "coup",
    "frnr",
    "matu",
    "issu",
    "cald",
    "putt",
    "ddte",
    "conv"
})
public class SeqE1AF98AType
    extends ISO15022Field
{

    @XmlElement(name = "COUP")
    protected SeqE1AF98ACOUPType coup;
    @XmlElement(name = "FRNR")
    protected SeqE1AF98AFRNRType frnr;
    @XmlElement(name = "MATU")
    protected SeqE1AF98AMATUType matu;
    @XmlElement(name = "ISSU")
    protected SeqE1AF98AISSUType issu;
    @XmlElement(name = "CALD")
    protected SeqE1AF98ACALDType cald;
    @XmlElement(name = "PUTT")
    protected SeqE1AF98APUTTType putt;
    @XmlElement(name = "DDTE")
    protected SeqE1AF98ADDTEType ddte;
    @XmlElement(name = "CONV")
    protected SeqE1AF98ACONVType conv;

    /**
     * 获取coup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ACOUPType }
     *     
     */
    public SeqE1AF98ACOUPType getCOUP() {
        return coup;
    }

    /**
     * 设置coup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ACOUPType }
     *     
     */
    public void setCOUP(SeqE1AF98ACOUPType value) {
        this.coup = value;
    }

    /**
     * 获取frnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98AFRNRType }
     *     
     */
    public SeqE1AF98AFRNRType getFRNR() {
        return frnr;
    }

    /**
     * 设置frnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98AFRNRType }
     *     
     */
    public void setFRNR(SeqE1AF98AFRNRType value) {
        this.frnr = value;
    }

    /**
     * 获取matu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98AMATUType }
     *     
     */
    public SeqE1AF98AMATUType getMATU() {
        return matu;
    }

    /**
     * 设置matu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98AMATUType }
     *     
     */
    public void setMATU(SeqE1AF98AMATUType value) {
        this.matu = value;
    }

    /**
     * 获取issu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98AISSUType }
     *     
     */
    public SeqE1AF98AISSUType getISSU() {
        return issu;
    }

    /**
     * 设置issu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98AISSUType }
     *     
     */
    public void setISSU(SeqE1AF98AISSUType value) {
        this.issu = value;
    }

    /**
     * 获取cald属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ACALDType }
     *     
     */
    public SeqE1AF98ACALDType getCALD() {
        return cald;
    }

    /**
     * 设置cald属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ACALDType }
     *     
     */
    public void setCALD(SeqE1AF98ACALDType value) {
        this.cald = value;
    }

    /**
     * 获取putt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98APUTTType }
     *     
     */
    public SeqE1AF98APUTTType getPUTT() {
        return putt;
    }

    /**
     * 设置putt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98APUTTType }
     *     
     */
    public void setPUTT(SeqE1AF98APUTTType value) {
        this.putt = value;
    }

    /**
     * 获取ddte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ADDTEType }
     *     
     */
    public SeqE1AF98ADDTEType getDDTE() {
        return ddte;
    }

    /**
     * 设置ddte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ADDTEType }
     *     
     */
    public void setDDTE(SeqE1AF98ADDTEType value) {
        this.ddte = value;
    }

    /**
     * 获取conv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ACONVType }
     *     
     */
    public SeqE1AF98ACONVType getCONV() {
        return conv;
    }

    /**
     * 设置conv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ACONVType }
     *     
     */
    public void setCONV(SeqE1AF98ACONVType value) {
        this.conv = value;
    }

}
