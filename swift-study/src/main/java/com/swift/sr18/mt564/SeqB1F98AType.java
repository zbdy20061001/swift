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
 * <p>SeqB1_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcoup���Ե�ֵ��
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
     * ����coup���Ե�ֵ��
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
     * ��ȡexpi���Ե�ֵ��
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
     * ����expi���Ե�ֵ��
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
     * ��ȡfrnr���Ե�ֵ��
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
     * ����frnr���Ե�ֵ��
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
     * ��ȡmatu���Ե�ֵ��
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
     * ����matu���Ե�ֵ��
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
     * ��ȡissu���Ե�ֵ��
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
     * ����issu���Ե�ֵ��
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
     * ��ȡcald���Ե�ֵ��
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
     * ����cald���Ե�ֵ��
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
     * ��ȡputt���Ե�ֵ��
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
     * ����putt���Ե�ֵ��
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
     * ��ȡddte���Ե�ֵ��
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
     * ����ddte���Ե�ֵ��
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
     * ��ȡconv���Ե�ֵ��
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
     * ����conv���Ե�ֵ��
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
