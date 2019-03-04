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
 * <p>SeqD_F92a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="RDIS" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RDIS_Type"/>
 *         &lt;element name="INTR" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_INTR_Type"/>
 *         &lt;element name="BIDI" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_BIDI_Type"/>
 *         &lt;element name="NWFC" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_NWFC_Type"/>
 *         &lt;element name="PTSC" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_PTSC_Type"/>
 *         &lt;element name="PRFC" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_PRFC_Type"/>
 *         &lt;element name="RINR" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RINR_Type"/>
 *         &lt;element name="RSPR" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RSPR_Type"/>
 *         &lt;element name="SHRT" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_SHRT_Type"/>
 *         &lt;element name="RLOS" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_RLOS_Type"/>
 *         &lt;element name="DEVI" type="{urn:swift:xsd:fin.564.2018}SeqD_F92a_DEVI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F92a_Type", propOrder = {
    "rdis",
    "intr",
    "bidi",
    "nwfc",
    "ptsc",
    "prfc",
    "rinr",
    "rspr",
    "shrt",
    "rlos",
    "devi"
})
public class SeqDF92AType
    extends ISO15022Field
{

    @XmlElement(name = "RDIS")
    protected SeqDF92ARDISType rdis;
    @XmlElement(name = "INTR")
    protected SeqDF92AINTRType intr;
    @XmlElement(name = "BIDI")
    protected SeqDF92ABIDIType bidi;
    @XmlElement(name = "NWFC")
    protected SeqDF92ANWFCType nwfc;
    @XmlElement(name = "PTSC")
    protected SeqDF92APTSCType ptsc;
    @XmlElement(name = "PRFC")
    protected SeqDF92APRFCType prfc;
    @XmlElement(name = "RINR")
    protected SeqDF92ARINRType rinr;
    @XmlElement(name = "RSPR")
    protected SeqDF92ARSPRType rspr;
    @XmlElement(name = "SHRT")
    protected SeqDF92ASHRTType shrt;
    @XmlElement(name = "RLOS")
    protected SeqDF92ARLOSType rlos;
    @XmlElement(name = "DEVI")
    protected SeqDF92ADEVIType devi;

    /**
     * ��ȡrdis���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARDISType }
     *     
     */
    public SeqDF92ARDISType getRDIS() {
        return rdis;
    }

    /**
     * ����rdis���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARDISType }
     *     
     */
    public void setRDIS(SeqDF92ARDISType value) {
        this.rdis = value;
    }

    /**
     * ��ȡintr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92AINTRType }
     *     
     */
    public SeqDF92AINTRType getINTR() {
        return intr;
    }

    /**
     * ����intr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92AINTRType }
     *     
     */
    public void setINTR(SeqDF92AINTRType value) {
        this.intr = value;
    }

    /**
     * ��ȡbidi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ABIDIType }
     *     
     */
    public SeqDF92ABIDIType getBIDI() {
        return bidi;
    }

    /**
     * ����bidi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ABIDIType }
     *     
     */
    public void setBIDI(SeqDF92ABIDIType value) {
        this.bidi = value;
    }

    /**
     * ��ȡnwfc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ANWFCType }
     *     
     */
    public SeqDF92ANWFCType getNWFC() {
        return nwfc;
    }

    /**
     * ����nwfc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ANWFCType }
     *     
     */
    public void setNWFC(SeqDF92ANWFCType value) {
        this.nwfc = value;
    }

    /**
     * ��ȡptsc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92APTSCType }
     *     
     */
    public SeqDF92APTSCType getPTSC() {
        return ptsc;
    }

    /**
     * ����ptsc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92APTSCType }
     *     
     */
    public void setPTSC(SeqDF92APTSCType value) {
        this.ptsc = value;
    }

    /**
     * ��ȡprfc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92APRFCType }
     *     
     */
    public SeqDF92APRFCType getPRFC() {
        return prfc;
    }

    /**
     * ����prfc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92APRFCType }
     *     
     */
    public void setPRFC(SeqDF92APRFCType value) {
        this.prfc = value;
    }

    /**
     * ��ȡrinr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARINRType }
     *     
     */
    public SeqDF92ARINRType getRINR() {
        return rinr;
    }

    /**
     * ����rinr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARINRType }
     *     
     */
    public void setRINR(SeqDF92ARINRType value) {
        this.rinr = value;
    }

    /**
     * ��ȡrspr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARSPRType }
     *     
     */
    public SeqDF92ARSPRType getRSPR() {
        return rspr;
    }

    /**
     * ����rspr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARSPRType }
     *     
     */
    public void setRSPR(SeqDF92ARSPRType value) {
        this.rspr = value;
    }

    /**
     * ��ȡshrt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ASHRTType }
     *     
     */
    public SeqDF92ASHRTType getSHRT() {
        return shrt;
    }

    /**
     * ����shrt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ASHRTType }
     *     
     */
    public void setSHRT(SeqDF92ASHRTType value) {
        this.shrt = value;
    }

    /**
     * ��ȡrlos���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ARLOSType }
     *     
     */
    public SeqDF92ARLOSType getRLOS() {
        return rlos;
    }

    /**
     * ����rlos���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ARLOSType }
     *     
     */
    public void setRLOS(SeqDF92ARLOSType value) {
        this.rlos = value;
    }

    /**
     * ��ȡdevi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF92ADEVIType }
     *     
     */
    public SeqDF92ADEVIType getDEVI() {
        return devi;
    }

    /**
     * ����devi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF92ADEVIType }
     *     
     */
    public void setDEVI(SeqDF92ADEVIType value) {
        this.devi = value;
    }

}
