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
 * <p>SeqE1a_F94a_PLIS_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F94a_PLIS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F94B" type="{urn:swift:xsd:fin.564.2018}F94B_30_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F94a_PLIS_Type", propOrder = {
    "f94B"
})
public class SeqE1AF94APLISType
    extends Qualifier
{

    @XmlElement(name = "F94B")
    protected F94B30Type f94B;

    /**
     * ��ȡf94B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F94B30Type }
     *     
     */
    public F94B30Type getF94B() {
        return f94B;
    }

    /**
     * ����f94B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F94B30Type }
     *     
     */
    public void setF94B(F94B30Type value) {
        this.f94B = value;
    }

}
