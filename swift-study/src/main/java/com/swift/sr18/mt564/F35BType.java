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
 * <p>F35B_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F35B_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="IdentificationOfSecurity" type="{urn:swift:xsd:fin.564.2018}Identifier_Isin_Type" minOccurs="0"/>
 *         &lt;element name="DescriptionOfSecurity" type="{urn:swift:xsd:fin.564.2018}Text_FIN_4M35x_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F35B_Type", propOrder = {
    "identificationOfSecurity",
    "descriptionOfSecurity"
})
public class F35BType
    extends FieldOption
{

    @XmlElement(name = "IdentificationOfSecurity")
    protected String identificationOfSecurity;
    @XmlElement(name = "DescriptionOfSecurity")
    protected TextFIN4M35XType descriptionOfSecurity;

    /**
     * 获取identificationOfSecurity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationOfSecurity() {
        return identificationOfSecurity;
    }

    /**
     * 设置identificationOfSecurity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationOfSecurity(String value) {
        this.identificationOfSecurity = value;
    }

    /**
     * 获取descriptionOfSecurity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TextFIN4M35XType }
     *     
     */
    public TextFIN4M35XType getDescriptionOfSecurity() {
        return descriptionOfSecurity;
    }

    /**
     * 设置descriptionOfSecurity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TextFIN4M35XType }
     *     
     */
    public void setDescriptionOfSecurity(TextFIN4M35XType value) {
        this.descriptionOfSecurity = value;
    }

}
