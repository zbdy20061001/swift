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
 * <p>F28E_2_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F28E_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="PageNumber" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_5n_Type"/>
 *         &lt;element name="ContinuationIndicator" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_333_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F28E_2_Type", propOrder = {
    "pageNumber",
    "continuationIndicator"
})
public class F28E2Type
    extends FieldOption
{

    @XmlElement(name = "PageNumber", required = true)
    protected String pageNumber;
    @XmlElement(name = "ContinuationIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec333Type continuationIndicator;

    /**
     * 获取pageNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * 设置pageNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

    /**
     * 获取continuationIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec333Type }
     *     
     */
    public Code4Ec333Type getContinuationIndicator() {
        return continuationIndicator;
    }

    /**
     * 设置continuationIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec333Type }
     *     
     */
    public void setContinuationIndicator(Code4Ec333Type value) {
        this.continuationIndicator = value;
    }

}
