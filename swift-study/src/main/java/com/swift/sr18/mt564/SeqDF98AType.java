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
 * <p>SeqD_F98a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ANOU" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_ANOU_Type"/>
 *         &lt;element name="CERT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_CERT_Type"/>
 *         &lt;element name="XDTE" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_XDTE_Type"/>
 *         &lt;element name="EFFD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_EFFD_Type"/>
 *         &lt;element name="FDAT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_FDAT_Type"/>
 *         &lt;element name="PROD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_PROD_Type"/>
 *         &lt;element name="REGI" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_REGI_Type"/>
 *         &lt;element name="RESU" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_RESU_Type"/>
 *         &lt;element name="SPLT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_SPLT_Type"/>
 *         &lt;element name="MEET" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_MEET_Type"/>
 *         &lt;element name="RDTE" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_RDTE_Type"/>
 *         &lt;element name="TAXB" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_TAXB_Type"/>
 *         &lt;element name="TSDT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_TSDT_Type"/>
 *         &lt;element name="LOTO" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_LOTO_Type"/>
 *         &lt;element name="UNCO" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_UNCO_Type"/>
 *         &lt;element name="WUCO" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_WUCO_Type"/>
 *         &lt;element name="MET2" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_MET2_Type"/>
 *         &lt;element name="MET3" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_MET3_Type"/>
 *         &lt;element name="EQUL" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_EQUL_Type"/>
 *         &lt;element name="ECDT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_ECDT_Type"/>
 *         &lt;element name="IFIX" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_IFIX_Type"/>
 *         &lt;element name="MFIX" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_MFIX_Type"/>
 *         &lt;element name="COAP" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_COAP_Type"/>
 *         &lt;element name="MATU" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_MATU_Type"/>
 *         &lt;element name="OAPD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_OAPD_Type"/>
 *         &lt;element name="SXDT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_SXDT_Type"/>
 *         &lt;element name="GUPA" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_GUPA_Type"/>
 *         &lt;element name="ECPD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_ECPD_Type"/>
 *         &lt;element name="LAPD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_LAPD_Type"/>
 *         &lt;element name="MCTD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_MCTD_Type"/>
 *         &lt;element name="PAYD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_PAYD_Type"/>
 *         &lt;element name="TPDT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_TPDT_Type"/>
 *         &lt;element name="ETPD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_ETPD_Type"/>
 *         &lt;element name="PLDT" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_PLDT_Type"/>
 *         &lt;element name="FILL" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_FILL_Type"/>
 *         &lt;element name="HEAR" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_HEAR_Type"/>
 *         &lt;element name="ECRD" type="{urn:swift:xsd:fin.564.2018}SeqD_F98a_ECRD_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F98a_Type", propOrder = {
    "anou",
    "cert",
    "xdte",
    "effd",
    "fdat",
    "prod",
    "regi",
    "resu",
    "splt",
    "meet",
    "rdte",
    "taxb",
    "tsdt",
    "loto",
    "unco",
    "wuco",
    "met2",
    "met3",
    "equl",
    "ecdt",
    "ifix",
    "mfix",
    "coap",
    "matu",
    "oapd",
    "sxdt",
    "gupa",
    "ecpd",
    "lapd",
    "mctd",
    "payd",
    "tpdt",
    "etpd",
    "pldt",
    "fill",
    "hear",
    "ecrd"
})
public class SeqDF98AType
    extends ISO15022Field
{

    @XmlElement(name = "ANOU")
    protected SeqDF98AANOUType anou;
    @XmlElement(name = "CERT")
    protected SeqDF98ACERTType cert;
    @XmlElement(name = "XDTE")
    protected SeqDF98AXDTEType xdte;
    @XmlElement(name = "EFFD")
    protected SeqDF98AEFFDType effd;
    @XmlElement(name = "FDAT")
    protected SeqDF98AFDATType fdat;
    @XmlElement(name = "PROD")
    protected SeqDF98APRODType prod;
    @XmlElement(name = "REGI")
    protected SeqDF98AREGIType regi;
    @XmlElement(name = "RESU")
    protected SeqDF98ARESUType resu;
    @XmlElement(name = "SPLT")
    protected SeqDF98ASPLTType splt;
    @XmlElement(name = "MEET")
    protected SeqDF98AMEETType meet;
    @XmlElement(name = "RDTE")
    protected SeqDF98ARDTEType rdte;
    @XmlElement(name = "TAXB")
    protected SeqDF98ATAXBType taxb;
    @XmlElement(name = "TSDT")
    protected SeqDF98ATSDTType tsdt;
    @XmlElement(name = "LOTO")
    protected SeqDF98ALOTOType loto;
    @XmlElement(name = "UNCO")
    protected SeqDF98AUNCOType unco;
    @XmlElement(name = "WUCO")
    protected SeqDF98AWUCOType wuco;
    @XmlElement(name = "MET2")
    protected SeqDF98AMET2Type met2;
    @XmlElement(name = "MET3")
    protected SeqDF98AMET3Type met3;
    @XmlElement(name = "EQUL")
    protected SeqDF98AEQULType equl;
    @XmlElement(name = "ECDT")
    protected SeqDF98AECDTType ecdt;
    @XmlElement(name = "IFIX")
    protected SeqDF98AIFIXType ifix;
    @XmlElement(name = "MFIX")
    protected SeqDF98AMFIXType mfix;
    @XmlElement(name = "COAP")
    protected SeqDF98ACOAPType coap;
    @XmlElement(name = "MATU")
    protected SeqDF98AMATUType matu;
    @XmlElement(name = "OAPD")
    protected SeqDF98AOAPDType oapd;
    @XmlElement(name = "SXDT")
    protected SeqDF98ASXDTType sxdt;
    @XmlElement(name = "GUPA")
    protected SeqDF98AGUPAType gupa;
    @XmlElement(name = "ECPD")
    protected SeqDF98AECPDType ecpd;
    @XmlElement(name = "LAPD")
    protected SeqDF98ALAPDType lapd;
    @XmlElement(name = "MCTD")
    protected SeqDF98AMCTDType mctd;
    @XmlElement(name = "PAYD")
    protected SeqDF98APAYDType payd;
    @XmlElement(name = "TPDT")
    protected SeqDF98ATPDTType tpdt;
    @XmlElement(name = "ETPD")
    protected SeqDF98AETPDType etpd;
    @XmlElement(name = "PLDT")
    protected SeqDF98APLDTType pldt;
    @XmlElement(name = "FILL")
    protected SeqDF98AFILLType fill;
    @XmlElement(name = "HEAR")
    protected SeqDF98AHEARType hear;
    @XmlElement(name = "ECRD")
    protected SeqDF98AECRDType ecrd;

    /**
     * 获取anou属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AANOUType }
     *     
     */
    public SeqDF98AANOUType getANOU() {
        return anou;
    }

    /**
     * 设置anou属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AANOUType }
     *     
     */
    public void setANOU(SeqDF98AANOUType value) {
        this.anou = value;
    }

    /**
     * 获取cert属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ACERTType }
     *     
     */
    public SeqDF98ACERTType getCERT() {
        return cert;
    }

    /**
     * 设置cert属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ACERTType }
     *     
     */
    public void setCERT(SeqDF98ACERTType value) {
        this.cert = value;
    }

    /**
     * 获取xdte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AXDTEType }
     *     
     */
    public SeqDF98AXDTEType getXDTE() {
        return xdte;
    }

    /**
     * 设置xdte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AXDTEType }
     *     
     */
    public void setXDTE(SeqDF98AXDTEType value) {
        this.xdte = value;
    }

    /**
     * 获取effd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AEFFDType }
     *     
     */
    public SeqDF98AEFFDType getEFFD() {
        return effd;
    }

    /**
     * 设置effd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AEFFDType }
     *     
     */
    public void setEFFD(SeqDF98AEFFDType value) {
        this.effd = value;
    }

    /**
     * 获取fdat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AFDATType }
     *     
     */
    public SeqDF98AFDATType getFDAT() {
        return fdat;
    }

    /**
     * 设置fdat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AFDATType }
     *     
     */
    public void setFDAT(SeqDF98AFDATType value) {
        this.fdat = value;
    }

    /**
     * 获取prod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98APRODType }
     *     
     */
    public SeqDF98APRODType getPROD() {
        return prod;
    }

    /**
     * 设置prod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98APRODType }
     *     
     */
    public void setPROD(SeqDF98APRODType value) {
        this.prod = value;
    }

    /**
     * 获取regi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AREGIType }
     *     
     */
    public SeqDF98AREGIType getREGI() {
        return regi;
    }

    /**
     * 设置regi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AREGIType }
     *     
     */
    public void setREGI(SeqDF98AREGIType value) {
        this.regi = value;
    }

    /**
     * 获取resu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ARESUType }
     *     
     */
    public SeqDF98ARESUType getRESU() {
        return resu;
    }

    /**
     * 设置resu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ARESUType }
     *     
     */
    public void setRESU(SeqDF98ARESUType value) {
        this.resu = value;
    }

    /**
     * 获取splt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ASPLTType }
     *     
     */
    public SeqDF98ASPLTType getSPLT() {
        return splt;
    }

    /**
     * 设置splt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ASPLTType }
     *     
     */
    public void setSPLT(SeqDF98ASPLTType value) {
        this.splt = value;
    }

    /**
     * 获取meet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AMEETType }
     *     
     */
    public SeqDF98AMEETType getMEET() {
        return meet;
    }

    /**
     * 设置meet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AMEETType }
     *     
     */
    public void setMEET(SeqDF98AMEETType value) {
        this.meet = value;
    }

    /**
     * 获取rdte属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ARDTEType }
     *     
     */
    public SeqDF98ARDTEType getRDTE() {
        return rdte;
    }

    /**
     * 设置rdte属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ARDTEType }
     *     
     */
    public void setRDTE(SeqDF98ARDTEType value) {
        this.rdte = value;
    }

    /**
     * 获取taxb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ATAXBType }
     *     
     */
    public SeqDF98ATAXBType getTAXB() {
        return taxb;
    }

    /**
     * 设置taxb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ATAXBType }
     *     
     */
    public void setTAXB(SeqDF98ATAXBType value) {
        this.taxb = value;
    }

    /**
     * 获取tsdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ATSDTType }
     *     
     */
    public SeqDF98ATSDTType getTSDT() {
        return tsdt;
    }

    /**
     * 设置tsdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ATSDTType }
     *     
     */
    public void setTSDT(SeqDF98ATSDTType value) {
        this.tsdt = value;
    }

    /**
     * 获取loto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ALOTOType }
     *     
     */
    public SeqDF98ALOTOType getLOTO() {
        return loto;
    }

    /**
     * 设置loto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ALOTOType }
     *     
     */
    public void setLOTO(SeqDF98ALOTOType value) {
        this.loto = value;
    }

    /**
     * 获取unco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AUNCOType }
     *     
     */
    public SeqDF98AUNCOType getUNCO() {
        return unco;
    }

    /**
     * 设置unco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AUNCOType }
     *     
     */
    public void setUNCO(SeqDF98AUNCOType value) {
        this.unco = value;
    }

    /**
     * 获取wuco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AWUCOType }
     *     
     */
    public SeqDF98AWUCOType getWUCO() {
        return wuco;
    }

    /**
     * 设置wuco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AWUCOType }
     *     
     */
    public void setWUCO(SeqDF98AWUCOType value) {
        this.wuco = value;
    }

    /**
     * 获取met2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AMET2Type }
     *     
     */
    public SeqDF98AMET2Type getMET2() {
        return met2;
    }

    /**
     * 设置met2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AMET2Type }
     *     
     */
    public void setMET2(SeqDF98AMET2Type value) {
        this.met2 = value;
    }

    /**
     * 获取met3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AMET3Type }
     *     
     */
    public SeqDF98AMET3Type getMET3() {
        return met3;
    }

    /**
     * 设置met3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AMET3Type }
     *     
     */
    public void setMET3(SeqDF98AMET3Type value) {
        this.met3 = value;
    }

    /**
     * 获取equl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AEQULType }
     *     
     */
    public SeqDF98AEQULType getEQUL() {
        return equl;
    }

    /**
     * 设置equl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AEQULType }
     *     
     */
    public void setEQUL(SeqDF98AEQULType value) {
        this.equl = value;
    }

    /**
     * 获取ecdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AECDTType }
     *     
     */
    public SeqDF98AECDTType getECDT() {
        return ecdt;
    }

    /**
     * 设置ecdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AECDTType }
     *     
     */
    public void setECDT(SeqDF98AECDTType value) {
        this.ecdt = value;
    }

    /**
     * 获取ifix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AIFIXType }
     *     
     */
    public SeqDF98AIFIXType getIFIX() {
        return ifix;
    }

    /**
     * 设置ifix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AIFIXType }
     *     
     */
    public void setIFIX(SeqDF98AIFIXType value) {
        this.ifix = value;
    }

    /**
     * 获取mfix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AMFIXType }
     *     
     */
    public SeqDF98AMFIXType getMFIX() {
        return mfix;
    }

    /**
     * 设置mfix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AMFIXType }
     *     
     */
    public void setMFIX(SeqDF98AMFIXType value) {
        this.mfix = value;
    }

    /**
     * 获取coap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ACOAPType }
     *     
     */
    public SeqDF98ACOAPType getCOAP() {
        return coap;
    }

    /**
     * 设置coap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ACOAPType }
     *     
     */
    public void setCOAP(SeqDF98ACOAPType value) {
        this.coap = value;
    }

    /**
     * 获取matu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AMATUType }
     *     
     */
    public SeqDF98AMATUType getMATU() {
        return matu;
    }

    /**
     * 设置matu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AMATUType }
     *     
     */
    public void setMATU(SeqDF98AMATUType value) {
        this.matu = value;
    }

    /**
     * 获取oapd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AOAPDType }
     *     
     */
    public SeqDF98AOAPDType getOAPD() {
        return oapd;
    }

    /**
     * 设置oapd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AOAPDType }
     *     
     */
    public void setOAPD(SeqDF98AOAPDType value) {
        this.oapd = value;
    }

    /**
     * 获取sxdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ASXDTType }
     *     
     */
    public SeqDF98ASXDTType getSXDT() {
        return sxdt;
    }

    /**
     * 设置sxdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ASXDTType }
     *     
     */
    public void setSXDT(SeqDF98ASXDTType value) {
        this.sxdt = value;
    }

    /**
     * 获取gupa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AGUPAType }
     *     
     */
    public SeqDF98AGUPAType getGUPA() {
        return gupa;
    }

    /**
     * 设置gupa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AGUPAType }
     *     
     */
    public void setGUPA(SeqDF98AGUPAType value) {
        this.gupa = value;
    }

    /**
     * 获取ecpd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AECPDType }
     *     
     */
    public SeqDF98AECPDType getECPD() {
        return ecpd;
    }

    /**
     * 设置ecpd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AECPDType }
     *     
     */
    public void setECPD(SeqDF98AECPDType value) {
        this.ecpd = value;
    }

    /**
     * 获取lapd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ALAPDType }
     *     
     */
    public SeqDF98ALAPDType getLAPD() {
        return lapd;
    }

    /**
     * 设置lapd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ALAPDType }
     *     
     */
    public void setLAPD(SeqDF98ALAPDType value) {
        this.lapd = value;
    }

    /**
     * 获取mctd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AMCTDType }
     *     
     */
    public SeqDF98AMCTDType getMCTD() {
        return mctd;
    }

    /**
     * 设置mctd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AMCTDType }
     *     
     */
    public void setMCTD(SeqDF98AMCTDType value) {
        this.mctd = value;
    }

    /**
     * 获取payd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98APAYDType }
     *     
     */
    public SeqDF98APAYDType getPAYD() {
        return payd;
    }

    /**
     * 设置payd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98APAYDType }
     *     
     */
    public void setPAYD(SeqDF98APAYDType value) {
        this.payd = value;
    }

    /**
     * 获取tpdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98ATPDTType }
     *     
     */
    public SeqDF98ATPDTType getTPDT() {
        return tpdt;
    }

    /**
     * 设置tpdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98ATPDTType }
     *     
     */
    public void setTPDT(SeqDF98ATPDTType value) {
        this.tpdt = value;
    }

    /**
     * 获取etpd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AETPDType }
     *     
     */
    public SeqDF98AETPDType getETPD() {
        return etpd;
    }

    /**
     * 设置etpd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AETPDType }
     *     
     */
    public void setETPD(SeqDF98AETPDType value) {
        this.etpd = value;
    }

    /**
     * 获取pldt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98APLDTType }
     *     
     */
    public SeqDF98APLDTType getPLDT() {
        return pldt;
    }

    /**
     * 设置pldt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98APLDTType }
     *     
     */
    public void setPLDT(SeqDF98APLDTType value) {
        this.pldt = value;
    }

    /**
     * 获取fill属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AFILLType }
     *     
     */
    public SeqDF98AFILLType getFILL() {
        return fill;
    }

    /**
     * 设置fill属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AFILLType }
     *     
     */
    public void setFILL(SeqDF98AFILLType value) {
        this.fill = value;
    }

    /**
     * 获取hear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AHEARType }
     *     
     */
    public SeqDF98AHEARType getHEAR() {
        return hear;
    }

    /**
     * 设置hear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AHEARType }
     *     
     */
    public void setHEAR(SeqDF98AHEARType value) {
        this.hear = value;
    }

    /**
     * 获取ecrd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF98AECRDType }
     *     
     */
    public SeqDF98AECRDType getECRD() {
        return ecrd;
    }

    /**
     * 设置ecrd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF98AECRDType }
     *     
     */
    public void setECRD(SeqDF98AECRDType value) {
        this.ecrd = value;
    }

}
