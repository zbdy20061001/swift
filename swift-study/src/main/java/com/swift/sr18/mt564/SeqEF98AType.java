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
 * <p>SeqE_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdvcp���Ե�ֵ��
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
     * ����dvcp���Ե�ֵ��
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
     * ��ȡeard���Ե�ֵ��
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
     * ����eard���Ե�ֵ��
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
     * ��ȡexpi���Ե�ֵ��
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
     * ����expi���Ե�ֵ��
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
     * ��ȡmkdt���Ե�ֵ��
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
     * ����mkdt���Ե�ֵ��
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
     * ��ȡpodt���Ե�ֵ��
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
     * ����podt���Ե�ֵ��
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
     * ��ȡsubs���Ե�ֵ��
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
     * ����subs���Ե�ֵ��
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
     * ��ȡrddt���Ե�ֵ��
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
     * ����rddt���Ե�ֵ��
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
     * ��ȡcvpr���Ե�ֵ��
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
     * ����cvpr���Ե�ֵ��
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
     * ��ȡbord���Ե�ֵ��
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
     * ����bord���Ե�ֵ��
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
