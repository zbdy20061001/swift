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
 * <p>F97E_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F97E_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="InternationalBankAccountNumber" type="{urn:swift:xsd:fin.564.2018}Identifier_FIN_34x_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F97E_Type", propOrder = {
    "internationalBankAccountNumber"
})
public class F97EType
    extends FieldOption
{

    @XmlElement(name = "InternationalBankAccountNumber", required = true)
    protected String internationalBankAccountNumber;

    /**
     * ��ȡinternationalBankAccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalBankAccountNumber() {
        return internationalBankAccountNumber;
    }

    /**
     * ����internationalBankAccountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalBankAccountNumber(String value) {
        this.internationalBankAccountNumber = value;
    }

}
