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
 * <p>F90E_9_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F90E_9_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="PriceCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_350_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F90E_9_Type", propOrder = {
    "priceCode"
})
public class F90E9Type
    extends FieldOption
{

    @XmlElement(name = "PriceCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec350Type priceCode;

    /**
     * ��ȡpriceCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec350Type }
     *     
     */
    public Code4Ec350Type getPriceCode() {
        return priceCode;
    }

    /**
     * ����priceCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec350Type }
     *     
     */
    public void setPriceCode(Code4Ec350Type value) {
        this.priceCode = value;
    }

}
