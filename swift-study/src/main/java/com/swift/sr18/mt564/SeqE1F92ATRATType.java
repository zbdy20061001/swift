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
 * <p>SeqE1_F92a_TRAT_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F92a_TRAT_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92A" type="{urn:swift:xsd:fin.564.2018}F92A_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F92a_TRAT_Type", propOrder = {
    "f92A"
})
public class SeqE1F92ATRATType
    extends Qualifier
{

    @XmlElement(name = "F92A")
    protected F92AType f92A;

    /**
     * ��ȡf92A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92AType }
     *     
     */
    public F92AType getF92A() {
        return f92A;
    }

    /**
     * ����f92A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92AType }
     *     
     */
    public void setF92A(F92AType value) {
        this.f92A = value;
    }

}
