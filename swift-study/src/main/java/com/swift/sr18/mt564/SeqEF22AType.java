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
 * <p>SeqE_F22a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CAOP" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_CAOP_Type"/>
 *         &lt;element name="DISF" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_DISF_Type"/>
 *         &lt;element name="OFFE" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_OFFE_Type"/>
 *         &lt;element name="OPTF" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_OPTF_Type"/>
 *         &lt;element name="OSTA" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_OSTA_Type"/>
 *         &lt;element name="CETI" type="{urn:swift:xsd:fin.564.2018}SeqE_F22a_CETI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F22a_Type", propOrder = {
    "caop",
    "disf",
    "offe",
    "optf",
    "osta",
    "ceti"
})
public class SeqEF22AType
    extends ISO15022Field
{

    @XmlElement(name = "CAOP")
    protected SeqEF22ACAOPType caop;
    @XmlElement(name = "DISF")
    protected SeqEF22ADISFType disf;
    @XmlElement(name = "OFFE")
    protected SeqEF22AOFFEType offe;
    @XmlElement(name = "OPTF")
    protected SeqEF22AOPTFType optf;
    @XmlElement(name = "OSTA")
    protected SeqEF22AOSTAType osta;
    @XmlElement(name = "CETI")
    protected SeqEF22ACETIType ceti;

    /**
     * ��ȡcaop���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF22ACAOPType }
     *     
     */
    public SeqEF22ACAOPType getCAOP() {
        return caop;
    }

    /**
     * ����caop���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF22ACAOPType }
     *     
     */
    public void setCAOP(SeqEF22ACAOPType value) {
        this.caop = value;
    }

    /**
     * ��ȡdisf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF22ADISFType }
     *     
     */
    public SeqEF22ADISFType getDISF() {
        return disf;
    }

    /**
     * ����disf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF22ADISFType }
     *     
     */
    public void setDISF(SeqEF22ADISFType value) {
        this.disf = value;
    }

    /**
     * ��ȡoffe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF22AOFFEType }
     *     
     */
    public SeqEF22AOFFEType getOFFE() {
        return offe;
    }

    /**
     * ����offe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF22AOFFEType }
     *     
     */
    public void setOFFE(SeqEF22AOFFEType value) {
        this.offe = value;
    }

    /**
     * ��ȡoptf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF22AOPTFType }
     *     
     */
    public SeqEF22AOPTFType getOPTF() {
        return optf;
    }

    /**
     * ����optf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF22AOPTFType }
     *     
     */
    public void setOPTF(SeqEF22AOPTFType value) {
        this.optf = value;
    }

    /**
     * ��ȡosta���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF22AOSTAType }
     *     
     */
    public SeqEF22AOSTAType getOSTA() {
        return osta;
    }

    /**
     * ����osta���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF22AOSTAType }
     *     
     */
    public void setOSTA(SeqEF22AOSTAType value) {
        this.osta = value;
    }

    /**
     * ��ȡceti���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF22ACETIType }
     *     
     */
    public SeqEF22ACETIType getCETI() {
        return ceti;
    }

    /**
     * ����ceti���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF22ACETIType }
     *     
     */
    public void setCETI(SeqEF22ACETIType value) {
        this.ceti = value;
    }

}
