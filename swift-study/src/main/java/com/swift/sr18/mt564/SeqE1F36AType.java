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
 * <p>SeqE1_F36a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F36a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ENTL" type="{urn:swift:xsd:fin.564.2018}SeqE1_F36a_ENTL_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F36a_Type", propOrder = {
    "entl"
})
public class SeqE1F36AType
    extends ISO15022Field
{

    @XmlElement(name = "ENTL")
    protected SeqE1F36AENTLType entl;

    /**
     * ��ȡentl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F36AENTLType }
     *     
     */
    public SeqE1F36AENTLType getENTL() {
        return entl;
    }

    /**
     * ����entl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F36AENTLType }
     *     
     */
    public void setENTL(SeqE1F36AENTLType value) {
        this.entl = value;
    }

}
