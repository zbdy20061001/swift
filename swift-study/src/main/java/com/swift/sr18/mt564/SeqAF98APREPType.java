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
 * <p>SeqA_F98a_PREP_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqA_F98a_PREP_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F98A" type="{urn:swift:xsd:fin.564.2018}F98A_Type"/>
 *         &lt;element name="F98C" type="{urn:swift:xsd:fin.564.2018}F98C_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F98a_PREP_Type", propOrder = {
    "f98A",
    "f98C"
})
public class SeqAF98APREPType
    extends Qualifier
{

    @XmlElement(name = "F98A")
    protected F98AType f98A;
    @XmlElement(name = "F98C")
    protected F98CType f98C;

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
     * 获取f98C属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F98CType }
     *     
     */
    public F98CType getF98C() {
        return f98C;
    }

    /**
     * 设置f98C属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F98CType }
     *     
     */
    public void setF98C(F98CType value) {
        this.f98C = value;
    }

}
