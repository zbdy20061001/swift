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
 * <p>SeqE2_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PAYD" type="{urn:swift:xsd:fin.564.2018}SeqE2_F98a_PAYD_Type"/>
 *         &lt;element name="VALU" type="{urn:swift:xsd:fin.564.2018}SeqE2_F98a_VALU_Type"/>
 *         &lt;element name="EARL" type="{urn:swift:xsd:fin.564.2018}SeqE2_F98a_EARL_Type"/>
 *         &lt;element name="FXDT" type="{urn:swift:xsd:fin.564.2018}SeqE2_F98a_FXDT_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F98a_Type", propOrder = {
    "payd",
    "valu",
    "earl",
    "fxdt"
})
public class SeqE2F98AType
    extends ISO15022Field
{

    @XmlElement(name = "PAYD")
    protected SeqE2F98APAYDType payd;
    @XmlElement(name = "VALU")
    protected SeqE2F98AVALUType valu;
    @XmlElement(name = "EARL")
    protected SeqE2F98AEARLType earl;
    @XmlElement(name = "FXDT")
    protected SeqE2F98AFXDTType fxdt;

    /**
     * ��ȡpayd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F98APAYDType }
     *     
     */
    public SeqE2F98APAYDType getPAYD() {
        return payd;
    }

    /**
     * ����payd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F98APAYDType }
     *     
     */
    public void setPAYD(SeqE2F98APAYDType value) {
        this.payd = value;
    }

    /**
     * ��ȡvalu���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F98AVALUType }
     *     
     */
    public SeqE2F98AVALUType getVALU() {
        return valu;
    }

    /**
     * ����valu���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F98AVALUType }
     *     
     */
    public void setVALU(SeqE2F98AVALUType value) {
        this.valu = value;
    }

    /**
     * ��ȡearl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F98AEARLType }
     *     
     */
    public SeqE2F98AEARLType getEARL() {
        return earl;
    }

    /**
     * ����earl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F98AEARLType }
     *     
     */
    public void setEARL(SeqE2F98AEARLType value) {
        this.earl = value;
    }

    /**
     * ��ȡfxdt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F98AFXDTType }
     *     
     */
    public SeqE2F98AFXDTType getFXDT() {
        return fxdt;
    }

    /**
     * ����fxdt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F98AFXDTType }
     *     
     */
    public void setFXDT(SeqE2F98AFXDTType value) {
        this.fxdt = value;
    }

}
