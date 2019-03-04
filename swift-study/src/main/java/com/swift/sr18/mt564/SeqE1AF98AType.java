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
 * <p>SeqE1a_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="COUP" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_COUP_Type"/>
 *         &lt;element name="FRNR" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_FRNR_Type"/>
 *         &lt;element name="MATU" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_MATU_Type"/>
 *         &lt;element name="ISSU" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_ISSU_Type"/>
 *         &lt;element name="CALD" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_CALD_Type"/>
 *         &lt;element name="PUTT" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_PUTT_Type"/>
 *         &lt;element name="DDTE" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_DDTE_Type"/>
 *         &lt;element name="CONV" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F98a_CONV_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F98a_Type", propOrder = {
    "coup",
    "frnr",
    "matu",
    "issu",
    "cald",
    "putt",
    "ddte",
    "conv"
})
public class SeqE1AF98AType
    extends ISO15022Field
{

    @XmlElement(name = "COUP")
    protected SeqE1AF98ACOUPType coup;
    @XmlElement(name = "FRNR")
    protected SeqE1AF98AFRNRType frnr;
    @XmlElement(name = "MATU")
    protected SeqE1AF98AMATUType matu;
    @XmlElement(name = "ISSU")
    protected SeqE1AF98AISSUType issu;
    @XmlElement(name = "CALD")
    protected SeqE1AF98ACALDType cald;
    @XmlElement(name = "PUTT")
    protected SeqE1AF98APUTTType putt;
    @XmlElement(name = "DDTE")
    protected SeqE1AF98ADDTEType ddte;
    @XmlElement(name = "CONV")
    protected SeqE1AF98ACONVType conv;

    /**
     * ��ȡcoup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ACOUPType }
     *     
     */
    public SeqE1AF98ACOUPType getCOUP() {
        return coup;
    }

    /**
     * ����coup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ACOUPType }
     *     
     */
    public void setCOUP(SeqE1AF98ACOUPType value) {
        this.coup = value;
    }

    /**
     * ��ȡfrnr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98AFRNRType }
     *     
     */
    public SeqE1AF98AFRNRType getFRNR() {
        return frnr;
    }

    /**
     * ����frnr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98AFRNRType }
     *     
     */
    public void setFRNR(SeqE1AF98AFRNRType value) {
        this.frnr = value;
    }

    /**
     * ��ȡmatu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98AMATUType }
     *     
     */
    public SeqE1AF98AMATUType getMATU() {
        return matu;
    }

    /**
     * ����matu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98AMATUType }
     *     
     */
    public void setMATU(SeqE1AF98AMATUType value) {
        this.matu = value;
    }

    /**
     * ��ȡissu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98AISSUType }
     *     
     */
    public SeqE1AF98AISSUType getISSU() {
        return issu;
    }

    /**
     * ����issu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98AISSUType }
     *     
     */
    public void setISSU(SeqE1AF98AISSUType value) {
        this.issu = value;
    }

    /**
     * ��ȡcald���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ACALDType }
     *     
     */
    public SeqE1AF98ACALDType getCALD() {
        return cald;
    }

    /**
     * ����cald���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ACALDType }
     *     
     */
    public void setCALD(SeqE1AF98ACALDType value) {
        this.cald = value;
    }

    /**
     * ��ȡputt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98APUTTType }
     *     
     */
    public SeqE1AF98APUTTType getPUTT() {
        return putt;
    }

    /**
     * ����putt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98APUTTType }
     *     
     */
    public void setPUTT(SeqE1AF98APUTTType value) {
        this.putt = value;
    }

    /**
     * ��ȡddte���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ADDTEType }
     *     
     */
    public SeqE1AF98ADDTEType getDDTE() {
        return ddte;
    }

    /**
     * ����ddte���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ADDTEType }
     *     
     */
    public void setDDTE(SeqE1AF98ADDTEType value) {
        this.ddte = value;
    }

    /**
     * ��ȡconv���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF98ACONVType }
     *     
     */
    public SeqE1AF98ACONVType getCONV() {
        return conv;
    }

    /**
     * ����conv���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF98ACONVType }
     *     
     */
    public void setCONV(SeqE1AF98ACONVType value) {
        this.conv = value;
    }

}
