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
 * <p>SeqC_F22a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqC_F22a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DISF" type="{urn:swift:xsd:fin.564.2018}SeqC_F22a_DISF_Type"/>
 *         &lt;element name="SELL" type="{urn:swift:xsd:fin.564.2018}SeqC_F22a_SELL_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F22a_Type", propOrder = {
    "disf",
    "sell"
})
public class SeqCF22AType
    extends ISO15022Field
{

    @XmlElement(name = "DISF")
    protected SeqCF22ADISFType disf;
    @XmlElement(name = "SELL")
    protected SeqCF22ASELLType sell;

    /**
     * ��ȡdisf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF22ADISFType }
     *     
     */
    public SeqCF22ADISFType getDISF() {
        return disf;
    }

    /**
     * ����disf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF22ADISFType }
     *     
     */
    public void setDISF(SeqCF22ADISFType value) {
        this.disf = value;
    }

    /**
     * ��ȡsell���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF22ASELLType }
     *     
     */
    public SeqCF22ASELLType getSELL() {
        return sell;
    }

    /**
     * ����sell���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF22ASELLType }
     *     
     */
    public void setSELL(SeqCF22ASELLType value) {
        this.sell = value;
    }

}
