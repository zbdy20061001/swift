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
 * <p>SeqE_F70a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F70a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ADTX" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_ADTX_Type"/>
 *         &lt;element name="TXNR" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_TXNR_Type"/>
 *         &lt;element name="INCO" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_INCO_Type"/>
 *         &lt;element name="COMP" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_COMP_Type"/>
 *         &lt;element name="NSER" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_NSER_Type"/>
 *         &lt;element name="TAXE" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_TAXE_Type"/>
 *         &lt;element name="DISC" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_DISC_Type"/>
 *         &lt;element name="CETI" type="{urn:swift:xsd:fin.564.2018}SeqE_F70a_CETI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F70a_Type", propOrder = {
    "adtx",
    "txnr",
    "inco",
    "comp",
    "nser",
    "taxe",
    "disc",
    "ceti"
})
public class SeqEF70AType
    extends ISO15022Field
{

    @XmlElement(name = "ADTX")
    protected SeqEF70AADTXType adtx;
    @XmlElement(name = "TXNR")
    protected SeqEF70ATXNRType txnr;
    @XmlElement(name = "INCO")
    protected SeqEF70AINCOType inco;
    @XmlElement(name = "COMP")
    protected SeqEF70ACOMPType comp;
    @XmlElement(name = "NSER")
    protected SeqEF70ANSERType nser;
    @XmlElement(name = "TAXE")
    protected SeqEF70ATAXEType taxe;
    @XmlElement(name = "DISC")
    protected SeqEF70ADISCType disc;
    @XmlElement(name = "CETI")
    protected SeqEF70ACETIType ceti;

    /**
     * ��ȡadtx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70AADTXType }
     *     
     */
    public SeqEF70AADTXType getADTX() {
        return adtx;
    }

    /**
     * ����adtx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70AADTXType }
     *     
     */
    public void setADTX(SeqEF70AADTXType value) {
        this.adtx = value;
    }

    /**
     * ��ȡtxnr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ATXNRType }
     *     
     */
    public SeqEF70ATXNRType getTXNR() {
        return txnr;
    }

    /**
     * ����txnr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ATXNRType }
     *     
     */
    public void setTXNR(SeqEF70ATXNRType value) {
        this.txnr = value;
    }

    /**
     * ��ȡinco���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70AINCOType }
     *     
     */
    public SeqEF70AINCOType getINCO() {
        return inco;
    }

    /**
     * ����inco���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70AINCOType }
     *     
     */
    public void setINCO(SeqEF70AINCOType value) {
        this.inco = value;
    }

    /**
     * ��ȡcomp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ACOMPType }
     *     
     */
    public SeqEF70ACOMPType getCOMP() {
        return comp;
    }

    /**
     * ����comp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ACOMPType }
     *     
     */
    public void setCOMP(SeqEF70ACOMPType value) {
        this.comp = value;
    }

    /**
     * ��ȡnser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ANSERType }
     *     
     */
    public SeqEF70ANSERType getNSER() {
        return nser;
    }

    /**
     * ����nser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ANSERType }
     *     
     */
    public void setNSER(SeqEF70ANSERType value) {
        this.nser = value;
    }

    /**
     * ��ȡtaxe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ATAXEType }
     *     
     */
    public SeqEF70ATAXEType getTAXE() {
        return taxe;
    }

    /**
     * ����taxe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ATAXEType }
     *     
     */
    public void setTAXE(SeqEF70ATAXEType value) {
        this.taxe = value;
    }

    /**
     * ��ȡdisc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ADISCType }
     *     
     */
    public SeqEF70ADISCType getDISC() {
        return disc;
    }

    /**
     * ����disc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ADISCType }
     *     
     */
    public void setDISC(SeqEF70ADISCType value) {
        this.disc = value;
    }

    /**
     * ��ȡceti���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF70ACETIType }
     *     
     */
    public SeqEF70ACETIType getCETI() {
        return ceti;
    }

    /**
     * ����ceti���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF70ACETIType }
     *     
     */
    public void setCETI(SeqEF70ACETIType value) {
        this.ceti = value;
    }

}
