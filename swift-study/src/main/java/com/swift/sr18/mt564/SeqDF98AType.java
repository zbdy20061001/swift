//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.12.05 ʱ�� 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqD_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡanou���Ե�ֵ��
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
     * ����anou���Ե�ֵ��
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
     * ��ȡcert���Ե�ֵ��
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
     * ����cert���Ե�ֵ��
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
     * ��ȡxdte���Ե�ֵ��
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
     * ����xdte���Ե�ֵ��
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
     * ��ȡeffd���Ե�ֵ��
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
     * ����effd���Ե�ֵ��
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
     * ��ȡfdat���Ե�ֵ��
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
     * ����fdat���Ե�ֵ��
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
     * ��ȡprod���Ե�ֵ��
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
     * ����prod���Ե�ֵ��
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
     * ��ȡregi���Ե�ֵ��
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
     * ����regi���Ե�ֵ��
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
     * ��ȡresu���Ե�ֵ��
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
     * ����resu���Ե�ֵ��
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
     * ��ȡsplt���Ե�ֵ��
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
     * ����splt���Ե�ֵ��
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
     * ��ȡmeet���Ե�ֵ��
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
     * ����meet���Ե�ֵ��
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
     * ��ȡrdte���Ե�ֵ��
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
     * ����rdte���Ե�ֵ��
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
     * ��ȡtaxb���Ե�ֵ��
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
     * ����taxb���Ե�ֵ��
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
     * ��ȡtsdt���Ե�ֵ��
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
     * ����tsdt���Ե�ֵ��
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
     * ��ȡloto���Ե�ֵ��
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
     * ����loto���Ե�ֵ��
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
     * ��ȡunco���Ե�ֵ��
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
     * ����unco���Ե�ֵ��
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
     * ��ȡwuco���Ե�ֵ��
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
     * ����wuco���Ե�ֵ��
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
     * ��ȡmet2���Ե�ֵ��
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
     * ����met2���Ե�ֵ��
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
     * ��ȡmet3���Ե�ֵ��
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
     * ����met3���Ե�ֵ��
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
     * ��ȡequl���Ե�ֵ��
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
     * ����equl���Ե�ֵ��
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
     * ��ȡecdt���Ե�ֵ��
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
     * ����ecdt���Ե�ֵ��
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
     * ��ȡifix���Ե�ֵ��
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
     * ����ifix���Ե�ֵ��
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
     * ��ȡmfix���Ե�ֵ��
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
     * ����mfix���Ե�ֵ��
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
     * ��ȡcoap���Ե�ֵ��
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
     * ����coap���Ե�ֵ��
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
     * ��ȡmatu���Ե�ֵ��
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
     * ����matu���Ե�ֵ��
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
     * ��ȡoapd���Ե�ֵ��
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
     * ����oapd���Ե�ֵ��
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
     * ��ȡsxdt���Ե�ֵ��
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
     * ����sxdt���Ե�ֵ��
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
     * ��ȡgupa���Ե�ֵ��
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
     * ����gupa���Ե�ֵ��
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
     * ��ȡecpd���Ե�ֵ��
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
     * ����ecpd���Ե�ֵ��
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
     * ��ȡlapd���Ե�ֵ��
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
     * ����lapd���Ե�ֵ��
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
     * ��ȡmctd���Ե�ֵ��
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
     * ����mctd���Ե�ֵ��
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
     * ��ȡpayd���Ե�ֵ��
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
     * ����payd���Ե�ֵ��
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
     * ��ȡtpdt���Ե�ֵ��
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
     * ����tpdt���Ե�ֵ��
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
     * ��ȡetpd���Ե�ֵ��
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
     * ����etpd���Ե�ֵ��
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
     * ��ȡpldt���Ե�ֵ��
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
     * ����pldt���Ե�ֵ��
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
     * ��ȡfill���Ե�ֵ��
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
     * ����fill���Ե�ֵ��
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
     * ��ȡhear���Ե�ֵ��
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
     * ����hear���Ե�ֵ��
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
     * ��ȡecrd���Ե�ֵ��
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
     * ����ecrd���Ե�ֵ��
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
