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
 * <p>F95R_4_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F95R_4_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="DataSourceScheme" type="{urn:swift:xsd:fin.564.2018}Identifier_FIN_8c_Type"/>
 *         &lt;element name="ProprietaryCode" type="{urn:swift:xsd:fin.564.2018}Text_FIN_34x_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F95R_4_Type", propOrder = {
    "dataSourceScheme",
    "proprietaryCode"
})
public class F95R4Type
    extends FieldOption
{

    @XmlElement(name = "DataSourceScheme", required = true)
    protected String dataSourceScheme;
    @XmlElement(name = "ProprietaryCode", required = true)
    protected String proprietaryCode;

    /**
     * 获取dataSourceScheme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceScheme() {
        return dataSourceScheme;
    }

    /**
     * 设置dataSourceScheme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceScheme(String value) {
        this.dataSourceScheme = value;
    }

    /**
     * 获取proprietaryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryCode() {
        return proprietaryCode;
    }

    /**
     * 设置proprietaryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryCode(String value) {
        this.proprietaryCode = value;
    }

}
