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
 * <p>SeqD_F22a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DIVI" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_DIVI_Type"/>
 *         &lt;element name="CONV" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_CONV_Type"/>
 *         &lt;element name="DITY" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_DITY_Type"/>
 *         &lt;element name="OFFE" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_OFFE_Type"/>
 *         &lt;element name="SELL" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_SELL_Type"/>
 *         &lt;element name="ESTA" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_ESTA_Type"/>
 *         &lt;element name="ADDB" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_ADDB_Type"/>
 *         &lt;element name="CHAN" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_CHAN_Type"/>
 *         &lt;element name="RHDI" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_RHDI_Type"/>
 *         &lt;element name="ECIO" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_ECIO_Type"/>
 *         &lt;element name="TDTA" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_TDTA_Type"/>
 *         &lt;element name="ELCT" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_ELCT_Type"/>
 *         &lt;element name="LOTO" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_LOTO_Type"/>
 *         &lt;element name="CEFI" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_CEFI_Type"/>
 *         &lt;element name="CONS" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_CONS_Type"/>
 *         &lt;element name="INFO" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_INFO_Type"/>
 *         &lt;element name="TNDP" type="{urn:swift:xsd:fin.564.2018}SeqD_F22a_TNDP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F22a_Type", propOrder = {
    "divi",
    "conv",
    "dity",
    "offe",
    "sell",
    "esta",
    "addb",
    "chan",
    "rhdi",
    "ecio",
    "tdta",
    "elct",
    "loto",
    "cefi",
    "cons",
    "info",
    "tndp"
})
public class SeqDF22AType
    extends ISO15022Field
{

    @XmlElement(name = "DIVI")
    protected SeqDF22ADIVIType divi;
    @XmlElement(name = "CONV")
    protected SeqDF22ACONVType conv;
    @XmlElement(name = "DITY")
    protected SeqDF22ADITYType dity;
    @XmlElement(name = "OFFE")
    protected SeqDF22AOFFEType offe;
    @XmlElement(name = "SELL")
    protected SeqDF22ASELLType sell;
    @XmlElement(name = "ESTA")
    protected SeqDF22AESTAType esta;
    @XmlElement(name = "ADDB")
    protected SeqDF22AADDBType addb;
    @XmlElement(name = "CHAN")
    protected SeqDF22ACHANType chan;
    @XmlElement(name = "RHDI")
    protected SeqDF22ARHDIType rhdi;
    @XmlElement(name = "ECIO")
    protected SeqDF22AECIOType ecio;
    @XmlElement(name = "TDTA")
    protected SeqDF22ATDTAType tdta;
    @XmlElement(name = "ELCT")
    protected SeqDF22AELCTType elct;
    @XmlElement(name = "LOTO")
    protected SeqDF22ALOTOType loto;
    @XmlElement(name = "CEFI")
    protected SeqDF22ACEFIType cefi;
    @XmlElement(name = "CONS")
    protected SeqDF22ACONSType cons;
    @XmlElement(name = "INFO")
    protected SeqDF22AINFOType info;
    @XmlElement(name = "TNDP")
    protected SeqDF22ATNDPType tndp;

    /**
     * 获取divi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ADIVIType }
     *     
     */
    public SeqDF22ADIVIType getDIVI() {
        return divi;
    }

    /**
     * 设置divi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ADIVIType }
     *     
     */
    public void setDIVI(SeqDF22ADIVIType value) {
        this.divi = value;
    }

    /**
     * 获取conv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ACONVType }
     *     
     */
    public SeqDF22ACONVType getCONV() {
        return conv;
    }

    /**
     * 设置conv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ACONVType }
     *     
     */
    public void setCONV(SeqDF22ACONVType value) {
        this.conv = value;
    }

    /**
     * 获取dity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ADITYType }
     *     
     */
    public SeqDF22ADITYType getDITY() {
        return dity;
    }

    /**
     * 设置dity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ADITYType }
     *     
     */
    public void setDITY(SeqDF22ADITYType value) {
        this.dity = value;
    }

    /**
     * 获取offe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22AOFFEType }
     *     
     */
    public SeqDF22AOFFEType getOFFE() {
        return offe;
    }

    /**
     * 设置offe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22AOFFEType }
     *     
     */
    public void setOFFE(SeqDF22AOFFEType value) {
        this.offe = value;
    }

    /**
     * 获取sell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ASELLType }
     *     
     */
    public SeqDF22ASELLType getSELL() {
        return sell;
    }

    /**
     * 设置sell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ASELLType }
     *     
     */
    public void setSELL(SeqDF22ASELLType value) {
        this.sell = value;
    }

    /**
     * 获取esta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22AESTAType }
     *     
     */
    public SeqDF22AESTAType getESTA() {
        return esta;
    }

    /**
     * 设置esta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22AESTAType }
     *     
     */
    public void setESTA(SeqDF22AESTAType value) {
        this.esta = value;
    }

    /**
     * 获取addb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22AADDBType }
     *     
     */
    public SeqDF22AADDBType getADDB() {
        return addb;
    }

    /**
     * 设置addb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22AADDBType }
     *     
     */
    public void setADDB(SeqDF22AADDBType value) {
        this.addb = value;
    }

    /**
     * 获取chan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ACHANType }
     *     
     */
    public SeqDF22ACHANType getCHAN() {
        return chan;
    }

    /**
     * 设置chan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ACHANType }
     *     
     */
    public void setCHAN(SeqDF22ACHANType value) {
        this.chan = value;
    }

    /**
     * 获取rhdi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ARHDIType }
     *     
     */
    public SeqDF22ARHDIType getRHDI() {
        return rhdi;
    }

    /**
     * 设置rhdi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ARHDIType }
     *     
     */
    public void setRHDI(SeqDF22ARHDIType value) {
        this.rhdi = value;
    }

    /**
     * 获取ecio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22AECIOType }
     *     
     */
    public SeqDF22AECIOType getECIO() {
        return ecio;
    }

    /**
     * 设置ecio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22AECIOType }
     *     
     */
    public void setECIO(SeqDF22AECIOType value) {
        this.ecio = value;
    }

    /**
     * 获取tdta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ATDTAType }
     *     
     */
    public SeqDF22ATDTAType getTDTA() {
        return tdta;
    }

    /**
     * 设置tdta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ATDTAType }
     *     
     */
    public void setTDTA(SeqDF22ATDTAType value) {
        this.tdta = value;
    }

    /**
     * 获取elct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22AELCTType }
     *     
     */
    public SeqDF22AELCTType getELCT() {
        return elct;
    }

    /**
     * 设置elct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22AELCTType }
     *     
     */
    public void setELCT(SeqDF22AELCTType value) {
        this.elct = value;
    }

    /**
     * 获取loto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ALOTOType }
     *     
     */
    public SeqDF22ALOTOType getLOTO() {
        return loto;
    }

    /**
     * 设置loto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ALOTOType }
     *     
     */
    public void setLOTO(SeqDF22ALOTOType value) {
        this.loto = value;
    }

    /**
     * 获取cefi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ACEFIType }
     *     
     */
    public SeqDF22ACEFIType getCEFI() {
        return cefi;
    }

    /**
     * 设置cefi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ACEFIType }
     *     
     */
    public void setCEFI(SeqDF22ACEFIType value) {
        this.cefi = value;
    }

    /**
     * 获取cons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ACONSType }
     *     
     */
    public SeqDF22ACONSType getCONS() {
        return cons;
    }

    /**
     * 设置cons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ACONSType }
     *     
     */
    public void setCONS(SeqDF22ACONSType value) {
        this.cons = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22AINFOType }
     *     
     */
    public SeqDF22AINFOType getINFO() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22AINFOType }
     *     
     */
    public void setINFO(SeqDF22AINFOType value) {
        this.info = value;
    }

    /**
     * 获取tndp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF22ATNDPType }
     *     
     */
    public SeqDF22ATNDPType getTNDP() {
        return tndp;
    }

    /**
     * 设置tndp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF22ATNDPType }
     *     
     */
    public void setTNDP(SeqDF22ATNDPType value) {
        this.tndp = value;
    }

}
