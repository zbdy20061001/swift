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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>F97C_2_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F97C_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="AccountCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_336_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F97C_2_Type", propOrder = {
    "accountCode"
})
public class F97C2Type
    extends FieldOption
{

    @XmlElement(name = "AccountCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec336Type accountCode;

    /**
     * ��ȡaccountCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec336Type }
     *     
     */
    public Code4Ec336Type getAccountCode() {
        return accountCode;
    }

    /**
     * ����accountCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec336Type }
     *     
     */
    public void setAccountCode(Code4Ec336Type value) {
        this.accountCode = value;
    }

}
