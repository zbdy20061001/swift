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
 * <p>SeqE_F17a_CHAN_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F17a_CHAN_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F17B" type="{urn:swift:xsd:fin.564.2018}F17B_15_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F17a_CHAN_Type", propOrder = {
    "f17B"
})
public class SeqEF17ACHANType
    extends Qualifier
{

    @XmlElement(name = "F17B")
    protected F17B15Type f17B;

    /**
     * ��ȡf17B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F17B15Type }
     *     
     */
    public F17B15Type getF17B() {
        return f17B;
    }

    /**
     * ����f17B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F17B15Type }
     *     
     */
    public void setF17B(F17B15Type value) {
        this.f17B = value;
    }

}
