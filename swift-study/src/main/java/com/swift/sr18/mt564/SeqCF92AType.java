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
 * <p>SeqC_F92a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqC_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="RTUN" type="{urn:swift:xsd:fin.564.2018}SeqC_F92a_RTUN_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F92a_Type", propOrder = {
    "rtun"
})
public class SeqCF92AType
    extends ISO15022Field
{

    @XmlElement(name = "RTUN")
    protected SeqCF92ARTUNType rtun;

    /**
     * ��ȡrtun���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF92ARTUNType }
     *     
     */
    public SeqCF92ARTUNType getRTUN() {
        return rtun;
    }

    /**
     * ����rtun���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF92ARTUNType }
     *     
     */
    public void setRTUN(SeqCF92ARTUNType value) {
        this.rtun = value;
    }

}
