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
 * <p>SeqB2_F95a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB2_F95a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ACOW" type="{urn:swift:xsd:fin.564.2018}SeqB2_F95a_ACOW_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_F95a_Type", propOrder = {
    "acow"
})
public class SeqB2F95AType
    extends ISO15022Field
{

    @XmlElement(name = "ACOW")
    protected SeqB2F95AACOWType acow;

    /**
     * ��ȡacow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F95AACOWType }
     *     
     */
    public SeqB2F95AACOWType getACOW() {
        return acow;
    }

    /**
     * ����acow���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F95AACOWType }
     *     
     */
    public void setACOW(SeqB2F95AACOWType value) {
        this.acow = value;
    }

}
