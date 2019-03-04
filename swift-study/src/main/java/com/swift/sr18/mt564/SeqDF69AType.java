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
 * <p>SeqD_F69a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqD_F69a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PRIC" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_PRIC_Type"/>
 *         &lt;element name="INPE" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_INPE_Type"/>
 *         &lt;element name="CSPD" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_CSPD_Type"/>
 *         &lt;element name="BLOK" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_BLOK_Type"/>
 *         &lt;element name="CLCP" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_CLCP_Type"/>
 *         &lt;element name="DSWN" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSWN_Type"/>
 *         &lt;element name="DSDE" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSDE_Type"/>
 *         &lt;element name="DSBT" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSBT_Type"/>
 *         &lt;element name="DSDA" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSDA_Type"/>
 *         &lt;element name="DSWA" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSWA_Type"/>
 *         &lt;element name="DSPL" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSPL_Type"/>
 *         &lt;element name="DSSE" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSSE_Type"/>
 *         &lt;element name="DSWS" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_DSWS_Type"/>
 *         &lt;element name="BOCL" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_BOCL_Type"/>
 *         &lt;element name="CODS" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_CODS_Type"/>
 *         &lt;element name="SPLP" type="{urn:swift:xsd:fin.564.2018}SeqD_F69a_SPLP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F69a_Type", propOrder = {
    "pric",
    "inpe",
    "cspd",
    "blok",
    "clcp",
    "dswn",
    "dsde",
    "dsbt",
    "dsda",
    "dswa",
    "dspl",
    "dsse",
    "dsws",
    "bocl",
    "cods",
    "splp"
})
public class SeqDF69AType
    extends ISO15022Field
{

    @XmlElement(name = "PRIC")
    protected SeqDF69APRICType pric;
    @XmlElement(name = "INPE")
    protected SeqDF69AINPEType inpe;
    @XmlElement(name = "CSPD")
    protected SeqDF69ACSPDType cspd;
    @XmlElement(name = "BLOK")
    protected SeqDF69ABLOKType blok;
    @XmlElement(name = "CLCP")
    protected SeqDF69ACLCPType clcp;
    @XmlElement(name = "DSWN")
    protected SeqDF69ADSWNType dswn;
    @XmlElement(name = "DSDE")
    protected SeqDF69ADSDEType dsde;
    @XmlElement(name = "DSBT")
    protected SeqDF69ADSBTType dsbt;
    @XmlElement(name = "DSDA")
    protected SeqDF69ADSDAType dsda;
    @XmlElement(name = "DSWA")
    protected SeqDF69ADSWAType dswa;
    @XmlElement(name = "DSPL")
    protected SeqDF69ADSPLType dspl;
    @XmlElement(name = "DSSE")
    protected SeqDF69ADSSEType dsse;
    @XmlElement(name = "DSWS")
    protected SeqDF69ADSWSType dsws;
    @XmlElement(name = "BOCL")
    protected SeqDF69ABOCLType bocl;
    @XmlElement(name = "CODS")
    protected SeqDF69ACODSType cods;
    @XmlElement(name = "SPLP")
    protected SeqDF69ASPLPType splp;

    /**
     * 获取pric属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69APRICType }
     *     
     */
    public SeqDF69APRICType getPRIC() {
        return pric;
    }

    /**
     * 设置pric属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69APRICType }
     *     
     */
    public void setPRIC(SeqDF69APRICType value) {
        this.pric = value;
    }

    /**
     * 获取inpe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69AINPEType }
     *     
     */
    public SeqDF69AINPEType getINPE() {
        return inpe;
    }

    /**
     * 设置inpe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69AINPEType }
     *     
     */
    public void setINPE(SeqDF69AINPEType value) {
        this.inpe = value;
    }

    /**
     * 获取cspd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ACSPDType }
     *     
     */
    public SeqDF69ACSPDType getCSPD() {
        return cspd;
    }

    /**
     * 设置cspd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ACSPDType }
     *     
     */
    public void setCSPD(SeqDF69ACSPDType value) {
        this.cspd = value;
    }

    /**
     * 获取blok属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ABLOKType }
     *     
     */
    public SeqDF69ABLOKType getBLOK() {
        return blok;
    }

    /**
     * 设置blok属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ABLOKType }
     *     
     */
    public void setBLOK(SeqDF69ABLOKType value) {
        this.blok = value;
    }

    /**
     * 获取clcp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ACLCPType }
     *     
     */
    public SeqDF69ACLCPType getCLCP() {
        return clcp;
    }

    /**
     * 设置clcp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ACLCPType }
     *     
     */
    public void setCLCP(SeqDF69ACLCPType value) {
        this.clcp = value;
    }

    /**
     * 获取dswn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSWNType }
     *     
     */
    public SeqDF69ADSWNType getDSWN() {
        return dswn;
    }

    /**
     * 设置dswn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSWNType }
     *     
     */
    public void setDSWN(SeqDF69ADSWNType value) {
        this.dswn = value;
    }

    /**
     * 获取dsde属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSDEType }
     *     
     */
    public SeqDF69ADSDEType getDSDE() {
        return dsde;
    }

    /**
     * 设置dsde属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSDEType }
     *     
     */
    public void setDSDE(SeqDF69ADSDEType value) {
        this.dsde = value;
    }

    /**
     * 获取dsbt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSBTType }
     *     
     */
    public SeqDF69ADSBTType getDSBT() {
        return dsbt;
    }

    /**
     * 设置dsbt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSBTType }
     *     
     */
    public void setDSBT(SeqDF69ADSBTType value) {
        this.dsbt = value;
    }

    /**
     * 获取dsda属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSDAType }
     *     
     */
    public SeqDF69ADSDAType getDSDA() {
        return dsda;
    }

    /**
     * 设置dsda属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSDAType }
     *     
     */
    public void setDSDA(SeqDF69ADSDAType value) {
        this.dsda = value;
    }

    /**
     * 获取dswa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSWAType }
     *     
     */
    public SeqDF69ADSWAType getDSWA() {
        return dswa;
    }

    /**
     * 设置dswa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSWAType }
     *     
     */
    public void setDSWA(SeqDF69ADSWAType value) {
        this.dswa = value;
    }

    /**
     * 获取dspl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSPLType }
     *     
     */
    public SeqDF69ADSPLType getDSPL() {
        return dspl;
    }

    /**
     * 设置dspl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSPLType }
     *     
     */
    public void setDSPL(SeqDF69ADSPLType value) {
        this.dspl = value;
    }

    /**
     * 获取dsse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSSEType }
     *     
     */
    public SeqDF69ADSSEType getDSSE() {
        return dsse;
    }

    /**
     * 设置dsse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSSEType }
     *     
     */
    public void setDSSE(SeqDF69ADSSEType value) {
        this.dsse = value;
    }

    /**
     * 获取dsws属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ADSWSType }
     *     
     */
    public SeqDF69ADSWSType getDSWS() {
        return dsws;
    }

    /**
     * 设置dsws属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ADSWSType }
     *     
     */
    public void setDSWS(SeqDF69ADSWSType value) {
        this.dsws = value;
    }

    /**
     * 获取bocl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ABOCLType }
     *     
     */
    public SeqDF69ABOCLType getBOCL() {
        return bocl;
    }

    /**
     * 设置bocl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ABOCLType }
     *     
     */
    public void setBOCL(SeqDF69ABOCLType value) {
        this.bocl = value;
    }

    /**
     * 获取cods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ACODSType }
     *     
     */
    public SeqDF69ACODSType getCODS() {
        return cods;
    }

    /**
     * 设置cods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ACODSType }
     *     
     */
    public void setCODS(SeqDF69ACODSType value) {
        this.cods = value;
    }

    /**
     * 获取splp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqDF69ASPLPType }
     *     
     */
    public SeqDF69ASPLPType getSPLP() {
        return splp;
    }

    /**
     * 设置splp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF69ASPLPType }
     *     
     */
    public void setSPLP(SeqDF69ASPLPType value) {
        this.splp = value;
    }

}
