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
 * <p>F90J_2_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F90J_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="AmountTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_342_Type"/>
 *         &lt;element name="CurrencyCode1" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Amount1" type="{urn:swift:xsd:fin.564.2018}Amount_FIN_15d_Type"/>
 *         &lt;element name="CurrencyCode2" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Amount2" type="{urn:swift:xsd:fin.564.2018}Amount_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F90J_2_Type", propOrder = {
    "amountTypeCode",
    "currencyCode1",
    "amount1",
    "currencyCode2",
    "amount2"
})
public class F90J2Type
    extends FieldOption
{

    @XmlElement(name = "AmountTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec342Type amountTypeCode;
    @XmlElement(name = "CurrencyCode1", required = true)
    protected String currencyCode1;
    @XmlElement(name = "Amount1", required = true)
    protected String amount1;
    @XmlElement(name = "CurrencyCode2", required = true)
    protected String currencyCode2;
    @XmlElement(name = "Amount2", required = true)
    protected String amount2;

    /**
     * 获取amountTypeCode属性的值。
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
     * 设置amountTypeCode属性的值。
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
     * 获取currencyCode1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode1() {
        return currencyCode1;
    }

    /**
     * 设置currencyCode1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode1(String value) {
        this.currencyCode1 = value;
    }

    /**
     * 获取amount1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount1() {
        return amount1;
    }

    /**
     * 设置amount1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount1(String value) {
        this.amount1 = value;
    }

    /**
     * 获取currencyCode2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode2() {
        return currencyCode2;
    }

    /**
     * 设置currencyCode2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode2(String value) {
        this.currencyCode2 = value;
    }

    /**
     * 获取amount2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount2() {
        return amount2;
    }

    /**
     * 设置amount2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount2(String value) {
        this.amount2 = value;
    }

}
