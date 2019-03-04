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
 * <p>SeqD_F92a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="RDIS" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RDIS_Type"/>
 *         &lt;element name="INTR" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_INTR_Type"/>
 *         &lt;element name="BIDI" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_BIDI_Type"/>
 *         &lt;element name="NWFC" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_NWFC_Type"/>
 *         &lt;element name="PTSC" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_PTSC_Type"/>
 *         &lt;element name="PRFC" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_PRFC_Type"/>
 *         &lt;element name="RINR" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RINR_Type"/>
 *         &lt;element name="RSPR" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RSPR_Type"/>
 *         &lt;element name="SHRT" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_SHRT_Type"/>
 *         &lt;element name="RLOS" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RLOS_Type"/>
 *         &lt;element name="DEVI" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_DEVI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F92a_Type", propOrder = {
    "rdis",
    "intr",
    "bidi",
    "nwfc",
    "ptsc",
    "prfc",
    "rinr",
    "rspr",
    "shrt",
    "rlos",
    "devi"
})
public class SeqDF92AType
    extends ISO15022Field
{

    @XmlElement(name = "RDIS")
    protected SeqDF92ARDISType rdis;
    @XmlElement(name = "INTR")
    protected SeqDF92AINTRType intr;
    @XmlElement(name = "BIDI")
    protected SeqDF92ABIDIType bidi;
    @XmlElement(name = "NWFC")
    protected SeqDF92ANWFCType nwfc;
    @XmlElement(name = "PTSC")
    protected SeqDF92APTSCType ptsc;
    @XmlElement(name = "PRFC")
    protected SeqDF92APRFCType prfc;
    @XmlElement(name = "RINR")
    protected SeqDF92ARINRType rinr;
    @XmlElement(name = "RSPR")
    protected SeqDF92ARSPRType rspr;
    @XmlElement(name = "SHRT")
    protected SeqDF92ASHRTType shrt;
    @XmlElement(name = "RLOS")
    protected SeqDF92ARLOSType rlos;
    @XmlElement(name = "DEVI")
    protected SeqDF92ADEVIType devi;

    /**
     * 获取rdis属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARDISType }
     *     
     */
    public SeqDF92ARDISType getRDIS() {
        return rdis;
    }

    /**
     * 设置rdis属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARDISType }
     *     
     */
    public void setRDIS(SeqDF92ARDISType value) {
        this.rdis = value;
    }

    /**
     * 获取intr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92AINTRType }
     *     
     */
    public SeqDF92AINTRType getINTR() {
        return intr;
    }

    /**
     * 设置intr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92AINTRType }
     *     
     */
    public void setINTR(SeqDF92AINTRType value) {
        this.intr = value;
    }

    /**
     * 获取bidi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ABIDIType }
     *     
     */
    public SeqDF92ABIDIType getBIDI() {
        return bidi;
    }

    /**
     * 设置bidi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ABIDIType }
     *     
     */
    public void setBIDI(SeqDF92ABIDIType value) {
        this.bidi = value;
    }

    /**
     * 获取nwfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ANWFCType }
     *     
     */
    public SeqDF92ANWFCType getNWFC() {
        return nwfc;
    }

    /**
     * 设置nwfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ANWFCType }
     *     
     */
    public void setNWFC(SeqDF92ANWFCType value) {
        this.nwfc = value;
    }

    /**
     * 获取ptsc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92APTSCType }
     *     
     */
    public SeqDF92APTSCType getPTSC() {
        return ptsc;
    }

    /**
     * 设置ptsc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92APTSCType }
     *     
     */
    public void setPTSC(SeqDF92APTSCType value) {
        this.ptsc = value;
    }

    /**
     * 获取prfc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92APRFCType }
     *     
     */
    public SeqDF92APRFCType getPRFC() {
        return prfc;
    }

    /**
     * 设置prfc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92APRFCType }
     *     
     */
    public void setPRFC(SeqDF92APRFCType value) {
        this.prfc = value;
    }

    /**
     * 获取rinr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARINRType }
     *     
     */
    public SeqDF92ARINRType getRINR() {
        return rinr;
    }

    /**
     * 设置rinr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARINRType }
     *     
     */
    public void setRINR(SeqDF92ARINRType value) {
        this.rinr = value;
    }

    /**
     * 获取rspr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARSPRType }
     *     
     */
    public SeqDF92ARSPRType getRSPR() {
        return rspr;
    }

    /**
     * 设置rspr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARSPRType }
     *     
     */
    public void setRSPR(SeqDF92ARSPRType value) {
        this.rspr = value;
    }

    /**
     * 获取shrt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ASHRTType }
     *     
     */
    public SeqDF92ASHRTType getSHRT() {
        return shrt;
    }

    /**
     * 设置shrt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ASHRTType }
     *     
     */
    public void setSHRT(SeqDF92ASHRTType value) {
        this.shrt = value;
    }

    /**
     * 获取rlos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARLOSType }
     *     
     */
    public SeqDF92ARLOSType getRLOS() {
        return rlos;
    }

    /**
     * 设置rlos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARLOSType }
     *     
     */
    public void setRLOS(SeqDF92ARLOSType value) {
        this.rlos = value;
    }

    /**
     * 获取devi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ADEVIType }
     *     
     */
    public SeqDF92ADEVIType getDEVI() {
        return devi;
    }

    /**
     * 设置devi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ADEVIType }
     *     
     */
    public void setDEVI(SeqDF92ADEVIType value) {
        this.devi = value;
    }

}
