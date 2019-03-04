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
 * <p>SeqE1_F22a_1_CRDB_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F22a_1_CRDB_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F22H" type="{urn:swift:xsd:fin.564.2018}F22H_85_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F22a_1_CRDB_Type", propOrder = {
    "f22H"
})
public class SeqE1F22A1CRDBType
    extends Qualifier
{

    @XmlElement(name = "F22H")
    protected F22H85Type f22H;

    /**
     * 获取f22H属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F22H85Type }
     *     
     */
    public F22H85Type getF22H() {
        return f22H;
    }

    /**
     * 设置f22H属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F22H85Type }
     *     
     */
    public void setF22H(F22H85Type value) {
        this.f22H = value;
    }

}
