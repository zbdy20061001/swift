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
 * <p>SeqE2_F97a_CASH_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F97a_CASH_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F97A" type="{urn:swift:xsd:fin.564.2018}F97A_Type"/>
 *         &lt;element name="F97E" type="{urn:swift:xsd:fin.564.2018}F97E_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F97a_CASH_Type", propOrder = {
    "f97A",
    "f97E"
})
public class SeqE2F97ACASHType
    extends Qualifier
{

    @XmlElement(name = "F97A")
    protected F97AType f97A;
    @XmlElement(name = "F97E")
    protected F97EType f97E;

    /**
     * ��ȡf97A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F97AType }
     *     
     */
    public F97AType getF97A() {
        return f97A;
    }

    /**
     * ����f97A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F97AType }
     *     
     */
    public void setF97A(F97AType value) {
        this.f97A = value;
    }

    /**
     * ��ȡf97E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F97EType }
     *     
     */
    public F97EType getF97E() {
        return f97E;
    }

    /**
     * ����f97E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F97EType }
     *     
     */
    public void setF97E(F97EType value) {
        this.f97E = value;
    }

}
