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
 * <p>SeqC_F93a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqC_F93a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="UNBA" type="{urn:swift:xsd:fin.564.2018}SeqC_F93a_UNBA_Type"/>
 *         &lt;element name="INBA" type="{urn:swift:xsd:fin.564.2018}SeqC_F93a_INBA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F93a_Type", propOrder = {
    "unba",
    "inba"
})
public class SeqCF93AType
    extends ISO15022Field
{

    @XmlElement(name = "UNBA")
    protected SeqCF93AUNBAType unba;
    @XmlElement(name = "INBA")
    protected SeqCF93AINBAType inba;

    /**
     * ��ȡunba���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF93AUNBAType }
     *     
     */
    public SeqCF93AUNBAType getUNBA() {
        return unba;
    }

    /**
     * ����unba���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF93AUNBAType }
     *     
     */
    public void setUNBA(SeqCF93AUNBAType value) {
        this.unba = value;
    }

    /**
     * ��ȡinba���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF93AINBAType }
     *     
     */
    public SeqCF93AINBAType getINBA() {
        return inba;
    }

    /**
     * ����inba���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF93AINBAType }
     *     
     */
    public void setINBA(SeqCF93AINBAType value) {
        this.inba = value;
    }

}