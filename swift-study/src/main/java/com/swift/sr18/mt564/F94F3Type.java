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
 * <p>F94F_3_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F94F_3_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="PlaceCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_283_Type"/>
 *         &lt;element name="IdentifierCode" type="{urn:swift:xsd:fin.564.2018}Identifier_BICFIOrNonFI_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F94F_3_Type", propOrder = {
    "placeCode",
    "identifierCode"
})
public class F94F3Type
    extends FieldOption
{

    @XmlElement(name = "PlaceCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec283Type placeCode;
    @XmlElement(name = "IdentifierCode", required = true)
    protected String identifierCode;

    /**
     * 获取placeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec283Type }
     *     
     */
    public Code4Ec283Type getPlaceCode() {
        return placeCode;
    }

    /**
     * 设置placeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec283Type }
     *     
     */
    public void setPlaceCode(Code4Ec283Type value) {
        this.placeCode = value;
    }

    /**
     * 获取identifierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierCode() {
        return identifierCode;
    }

    /**
     * 设置identifierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierCode(String value) {
        this.identifierCode = value;
    }

}
