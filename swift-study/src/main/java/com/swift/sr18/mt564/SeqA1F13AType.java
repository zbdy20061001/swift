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
 * <p>SeqA1_F13a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA1_F13a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="LINK" type="{urn:swift:xsd:fin.564.2018}SeqA1_F13a_LINK_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_F13a_Type", propOrder = {
    "link"
})
public class SeqA1F13AType
    extends ISO15022Field
{

    @XmlElement(name = "LINK")
    protected SeqA1F13ALINKType link;

    /**
     * ��ȡlink���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F13ALINKType }
     *     
     */
    public SeqA1F13ALINKType getLINK() {
        return link;
    }

    /**
     * ����link���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F13ALINKType }
     *     
     */
    public void setLINK(SeqA1F13ALINKType value) {
        this.link = value;
    }

}
