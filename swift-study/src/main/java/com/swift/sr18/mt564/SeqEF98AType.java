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
 * <p>SeqE_F98a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DVCP" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_DVCP_Type"/>
 *         &lt;element name="EARD" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_EARD_Type"/>
 *         &lt;element name="EXPI" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_EXPI_Type"/>
 *         &lt;element name="MKDT" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_MKDT_Type"/>
 *         &lt;element name="PODT" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_PODT_Type"/>
 *         &lt;element name="SUBS" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_SUBS_Type"/>
 *         &lt;element name="RDDT" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_RDDT_Type"/>
 *         &lt;element name="CVPR" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_CVPR_Type"/>
 *         &lt;element name="BORD" type="{urn:swift:xsd:fin.564.2018}SeqE_F98a_BORD_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F98a_Type", propOrder = {
    "dvcp",
    "eard",
    "expi",
    "mkdt",
    "podt",
    "subs",
    "rddt",
    "cvpr",
    "bord"
})
public class SeqEF98AType
    extends ISO15022Field
{

    @XmlElement(name = "DVCP")
    protected SeqEF98ADVCPType dvcp;
    @XmlElement(name = "EARD")
    protected SeqEF98AEARDType eard;
    @XmlElement(name = "EXPI")
    protected SeqEF98AEXPIType expi;
    @XmlElement(name = "MKDT")
    protected SeqEF98AMKDTType mkdt;
    @XmlElement(name = "PODT")
    protected SeqEF98APODTType podt;
    @XmlElement(name = "SUBS")
    protected SeqEF98ASUBSType subs;
    @XmlElement(name = "RDDT")
    protected SeqEF98ARDDTType rddt;
    @XmlElement(name = "CVPR")
    protected SeqEF98ACVPRType cvpr;
    @XmlElement(name = "BORD")
    protected SeqEF98ABORDType bord;

    /**
     * 获取dvcp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98ADVCPType }
     *     
     */
    public SeqEF98ADVCPType getDVCP() {
        return dvcp;
    }

    /**
     * 设置dvcp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98ADVCPType }
     *     
     */
    public void setDVCP(SeqEF98ADVCPType value) {
        this.dvcp = value;
    }

    /**
     * 获取eard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98AEARDType }
     *     
     */
    public SeqEF98AEARDType getEARD() {
        return eard;
    }

    /**
     * 设置eard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98AEARDType }
     *     
     */
    public void setEARD(SeqEF98AEARDType value) {
        this.eard = value;
    }

    /**
     * 获取expi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98AEXPIType }
     *     
     */
    public SeqEF98AEXPIType getEXPI() {
        return expi;
    }

    /**
     * 设置expi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98AEXPIType }
     *     
     */
    public void setEXPI(SeqEF98AEXPIType value) {
        this.expi = value;
    }

    /**
     * 获取mkdt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98AMKDTType }
     *     
     */
    public SeqEF98AMKDTType getMKDT() {
        return mkdt;
    }

    /**
     * 设置mkdt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98AMKDTType }
     *     
     */
    public void setMKDT(SeqEF98AMKDTType value) {
        this.mkdt = value;
    }

    /**
     * 获取podt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98APODTType }
     *     
     */
    public SeqEF98APODTType getPODT() {
        return podt;
    }

    /**
     * 设置podt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98APODTType }
     *     
     */
    public void setPODT(SeqEF98APODTType value) {
        this.podt = value;
    }

    /**
     * 获取subs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98ASUBSType }
     *     
     */
    public SeqEF98ASUBSType getSUBS() {
        return subs;
    }

    /**
     * 设置subs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98ASUBSType }
     *     
     */
    public void setSUBS(SeqEF98ASUBSType value) {
        this.subs = value;
    }

    /**
     * 获取rddt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98ARDDTType }
     *     
     */
    public SeqEF98ARDDTType getRDDT() {
        return rddt;
    }

    /**
     * 设置rddt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98ARDDTType }
     *     
     */
    public void setRDDT(SeqEF98ARDDTType value) {
        this.rddt = value;
    }

    /**
     * 获取cvpr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98ACVPRType }
     *     
     */
    public SeqEF98ACVPRType getCVPR() {
        return cvpr;
    }

    /**
     * 设置cvpr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98ACVPRType }
     *     
     */
    public void setCVPR(SeqEF98ACVPRType value) {
        this.cvpr = value;
    }

    /**
     * 获取bord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF98ABORDType }
     *     
     */
    public SeqEF98ABORDType getBORD() {
        return bord;
    }

    /**
     * 设置bord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF98ABORDType }
     *     
     */
    public void setBORD(SeqEF98ABORDType value) {
        this.bord = value;
    }

}
