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
 * <p>SeqE2_F19a_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F19a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ENTL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_ENTL_Type"/>
 *         &lt;element name="RESU" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_RESU_Type"/>
 *         &lt;element name="OCMT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_OCMT_Type"/>
 *         &lt;element name="CAPG" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_CAPG_Type"/>
 *         &lt;element name="INDM" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_INDM_Type"/>
 *         &lt;element name="CINL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_CINL_Type"/>
 *         &lt;element name="CHAR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_CHAR_Type"/>
 *         &lt;element name="FLFR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_FLFR_Type"/>
 *         &lt;element name="UNFR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_UNFR_Type"/>
 *         &lt;element name="TXFR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TXFR_Type"/>
 *         &lt;element name="TXDF" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TXDF_Type"/>
 *         &lt;element name="SOIC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_SOIC_Type"/>
 *         &lt;element name="GRSS" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_GRSS_Type"/>
 *         &lt;element name="INTR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_INTR_Type"/>
 *         &lt;element name="MKTC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_MKTC_Type"/>
 *         &lt;element name="NETT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_NETT_Type"/>
 *         &lt;element name="PRIN" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_PRIN_Type"/>
 *         &lt;element name="REIN" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_REIN_Type"/>
 *         &lt;element name="TAXC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TAXC_Type"/>
 *         &lt;element name="TAXR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TAXR_Type"/>
 *         &lt;element name="WITL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_WITL_Type"/>
 *         &lt;element name="REDP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_REDP_Type"/>
 *         &lt;element name="ATAX" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_ATAX_Type"/>
 *         &lt;element name="INCO" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_INCO_Type"/>
 *         &lt;element name="EXEC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_EXEC_Type"/>
 *         &lt;element name="LOCO" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_LOCO_Type"/>
 *         &lt;element name="PAMM" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_PAMM_Type"/>
 *         &lt;element name="REGF" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_REGF_Type"/>
 *         &lt;element name="SHIP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_SHIP_Type"/>
 *         &lt;element name="SOFE" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_SOFE_Type"/>
 *         &lt;element name="STAM" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_STAM_Type"/>
 *         &lt;element name="STEX" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_STEX_Type"/>
 *         &lt;element name="VATA" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_VATA_Type"/>
 *         &lt;element name="FISC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_FISC_Type"/>
 *         &lt;element name="MFDV" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_MFDV_Type"/>
 *         &lt;element name="TXRC" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TXRC_Type"/>
 *         &lt;element name="EUTR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_EUTR_Type"/>
 *         &lt;element name="ACRU" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_ACRU_Type"/>
 *         &lt;element name="EQUL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_EQUL_Type"/>
 *         &lt;element name="FTCA" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_FTCA_Type"/>
 *         &lt;element name="NRAT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_NRAT_Type"/>
 *         &lt;element name="BWIT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_BWIT_Type"/>
 *         &lt;element name="TXIN" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TXIN_Type"/>
 *         &lt;element name="TRAX" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_TRAX_Type"/>
 *         &lt;element name="DEEM" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_DEEM_Type"/>
 *         &lt;element name="CDFI" type="{urn:swift:xsd:fin.564.2018}SeqE2_F19a_CDFI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F19a_Type", propOrder = {
    "entl",
    "resu",
    "ocmt",
    "capg",
    "indm",
    "cinl",
    "_char",
    "flfr",
    "unfr",
    "txfr",
    "txdf",
    "soic",
    "grss",
    "intr",
    "mktc",
    "nett",
    "prin",
    "rein",
    "taxc",
    "taxr",
    "witl",
    "redp",
    "atax",
    "inco",
    "exec",
    "loco",
    "pamm",
    "regf",
    "ship",
    "sofe",
    "stam",
    "stex",
    "vata",
    "fisc",
    "mfdv",
    "txrc",
    "eutr",
    "acru",
    "equl",
    "ftca",
    "nrat",
    "bwit",
    "txin",
    "trax",
    "deem",
    "cdfi"
})
public class SeqE2F19AType
    extends ISO15022Field
{

    @XmlElement(name = "ENTL")
    protected SeqE2F19AENTLType entl;
    @XmlElement(name = "RESU")
    protected SeqE2F19ARESUType resu;
    @XmlElement(name = "OCMT")
    protected SeqE2F19AOCMTType ocmt;
    @XmlElement(name = "CAPG")
    protected SeqE2F19ACAPGType capg;
    @XmlElement(name = "INDM")
    protected SeqE2F19AINDMType indm;
    @XmlElement(name = "CINL")
    protected SeqE2F19ACINLType cinl;
    @XmlElement(name = "CHAR")
    protected SeqE2F19ACHARType _char;
    @XmlElement(name = "FLFR")
    protected SeqE2F19AFLFRType flfr;
    @XmlElement(name = "UNFR")
    protected SeqE2F19AUNFRType unfr;
    @XmlElement(name = "TXFR")
    protected SeqE2F19ATXFRType txfr;
    @XmlElement(name = "TXDF")
    protected SeqE2F19ATXDFType txdf;
    @XmlElement(name = "SOIC")
    protected SeqE2F19ASOICType soic;
    @XmlElement(name = "GRSS")
    protected SeqE2F19AGRSSType grss;
    @XmlElement(name = "INTR")
    protected SeqE2F19AINTRType intr;
    @XmlElement(name = "MKTC")
    protected SeqE2F19AMKTCType mktc;
    @XmlElement(name = "NETT")
    protected SeqE2F19ANETTType nett;
    @XmlElement(name = "PRIN")
    protected SeqE2F19APRINType prin;
    @XmlElement(name = "REIN")
    protected SeqE2F19AREINType rein;
    @XmlElement(name = "TAXC")
    protected SeqE2F19ATAXCType taxc;
    @XmlElement(name = "TAXR")
    protected SeqE2F19ATAXRType taxr;
    @XmlElement(name = "WITL")
    protected SeqE2F19AWITLType witl;
    @XmlElement(name = "REDP")
    protected SeqE2F19AREDPType redp;
    @XmlElement(name = "ATAX")
    protected SeqE2F19AATAXType atax;
    @XmlElement(name = "INCO")
    protected SeqE2F19AINCOType inco;
    @XmlElement(name = "EXEC")
    protected SeqE2F19AEXECType exec;
    @XmlElement(name = "LOCO")
    protected SeqE2F19ALOCOType loco;
    @XmlElement(name = "PAMM")
    protected SeqE2F19APAMMType pamm;
    @XmlElement(name = "REGF")
    protected SeqE2F19AREGFType regf;
    @XmlElement(name = "SHIP")
    protected SeqE2F19ASHIPType ship;
    @XmlElement(name = "SOFE")
    protected SeqE2F19ASOFEType sofe;
    @XmlElement(name = "STAM")
    protected SeqE2F19ASTAMType stam;
    @XmlElement(name = "STEX")
    protected SeqE2F19ASTEXType stex;
    @XmlElement(name = "VATA")
    protected SeqE2F19AVATAType vata;
    @XmlElement(name = "FISC")
    protected SeqE2F19AFISCType fisc;
    @XmlElement(name = "MFDV")
    protected SeqE2F19AMFDVType mfdv;
    @XmlElement(name = "TXRC")
    protected SeqE2F19ATXRCType txrc;
    @XmlElement(name = "EUTR")
    protected SeqE2F19AEUTRType eutr;
    @XmlElement(name = "ACRU")
    protected SeqE2F19AACRUType acru;
    @XmlElement(name = "EQUL")
    protected SeqE2F19AEQULType equl;
    @XmlElement(name = "FTCA")
    protected SeqE2F19AFTCAType ftca;
    @XmlElement(name = "NRAT")
    protected SeqE2F19ANRATType nrat;
    @XmlElement(name = "BWIT")
    protected SeqE2F19ABWITType bwit;
    @XmlElement(name = "TXIN")
    protected SeqE2F19ATXINType txin;
    @XmlElement(name = "TRAX")
    protected SeqE2F19ATRAXType trax;
    @XmlElement(name = "DEEM")
    protected SeqE2F19ADEEMType deem;
    @XmlElement(name = "CDFI")
    protected SeqE2F19ACDFIType cdfi;

    /**
     * 获取entl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AENTLType }
     *     
     */
    public SeqE2F19AENTLType getENTL() {
        return entl;
    }

    /**
     * 设置entl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AENTLType }
     *     
     */
    public void setENTL(SeqE2F19AENTLType value) {
        this.entl = value;
    }

    /**
     * 获取resu属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ARESUType }
     *     
     */
    public SeqE2F19ARESUType getRESU() {
        return resu;
    }

    /**
     * 设置resu属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ARESUType }
     *     
     */
    public void setRESU(SeqE2F19ARESUType value) {
        this.resu = value;
    }

    /**
     * 获取ocmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AOCMTType }
     *     
     */
    public SeqE2F19AOCMTType getOCMT() {
        return ocmt;
    }

    /**
     * 设置ocmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AOCMTType }
     *     
     */
    public void setOCMT(SeqE2F19AOCMTType value) {
        this.ocmt = value;
    }

    /**
     * 获取capg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ACAPGType }
     *     
     */
    public SeqE2F19ACAPGType getCAPG() {
        return capg;
    }

    /**
     * 设置capg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ACAPGType }
     *     
     */
    public void setCAPG(SeqE2F19ACAPGType value) {
        this.capg = value;
    }

    /**
     * 获取indm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AINDMType }
     *     
     */
    public SeqE2F19AINDMType getINDM() {
        return indm;
    }

    /**
     * 设置indm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AINDMType }
     *     
     */
    public void setINDM(SeqE2F19AINDMType value) {
        this.indm = value;
    }

    /**
     * 获取cinl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ACINLType }
     *     
     */
    public SeqE2F19ACINLType getCINL() {
        return cinl;
    }

    /**
     * 设置cinl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ACINLType }
     *     
     */
    public void setCINL(SeqE2F19ACINLType value) {
        this.cinl = value;
    }

    /**
     * 获取char属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ACHARType }
     *     
     */
    public SeqE2F19ACHARType getCHAR() {
        return _char;
    }

    /**
     * 设置char属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ACHARType }
     *     
     */
    public void setCHAR(SeqE2F19ACHARType value) {
        this._char = value;
    }

    /**
     * 获取flfr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AFLFRType }
     *     
     */
    public SeqE2F19AFLFRType getFLFR() {
        return flfr;
    }

    /**
     * 设置flfr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AFLFRType }
     *     
     */
    public void setFLFR(SeqE2F19AFLFRType value) {
        this.flfr = value;
    }

    /**
     * 获取unfr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AUNFRType }
     *     
     */
    public SeqE2F19AUNFRType getUNFR() {
        return unfr;
    }

    /**
     * 设置unfr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AUNFRType }
     *     
     */
    public void setUNFR(SeqE2F19AUNFRType value) {
        this.unfr = value;
    }

    /**
     * 获取txfr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATXFRType }
     *     
     */
    public SeqE2F19ATXFRType getTXFR() {
        return txfr;
    }

    /**
     * 设置txfr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATXFRType }
     *     
     */
    public void setTXFR(SeqE2F19ATXFRType value) {
        this.txfr = value;
    }

    /**
     * 获取txdf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATXDFType }
     *     
     */
    public SeqE2F19ATXDFType getTXDF() {
        return txdf;
    }

    /**
     * 设置txdf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATXDFType }
     *     
     */
    public void setTXDF(SeqE2F19ATXDFType value) {
        this.txdf = value;
    }

    /**
     * 获取soic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ASOICType }
     *     
     */
    public SeqE2F19ASOICType getSOIC() {
        return soic;
    }

    /**
     * 设置soic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ASOICType }
     *     
     */
    public void setSOIC(SeqE2F19ASOICType value) {
        this.soic = value;
    }

    /**
     * 获取grss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AGRSSType }
     *     
     */
    public SeqE2F19AGRSSType getGRSS() {
        return grss;
    }

    /**
     * 设置grss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AGRSSType }
     *     
     */
    public void setGRSS(SeqE2F19AGRSSType value) {
        this.grss = value;
    }

    /**
     * 获取intr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AINTRType }
     *     
     */
    public SeqE2F19AINTRType getINTR() {
        return intr;
    }

    /**
     * 设置intr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AINTRType }
     *     
     */
    public void setINTR(SeqE2F19AINTRType value) {
        this.intr = value;
    }

    /**
     * 获取mktc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AMKTCType }
     *     
     */
    public SeqE2F19AMKTCType getMKTC() {
        return mktc;
    }

    /**
     * 设置mktc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AMKTCType }
     *     
     */
    public void setMKTC(SeqE2F19AMKTCType value) {
        this.mktc = value;
    }

    /**
     * 获取nett属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ANETTType }
     *     
     */
    public SeqE2F19ANETTType getNETT() {
        return nett;
    }

    /**
     * 设置nett属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ANETTType }
     *     
     */
    public void setNETT(SeqE2F19ANETTType value) {
        this.nett = value;
    }

    /**
     * 获取prin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19APRINType }
     *     
     */
    public SeqE2F19APRINType getPRIN() {
        return prin;
    }

    /**
     * 设置prin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19APRINType }
     *     
     */
    public void setPRIN(SeqE2F19APRINType value) {
        this.prin = value;
    }

    /**
     * 获取rein属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AREINType }
     *     
     */
    public SeqE2F19AREINType getREIN() {
        return rein;
    }

    /**
     * 设置rein属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AREINType }
     *     
     */
    public void setREIN(SeqE2F19AREINType value) {
        this.rein = value;
    }

    /**
     * 获取taxc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATAXCType }
     *     
     */
    public SeqE2F19ATAXCType getTAXC() {
        return taxc;
    }

    /**
     * 设置taxc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATAXCType }
     *     
     */
    public void setTAXC(SeqE2F19ATAXCType value) {
        this.taxc = value;
    }

    /**
     * 获取taxr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATAXRType }
     *     
     */
    public SeqE2F19ATAXRType getTAXR() {
        return taxr;
    }

    /**
     * 设置taxr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATAXRType }
     *     
     */
    public void setTAXR(SeqE2F19ATAXRType value) {
        this.taxr = value;
    }

    /**
     * 获取witl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AWITLType }
     *     
     */
    public SeqE2F19AWITLType getWITL() {
        return witl;
    }

    /**
     * 设置witl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AWITLType }
     *     
     */
    public void setWITL(SeqE2F19AWITLType value) {
        this.witl = value;
    }

    /**
     * 获取redp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AREDPType }
     *     
     */
    public SeqE2F19AREDPType getREDP() {
        return redp;
    }

    /**
     * 设置redp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AREDPType }
     *     
     */
    public void setREDP(SeqE2F19AREDPType value) {
        this.redp = value;
    }

    /**
     * 获取atax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AATAXType }
     *     
     */
    public SeqE2F19AATAXType getATAX() {
        return atax;
    }

    /**
     * 设置atax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AATAXType }
     *     
     */
    public void setATAX(SeqE2F19AATAXType value) {
        this.atax = value;
    }

    /**
     * 获取inco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AINCOType }
     *     
     */
    public SeqE2F19AINCOType getINCO() {
        return inco;
    }

    /**
     * 设置inco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AINCOType }
     *     
     */
    public void setINCO(SeqE2F19AINCOType value) {
        this.inco = value;
    }

    /**
     * 获取exec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AEXECType }
     *     
     */
    public SeqE2F19AEXECType getEXEC() {
        return exec;
    }

    /**
     * 设置exec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AEXECType }
     *     
     */
    public void setEXEC(SeqE2F19AEXECType value) {
        this.exec = value;
    }

    /**
     * 获取loco属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ALOCOType }
     *     
     */
    public SeqE2F19ALOCOType getLOCO() {
        return loco;
    }

    /**
     * 设置loco属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ALOCOType }
     *     
     */
    public void setLOCO(SeqE2F19ALOCOType value) {
        this.loco = value;
    }

    /**
     * 获取pamm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19APAMMType }
     *     
     */
    public SeqE2F19APAMMType getPAMM() {
        return pamm;
    }

    /**
     * 设置pamm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19APAMMType }
     *     
     */
    public void setPAMM(SeqE2F19APAMMType value) {
        this.pamm = value;
    }

    /**
     * 获取regf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AREGFType }
     *     
     */
    public SeqE2F19AREGFType getREGF() {
        return regf;
    }

    /**
     * 设置regf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AREGFType }
     *     
     */
    public void setREGF(SeqE2F19AREGFType value) {
        this.regf = value;
    }

    /**
     * 获取ship属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ASHIPType }
     *     
     */
    public SeqE2F19ASHIPType getSHIP() {
        return ship;
    }

    /**
     * 设置ship属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ASHIPType }
     *     
     */
    public void setSHIP(SeqE2F19ASHIPType value) {
        this.ship = value;
    }

    /**
     * 获取sofe属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ASOFEType }
     *     
     */
    public SeqE2F19ASOFEType getSOFE() {
        return sofe;
    }

    /**
     * 设置sofe属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ASOFEType }
     *     
     */
    public void setSOFE(SeqE2F19ASOFEType value) {
        this.sofe = value;
    }

    /**
     * 获取stam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ASTAMType }
     *     
     */
    public SeqE2F19ASTAMType getSTAM() {
        return stam;
    }

    /**
     * 设置stam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ASTAMType }
     *     
     */
    public void setSTAM(SeqE2F19ASTAMType value) {
        this.stam = value;
    }

    /**
     * 获取stex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ASTEXType }
     *     
     */
    public SeqE2F19ASTEXType getSTEX() {
        return stex;
    }

    /**
     * 设置stex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ASTEXType }
     *     
     */
    public void setSTEX(SeqE2F19ASTEXType value) {
        this.stex = value;
    }

    /**
     * 获取vata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AVATAType }
     *     
     */
    public SeqE2F19AVATAType getVATA() {
        return vata;
    }

    /**
     * 设置vata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AVATAType }
     *     
     */
    public void setVATA(SeqE2F19AVATAType value) {
        this.vata = value;
    }

    /**
     * 获取fisc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AFISCType }
     *     
     */
    public SeqE2F19AFISCType getFISC() {
        return fisc;
    }

    /**
     * 设置fisc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AFISCType }
     *     
     */
    public void setFISC(SeqE2F19AFISCType value) {
        this.fisc = value;
    }

    /**
     * 获取mfdv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AMFDVType }
     *     
     */
    public SeqE2F19AMFDVType getMFDV() {
        return mfdv;
    }

    /**
     * 设置mfdv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AMFDVType }
     *     
     */
    public void setMFDV(SeqE2F19AMFDVType value) {
        this.mfdv = value;
    }

    /**
     * 获取txrc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATXRCType }
     *     
     */
    public SeqE2F19ATXRCType getTXRC() {
        return txrc;
    }

    /**
     * 设置txrc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATXRCType }
     *     
     */
    public void setTXRC(SeqE2F19ATXRCType value) {
        this.txrc = value;
    }

    /**
     * 获取eutr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AEUTRType }
     *     
     */
    public SeqE2F19AEUTRType getEUTR() {
        return eutr;
    }

    /**
     * 设置eutr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AEUTRType }
     *     
     */
    public void setEUTR(SeqE2F19AEUTRType value) {
        this.eutr = value;
    }

    /**
     * 获取acru属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AACRUType }
     *     
     */
    public SeqE2F19AACRUType getACRU() {
        return acru;
    }

    /**
     * 设置acru属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AACRUType }
     *     
     */
    public void setACRU(SeqE2F19AACRUType value) {
        this.acru = value;
    }

    /**
     * 获取equl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AEQULType }
     *     
     */
    public SeqE2F19AEQULType getEQUL() {
        return equl;
    }

    /**
     * 设置equl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AEQULType }
     *     
     */
    public void setEQUL(SeqE2F19AEQULType value) {
        this.equl = value;
    }

    /**
     * 获取ftca属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19AFTCAType }
     *     
     */
    public SeqE2F19AFTCAType getFTCA() {
        return ftca;
    }

    /**
     * 设置ftca属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19AFTCAType }
     *     
     */
    public void setFTCA(SeqE2F19AFTCAType value) {
        this.ftca = value;
    }

    /**
     * 获取nrat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ANRATType }
     *     
     */
    public SeqE2F19ANRATType getNRAT() {
        return nrat;
    }

    /**
     * 设置nrat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ANRATType }
     *     
     */
    public void setNRAT(SeqE2F19ANRATType value) {
        this.nrat = value;
    }

    /**
     * 获取bwit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ABWITType }
     *     
     */
    public SeqE2F19ABWITType getBWIT() {
        return bwit;
    }

    /**
     * 设置bwit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ABWITType }
     *     
     */
    public void setBWIT(SeqE2F19ABWITType value) {
        this.bwit = value;
    }

    /**
     * 获取txin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATXINType }
     *     
     */
    public SeqE2F19ATXINType getTXIN() {
        return txin;
    }

    /**
     * 设置txin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATXINType }
     *     
     */
    public void setTXIN(SeqE2F19ATXINType value) {
        this.txin = value;
    }

    /**
     * 获取trax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ATRAXType }
     *     
     */
    public SeqE2F19ATRAXType getTRAX() {
        return trax;
    }

    /**
     * 设置trax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ATRAXType }
     *     
     */
    public void setTRAX(SeqE2F19ATRAXType value) {
        this.trax = value;
    }

    /**
     * 获取deem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ADEEMType }
     *     
     */
    public SeqE2F19ADEEMType getDEEM() {
        return deem;
    }

    /**
     * 设置deem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ADEEMType }
     *     
     */
    public void setDEEM(SeqE2F19ADEEMType value) {
        this.deem = value;
    }

    /**
     * 获取cdfi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F19ACDFIType }
     *     
     */
    public SeqE2F19ACDFIType getCDFI() {
        return cdfi;
    }

    /**
     * 设置cdfi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F19ACDFIType }
     *     
     */
    public void setCDFI(SeqE2F19ACDFIType value) {
        this.cdfi = value;
    }

}
