//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.05 时间 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>F92H_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F92H_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Amount" type="{urn:swift:xsd:fin.564.2018}Amount_FIN_15d_Type"/>
 *         &lt;element name="RateStatus" type="{urn:swift:xsd:fin.564.2018}OptionalCode_4Ec_709_4_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F92H_Type", propOrder = {
    "currencyCode",
    "amount",
    "rateStatus"
})
public class F92HType
    extends FieldOption
{

    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "RateStatus", required = true)
    @XmlSchemaType(name = "string")
    protected OptionalCode4Ec7094Type rateStatus;

    /**
     * 获取currencyCode属性的值。
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
     * 设置currencyCode属性的值。
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
     * 获取amount属性的值。
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
     * 设置amount属性的值。
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
     * 获取rateStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OptionalCode4Ec7094Type }
     *     
     */
    public OptionalCode4Ec7094Type getRateStatus() {
        return rateStatus;
    }

    /**
     * 设置rateStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalCode4Ec7094Type }
     *     
     */
    public void setRateStatus(OptionalCode4Ec7094Type value) {
        this.rateStatus = value;
    }

}
