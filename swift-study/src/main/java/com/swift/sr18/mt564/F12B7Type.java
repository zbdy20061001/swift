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
 * <p>F12B_7_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="F12B_7_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="DataSourceScheme" type="{urn:swift:xsd:fin.564.2018}Identifier_FIN_8c_Type" minOccurs="0"/>
 *         &lt;element name="InstrumentTypeCode" type="{urn:swift:xsd:fin.564.2018}OptionalCode_4Ec_446_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F12B_7_Type", propOrder = {
    "dataSourceScheme",
    "instrumentTypeCode"
})
public class F12B7Type
    extends FieldOption
{

    @XmlElement(name = "DataSourceScheme")
    protected String dataSourceScheme;
    @XmlElement(name = "InstrumentTypeCode", required = true)
    protected String instrumentTypeCode;

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
     * 获取instrumentTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentTypeCode() {
        return instrumentTypeCode;
    }

    /**
     * 设置instrumentTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentTypeCode(String value) {
        this.instrumentTypeCode = value;
    }

}
