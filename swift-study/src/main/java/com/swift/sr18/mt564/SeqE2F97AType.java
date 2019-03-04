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
 * <p>SeqE2_F97a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F97a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CASH" type="{urn:swift:xsd:fin.564.2018}SeqE2_F97a_CASH_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F97a_Type", propOrder = {
    "cash"
})
public class SeqE2F97AType
    extends ISO15022Field
{

    @XmlElement(name = "CASH")
    protected SeqE2F97ACASHType cash;

    /**
     * ��ȡcash���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F97ACASHType }
     *     
     */
    public SeqE2F97ACASHType getCASH() {
        return cash;
    }

    /**
     * ����cash���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F97ACASHType }
     *     
     */
    public void setCASH(SeqE2F97ACASHType value) {
        this.cash = value;
    }

}