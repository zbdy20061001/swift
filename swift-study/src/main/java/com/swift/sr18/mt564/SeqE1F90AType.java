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
 * <p>SeqE1_F90a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="INDC" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_INDC_Type"/>
 *         &lt;element name="MRKT" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_MRKT_Type"/>
 *         &lt;element name="CINL" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_CINL_Type"/>
 *         &lt;element name="OFFR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_OFFR_Type"/>
 *         &lt;element name="PRPP" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_PRPP_Type"/>
 *         &lt;element name="CAVA" type="{urn:swift:xsd:fin.564.2018}SeqE1_F90a_CAVA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F90a_Type", propOrder = {
    "indc",
    "mrkt",
    "cinl",
    "offr",
    "prpp",
    "cava"
})
public class SeqE1F90AType
    extends ISO15022Field
{

    @XmlElement(name = "INDC")
    protected SeqE1F90AINDCType indc;
    @XmlElement(name = "MRKT")
    protected SeqE1F90AMRKTType mrkt;
    @XmlElement(name = "CINL")
    protected SeqE1F90ACINLType cinl;
    @XmlElement(name = "OFFR")
    protected SeqE1F90AOFFRType offr;
    @XmlElement(name = "PRPP")
    protected SeqE1F90APRPPType prpp;
    @XmlElement(name = "CAVA")
    protected SeqE1F90ACAVAType cava;

    /**
     * ��ȡindc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90AINDCType }
     *     
     */
    public SeqE1F90AINDCType getINDC() {
        return indc;
    }

    /**
     * ����indc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90AINDCType }
     *     
     */
    public void setINDC(SeqE1F90AINDCType value) {
        this.indc = value;
    }

    /**
     * ��ȡmrkt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90AMRKTType }
     *     
     */
    public SeqE1F90AMRKTType getMRKT() {
        return mrkt;
    }

    /**
     * ����mrkt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90AMRKTType }
     *     
     */
    public void setMRKT(SeqE1F90AMRKTType value) {
        this.mrkt = value;
    }

    /**
     * ��ȡcinl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90ACINLType }
     *     
     */
    public SeqE1F90ACINLType getCINL() {
        return cinl;
    }

    /**
     * ����cinl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90ACINLType }
     *     
     */
    public void setCINL(SeqE1F90ACINLType value) {
        this.cinl = value;
    }

    /**
     * ��ȡoffr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90AOFFRType }
     *     
     */
    public SeqE1F90AOFFRType getOFFR() {
        return offr;
    }

    /**
     * ����offr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90AOFFRType }
     *     
     */
    public void setOFFR(SeqE1F90AOFFRType value) {
        this.offr = value;
    }

    /**
     * ��ȡprpp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90APRPPType }
     *     
     */
    public SeqE1F90APRPPType getPRPP() {
        return prpp;
    }

    /**
     * ����prpp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90APRPPType }
     *     
     */
    public void setPRPP(SeqE1F90APRPPType value) {
        this.prpp = value;
    }

    /**
     * ��ȡcava���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F90ACAVAType }
     *     
     */
    public SeqE1F90ACAVAType getCAVA() {
        return cava;
    }

    /**
     * ����cava���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F90ACAVAType }
     *     
     */
    public void setCAVA(SeqE1F90ACAVAType value) {
        this.cava = value;
    }

}
