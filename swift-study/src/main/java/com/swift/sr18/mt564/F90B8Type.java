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
 * <p>F90B_8_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F90B_8_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="AmountTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_405_Type"/>
 *         &lt;element name="CurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Price" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F90B_8_Type", propOrder = {
    "amountTypeCode",
    "currencyCode",
    "price"
})
public class F90B8Type
    extends FieldOption
{

    @XmlElement(name = "AmountTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec405Type amountTypeCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "Price", required = true)
    protected String price;

    /**
     * ��ȡamountTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec405Type }
     *     
     */
    public Code4Ec405Type getAmountTypeCode() {
        return amountTypeCode;
    }

    /**
     * ����amountTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec405Type }
     *     
     */
    public void setAmountTypeCode(Code4Ec405Type value) {
        this.amountTypeCode = value;
    }

    /**
     * ��ȡcurrencyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡprice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * ����price���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

}
