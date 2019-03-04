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
 * <p>SeqF_F95a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqF_F95a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MEOR" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_MEOR_Type"/>
 *         &lt;element name="MERE" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_MERE_Type"/>
 *         &lt;element name="ISAG" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_ISAG_Type"/>
 *         &lt;element name="PAYA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_PAYA_Type"/>
 *         &lt;element name="CODO" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_CODO_Type"/>
 *         &lt;element name="REGR" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_REGR_Type"/>
 *         &lt;element name="DROP" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_DROP_Type"/>
 *         &lt;element name="PSAG" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_PSAG_Type"/>
 *         &lt;element name="RESA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_RESA_Type"/>
 *         &lt;element name="SOLA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_SOLA_Type"/>
 *         &lt;element name="INFA" type="{urn:swift:xsd:fin.564.2018}SeqF_F95a_INFA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqF_F95a_Type", propOrder = {
    "meor",
    "mere",
    "isag",
    "paya",
    "codo",
    "regr",
    "drop",
    "psag",
    "resa",
    "sola",
    "infa"
})
public class SeqFF95AType
    extends ISO15022Field
{

    @XmlElement(name = "MEOR")
    protected SeqFF95AMEORType meor;
    @XmlElement(name = "MERE")
    protected SeqFF95AMEREType mere;
    @XmlElement(name = "ISAG")
    protected SeqFF95AISAGType isag;
    @XmlElement(name = "PAYA")
    protected SeqFF95APAYAType paya;
    @XmlElement(name = "CODO")
    protected SeqFF95ACODOType codo;
    @XmlElement(name = "REGR")
    protected SeqFF95AREGRType regr;
    @XmlElement(name = "DROP")
    protected SeqFF95ADROPType drop;
    @XmlElement(name = "PSAG")
    protected SeqFF95APSAGType psag;
    @XmlElement(name = "RESA")
    protected SeqFF95ARESAType resa;
    @XmlElement(name = "SOLA")
    protected SeqFF95ASOLAType sola;
    @XmlElement(name = "INFA")
    protected SeqFF95AINFAType infa;

    /**
     * 获取meor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AMEORType }
     *     
     */
    public SeqFF95AMEORType getMEOR() {
        return meor;
    }

    /**
     * 设置meor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AMEORType }
     *     
     */
    public void setMEOR(SeqFF95AMEORType value) {
        this.meor = value;
    }

    /**
     * 获取mere属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AMEREType }
     *     
     */
    public SeqFF95AMEREType getMERE() {
        return mere;
    }

    /**
     * 设置mere属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AMEREType }
     *     
     */
    public void setMERE(SeqFF95AMEREType value) {
        this.mere = value;
    }

    /**
     * 获取isag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AISAGType }
     *     
     */
    public SeqFF95AISAGType getISAG() {
        return isag;
    }

    /**
     * 设置isag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AISAGType }
     *     
     */
    public void setISAG(SeqFF95AISAGType value) {
        this.isag = value;
    }

    /**
     * 获取paya属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95APAYAType }
     *     
     */
    public SeqFF95APAYAType getPAYA() {
        return paya;
    }

    /**
     * 设置paya属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95APAYAType }
     *     
     */
    public void setPAYA(SeqFF95APAYAType value) {
        this.paya = value;
    }

    /**
     * 获取codo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ACODOType }
     *     
     */
    public SeqFF95ACODOType getCODO() {
        return codo;
    }

    /**
     * 设置codo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ACODOType }
     *     
     */
    public void setCODO(SeqFF95ACODOType value) {
        this.codo = value;
    }

    /**
     * 获取regr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AREGRType }
     *     
     */
    public SeqFF95AREGRType getREGR() {
        return regr;
    }

    /**
     * 设置regr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AREGRType }
     *     
     */
    public void setREGR(SeqFF95AREGRType value) {
        this.regr = value;
    }

    /**
     * 获取drop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ADROPType }
     *     
     */
    public SeqFF95ADROPType getDROP() {
        return drop;
    }

    /**
     * 设置drop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ADROPType }
     *     
     */
    public void setDROP(SeqFF95ADROPType value) {
        this.drop = value;
    }

    /**
     * 获取psag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95APSAGType }
     *     
     */
    public SeqFF95APSAGType getPSAG() {
        return psag;
    }

    /**
     * 设置psag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95APSAGType }
     *     
     */
    public void setPSAG(SeqFF95APSAGType value) {
        this.psag = value;
    }

    /**
     * 获取resa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ARESAType }
     *     
     */
    public SeqFF95ARESAType getRESA() {
        return resa;
    }

    /**
     * 设置resa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ARESAType }
     *     
     */
    public void setRESA(SeqFF95ARESAType value) {
        this.resa = value;
    }

    /**
     * 获取sola属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95ASOLAType }
     *     
     */
    public SeqFF95ASOLAType getSOLA() {
        return sola;
    }

    /**
     * 设置sola属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95ASOLAType }
     *     
     */
    public void setSOLA(SeqFF95ASOLAType value) {
        this.sola = value;
    }

    /**
     * 获取infa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqFF95AINFAType }
     *     
     */
    public SeqFF95AINFAType getINFA() {
        return infa;
    }

    /**
     * 设置infa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFF95AINFAType }
     *     
     */
    public void setINFA(SeqFF95AINFAType value) {
        this.infa = value;
    }

}
