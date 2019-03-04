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
 * <p>F90B_8_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取amountTypeCode属性的值。
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
     * 设置amountTypeCode属性的值。
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
     * 获取price属性的值。
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
     * 设置price属性的值。
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
