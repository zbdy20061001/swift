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
 * <p>SeqB1_F11a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F11a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DENO" type="{urn:swift:xsd:fin.564.2018}SeqB1_F11a_DENO_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F11a_Type", propOrder = {
    "deno"
})
public class SeqB1F11AType
    extends ISO15022Field
{

    @XmlElement(name = "DENO")
    protected SeqB1F11ADENOType deno;

    /**
     * ��ȡdeno���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F11ADENOType }
     *     
     */
    public SeqB1F11ADENOType getDENO() {
        return deno;
    }

    /**
     * ����deno���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F11ADENOType }
     *     
     */
    public void setDENO(SeqB1F11ADENOType value) {
        this.deno = value;
    }

}
