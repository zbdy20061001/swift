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
 * <p>SeqD_F17a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F17a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CERT" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_CERT_Type"/>
 *         &lt;element name="RCHG" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_RCHG_Type"/>
 *         &lt;element name="COMP" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_COMP_Type"/>
 *         &lt;element name="ACIN" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_ACIN_Type"/>
 *         &lt;element name="LEOG" type="{urn:swift:xsd:fin.564.2018}SeqD_F17a_LEOG_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F17a_Type", propOrder = {
    "cert",
    "rchg",
    "comp",
    "acin",
    "leog"
})
public class SeqDF17AType
    extends ISO15022Field
{

    @XmlElement(name = "CERT")
    protected SeqDF17ACERTType cert;
    @XmlElement(name = "RCHG")
    protected SeqDF17ARCHGType rchg;
    @XmlElement(name = "COMP")
    protected SeqDF17ACOMPType comp;
    @XmlElement(name = "ACIN")
    protected SeqDF17AACINType acin;
    @XmlElement(name = "LEOG")
    protected SeqDF17ALEOGType leog;

    /**
     * ��ȡcert���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ACERTType }
     *     
     */
    public SeqDF17ACERTType getCERT() {
        return cert;
    }

    /**
     * ����cert���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ACERTType }
     *     
     */
    public void setCERT(SeqDF17ACERTType value) {
        this.cert = value;
    }

    /**
     * ��ȡrchg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ARCHGType }
     *     
     */
    public SeqDF17ARCHGType getRCHG() {
        return rchg;
    }

    /**
     * ����rchg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ARCHGType }
     *     
     */
    public void setRCHG(SeqDF17ARCHGType value) {
        this.rchg = value;
    }

    /**
     * ��ȡcomp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ACOMPType }
     *     
     */
    public SeqDF17ACOMPType getCOMP() {
        return comp;
    }

    /**
     * ����comp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ACOMPType }
     *     
     */
    public void setCOMP(SeqDF17ACOMPType value) {
        this.comp = value;
    }

    /**
     * ��ȡacin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17AACINType }
     *     
     */
    public SeqDF17AACINType getACIN() {
        return acin;
    }

    /**
     * ����acin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17AACINType }
     *     
     */
    public void setACIN(SeqDF17AACINType value) {
        this.acin = value;
    }

    /**
     * ��ȡleog���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF17ALEOGType }
     *     
     */
    public SeqDF17ALEOGType getLEOG() {
        return leog;
    }

    /**
     * ����leog���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF17ALEOGType }
     *     
     */
    public void setLEOG(SeqDF17ALEOGType value) {
        this.leog = value;
    }

}
