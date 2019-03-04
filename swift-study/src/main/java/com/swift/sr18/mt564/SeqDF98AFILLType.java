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
 * <p>SeqD_F98a_FILL_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F98a_FILL_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F98A" type="{urn:swift:xsd:fin.564.2018}F98A_Type"/>
 *         &lt;element name="F98B" type="{urn:swift:xsd:fin.564.2018}F98B_25_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F98a_FILL_Type", propOrder = {
    "f98A",
    "f98B"
})
public class SeqDF98AFILLType
    extends Qualifier
{

    @XmlElement(name = "F98A")
    protected F98AType f98A;
    @XmlElement(name = "F98B")
    protected F98B25Type f98B;

    /**
     * 获取f98A属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F98AType }
     *     
     */
    public F98AType getF98A() {
        return f98A;
    }

    /**
     * 设置f98A属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F98AType }
     *     
     */
    public void setF98A(F98AType value) {
        this.f98A = value;
    }

    /**
     * 获取f98B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F98B25Type }
     *     
     */
    public F98B25Type getF98B() {
        return f98B;
    }

    /**
     * 设置f98B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F98B25Type }
     *     
     */
    public void setF98B(F98B25Type value) {
        this.f98B = value;
    }

}
