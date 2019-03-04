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
 * <p>SeqE1_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PAYD" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_PAYD_Type"/>
 *         &lt;element name="AVAL" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_AVAL_Type"/>
 *         &lt;element name="DIVR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_DIVR_Type"/>
 *         &lt;element name="EARL" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_EARL_Type"/>
 *         &lt;element name="PPDT" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_PPDT_Type"/>
 *         &lt;element name="LTRD" type="{urn:swift:xsd:fin.564.2018}SeqE1_F98a_LTRD_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F98a_Type", propOrder = {
    "payd",
    "aval",
    "divr",
    "earl",
    "ppdt",
    "ltrd"
})
public class SeqE1F98AType
    extends ISO15022Field
{

    @XmlElement(name = "PAYD")
    protected SeqE1F98APAYDType payd;
    @XmlElement(name = "AVAL")
    protected SeqE1F98AAVALType aval;
    @XmlElement(name = "DIVR")
    protected SeqE1F98ADIVRType divr;
    @XmlElement(name = "EARL")
    protected SeqE1F98AEARLType earl;
    @XmlElement(name = "PPDT")
    protected SeqE1F98APPDTType ppdt;
    @XmlElement(name = "LTRD")
    protected SeqE1F98ALTRDType ltrd;

    /**
     * ��ȡpayd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F98APAYDType }
     *     
     */
    public SeqE1F98APAYDType getPAYD() {
        return payd;
    }

    /**
     * ����payd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F98APAYDType }
     *     
     */
    public void setPAYD(SeqE1F98APAYDType value) {
        this.payd = value;
    }

    /**
     * ��ȡaval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F98AAVALType }
     *     
     */
    public SeqE1F98AAVALType getAVAL() {
        return aval;
    }

    /**
     * ����aval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F98AAVALType }
     *     
     */
    public void setAVAL(SeqE1F98AAVALType value) {
        this.aval = value;
    }

    /**
     * ��ȡdivr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F98ADIVRType }
     *     
     */
    public SeqE1F98ADIVRType getDIVR() {
        return divr;
    }

    /**
     * ����divr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F98ADIVRType }
     *     
     */
    public void setDIVR(SeqE1F98ADIVRType value) {
        this.divr = value;
    }

    /**
     * ��ȡearl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F98AEARLType }
     *     
     */
    public SeqE1F98AEARLType getEARL() {
        return earl;
    }

    /**
     * ����earl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F98AEARLType }
     *     
     */
    public void setEARL(SeqE1F98AEARLType value) {
        this.earl = value;
    }

    /**
     * ��ȡppdt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F98APPDTType }
     *     
     */
    public SeqE1F98APPDTType getPPDT() {
        return ppdt;
    }

    /**
     * ����ppdt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F98APPDTType }
     *     
     */
    public void setPPDT(SeqE1F98APPDTType value) {
        this.ppdt = value;
    }

    /**
     * ��ȡltrd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F98ALTRDType }
     *     
     */
    public SeqE1F98ALTRDType getLTRD() {
        return ltrd;
    }

    /**
     * ����ltrd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F98ALTRDType }
     *     
     */
    public void setLTRD(SeqE1F98ALTRDType value) {
        this.ltrd = value;
    }

}
