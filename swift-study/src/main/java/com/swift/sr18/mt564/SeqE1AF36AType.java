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
 * <p>SeqE1a_F36a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F36a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MINO" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F36a_MINO_Type"/>
 *         &lt;element name="MIEX" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F36a_MIEX_Type"/>
 *         &lt;element name="MILT" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F36a_MILT_Type"/>
 *         &lt;element name="SIZE" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F36a_SIZE_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F36a_Type", propOrder = {
    "mino",
    "miex",
    "milt",
    "size"
})
public class SeqE1AF36AType
    extends ISO15022Field
{

    @XmlElement(name = "MINO")
    protected SeqE1AF36AMINOType mino;
    @XmlElement(name = "MIEX")
    protected SeqE1AF36AMIEXType miex;
    @XmlElement(name = "MILT")
    protected SeqE1AF36AMILTType milt;
    @XmlElement(name = "SIZE")
    protected SeqE1AF36ASIZEType size;

    /**
     * 获取mino属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF36AMINOType }
     *     
     */
    public SeqE1AF36AMINOType getMINO() {
        return mino;
    }

    /**
     * 设置mino属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF36AMINOType }
     *     
     */
    public void setMINO(SeqE1AF36AMINOType value) {
        this.mino = value;
    }

    /**
     * 获取miex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF36AMIEXType }
     *     
     */
    public SeqE1AF36AMIEXType getMIEX() {
        return miex;
    }

    /**
     * 设置miex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF36AMIEXType }
     *     
     */
    public void setMIEX(SeqE1AF36AMIEXType value) {
        this.miex = value;
    }

    /**
     * 获取milt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF36AMILTType }
     *     
     */
    public SeqE1AF36AMILTType getMILT() {
        return milt;
    }

    /**
     * 设置milt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF36AMILTType }
     *     
     */
    public void setMILT(SeqE1AF36AMILTType value) {
        this.milt = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF36ASIZEType }
     *     
     */
    public SeqE1AF36ASIZEType getSIZE() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF36ASIZEType }
     *     
     */
    public void setSIZE(SeqE1AF36ASIZEType value) {
        this.size = value;
    }

}
