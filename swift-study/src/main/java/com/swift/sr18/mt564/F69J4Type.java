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
 * <p>F69J_4_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F69J_4_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="DateCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_340_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F69J_4_Type", propOrder = {
    "dateCode"
})
public class F69J4Type
    extends FieldOption
{

    @XmlElement(name = "DateCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec340Type dateCode;

    /**
     * 获取dateCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec340Type }
     *     
     */
    public Code4Ec340Type getDateCode() {
        return dateCode;
    }

    /**
     * 设置dateCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec340Type }
     *     
     */
    public void setDateCode(Code4Ec340Type value) {
        this.dateCode = value;
    }

}
