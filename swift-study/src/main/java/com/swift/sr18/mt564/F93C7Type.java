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
 * <p>F93C_7_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F93C_7_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="QuantityTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_317_Type"/>
 *         &lt;element name="BalanceTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_390_Type"/>
 *         &lt;element name="Sign" type="{urn:swift:xsd:fin.564.2018}Text_Sign_Type" minOccurs="0"/>
 *         &lt;element name="Balance" type="{urn:swift:xsd:fin.564.2018}Amount_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F93C_7_Type", propOrder = {
    "quantityTypeCode",
    "balanceTypeCode",
    "sign",
    "balance"
})
public class F93C7Type
    extends FieldOption
{

    @XmlElement(name = "QuantityTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec317Type quantityTypeCode;
    @XmlElement(name = "BalanceTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec390Type balanceTypeCode;
    @XmlElement(name = "Sign")
    protected String sign;
    @XmlElement(name = "Balance", required = true)
    protected String balance;

    /**
     * 获取quantityTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec317Type }
     *     
     */
    public Code4Ec317Type getQuantityTypeCode() {
        return quantityTypeCode;
    }

    /**
     * 设置quantityTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec317Type }
     *     
     */
    public void setQuantityTypeCode(Code4Ec317Type value) {
        this.quantityTypeCode = value;
    }

    /**
     * 获取balanceTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec390Type }
     *     
     */
    public Code4Ec390Type getBalanceTypeCode() {
        return balanceTypeCode;
    }

    /**
     * 设置balanceTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec390Type }
     *     
     */
    public void setBalanceTypeCode(Code4Ec390Type value) {
        this.balanceTypeCode = value;
    }

    /**
     * 获取sign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置sign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * 获取balance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalance() {
        return balance;
    }

    /**
     * 设置balance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalance(String value) {
        this.balance = value;
    }

}
