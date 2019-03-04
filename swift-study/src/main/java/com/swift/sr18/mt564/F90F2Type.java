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
 * <p>F90F_2_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F90F_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="AmountTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_342_Type"/>
 *         &lt;element name="CurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Amount" type="{urn:swift:xsd:fin.564.2018}Amount_FIN_15d_Type"/>
 *         &lt;element name="QuantityTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_351_Type"/>
 *         &lt;element name="Quantity" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F90F_2_Type", propOrder = {
    "amountTypeCode",
    "currencyCode",
    "amount",
    "quantityTypeCode",
    "quantity"
})
public class F90F2Type
    extends FieldOption
{

    @XmlElement(name = "AmountTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec342Type amountTypeCode;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "QuantityTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec351Type quantityTypeCode;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;

    /**
     * ��ȡamountTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec342Type }
     *     
     */
    public Code4Ec342Type getAmountTypeCode() {
        return amountTypeCode;
    }

    /**
     * ����amountTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec342Type }
     *     
     */
    public void setAmountTypeCode(Code4Ec342Type value) {
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
     * ��ȡamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * ��ȡquantityTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec351Type }
     *     
     */
    public Code4Ec351Type getQuantityTypeCode() {
        return quantityTypeCode;
    }

    /**
     * ����quantityTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec351Type }
     *     
     */
    public void setQuantityTypeCode(Code4Ec351Type value) {
        this.quantityTypeCode = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

}
