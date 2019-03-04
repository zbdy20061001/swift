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
 * <p>SeqF_F95a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqF_F95a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MEOR" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_MEOR_Type"/>
 *         &lt;element name="MERE" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_MERE_Type"/>
 *         &lt;element name="ISAG" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_ISAG_Type"/>
 *         &lt;element name="PAYA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_PAYA_Type"/>
 *         &lt;element name="CODO" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_CODO_Type"/>
 *         &lt;element name="REGR" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_REGR_Type"/>
 *         &lt;element name="DROP" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_DROP_Type"/>
 *         &lt;element name="PSAG" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_PSAG_Type"/>
 *         &lt;element name="RESA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_RESA_Type"/>
 *         &lt;element name="SOLA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_SOLA_Type"/>
 *         &lt;element name="INFA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_INFA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqF_F95a_Type", propOrder = {
    "meor",
    "mere",
    "isag",
    "paya",
    "codo",
    "regr",
    "drop",
    "psag",
    "resa",
    "sola",
    "infa"
})
public class SeqFF95AType
    extends ISO15022Field
{

    @XmlElement(name = "MEOR")
    protected SeqFF95AMEORType meor;
    @XmlElement(name = "MERE")
    protected SeqFF95AMEREType mere;
    @XmlElement(name = "ISAG")
    protected SeqFF95AISAGType isag;
    @XmlElement(name = "PAYA")
    protected SeqFF95APAYAType paya;
    @XmlElement(name = "CODO")
    protected SeqFF95ACODOType codo;
    @XmlElement(name = "REGR")
    protected SeqFF95AREGRType regr;
    @XmlElement(name = "DROP")
    protected SeqFF95ADROPType drop;
    @XmlElement(name = "PSAG")
    protected SeqFF95APSAGType psag;
    @XmlElement(name = "RESA")
    protected SeqFF95ARESAType resa;
    @XmlElement(name = "SOLA")
    protected SeqFF95ASOLAType sola;
    @XmlElement(name = "INFA")
    protected SeqFF95AINFAType infa;

    /**
     * ��ȡmeor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AMEORType }
     *     
     */
    public SeqFF95AMEORType getMEOR() {
        return meor;
    }

    /**
     * ����meor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AMEORType }
     *     
     */
    public void setMEOR(SeqFF95AMEORType value) {
        this.meor = value;
    }

    /**
     * ��ȡmere���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AMEREType }
     *     
     */
    public SeqFF95AMEREType getMERE() {
        return mere;
    }

    /**
     * ����mere���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AMEREType }
     *     
     */
    public void setMERE(SeqFF95AMEREType value) {
        this.mere = value;
    }

    /**
     * ��ȡisag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AISAGType }
     *     
     */
    public SeqFF95AISAGType getISAG() {
        return isag;
    }

    /**
     * ����isag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AISAGType }
     *     
     */
    public void setISAG(SeqFF95AISAGType value) {
        this.isag = value;
    }

    /**
     * ��ȡpaya���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95APAYAType }
     *     
     */
    public SeqFF95APAYAType getPAYA() {
        return paya;
    }

    /**
     * ����paya���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95APAYAType }
     *     
     */
    public void setPAYA(SeqFF95APAYAType value) {
        this.paya = value;
    }

    /**
     * ��ȡcodo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ACODOType }
     *     
     */
    public SeqFF95ACODOType getCODO() {
        return codo;
    }

    /**
     * ����codo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ACODOType }
     *     
     */
    public void setCODO(SeqFF95ACODOType value) {
        this.codo = value;
    }

    /**
     * ��ȡregr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AREGRType }
     *     
     */
    public SeqFF95AREGRType getREGR() {
        return regr;
    }

    /**
     * ����regr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AREGRType }
     *     
     */
    public void setREGR(SeqFF95AREGRType value) {
        this.regr = value;
    }

    /**
     * ��ȡdrop���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ADROPType }
     *     
     */
    public SeqFF95ADROPType getDROP() {
        return drop;
    }

    /**
     * ����drop���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ADROPType }
     *     
     */
    public void setDROP(SeqFF95ADROPType value) {
        this.drop = value;
    }

    /**
     * ��ȡpsag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95APSAGType }
     *     
     */
    public SeqFF95APSAGType getPSAG() {
        return psag;
    }

    /**
     * ����psag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95APSAGType }
     *     
     */
    public void setPSAG(SeqFF95APSAGType value) {
        this.psag = value;
    }

    /**
     * ��ȡresa���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ARESAType }
     *     
     */
    public SeqFF95ARESAType getRESA() {
        return resa;
    }

    /**
     * ����resa���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ARESAType }
     *     
     */
    public void setRESA(SeqFF95ARESAType value) {
        this.resa = value;
    }

    /**
     * ��ȡsola���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ASOLAType }
     *     
     */
    public SeqFF95ASOLAType getSOLA() {
        return sola;
    }

    /**
     * ����sola���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ASOLAType }
     *     
     */
    public void setSOLA(SeqFF95ASOLAType value) {
        this.sola = value;
    }

    /**
     * ��ȡinfa���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AINFAType }
     *     
     */
    public SeqFF95AINFAType getINFA() {
        return infa;
    }

    /**
     * ����infa���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AINFAType }
     *     
     */
    public void setINFA(SeqFF95AINFAType value) {
        this.infa = value;
    }

}
