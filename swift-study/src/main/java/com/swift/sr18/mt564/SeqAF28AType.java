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
 * <p>SeqA_F28a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F28a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}MTField">
 *       &lt;choice>
 *         &lt;element name="F28E" type="{urn:swift:xsd:fin.564.2018}F28E_2_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F28a_Type", propOrder = {
    "f28E"
})
public class SeqAF28AType
    extends MTField
{

    @XmlElement(name = "F28E")
    protected F28E2Type f28E;

    /**
     * ��ȡf28E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F28E2Type }
     *     
     */
    public F28E2Type getF28E() {
        return f28E;
    }

    /**
     * ����f28E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F28E2Type }
     *     
     */
    public void setF28E(F28E2Type value) {
        this.f28E = value;
    }

}
