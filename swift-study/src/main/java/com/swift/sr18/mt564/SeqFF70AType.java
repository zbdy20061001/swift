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
 * <p>SeqF_F70a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqF_F70a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ADTX" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_ADTX_Type"/>
 *         &lt;element name="TXNR" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_TXNR_Type"/>
 *         &lt;element name="REGI" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_REGI_Type"/>
 *         &lt;element name="INCO" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_INCO_Type"/>
 *         &lt;element name="COMP" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_COMP_Type"/>
 *         &lt;element name="PACO" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_PACO_Type"/>
 *         &lt;element name="TAXE" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_TAXE_Type"/>
 *         &lt;element name="DISC" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_DISC_Type"/>
 *         &lt;element name="BAIN" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_BAIN_Type"/>
 *         &lt;element name="CETI" type="{urn:swift:xsd:fin.564.2018}SeqF_F70a_CETI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqF_F70a_Type", propOrder = {
    "adtx",
    "txnr",
    "regi",
    "inco",
    "comp",
    "paco",
    "taxe",
    "disc",
    "bain",
    "ceti"
})
public class SeqFF70AType
    extends ISO15022Field
{

    @XmlElement(name = "ADTX")
    protected SeqFF70AADTXType adtx;
    @XmlElement(name = "TXNR")
    protected SeqFF70ATXNRType txnr;
    @XmlElement(name = "REGI")
    protected SeqFF70AREGIType regi;
    @XmlElement(name = "INCO")
    protected SeqFF70AINCOType inco;
    @XmlElement(name = "COMP")
    protected SeqFF70ACOMPType comp;
    @XmlElement(name = "PACO")
    protected SeqFF70APACOType paco;
    @XmlElement(name = "TAXE")
    protected SeqFF70ATAXEType taxe;
    @XmlElement(name = "DISC")
    protected SeqFF70ADISCType disc;
    @XmlElement(name = "BAIN")
    protected SeqFF70ABAINType bain;
    @XmlElement(name = "CETI")
    protected SeqFF70ACETIType ceti;

    /**
     * ��ȡadtx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70AADTXType }
     *     
     */
    public SeqFF70AADTXType getADTX() {
        return adtx;
    }

    /**
     * ����adtx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70AADTXType }
     *     
     */
    public void setADTX(SeqFF70AADTXType value) {
        this.adtx = value;
    }

    /**
     * ��ȡtxnr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ATXNRType }
     *     
     */
    public SeqFF70ATXNRType getTXNR() {
        return txnr;
    }

    /**
     * ����txnr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ATXNRType }
     *     
     */
    public void setTXNR(SeqFF70ATXNRType value) {
        this.txnr = value;
    }

    /**
     * ��ȡregi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70AREGIType }
     *     
     */
    public SeqFF70AREGIType getREGI() {
        return regi;
    }

    /**
     * ����regi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70AREGIType }
     *     
     */
    public void setREGI(SeqFF70AREGIType value) {
        this.regi = value;
    }

    /**
     * ��ȡinco���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70AINCOType }
     *     
     */
    public SeqFF70AINCOType getINCO() {
        return inco;
    }

    /**
     * ����inco���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70AINCOType }
     *     
     */
    public void setINCO(SeqFF70AINCOType value) {
        this.inco = value;
    }

    /**
     * ��ȡcomp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ACOMPType }
     *     
     */
    public SeqFF70ACOMPType getCOMP() {
        return comp;
    }

    /**
     * ����comp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ACOMPType }
     *     
     */
    public void setCOMP(SeqFF70ACOMPType value) {
        this.comp = value;
    }

    /**
     * ��ȡpaco���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70APACOType }
     *     
     */
    public SeqFF70APACOType getPACO() {
        return paco;
    }

    /**
     * ����paco���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70APACOType }
     *     
     */
    public void setPACO(SeqFF70APACOType value) {
        this.paco = value;
    }

    /**
     * ��ȡtaxe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ATAXEType }
     *     
     */
    public SeqFF70ATAXEType getTAXE() {
        return taxe;
    }

    /**
     * ����taxe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ATAXEType }
     *     
     */
    public void setTAXE(SeqFF70ATAXEType value) {
        this.taxe = value;
    }

    /**
     * ��ȡdisc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ADISCType }
     *     
     */
    public SeqFF70ADISCType getDISC() {
        return disc;
    }

    /**
     * ����disc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ADISCType }
     *     
     */
    public void setDISC(SeqFF70ADISCType value) {
        this.disc = value;
    }

    /**
     * ��ȡbain���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ABAINType }
     *     
     */
    public SeqFF70ABAINType getBAIN() {
        return bain;
    }

    /**
     * ����bain���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ABAINType }
     *     
     */
    public void setBAIN(SeqFF70ABAINType value) {
        this.bain = value;
    }

    /**
     * ��ȡceti���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF70ACETIType }
     *     
     */
    public SeqFF70ACETIType getCETI() {
        return ceti;
    }

    /**
     * ����ceti���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF70ACETIType }
     *     
     */
    public void setCETI(SeqFF70ACETIType value) {
        this.ceti = value;
    }

}
