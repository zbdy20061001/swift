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
 * <p>SeqE1a_F98a_CONV_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F98a_CONV_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F98A" type="{urn:swift:xsd:fin.564.2018}F98A_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F98a_CONV_Type", propOrder = {
    "f98A"
})
public class SeqE1AF98ACONVType
    extends Qualifier
{

    @XmlElement(name = "F98A")
    protected F98AType f98A;

    /**
     * ��ȡf98A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F98AType }
     *     
     */
    public F98AType getF98A() {
        return f98A;
    }

    /**
     * ����f98A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F98AType }
     *     
     */
    public void setF98A(F98AType value) {
        this.f98A = value;
    }

}
