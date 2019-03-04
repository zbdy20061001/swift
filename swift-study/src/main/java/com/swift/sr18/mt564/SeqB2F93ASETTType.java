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
 * <p>SeqB2_F93a_SETT_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB2_F93a_SETT_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F93B" type="{urn:swift:xsd:fin.564.2018}F93B_4_Type"/>
 *         &lt;element name="F93C" type="{urn:swift:xsd:fin.564.2018}F93C_6_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_F93a_SETT_Type", propOrder = {
    "f93B",
    "f93C"
})
public class SeqB2F93ASETTType
    extends Qualifier
{

    @XmlElement(name = "F93B")
    protected F93B4Type f93B;
    @XmlElement(name = "F93C")
    protected F93C6Type f93C;

    /**
     * 获取f93B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F93B4Type }
     *     
     */
    public F93B4Type getF93B() {
        return f93B;
    }

    /**
     * 设置f93B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F93B4Type }
     *     
     */
    public void setF93B(F93B4Type value) {
        this.f93B = value;
    }

    /**
     * 获取f93C属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F93C6Type }
     *     
     */
    public F93C6Type getF93C() {
        return f93C;
    }

    /**
     * 设置f93C属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F93C6Type }
     *     
     */
    public void setF93C(F93C6Type value) {
        this.f93C = value;
    }

}
