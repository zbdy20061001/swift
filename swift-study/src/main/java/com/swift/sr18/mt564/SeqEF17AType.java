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
 * <p>SeqE_F17a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE_F17a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DFLT" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_DFLT_Type"/>
 *         &lt;element name="STIN" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_STIN_Type"/>
 *         &lt;element name="RCHG" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_RCHG_Type"/>
 *         &lt;element name="CERT" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_CERT_Type"/>
 *         &lt;element name="WTHD" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_WTHD_Type"/>
 *         &lt;element name="CHAN" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_CHAN_Type"/>
 *         &lt;element name="APLI" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_APLI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F17a_Type", propOrder = {
    "dflt",
    "stin",
    "rchg",
    "cert",
    "wthd",
    "chan",
    "apli"
})
public class SeqEF17AType
    extends ISO15022Field
{

    @XmlElement(name = "DFLT")
    protected SeqEF17ADFLTType dflt;
    @XmlElement(name = "STIN")
    protected SeqEF17ASTINType stin;
    @XmlElement(name = "RCHG")
    protected SeqEF17ARCHGType rchg;
    @XmlElement(name = "CERT")
    protected SeqEF17ACERTType cert;
    @XmlElement(name = "WTHD")
    protected SeqEF17AWTHDType wthd;
    @XmlElement(name = "CHAN")
    protected SeqEF17ACHANType chan;
    @XmlElement(name = "APLI")
    protected SeqEF17AAPLIType apli;

    /**
     * 获取dflt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ADFLTType }
     *     
     */
    public SeqEF17ADFLTType getDFLT() {
        return dflt;
    }

    /**
     * 设置dflt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ADFLTType }
     *     
     */
    public void setDFLT(SeqEF17ADFLTType value) {
        this.dflt = value;
    }

    /**
     * 获取stin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ASTINType }
     *     
     */
    public SeqEF17ASTINType getSTIN() {
        return stin;
    }

    /**
     * 设置stin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ASTINType }
     *     
     */
    public void setSTIN(SeqEF17ASTINType value) {
        this.stin = value;
    }

    /**
     * 获取rchg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ARCHGType }
     *     
     */
    public SeqEF17ARCHGType getRCHG() {
        return rchg;
    }

    /**
     * 设置rchg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ARCHGType }
     *     
     */
    public void setRCHG(SeqEF17ARCHGType value) {
        this.rchg = value;
    }

    /**
     * 获取cert属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ACERTType }
     *     
     */
    public SeqEF17ACERTType getCERT() {
        return cert;
    }

    /**
     * 设置cert属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ACERTType }
     *     
     */
    public void setCERT(SeqEF17ACERTType value) {
        this.cert = value;
    }

    /**
     * 获取wthd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17AWTHDType }
     *     
     */
    public SeqEF17AWTHDType getWTHD() {
        return wthd;
    }

    /**
     * 设置wthd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17AWTHDType }
     *     
     */
    public void setWTHD(SeqEF17AWTHDType value) {
        this.wthd = value;
    }

    /**
     * 获取chan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ACHANType }
     *     
     */
    public SeqEF17ACHANType getCHAN() {
        return chan;
    }

    /**
     * 设置chan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ACHANType }
     *     
     */
    public void setCHAN(SeqEF17ACHANType value) {
        this.chan = value;
    }

    /**
     * 获取apli属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17AAPLIType }
     *     
     */
    public SeqEF17AAPLIType getAPLI() {
        return apli;
    }

    /**
     * 设置apli属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17AAPLIType }
     *     
     */
    public void setAPLI(SeqEF17AAPLIType value) {
        this.apli = value;
    }

}
