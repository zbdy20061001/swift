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
 * <p>SeqE1_F22a_2_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F22a_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DISF" type="{urn:swift:xsd:fin.564.2018}SeqE1_F22a_2_DISF_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F22a_2_Type", propOrder = {
    "disf"
})
public class SeqE1F22A2Type
    extends ISO15022Field
{

    @XmlElement(name = "DISF")
    protected SeqE1F22A2DISFType disf;

    /**
     * ��ȡdisf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F22A2DISFType }
     *     
     */
    public SeqE1F22A2DISFType getDISF() {
        return disf;
    }

    /**
     * ����disf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F22A2DISFType }
     *     
     */
    public void setDISF(SeqE1F22A2DISFType value) {
        this.disf = value;
    }

}
