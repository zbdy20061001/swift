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
 * <p>SeqE_F94a_DOMI_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F94a_DOMI_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F94C" type="{urn:swift:xsd:fin.564.2018}F94C_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F94a_DOMI_Type", propOrder = {
    "f94C"
})
public class SeqEF94ADOMIType
    extends Qualifier
{

    @XmlElement(name = "F94C")
    protected F94CType f94C;

    /**
     * ��ȡf94C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F94CType }
     *     
     */
    public F94CType getF94C() {
        return f94C;
    }

    /**
     * ����f94C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F94CType }
     *     
     */
    public void setF94C(F94CType value) {
        this.f94C = value;
    }

}
