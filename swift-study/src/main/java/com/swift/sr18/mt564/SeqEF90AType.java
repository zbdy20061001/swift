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
 * <p>SeqE_F90a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CINL" type="{urn:swift:xsd:fin.564.2018}SeqE_F90a_CINL_Type"/>
 *         &lt;element name="OSUB" type="{urn:swift:xsd:fin.564.2018}SeqE_F90a_OSUB_Type"/>
 *         &lt;element name="MACI" type="{urn:swift:xsd:fin.564.2018}SeqE_F90a_MACI_Type"/>
 *         &lt;element name="MICI" type="{urn:swift:xsd:fin.564.2018}SeqE_F90a_MICI_Type"/>
 *         &lt;element name="MMCI" type="{urn:swift:xsd:fin.564.2018}SeqE_F90a_MMCI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F90a_Type", propOrder = {
    "cinl",
    "osub",
    "maci",
    "mici",
    "mmci"
})
public class SeqEF90AType
    extends ISO15022Field
{

    @XmlElement(name = "CINL")
    protected SeqEF90ACINLType cinl;
    @XmlElement(name = "OSUB")
    protected SeqEF90AOSUBType osub;
    @XmlElement(name = "MACI")
    protected SeqEF90AMACIType maci;
    @XmlElement(name = "MICI")
    protected SeqEF90AMICIType mici;
    @XmlElement(name = "MMCI")
    protected SeqEF90AMMCIType mmci;

    /**
     * 获取cinl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF90ACINLType }
     *     
     */
    public SeqEF90ACINLType getCINL() {
        return cinl;
    }

    /**
     * 设置cinl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF90ACINLType }
     *     
     */
    public void setCINL(SeqEF90ACINLType value) {
        this.cinl = value;
    }

    /**
     * 获取osub属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF90AOSUBType }
     *     
     */
    public SeqEF90AOSUBType getOSUB() {
        return osub;
    }

    /**
     * 设置osub属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF90AOSUBType }
     *     
     */
    public void setOSUB(SeqEF90AOSUBType value) {
        this.osub = value;
    }

    /**
     * 获取maci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF90AMACIType }
     *     
     */
    public SeqEF90AMACIType getMACI() {
        return maci;
    }

    /**
     * 设置maci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF90AMACIType }
     *     
     */
    public void setMACI(SeqEF90AMACIType value) {
        this.maci = value;
    }

    /**
     * 获取mici属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF90AMICIType }
     *     
     */
    public SeqEF90AMICIType getMICI() {
        return mici;
    }

    /**
     * 设置mici属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF90AMICIType }
     *     
     */
    public void setMICI(SeqEF90AMICIType value) {
        this.mici = value;
    }

    /**
     * 获取mmci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF90AMMCIType }
     *     
     */
    public SeqEF90AMMCIType getMMCI() {
        return mmci;
    }

    /**
     * 设置mmci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF90AMMCIType }
     *     
     */
    public void setMMCI(SeqEF90AMMCIType value) {
        this.mmci = value;
    }

}
