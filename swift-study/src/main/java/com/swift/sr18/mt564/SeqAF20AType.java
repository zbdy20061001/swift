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
 * <p>SeqA_F20a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F20a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CORP" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_CORP_Type"/>
 *         &lt;element name="SEME" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_SEME_Type"/>
 *         &lt;element name="COAF" type="{urn:swift:xsd:fin.564.2018}SeqA_F20a_COAF_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F20a_Type", propOrder = {
    "corp",
    "seme",
    "coaf"
})
public class SeqAF20AType
    extends ISO15022Field
{

    @XmlElement(name = "CORP")
    protected SeqAF20ACORPType corp;
    @XmlElement(name = "SEME")
    protected SeqAF20ASEMEType seme;
    @XmlElement(name = "COAF")
    protected SeqAF20ACOAFType coaf;

    /**
     * ��ȡcorp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF20ACORPType }
     *     
     */
    public SeqAF20ACORPType getCORP() {
        return corp;
    }

    /**
     * ����corp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF20ACORPType }
     *     
     */
    public void setCORP(SeqAF20ACORPType value) {
        this.corp = value;
    }

    /**
     * ��ȡseme���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF20ASEMEType }
     *     
     */
    public SeqAF20ASEMEType getSEME() {
        return seme;
    }

    /**
     * ����seme���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF20ASEMEType }
     *     
     */
    public void setSEME(SeqAF20ASEMEType value) {
        this.seme = value;
    }

    /**
     * ��ȡcoaf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF20ACOAFType }
     *     
     */
    public SeqAF20ACOAFType getCOAF() {
        return coaf;
    }

    /**
     * ����coaf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF20ACOAFType }
     *     
     */
    public void setCOAF(SeqAF20ACOAFType value) {
        this.coaf = value;
    }

}
