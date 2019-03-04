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
 * <p>SeqE2_F92a_EXCH_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F92a_EXCH_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92B" type="{urn:swift:xsd:fin.564.2018}F92B_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F92a_EXCH_Type", propOrder = {
    "f92B"
})
public class SeqE2F92AEXCHType
    extends Qualifier
{

    @XmlElement(name = "F92B")
    protected F92BType f92B;

    /**
     * 获取f92B属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F92BType }
     *     
     */
    public F92BType getF92B() {
        return f92B;
    }

    /**
     * 设置f92B属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F92BType }
     *     
     */
    public void setF92B(F92BType value) {
        this.f92B = value;
    }

}
