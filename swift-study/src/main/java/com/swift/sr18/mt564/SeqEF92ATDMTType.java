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
 * <p>SeqE_F92a_TDMT_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F92a_TDMT_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92J" type="{urn:swift:xsd:fin.564.2018}F92J_16_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F92a_TDMT_Type", propOrder = {
    "f92J"
})
public class SeqEF92ATDMTType
    extends Qualifier
{

    @XmlElement(name = "F92J")
    protected F92J16Type f92J;

    /**
     * ��ȡf92J���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92J16Type }
     *     
     */
    public F92J16Type getF92J() {
        return f92J;
    }

    /**
     * ����f92J���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92J16Type }
     *     
     */
    public void setF92J(F92J16Type value) {
        this.f92J = value;
    }

}
