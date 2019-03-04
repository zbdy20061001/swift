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
 * <p>SeqE1_F94a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F94a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="SAFE" type="{urn:swift:xsd:fin.564.2018}SeqE1_F94a_SAFE_Type"/>
 *         &lt;element name="COIN" type="{urn:swift:xsd:fin.564.2018}SeqE1_F94a_COIN_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F94a_Type", propOrder = {
    "safe",
    "coin"
})
public class SeqE1F94AType
    extends ISO15022Field
{

    @XmlElement(name = "SAFE")
    protected SeqE1F94ASAFEType safe;
    @XmlElement(name = "COIN")
    protected SeqE1F94ACOINType coin;

    /**
     * ��ȡsafe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F94ASAFEType }
     *     
     */
    public SeqE1F94ASAFEType getSAFE() {
        return safe;
    }

    /**
     * ����safe���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F94ASAFEType }
     *     
     */
    public void setSAFE(SeqE1F94ASAFEType value) {
        this.safe = value;
    }

    /**
     * ��ȡcoin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1F94ACOINType }
     *     
     */
    public SeqE1F94ACOINType getCOIN() {
        return coin;
    }

    /**
     * ����coin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1F94ACOINType }
     *     
     */
    public void setCOIN(SeqE1F94ACOINType value) {
        this.coin = value;
    }

}
