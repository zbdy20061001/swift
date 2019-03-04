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
 * <p>SeqE_F92a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="GRSS" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_GRSS_Type"/>
 *         &lt;element name="TAXR" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_TAXR_Type"/>
 *         &lt;element name="ATAX" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_ATAX_Type"/>
 *         &lt;element name="INDX" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_INDX_Type"/>
 *         &lt;element name="OVEP" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_OVEP_Type"/>
 *         &lt;element name="PROR" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_PROR_Type"/>
 *         &lt;element name="INTP" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_INTP_Type"/>
 *         &lt;element name="TDMT" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_TDMT_Type"/>
 *         &lt;element name="NETT" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_NETT_Type"/>
 *         &lt;element name="IDFX" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_IDFX_Type"/>
 *         &lt;element name="TXIN" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_TXIN_Type"/>
 *         &lt;element name="WITL" type="{urn:swift:xsd:fin.564.2018}SeqE_F92a_WITL_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F92a_Type", propOrder = {
    "grss",
    "taxr",
    "atax",
    "indx",
    "ovep",
    "pror",
    "intp",
    "tdmt",
    "nett",
    "idfx",
    "txin",
    "witl"
})
public class SeqEF92AType
    extends ISO15022Field
{

    @XmlElement(name = "GRSS")
    protected SeqEF92AGRSSType grss;
    @XmlElement(name = "TAXR")
    protected SeqEF92ATAXRType taxr;
    @XmlElement(name = "ATAX")
    protected SeqEF92AATAXType atax;
    @XmlElement(name = "INDX")
    protected SeqEF92AINDXType indx;
    @XmlElement(name = "OVEP")
    protected SeqEF92AOVEPType ovep;
    @XmlElement(name = "PROR")
    protected SeqEF92APRORType pror;
    @XmlElement(name = "INTP")
    protected SeqEF92AINTPType intp;
    @XmlElement(name = "TDMT")
    protected SeqEF92ATDMTType tdmt;
    @XmlElement(name = "NETT")
    protected SeqEF92ANETTType nett;
    @XmlElement(name = "IDFX")
    protected SeqEF92AIDFXType idfx;
    @XmlElement(name = "TXIN")
    protected SeqEF92ATXINType txin;
    @XmlElement(name = "WITL")
    protected SeqEF92AWITLType witl;

    /**
     * ��ȡgrss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AGRSSType }
     *     
     */
    public SeqEF92AGRSSType getGRSS() {
        return grss;
    }

    /**
     * ����grss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AGRSSType }
     *     
     */
    public void setGRSS(SeqEF92AGRSSType value) {
        this.grss = value;
    }

    /**
     * ��ȡtaxr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ATAXRType }
     *     
     */
    public SeqEF92ATAXRType getTAXR() {
        return taxr;
    }

    /**
     * ����taxr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ATAXRType }
     *     
     */
    public void setTAXR(SeqEF92ATAXRType value) {
        this.taxr = value;
    }

    /**
     * ��ȡatax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AATAXType }
     *     
     */
    public SeqEF92AATAXType getATAX() {
        return atax;
    }

    /**
     * ����atax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AATAXType }
     *     
     */
    public void setATAX(SeqEF92AATAXType value) {
        this.atax = value;
    }

    /**
     * ��ȡindx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AINDXType }
     *     
     */
    public SeqEF92AINDXType getINDX() {
        return indx;
    }

    /**
     * ����indx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AINDXType }
     *     
     */
    public void setINDX(SeqEF92AINDXType value) {
        this.indx = value;
    }

    /**
     * ��ȡovep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AOVEPType }
     *     
     */
    public SeqEF92AOVEPType getOVEP() {
        return ovep;
    }

    /**
     * ����ovep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AOVEPType }
     *     
     */
    public void setOVEP(SeqEF92AOVEPType value) {
        this.ovep = value;
    }

    /**
     * ��ȡpror���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92APRORType }
     *     
     */
    public SeqEF92APRORType getPROR() {
        return pror;
    }

    /**
     * ����pror���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92APRORType }
     *     
     */
    public void setPROR(SeqEF92APRORType value) {
        this.pror = value;
    }

    /**
     * ��ȡintp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AINTPType }
     *     
     */
    public SeqEF92AINTPType getINTP() {
        return intp;
    }

    /**
     * ����intp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AINTPType }
     *     
     */
    public void setINTP(SeqEF92AINTPType value) {
        this.intp = value;
    }

    /**
     * ��ȡtdmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ATDMTType }
     *     
     */
    public SeqEF92ATDMTType getTDMT() {
        return tdmt;
    }

    /**
     * ����tdmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ATDMTType }
     *     
     */
    public void setTDMT(SeqEF92ATDMTType value) {
        this.tdmt = value;
    }

    /**
     * ��ȡnett���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ANETTType }
     *     
     */
    public SeqEF92ANETTType getNETT() {
        return nett;
    }

    /**
     * ����nett���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ANETTType }
     *     
     */
    public void setNETT(SeqEF92ANETTType value) {
        this.nett = value;
    }

    /**
     * ��ȡidfx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AIDFXType }
     *     
     */
    public SeqEF92AIDFXType getIDFX() {
        return idfx;
    }

    /**
     * ����idfx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AIDFXType }
     *     
     */
    public void setIDFX(SeqEF92AIDFXType value) {
        this.idfx = value;
    }

    /**
     * ��ȡtxin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92ATXINType }
     *     
     */
    public SeqEF92ATXINType getTXIN() {
        return txin;
    }

    /**
     * ����txin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92ATXINType }
     *     
     */
    public void setTXIN(SeqEF92ATXINType value) {
        this.txin = value;
    }

    /**
     * ��ȡwitl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF92AWITLType }
     *     
     */
    public SeqEF92AWITLType getWITL() {
        return witl;
    }

    /**
     * ����witl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF92AWITLType }
     *     
     */
    public void setWITL(SeqEF92AWITLType value) {
        this.witl = value;
    }

}
