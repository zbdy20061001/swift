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
 * <p>Document complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MT564" type="{urn:swift:xsd:fin.564.2018}MT564_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mt564"
})
public class Document {

    @XmlElement(name = "MT564", required = true)
    protected MT564Type mt564;

    /**
     * ��ȡmt564���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MT564Type }
     *     
     */
    public MT564Type getMT564() {
        return mt564;
    }

    /**
     * ����mt564���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MT564Type }
     *     
     */
    public void setMT564(MT564Type value) {
        this.mt564 = value;
    }

}
