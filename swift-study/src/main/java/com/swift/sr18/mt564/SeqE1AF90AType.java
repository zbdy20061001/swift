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
 * <p>SeqE1a_F90a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ISSU" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F90a_ISSU_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F90a_Type", propOrder = {
    "issu"
})
public class SeqE1AF90AType
    extends ISO15022Field
{

    @XmlElement(name = "ISSU")
    protected SeqE1AF90AISSUType issu;

    /**
     * ��ȡissu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF90AISSUType }
     *     
     */
    public SeqE1AF90AISSUType getISSU() {
        return issu;
    }

    /**
     * ����issu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF90AISSUType }
     *     
     */
    public void setISSU(SeqE1AF90AISSUType value) {
        this.issu = value;
    }

}
