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
 * <p>SeqE_F35a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F35a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}MTField">
 *       &lt;choice>
 *         &lt;element name="F35B" type="{urn:swift:xsd:fin.564.2018}F35B_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F35a_Type", propOrder = {
    "f35B"
})
public class SeqEF35AType
    extends MTField
{

    @XmlElement(name = "F35B")
    protected F35BType f35B;

    /**
     * ��ȡf35B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F35BType }
     *     
     */
    public F35BType getF35B() {
        return f35B;
    }

    /**
     * ����f35B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F35BType }
     *     
     */
    public void setF35B(F35BType value) {
        this.f35B = value;
    }

}
