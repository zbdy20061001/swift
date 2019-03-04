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
 * <p>SeqE2_F92a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ATAX" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_ATAX_Type"/>
 *         &lt;element name="CHAR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_CHAR_Type"/>
 *         &lt;element name="EQUL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_EQUL_Type"/>
 *         &lt;element name="ESOF" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_ESOF_Type"/>
 *         &lt;element name="FISC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_FISC_Type"/>
 *         &lt;element name="GRSS" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_GRSS_Type"/>
 *         &lt;element name="EXCH" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_EXCH_Type"/>
 *         &lt;element name="INCE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_INCE_Type"/>
 *         &lt;element name="INTP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_INTP_Type"/>
 *         &lt;element name="NETT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_NETT_Type"/>
 *         &lt;element name="RATE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_RATE_Type"/>
 *         &lt;element name="SOFE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_SOFE_Type"/>
 *         &lt;element name="TAXC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TAXC_Type"/>
 *         &lt;element name="TAXR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TAXR_Type"/>
 *         &lt;element name="TXIN" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TXIN_Type"/>
 *         &lt;element name="TXPR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TXPR_Type"/>
 *         &lt;element name="TXRC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_TXRC_Type"/>
 *         &lt;element name="WITL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_WITL_Type"/>
 *         &lt;element name="DEEM" type="{urn:swift:xsd:fin.564.2018}SeqE2_F92a_DEEM_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F92a_Type", propOrder = {
    "atax",
    "_char",
    "equl",
    "esof",
    "fisc",
    "grss",
    "exch",
    "ince",
    "intp",
    "nett",
    "rate",
    "sofe",
    "taxc",
    "taxr",
    "txin",
    "txpr",
    "txrc",
    "witl",
    "deem"
})
public class SeqE2F92AType
    extends ISO15022Field
{

    @XmlElement(name = "ATAX")
    protected SeqE2F92AATAXType atax;
    @XmlElement(name = "CHAR")
    protected SeqE2F92ACHARType _char;
    @XmlElement(name = "EQUL")
    protected SeqE2F92AEQULType equl;
    @XmlElement(name = "ESOF")
    protected SeqE2F92AESOFType esof;
    @XmlElement(name = "FISC")
    protected SeqE2F92AFISCType fisc;
    @XmlElement(name = "GRSS")
    protected SeqE2F92AGRSSType grss;
    @XmlElement(name = "EXCH")
    protected SeqE2F92AEXCHType exch;
    @XmlElement(name = "INCE")
    protected SeqE2F92AINCEType ince;
    @XmlElement(name = "INTP")
    protected SeqE2F92AINTPType intp;
    @XmlElement(name = "NETT")
    protected SeqE2F92ANETTType nett;
    @XmlElement(name = "RATE")
    protected SeqE2F92ARATEType rate;
    @XmlElement(name = "SOFE")
    protected SeqE2F92ASOFEType sofe;
    @XmlElement(name = "TAXC")
    protected SeqE2F92ATAXCType taxc;
    @XmlElement(name = "TAXR")
    protected SeqE2F92ATAXRType taxr;
    @XmlElement(name = "TXIN")
    protected SeqE2F92ATXINType txin;
    @XmlElement(name = "TXPR")
    protected SeqE2F92ATXPRType txpr;
    @XmlElement(name = "TXRC")
    protected SeqE2F92ATXRCType txrc;
    @XmlElement(name = "WITL")
    protected SeqE2F92AWITLType witl;
    @XmlElement(name = "DEEM")
    protected SeqE2F92ADEEMType deem;

    /**
     * ��ȡatax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AATAXType }
     *     
     */
    public SeqE2F92AATAXType getATAX() {
        return atax;
    }

    /**
     * ����atax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AATAXType }
     *     
     */
    public void setATAX(SeqE2F92AATAXType value) {
        this.atax = value;
    }

    /**
     * ��ȡchar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ACHARType }
     *     
     */
    public SeqE2F92ACHARType getCHAR() {
        return _char;
    }

    /**
     * ����char���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ACHARType }
     *     
     */
    public void setCHAR(SeqE2F92ACHARType value) {
        this._char = value;
    }

    /**
     * ��ȡequl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AEQULType }
     *     
     */
    public SeqE2F92AEQULType getEQUL() {
        return equl;
    }

    /**
     * ����equl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AEQULType }
     *     
     */
    public void setEQUL(SeqE2F92AEQULType value) {
        this.equl = value;
    }

    /**
     * ��ȡesof���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AESOFType }
     *     
     */
    public SeqE2F92AESOFType getESOF() {
        return esof;
    }

    /**
     * ����esof���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AESOFType }
     *     
     */
    public void setESOF(SeqE2F92AESOFType value) {
        this.esof = value;
    }

    /**
     * ��ȡfisc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AFISCType }
     *     
     */
    public SeqE2F92AFISCType getFISC() {
        return fisc;
    }

    /**
     * ����fisc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AFISCType }
     *     
     */
    public void setFISC(SeqE2F92AFISCType value) {
        this.fisc = value;
    }

    /**
     * ��ȡgrss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AGRSSType }
     *     
     */
    public SeqE2F92AGRSSType getGRSS() {
        return grss;
    }

    /**
     * ����grss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AGRSSType }
     *     
     */
    public void setGRSS(SeqE2F92AGRSSType value) {
        this.grss = value;
    }

    /**
     * ��ȡexch���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AEXCHType }
     *     
     */
    public SeqE2F92AEXCHType getEXCH() {
        return exch;
    }

    /**
     * ����exch���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AEXCHType }
     *     
     */
    public void setEXCH(SeqE2F92AEXCHType value) {
        this.exch = value;
    }

    /**
     * ��ȡince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AINCEType }
     *     
     */
    public SeqE2F92AINCEType getINCE() {
        return ince;
    }

    /**
     * ����ince���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AINCEType }
     *     
     */
    public void setINCE(SeqE2F92AINCEType value) {
        this.ince = value;
    }

    /**
     * ��ȡintp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AINTPType }
     *     
     */
    public SeqE2F92AINTPType getINTP() {
        return intp;
    }

    /**
     * ����intp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AINTPType }
     *     
     */
    public void setINTP(SeqE2F92AINTPType value) {
        this.intp = value;
    }

    /**
     * ��ȡnett���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ANETTType }
     *     
     */
    public SeqE2F92ANETTType getNETT() {
        return nett;
    }

    /**
     * ����nett���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ANETTType }
     *     
     */
    public void setNETT(SeqE2F92ANETTType value) {
        this.nett = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ARATEType }
     *     
     */
    public SeqE2F92ARATEType getRATE() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ARATEType }
     *     
     */
    public void setRATE(SeqE2F92ARATEType value) {
        this.rate = value;
    }

    /**
     * ��ȡsofe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ASOFEType }
     *     
     */
    public SeqE2F92ASOFEType getSOFE() {
        return sofe;
    }

    /**
     * ����sofe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ASOFEType }
     *     
     */
    public void setSOFE(SeqE2F92ASOFEType value) {
        this.sofe = value;
    }

    /**
     * ��ȡtaxc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATAXCType }
     *     
     */
    public SeqE2F92ATAXCType getTAXC() {
        return taxc;
    }

    /**
     * ����taxc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATAXCType }
     *     
     */
    public void setTAXC(SeqE2F92ATAXCType value) {
        this.taxc = value;
    }

    /**
     * ��ȡtaxr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATAXRType }
     *     
     */
    public SeqE2F92ATAXRType getTAXR() {
        return taxr;
    }

    /**
     * ����taxr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATAXRType }
     *     
     */
    public void setTAXR(SeqE2F92ATAXRType value) {
        this.taxr = value;
    }

    /**
     * ��ȡtxin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATXINType }
     *     
     */
    public SeqE2F92ATXINType getTXIN() {
        return txin;
    }

    /**
     * ����txin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATXINType }
     *     
     */
    public void setTXIN(SeqE2F92ATXINType value) {
        this.txin = value;
    }

    /**
     * ��ȡtxpr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATXPRType }
     *     
     */
    public SeqE2F92ATXPRType getTXPR() {
        return txpr;
    }

    /**
     * ����txpr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATXPRType }
     *     
     */
    public void setTXPR(SeqE2F92ATXPRType value) {
        this.txpr = value;
    }

    /**
     * ��ȡtxrc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ATXRCType }
     *     
     */
    public SeqE2F92ATXRCType getTXRC() {
        return txrc;
    }

    /**
     * ����txrc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ATXRCType }
     *     
     */
    public void setTXRC(SeqE2F92ATXRCType value) {
        this.txrc = value;
    }

    /**
     * ��ȡwitl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92AWITLType }
     *     
     */
    public SeqE2F92AWITLType getWITL() {
        return witl;
    }

    /**
     * ����witl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92AWITLType }
     *     
     */
    public void setWITL(SeqE2F92AWITLType value) {
        this.witl = value;
    }

    /**
     * ��ȡdeem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F92ADEEMType }
     *     
     */
    public SeqE2F92ADEEMType getDEEM() {
        return deem;
    }

    /**
     * ����deem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F92ADEEMType }
     *     
     */
    public void setDEEM(SeqE2F92ADEEMType value) {
        this.deem = value;
    }

}
