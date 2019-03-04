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
 * <p>SeqB1_F98a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="COUP" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_COUP_Type"/>
 *         &lt;element name="EXPI" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_EXPI_Type"/>
 *         &lt;element name="FRNR" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_FRNR_Type"/>
 *         &lt;element name="MATU" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_MATU_Type"/>
 *         &lt;element name="ISSU" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_ISSU_Type"/>
 *         &lt;element name="CALD" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_CALD_Type"/>
 *         &lt;element name="PUTT" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_PUTT_Type"/>
 *         &lt;element name="DDTE" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_DDTE_Type"/>
 *         &lt;element name="CONV" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_CONV_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F98a_Type", propOrder = {
    "coup",
    "expi",
    "frnr",
    "matu",
    "issu",
    "cald",
    "putt",
    "ddte",
    "conv"
})
public class SeqB1F98AType
    extends ISO15022Field
{

    @XmlElement(name = "COUP")
    protected SeqB1F98ACOUPType coup;
    @XmlElement(name = "EXPI")
    protected SeqB1F98AEXPIType expi;
    @XmlElement(name = "FRNR")
    protected SeqB1F98AFRNRType frnr;
    @XmlElement(name = "MATU")
    protected SeqB1F98AMATUType matu;
    @XmlElement(name = "ISSU")
    protected SeqB1F98AISSUType issu;
    @XmlElement(name = "CALD")
    protected SeqB1F98ACALDType cald;
    @XmlElement(name = "PUTT")
    protected SeqB1F98APUTTType putt;
    @XmlElement(name = "DDTE")
    protected SeqB1F98ADDTEType ddte;
    @XmlElement(name = "CONV")
    protected SeqB1F98ACONVType conv;

    /**
     * 获取coup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98ACOUPType }
     *     
     */
    public SeqB1F98ACOUPType getCOUP() {
        return coup;
    }

    /**
     * 设置coup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98ACOUPType }
     *     
     */
    public void setCOUP(SeqB1F98ACOUPType value) {
        this.coup = value;
    }

    /**
     * 获取expi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98AEXPIType }
     *     
     */
    public SeqB1F98AEXPIType getEXPI() {
        return expi;
    }

    /**
     * 设置expi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98AEXPIType }
     *     
     */
    public void setEXPI(SeqB1F98AEXPIType value) {
        this.expi = value;
    }

    /**
     * 获取frnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98AFRNRType }
     *     
     */
    public SeqB1F98AFRNRType getFRNR() {
        return frnr;
    }

    /**
     * 设置frnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98AFRNRType }
     *     
     */
    public void setFRNR(SeqB1F98AFRNRType value) {
        this.frnr = value;
    }

    /**
     * 获取matu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98AMATUType }
     *     
     */
    public SeqB1F98AMATUType getMATU() {
        return matu;
    }

    /**
     * 设置matu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98AMATUType }
     *     
     */
    public void setMATU(SeqB1F98AMATUType value) {
        this.matu = value;
    }

    /**
     * 获取issu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98AISSUType }
     *     
     */
    public SeqB1F98AISSUType getISSU() {
        return issu;
    }

    /**
     * 设置issu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98AISSUType }
     *     
     */
    public void setISSU(SeqB1F98AISSUType value) {
        this.issu = value;
    }

    /**
     * 获取cald属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98ACALDType }
     *     
     */
    public SeqB1F98ACALDType getCALD() {
        return cald;
    }

    /**
     * 设置cald属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98ACALDType }
     *     
     */
    public void setCALD(SeqB1F98ACALDType value) {
        this.cald = value;
    }

    /**
     * 获取putt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98APUTTType }
     *     
     */
    public SeqB1F98APUTTType getPUTT() {
        return putt;
    }

    /**
     * 设置putt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98APUTTType }
     *     
     */
    public void setPUTT(SeqB1F98APUTTType value) {
        this.putt = value;
    }

    /**
     * 获取ddte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98ADDTEType }
     *     
     */
    public SeqB1F98ADDTEType getDDTE() {
        return ddte;
    }

    /**
     * 设置ddte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98ADDTEType }
     *     
     */
    public void setDDTE(SeqB1F98ADDTEType value) {
        this.ddte = value;
    }

    /**
     * 获取conv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F98ACONVType }
     *     
     */
    public SeqB1F98ACONVType getCONV() {
        return conv;
    }

    /**
     * 设置conv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F98ACONVType }
     *     
     */
    public void setCONV(SeqB1F98ACONVType value) {
        this.conv = value;
    }

}
