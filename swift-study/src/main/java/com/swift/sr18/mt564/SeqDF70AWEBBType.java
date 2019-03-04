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
 * <p>SeqD_F70a_WEBB_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F70a_WEBB_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F70E" type="{urn:swift:xsd:fin.564.2018}F70E_Type"/>
 *         &lt;element name="F70G" type="{urn:swift:xsd:fin.564.2018}F70G_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F70a_WEBB_Type", propOrder = {
    "f70E",
    "f70G"
})
public class SeqDF70AWEBBType
    extends Qualifier
{

    @XmlElement(name = "F70E")
    protected F70EType f70E;
    @XmlElement(name = "F70G")
    protected F70GType f70G;

    /**
     * 获取f70E属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F70EType }
     *     
     */
    public F70EType getF70E() {
        return f70E;
    }

    /**
     * 设置f70E属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F70EType }
     *     
     */
    public void setF70E(F70EType value) {
        this.f70E = value;
    }

    /**
     * 获取f70G属性的值。
     * 
     * @return
     *     possible object is
     *     {@link F70GType }
     *     
     */
    public F70GType getF70G() {
        return f70G;
    }

    /**
     * 设置f70G属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link F70GType }
     *     
     */
    public void setF70G(F70GType value) {
        this.f70G = value;
    }

}
