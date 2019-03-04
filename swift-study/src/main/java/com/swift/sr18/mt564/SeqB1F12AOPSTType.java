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
 * <p>SeqB1_F12a_OPST_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F12a_OPST_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F12B" type="{urn:swift:xsd:fin.564.2018}F12B_7_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F12a_OPST_Type", propOrder = {
    "f12B"
})
public class SeqB1F12AOPSTType
    extends Qualifier
{

    @XmlElement(name = "F12B")
    protected F12B7Type f12B;

    /**
     * 获取f12B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F12B7Type }
     *     
     */
    public F12B7Type getF12B() {
        return f12B;
    }

    /**
     * 设置f12B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F12B7Type }
     *     
     */
    public void setF12B(F12B7Type value) {
        this.f12B = value;
    }

}
