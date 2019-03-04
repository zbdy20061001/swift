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
 * <p>SeqA_F22a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CAEP" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_CAEP_Type"/>
 *         &lt;element name="CAEV" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_CAEV_Type"/>
 *         &lt;element name="CAMV" type="{urn:swift:xsd:fin.564.2018}SeqA_F22a_CAMV_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F22a_Type", propOrder = {
    "caep",
    "caev",
    "camv"
})
public class SeqAF22AType
    extends ISO15022Field
{

    @XmlElement(name = "CAEP")
    protected SeqAF22ACAEPType caep;
    @XmlElement(name = "CAEV")
    protected SeqAF22ACAEVType caev;
    @XmlElement(name = "CAMV")
    protected SeqAF22ACAMVType camv;

    /**
     * ��ȡcaep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF22ACAEPType }
     *     
     */
    public SeqAF22ACAEPType getCAEP() {
        return caep;
    }

    /**
     * ����caep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF22ACAEPType }
     *     
     */
    public void setCAEP(SeqAF22ACAEPType value) {
        this.caep = value;
    }

    /**
     * ��ȡcaev���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF22ACAEVType }
     *     
     */
    public SeqAF22ACAEVType getCAEV() {
        return caev;
    }

    /**
     * ����caev���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF22ACAEVType }
     *     
     */
    public void setCAEV(SeqAF22ACAEVType value) {
        this.caev = value;
    }

    /**
     * ��ȡcamv���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF22ACAMVType }
     *     
     */
    public SeqAF22ACAMVType getCAMV() {
        return camv;
    }

    /**
     * ����camv���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF22ACAMVType }
     *     
     */
    public void setCAMV(SeqAF22ACAMVType value) {
        this.camv = value;
    }

}
