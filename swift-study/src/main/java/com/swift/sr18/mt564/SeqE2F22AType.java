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
 * <p>SeqE2_F22a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CRDB" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_CRDB_Type"/>
 *         &lt;element name="CONT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_CONT_Type"/>
 *         &lt;element name="NELP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_NELP_Type"/>
 *         &lt;element name="ITYP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_ITYP_Type"/>
 *         &lt;element name="TXAP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_TXAP_Type"/>
 *         &lt;element name="ETYP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F22a_ETYP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F22a_Type", propOrder = {
    "crdb",
    "cont",
    "nelp",
    "ityp",
    "txap",
    "etyp"
})
public class SeqE2F22AType
    extends ISO15022Field
{

    @XmlElement(name = "CRDB")
    protected SeqE2F22ACRDBType crdb;
    @XmlElement(name = "CONT")
    protected SeqE2F22ACONTType cont;
    @XmlElement(name = "NELP")
    protected SeqE2F22ANELPType nelp;
    @XmlElement(name = "ITYP")
    protected SeqE2F22AITYPType ityp;
    @XmlElement(name = "TXAP")
    protected SeqE2F22ATXAPType txap;
    @XmlElement(name = "ETYP")
    protected SeqE2F22AETYPType etyp;

    /**
     * ��ȡcrdb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F22ACRDBType }
     *     
     */
    public SeqE2F22ACRDBType getCRDB() {
        return crdb;
    }

    /**
     * ����crdb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F22ACRDBType }
     *     
     */
    public void setCRDB(SeqE2F22ACRDBType value) {
        this.crdb = value;
    }

    /**
     * ��ȡcont���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F22ACONTType }
     *     
     */
    public SeqE2F22ACONTType getCONT() {
        return cont;
    }

    /**
     * ����cont���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F22ACONTType }
     *     
     */
    public void setCONT(SeqE2F22ACONTType value) {
        this.cont = value;
    }

    /**
     * ��ȡnelp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F22ANELPType }
     *     
     */
    public SeqE2F22ANELPType getNELP() {
        return nelp;
    }

    /**
     * ����nelp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F22ANELPType }
     *     
     */
    public void setNELP(SeqE2F22ANELPType value) {
        this.nelp = value;
    }

    /**
     * ��ȡityp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F22AITYPType }
     *     
     */
    public SeqE2F22AITYPType getITYP() {
        return ityp;
    }

    /**
     * ����ityp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F22AITYPType }
     *     
     */
    public void setITYP(SeqE2F22AITYPType value) {
        this.ityp = value;
    }

    /**
     * ��ȡtxap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F22ATXAPType }
     *     
     */
    public SeqE2F22ATXAPType getTXAP() {
        return txap;
    }

    /**
     * ����txap���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F22ATXAPType }
     *     
     */
    public void setTXAP(SeqE2F22ATXAPType value) {
        this.txap = value;
    }

    /**
     * ��ȡetyp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F22AETYPType }
     *     
     */
    public SeqE2F22AETYPType getETYP() {
        return etyp;
    }

    /**
     * ����etyp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F22AETYPType }
     *     
     */
    public void setETYP(SeqE2F22AETYPType value) {
        this.etyp = value;
    }

}
