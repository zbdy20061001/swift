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
 * <p>F92K_6_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F92K_6_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="RateTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_335_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F92K_6_Type", propOrder = {
    "rateTypeCode"
})
public class F92K6Type
    extends FieldOption
{

    @XmlElement(name = "RateTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec335Type rateTypeCode;

    /**
     * ��ȡrateTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec335Type }
     *     
     */
    public Code4Ec335Type getRateTypeCode() {
        return rateTypeCode;
    }

    /**
     * ����rateTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec335Type }
     *     
     */
    public void setRateTypeCode(Code4Ec335Type value) {
        this.rateTypeCode = value;
    }

}
