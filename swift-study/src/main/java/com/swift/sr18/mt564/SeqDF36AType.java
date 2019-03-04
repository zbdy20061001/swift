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
 * <p>SeqD_F36a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F36a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MQSO" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_MQSO_Type"/>
 *         &lt;element name="QTSO" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_QTSO_Type"/>
 *         &lt;element name="NBLT" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_NBLT_Type"/>
 *         &lt;element name="NEWD" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_NEWD_Type"/>
 *         &lt;element name="BASE" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_BASE_Type"/>
 *         &lt;element name="INCR" type="{urn:swift:xsd:fin.564.2018}SeqD_F36a_INCR_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F36a_Type", propOrder = {
    "mqso",
    "qtso",
    "nblt",
    "newd",
    "base",
    "incr"
})
public class SeqDF36AType
    extends ISO15022Field
{

    @XmlElement(name = "MQSO")
    protected SeqDF36AMQSOType mqso;
    @XmlElement(name = "QTSO")
    protected SeqDF36AQTSOType qtso;
    @XmlElement(name = "NBLT")
    protected SeqDF36ANBLTType nblt;
    @XmlElement(name = "NEWD")
    protected SeqDF36ANEWDType newd;
    @XmlElement(name = "BASE")
    protected SeqDF36ABASEType base;
    @XmlElement(name = "INCR")
    protected SeqDF36AINCRType incr;

    /**
     * ��ȡmqso���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36AMQSOType }
     *     
     */
    public SeqDF36AMQSOType getMQSO() {
        return mqso;
    }

    /**
     * ����mqso���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36AMQSOType }
     *     
     */
    public void setMQSO(SeqDF36AMQSOType value) {
        this.mqso = value;
    }

    /**
     * ��ȡqtso���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36AQTSOType }
     *     
     */
    public SeqDF36AQTSOType getQTSO() {
        return qtso;
    }

    /**
     * ����qtso���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36AQTSOType }
     *     
     */
    public void setQTSO(SeqDF36AQTSOType value) {
        this.qtso = value;
    }

    /**
     * ��ȡnblt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36ANBLTType }
     *     
     */
    public SeqDF36ANBLTType getNBLT() {
        return nblt;
    }

    /**
     * ����nblt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36ANBLTType }
     *     
     */
    public void setNBLT(SeqDF36ANBLTType value) {
        this.nblt = value;
    }

    /**
     * ��ȡnewd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36ANEWDType }
     *     
     */
    public SeqDF36ANEWDType getNEWD() {
        return newd;
    }

    /**
     * ����newd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36ANEWDType }
     *     
     */
    public void setNEWD(SeqDF36ANEWDType value) {
        this.newd = value;
    }

    /**
     * ��ȡbase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36ABASEType }
     *     
     */
    public SeqDF36ABASEType getBASE() {
        return base;
    }

    /**
     * ����base���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36ABASEType }
     *     
     */
    public void setBASE(SeqDF36ABASEType value) {
        this.base = value;
    }

    /**
     * ��ȡincr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF36AINCRType }
     *     
     */
    public SeqDF36AINCRType getINCR() {
        return incr;
    }

    /**
     * ����incr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF36AINCRType }
     *     
     */
    public void setINCR(SeqDF36AINCRType value) {
        this.incr = value;
    }

}
