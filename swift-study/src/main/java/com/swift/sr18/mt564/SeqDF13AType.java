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
 * <p>SeqD_F13a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F13a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="COUP" type="{urn:swift:xsd:fin.564.2018}SeqD_F13a_COUP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F13a_Type", propOrder = {
    "coup"
})
public class SeqDF13AType
    extends ISO15022Field
{

    @XmlElement(name = "COUP")
    protected SeqDF13ACOUPType coup;

    /**
     * ��ȡcoup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF13ACOUPType }
     *     
     */
    public SeqDF13ACOUPType getCOUP() {
        return coup;
    }

    /**
     * ����coup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF13ACOUPType }
     *     
     */
    public void setCOUP(SeqDF13ACOUPType value) {
        this.coup = value;
    }

}
