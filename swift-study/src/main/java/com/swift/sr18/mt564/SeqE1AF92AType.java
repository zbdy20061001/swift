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
 * <p>SeqE1a_F92a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PRFC" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_PRFC_Type"/>
 *         &lt;element name="NWFC" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_NWFC_Type"/>
 *         &lt;element name="INTR" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_INTR_Type"/>
 *         &lt;element name="NXRT" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F92a_NXRT_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F92a_Type", propOrder = {
    "prfc",
    "nwfc",
    "intr",
    "nxrt"
})
public class SeqE1AF92AType
    extends ISO15022Field
{

    @XmlElement(name = "PRFC")
    protected SeqE1AF92APRFCType prfc;
    @XmlElement(name = "NWFC")
    protected SeqE1AF92ANWFCType nwfc;
    @XmlElement(name = "INTR")
    protected SeqE1AF92AINTRType intr;
    @XmlElement(name = "NXRT")
    protected SeqE1AF92ANXRTType nxrt;

    /**
     * ��ȡprfc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92APRFCType }
     *     
     */
    public SeqE1AF92APRFCType getPRFC() {
        return prfc;
    }

    /**
     * ����prfc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92APRFCType }
     *     
     */
    public void setPRFC(SeqE1AF92APRFCType value) {
        this.prfc = value;
    }

    /**
     * ��ȡnwfc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92ANWFCType }
     *     
     */
    public SeqE1AF92ANWFCType getNWFC() {
        return nwfc;
    }

    /**
     * ����nwfc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92ANWFCType }
     *     
     */
    public void setNWFC(SeqE1AF92ANWFCType value) {
        this.nwfc = value;
    }

    /**
     * ��ȡintr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92AINTRType }
     *     
     */
    public SeqE1AF92AINTRType getINTR() {
        return intr;
    }

    /**
     * ����intr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92AINTRType }
     *     
     */
    public void setINTR(SeqE1AF92AINTRType value) {
        this.intr = value;
    }

    /**
     * ��ȡnxrt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF92ANXRTType }
     *     
     */
    public SeqE1AF92ANXRTType getNXRT() {
        return nxrt;
    }

    /**
     * ����nxrt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF92ANXRTType }
     *     
     */
    public void setNXRT(SeqE1AF92ANXRTType value) {
        this.nxrt = value;
    }

}
