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
 * <p>SeqB2_F93a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB2_F93a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ELIG" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_ELIG_Type"/>
 *         &lt;element name="BLOK" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_BLOK_Type"/>
 *         &lt;element name="BORR" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_BORR_Type"/>
 *         &lt;element name="COLI" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_COLI_Type"/>
 *         &lt;element name="COLO" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_COLO_Type"/>
 *         &lt;element name="LOAN" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_LOAN_Type"/>
 *         &lt;element name="PEND" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_PEND_Type"/>
 *         &lt;element name="PENR" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_PENR_Type"/>
 *         &lt;element name="REGO" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_REGO_Type"/>
 *         &lt;element name="SETT" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_SETT_Type"/>
 *         &lt;element name="SPOS" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_SPOS_Type"/>
 *         &lt;element name="TRAD" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_TRAD_Type"/>
 *         &lt;element name="TRAN" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_TRAN_Type"/>
 *         &lt;element name="NOMI" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_NOMI_Type"/>
 *         &lt;element name="UNBA" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_UNBA_Type"/>
 *         &lt;element name="INBA" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_INBA_Type"/>
 *         &lt;element name="OBAL" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_OBAL_Type"/>
 *         &lt;element name="AFFB" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_AFFB_Type"/>
 *         &lt;element name="UNAF" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_UNAF_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_F93a_Type", propOrder = {
    "elig",
    "blok",
    "borr",
    "coli",
    "colo",
    "loan",
    "pend",
    "penr",
    "rego",
    "sett",
    "spos",
    "trad",
    "tran",
    "nomi",
    "unba",
    "inba",
    "obal",
    "affb",
    "unaf"
})
public class SeqB2F93AType
    extends ISO15022Field
{

    @XmlElement(name = "ELIG")
    protected SeqB2F93AELIGType elig;
    @XmlElement(name = "BLOK")
    protected SeqB2F93ABLOKType blok;
    @XmlElement(name = "BORR")
    protected SeqB2F93ABORRType borr;
    @XmlElement(name = "COLI")
    protected SeqB2F93ACOLIType coli;
    @XmlElement(name = "COLO")
    protected SeqB2F93ACOLOType colo;
    @XmlElement(name = "LOAN")
    protected SeqB2F93ALOANType loan;
    @XmlElement(name = "PEND")
    protected SeqB2F93APENDType pend;
    @XmlElement(name = "PENR")
    protected SeqB2F93APENRType penr;
    @XmlElement(name = "REGO")
    protected SeqB2F93AREGOType rego;
    @XmlElement(name = "SETT")
    protected SeqB2F93ASETTType sett;
    @XmlElement(name = "SPOS")
    protected SeqB2F93ASPOSType spos;
    @XmlElement(name = "TRAD")
    protected SeqB2F93ATRADType trad;
    @XmlElement(name = "TRAN")
    protected SeqB2F93ATRANType tran;
    @XmlElement(name = "NOMI")
    protected SeqB2F93ANOMIType nomi;
    @XmlElement(name = "UNBA")
    protected SeqB2F93AUNBAType unba;
    @XmlElement(name = "INBA")
    protected SeqB2F93AINBAType inba;
    @XmlElement(name = "OBAL")
    protected SeqB2F93AOBALType obal;
    @XmlElement(name = "AFFB")
    protected SeqB2F93AAFFBType affb;
    @XmlElement(name = "UNAF")
    protected SeqB2F93AUNAFType unaf;

    /**
     * 获取elig属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AELIGType }
     *     
     */
    public SeqB2F93AELIGType getELIG() {
        return elig;
    }

    /**
     * 设置elig属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AELIGType }
     *     
     */
    public void setELIG(SeqB2F93AELIGType value) {
        this.elig = value;
    }

    /**
     * 获取blok属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ABLOKType }
     *     
     */
    public SeqB2F93ABLOKType getBLOK() {
        return blok;
    }

    /**
     * 设置blok属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ABLOKType }
     *     
     */
    public void setBLOK(SeqB2F93ABLOKType value) {
        this.blok = value;
    }

    /**
     * 获取borr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ABORRType }
     *     
     */
    public SeqB2F93ABORRType getBORR() {
        return borr;
    }

    /**
     * 设置borr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ABORRType }
     *     
     */
    public void setBORR(SeqB2F93ABORRType value) {
        this.borr = value;
    }

    /**
     * 获取coli属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ACOLIType }
     *     
     */
    public SeqB2F93ACOLIType getCOLI() {
        return coli;
    }

    /**
     * 设置coli属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ACOLIType }
     *     
     */
    public void setCOLI(SeqB2F93ACOLIType value) {
        this.coli = value;
    }

    /**
     * 获取colo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ACOLOType }
     *     
     */
    public SeqB2F93ACOLOType getCOLO() {
        return colo;
    }

    /**
     * 设置colo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ACOLOType }
     *     
     */
    public void setCOLO(SeqB2F93ACOLOType value) {
        this.colo = value;
    }

    /**
     * 获取loan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ALOANType }
     *     
     */
    public SeqB2F93ALOANType getLOAN() {
        return loan;
    }

    /**
     * 设置loan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ALOANType }
     *     
     */
    public void setLOAN(SeqB2F93ALOANType value) {
        this.loan = value;
    }

    /**
     * 获取pend属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93APENDType }
     *     
     */
    public SeqB2F93APENDType getPEND() {
        return pend;
    }

    /**
     * 设置pend属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93APENDType }
     *     
     */
    public void setPEND(SeqB2F93APENDType value) {
        this.pend = value;
    }

    /**
     * 获取penr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93APENRType }
     *     
     */
    public SeqB2F93APENRType getPENR() {
        return penr;
    }

    /**
     * 设置penr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93APENRType }
     *     
     */
    public void setPENR(SeqB2F93APENRType value) {
        this.penr = value;
    }

    /**
     * 获取rego属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AREGOType }
     *     
     */
    public SeqB2F93AREGOType getREGO() {
        return rego;
    }

    /**
     * 设置rego属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AREGOType }
     *     
     */
    public void setREGO(SeqB2F93AREGOType value) {
        this.rego = value;
    }

    /**
     * 获取sett属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ASETTType }
     *     
     */
    public SeqB2F93ASETTType getSETT() {
        return sett;
    }

    /**
     * 设置sett属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ASETTType }
     *     
     */
    public void setSETT(SeqB2F93ASETTType value) {
        this.sett = value;
    }

    /**
     * 获取spos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ASPOSType }
     *     
     */
    public SeqB2F93ASPOSType getSPOS() {
        return spos;
    }

    /**
     * 设置spos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ASPOSType }
     *     
     */
    public void setSPOS(SeqB2F93ASPOSType value) {
        this.spos = value;
    }

    /**
     * 获取trad属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ATRADType }
     *     
     */
    public SeqB2F93ATRADType getTRAD() {
        return trad;
    }

    /**
     * 设置trad属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ATRADType }
     *     
     */
    public void setTRAD(SeqB2F93ATRADType value) {
        this.trad = value;
    }

    /**
     * 获取tran属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ATRANType }
     *     
     */
    public SeqB2F93ATRANType getTRAN() {
        return tran;
    }

    /**
     * 设置tran属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ATRANType }
     *     
     */
    public void setTRAN(SeqB2F93ATRANType value) {
        this.tran = value;
    }

    /**
     * 获取nomi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93ANOMIType }
     *     
     */
    public SeqB2F93ANOMIType getNOMI() {
        return nomi;
    }

    /**
     * 设置nomi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93ANOMIType }
     *     
     */
    public void setNOMI(SeqB2F93ANOMIType value) {
        this.nomi = value;
    }

    /**
     * 获取unba属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AUNBAType }
     *     
     */
    public SeqB2F93AUNBAType getUNBA() {
        return unba;
    }

    /**
     * 设置unba属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AUNBAType }
     *     
     */
    public void setUNBA(SeqB2F93AUNBAType value) {
        this.unba = value;
    }

    /**
     * 获取inba属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AINBAType }
     *     
     */
    public SeqB2F93AINBAType getINBA() {
        return inba;
    }

    /**
     * 设置inba属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AINBAType }
     *     
     */
    public void setINBA(SeqB2F93AINBAType value) {
        this.inba = value;
    }

    /**
     * 获取obal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AOBALType }
     *     
     */
    public SeqB2F93AOBALType getOBAL() {
        return obal;
    }

    /**
     * 设置obal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AOBALType }
     *     
     */
    public void setOBAL(SeqB2F93AOBALType value) {
        this.obal = value;
    }

    /**
     * 获取affb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AAFFBType }
     *     
     */
    public SeqB2F93AAFFBType getAFFB() {
        return affb;
    }

    /**
     * 设置affb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AAFFBType }
     *     
     */
    public void setAFFB(SeqB2F93AAFFBType value) {
        this.affb = value;
    }

    /**
     * 获取unaf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F93AUNAFType }
     *     
     */
    public SeqB2F93AUNAFType getUNAF() {
        return unaf;
    }

    /**
     * 设置unaf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F93AUNAFType }
     *     
     */
    public void setUNAF(SeqB2F93AUNAFType value) {
        this.unaf = value;
    }

}
