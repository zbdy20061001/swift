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
 * <p>SeqE_F36a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F36a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MAEX" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_MAEX_Type"/>
 *         &lt;element name="MIEX" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_MIEX_Type"/>
 *         &lt;element name="MILT" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_MILT_Type"/>
 *         &lt;element name="NBLT" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_NBLT_Type"/>
 *         &lt;element name="NEWD" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_NEWD_Type"/>
 *         &lt;element name="BOLQ" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_BOLQ_Type"/>
 *         &lt;element name="FOLQ" type="{urn:swift:xsd:fin.564.2018}SeqE_F36a_FOLQ_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F36a_Type", propOrder = {
    "maex",
    "miex",
    "milt",
    "nblt",
    "newd",
    "bolq",
    "folq"
})
public class SeqEF36AType
    extends ISO15022Field
{

    @XmlElement(name = "MAEX")
    protected SeqEF36AMAEXType maex;
    @XmlElement(name = "MIEX")
    protected SeqEF36AMIEXType miex;
    @XmlElement(name = "MILT")
    protected SeqEF36AMILTType milt;
    @XmlElement(name = "NBLT")
    protected SeqEF36ANBLTType nblt;
    @XmlElement(name = "NEWD")
    protected SeqEF36ANEWDType newd;
    @XmlElement(name = "BOLQ")
    protected SeqEF36ABOLQType bolq;
    @XmlElement(name = "FOLQ")
    protected SeqEF36AFOLQType folq;

    /**
     * ��ȡmaex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36AMAEXType }
     *     
     */
    public SeqEF36AMAEXType getMAEX() {
        return maex;
    }

    /**
     * ����maex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36AMAEXType }
     *     
     */
    public void setMAEX(SeqEF36AMAEXType value) {
        this.maex = value;
    }

    /**
     * ��ȡmiex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36AMIEXType }
     *     
     */
    public SeqEF36AMIEXType getMIEX() {
        return miex;
    }

    /**
     * ����miex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36AMIEXType }
     *     
     */
    public void setMIEX(SeqEF36AMIEXType value) {
        this.miex = value;
    }

    /**
     * ��ȡmilt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36AMILTType }
     *     
     */
    public SeqEF36AMILTType getMILT() {
        return milt;
    }

    /**
     * ����milt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36AMILTType }
     *     
     */
    public void setMILT(SeqEF36AMILTType value) {
        this.milt = value;
    }

    /**
     * ��ȡnblt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36ANBLTType }
     *     
     */
    public SeqEF36ANBLTType getNBLT() {
        return nblt;
    }

    /**
     * ����nblt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36ANBLTType }
     *     
     */
    public void setNBLT(SeqEF36ANBLTType value) {
        this.nblt = value;
    }

    /**
     * ��ȡnewd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36ANEWDType }
     *     
     */
    public SeqEF36ANEWDType getNEWD() {
        return newd;
    }

    /**
     * ����newd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36ANEWDType }
     *     
     */
    public void setNEWD(SeqEF36ANEWDType value) {
        this.newd = value;
    }

    /**
     * ��ȡbolq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36ABOLQType }
     *     
     */
    public SeqEF36ABOLQType getBOLQ() {
        return bolq;
    }

    /**
     * ����bolq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36ABOLQType }
     *     
     */
    public void setBOLQ(SeqEF36ABOLQType value) {
        this.bolq = value;
    }

    /**
     * ��ȡfolq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF36AFOLQType }
     *     
     */
    public SeqEF36AFOLQType getFOLQ() {
        return folq;
    }

    /**
     * ����folq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF36AFOLQType }
     *     
     */
    public void setFOLQ(SeqEF36AFOLQType value) {
        this.folq = value;
    }

}
