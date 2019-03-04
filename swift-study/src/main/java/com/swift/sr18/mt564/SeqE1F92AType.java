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
 * <p>SeqE1_F92a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F92a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="ADEX" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_ADEX_Type"/>
 *         &lt;element name="NEWO" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_NEWO_Type"/>
 *         &lt;element name="ADSR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_ADSR_Type"/>
 *         &lt;element name="TRAT" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_TRAT_Type"/>
 *         &lt;element name="CHAR" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_CHAR_Type"/>
 *         &lt;element name="FISC" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_FISC_Type"/>
 *         &lt;element name="RATE" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_RATE_Type"/>
 *         &lt;element name="TAXC" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_TAXC_Type"/>
 *         &lt;element name="TRAX" type="{urn:swift:xsd:fin.564.2018}SeqE1_F92a_TRAX_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F92a_Type", propOrder = {
    "adex",
    "newo",
    "adsr",
    "trat",
    "_char",
    "fisc",
    "rate",
    "taxc",
    "trax"
})
public class SeqE1F92AType
    extends ISO15022Field
{

    @XmlElement(name = "ADEX")
    protected SeqE1F92AADEXType adex;
    @XmlElement(name = "NEWO")
    protected SeqE1F92ANEWOType newo;
    @XmlElement(name = "ADSR")
    protected SeqE1F92AADSRType adsr;
    @XmlElement(name = "TRAT")
    protected SeqE1F92ATRATType trat;
    @XmlElement(name = "CHAR")
    protected SeqE1F92ACHARType _char;
    @XmlElement(name = "FISC")
    protected SeqE1F92AFISCType fisc;
    @XmlElement(name = "RATE")
    protected SeqE1F92ARATEType rate;
    @XmlElement(name = "TAXC")
    protected SeqE1F92ATAXCType taxc;
    @XmlElement(name = "TRAX")
    protected SeqE1F92ATRAXType trax;

    /**
     * ��ȡadex���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92AADEXType }
     *     
     */
    public SeqE1F92AADEXType getADEX() {
        return adex;
    }

    /**
     * ����adex���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92AADEXType }
     *     
     */
    public void setADEX(SeqE1F92AADEXType value) {
        this.adex = value;
    }

    /**
     * ��ȡnewo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ANEWOType }
     *     
     */
    public SeqE1F92ANEWOType getNEWO() {
        return newo;
    }

    /**
     * ����newo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ANEWOType }
     *     
     */
    public void setNEWO(SeqE1F92ANEWOType value) {
        this.newo = value;
    }

    /**
     * ��ȡadsr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92AADSRType }
     *     
     */
    public SeqE1F92AADSRType getADSR() {
        return adsr;
    }

    /**
     * ����adsr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92AADSRType }
     *     
     */
    public void setADSR(SeqE1F92AADSRType value) {
        this.adsr = value;
    }

    /**
     * ��ȡtrat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ATRATType }
     *     
     */
    public SeqE1F92ATRATType getTRAT() {
        return trat;
    }

    /**
     * ����trat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ATRATType }
     *     
     */
    public void setTRAT(SeqE1F92ATRATType value) {
        this.trat = value;
    }

    /**
     * ��ȡchar���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ACHARType }
     *     
     */
    public SeqE1F92ACHARType getCHAR() {
        return _char;
    }

    /**
     * ����char���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ACHARType }
     *     
     */
    public void setCHAR(SeqE1F92ACHARType value) {
        this._char = value;
    }

    /**
     * ��ȡfisc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92AFISCType }
     *     
     */
    public SeqE1F92AFISCType getFISC() {
        return fisc;
    }

    /**
     * ����fisc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92AFISCType }
     *     
     */
    public void setFISC(SeqE1F92AFISCType value) {
        this.fisc = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ARATEType }
     *     
     */
    public SeqE1F92ARATEType getRATE() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ARATEType }
     *     
     */
    public void setRATE(SeqE1F92ARATEType value) {
        this.rate = value;
    }

    /**
     * ��ȡtaxc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ATAXCType }
     *     
     */
    public SeqE1F92ATAXCType getTAXC() {
        return taxc;
    }

    /**
     * ����taxc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ATAXCType }
     *     
     */
    public void setTAXC(SeqE1F92ATAXCType value) {
        this.taxc = value;
    }

    /**
     * ��ȡtrax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F92ATRAXType }
     *     
     */
    public SeqE1F92ATRAXType getTRAX() {
        return trax;
    }

    /**
     * ����trax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F92ATRAXType }
     *     
     */
    public void setTRAX(SeqE1F92ATRAXType value) {
        this.trax = value;
    }

}
