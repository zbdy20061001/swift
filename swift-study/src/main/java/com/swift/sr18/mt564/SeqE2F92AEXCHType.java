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
 * <p>SeqE2_F92a_EXCH_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F92a_EXCH_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92B" type="{urn:swift:xsd:fin.564.2018}F92B_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F92a_EXCH_Type", propOrder = {
    "f92B"
})
public class SeqE2F92AEXCHType
    extends Qualifier
{

    @XmlElement(name = "F92B")
    protected F92BType f92B;

    /**
     * ��ȡf92B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92BType }
     *     
     */
    public F92BType getF92B() {
        return f92B;
    }

    /**
     * ����f92B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92BType }
     *     
     */
    public void setF92B(F92BType value) {
        this.f92B = value;
    }

}
