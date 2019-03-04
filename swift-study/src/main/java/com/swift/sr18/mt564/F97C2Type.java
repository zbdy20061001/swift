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
 * <p>F97C_2_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取accountCode属性的值。
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
     * 设置accountCode属性的值。
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
