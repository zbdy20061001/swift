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
 * <p>SeqE_F69a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F69a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PRIC" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_PRIC_Type"/>
 *         &lt;element name="REVO" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_REVO_Type"/>
 *         &lt;element name="PWAL" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_PWAL_Type"/>
 *         &lt;element name="PARL" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_PARL_Type"/>
 *         &lt;element name="SUSP" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_SUSP_Type"/>
 *         &lt;element name="AREV" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_AREV_Type"/>
 *         &lt;element name="DSWO" type="{urn:swift:xsd:fin.564.2018}SeqE_F69a_DSWO_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F69a_Type", propOrder = {
    "pric",
    "revo",
    "pwal",
    "parl",
    "susp",
    "arev",
    "dswo"
})
public class SeqEF69AType
    extends ISO15022Field
{

    @XmlElement(name = "PRIC")
    protected SeqEF69APRICType pric;
    @XmlElement(name = "REVO")
    protected SeqEF69AREVOType revo;
    @XmlElement(name = "PWAL")
    protected SeqEF69APWALType pwal;
    @XmlElement(name = "PARL")
    protected SeqEF69APARLType parl;
    @XmlElement(name = "SUSP")
    protected SeqEF69ASUSPType susp;
    @XmlElement(name = "AREV")
    protected SeqEF69AAREVType arev;
    @XmlElement(name = "DSWO")
    protected SeqEF69ADSWOType dswo;

    /**
     * ��ȡpric���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69APRICType }
     *     
     */
    public SeqEF69APRICType getPRIC() {
        return pric;
    }

    /**
     * ����pric���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69APRICType }
     *     
     */
    public void setPRIC(SeqEF69APRICType value) {
        this.pric = value;
    }

    /**
     * ��ȡrevo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69AREVOType }
     *     
     */
    public SeqEF69AREVOType getREVO() {
        return revo;
    }

    /**
     * ����revo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69AREVOType }
     *     
     */
    public void setREVO(SeqEF69AREVOType value) {
        this.revo = value;
    }

    /**
     * ��ȡpwal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69APWALType }
     *     
     */
    public SeqEF69APWALType getPWAL() {
        return pwal;
    }

    /**
     * ����pwal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69APWALType }
     *     
     */
    public void setPWAL(SeqEF69APWALType value) {
        this.pwal = value;
    }

    /**
     * ��ȡparl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69APARLType }
     *     
     */
    public SeqEF69APARLType getPARL() {
        return parl;
    }

    /**
     * ����parl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69APARLType }
     *     
     */
    public void setPARL(SeqEF69APARLType value) {
        this.parl = value;
    }

    /**
     * ��ȡsusp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69ASUSPType }
     *     
     */
    public SeqEF69ASUSPType getSUSP() {
        return susp;
    }

    /**
     * ����susp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69ASUSPType }
     *     
     */
    public void setSUSP(SeqEF69ASUSPType value) {
        this.susp = value;
    }

    /**
     * ��ȡarev���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69AAREVType }
     *     
     */
    public SeqEF69AAREVType getAREV() {
        return arev;
    }

    /**
     * ����arev���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69AAREVType }
     *     
     */
    public void setAREV(SeqEF69AAREVType value) {
        this.arev = value;
    }

    /**
     * ��ȡdswo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF69ADSWOType }
     *     
     */
    public SeqEF69ADSWOType getDSWO() {
        return dswo;
    }

    /**
     * ����dswo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF69ADSWOType }
     *     
     */
    public void setDSWO(SeqEF69ADSWOType value) {
        this.dswo = value;
    }

}
