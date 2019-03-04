//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.12.05 ʱ�� 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqD_F22a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdivi���Ե�ֵ��
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
     * ����divi���Ե�ֵ��
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
     * ��ȡconv���Ե�ֵ��
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
     * ����conv���Ե�ֵ��
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
     * ��ȡdity���Ե�ֵ��
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
     * ����dity���Ե�ֵ��
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
     * ��ȡoffe���Ե�ֵ��
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
     * ����offe���Ե�ֵ��
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
     * ��ȡsell���Ե�ֵ��
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
     * ����sell���Ե�ֵ��
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
     * ��ȡesta���Ե�ֵ��
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
     * ����esta���Ե�ֵ��
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
     * ��ȡaddb���Ե�ֵ��
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
     * ����addb���Ե�ֵ��
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
     * ��ȡchan���Ե�ֵ��
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
     * ����chan���Ե�ֵ��
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
     * ��ȡrhdi���Ե�ֵ��
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
     * ����rhdi���Ե�ֵ��
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
     * ��ȡecio���Ե�ֵ��
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
     * ����ecio���Ե�ֵ��
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
     * ��ȡtdta���Ե�ֵ��
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
     * ����tdta���Ե�ֵ��
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
     * ��ȡelct���Ե�ֵ��
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
     * ����elct���Ե�ֵ��
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
     * ��ȡloto���Ե�ֵ��
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
     * ����loto���Ե�ֵ��
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
     * ��ȡcefi���Ե�ֵ��
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
     * ����cefi���Ե�ֵ��
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
     * ��ȡcons���Ե�ֵ��
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
     * ����cons���Ե�ֵ��
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
     * ��ȡinfo���Ե�ֵ��
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
     * ����info���Ե�ֵ��
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
     * ��ȡtndp���Ե�ֵ��
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
     * ����tndp���Ե�ֵ��
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
