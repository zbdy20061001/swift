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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>F92L_1_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F92L_1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="FirstCurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Amount1" type="{urn:swift:xsd:fin.564.2018}Amount_FIN_15d_Type"/>
 *         &lt;element name="SecondCurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
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
@XmlType(name = "F92L_1_Type", propOrder = {
    "firstCurrencyCode",
    "amount1",
    "secondCurrencyCode",
    "amount2"
})
public class F92L1Type
    extends FieldOption
{

    @XmlElement(name = "FirstCurrencyCode", required = true)
    protected String firstCurrencyCode;
    @XmlElement(name = "Amount1", required = true)
    protected String amount1;
    @XmlElement(name = "SecondCurrencyCode", required = true)
    protected String secondCurrencyCode;
    @XmlElement(name = "Amount2", required = true)
    protected String amount2;

    /**
     * 获取firstCurrencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstCurrencyCode() {
        return firstCurrencyCode;
    }

    /**
     * 设置firstCurrencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstCurrencyCode(String value) {
        this.firstCurrencyCode = value;
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
     * 获取secondCurrencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondCurrencyCode() {
        return secondCurrencyCode;
    }

    /**
     * 设置secondCurrencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondCurrencyCode(String value) {
        this.secondCurrencyCode = value;
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
