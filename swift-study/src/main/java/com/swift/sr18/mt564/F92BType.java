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
 * <p>F92B_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F92B_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="FirstCurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="SecondCurrencyCode" type="{urn:swift:xsd:fin.564.2018}Currency_Type"/>
 *         &lt;element name="Rate" type="{urn:swift:xsd:fin.564.2018}Rate_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F92B_Type", propOrder = {
    "firstCurrencyCode",
    "secondCurrencyCode",
    "rate"
})
public class F92BType
    extends FieldOption
{

    @XmlElement(name = "FirstCurrencyCode", required = true)
    protected String firstCurrencyCode;
    @XmlElement(name = "SecondCurrencyCode", required = true)
    protected String secondCurrencyCode;
    @XmlElement(name = "Rate", required = true)
    protected String rate;

    /**
     * ��ȡfirstCurrencyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstCurrencyCode() {
        return firstCurrencyCode;
    }

    /**
     * ����firstCurrencyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstCurrencyCode(String value) {
        this.firstCurrencyCode = value;
    }

    /**
     * ��ȡsecondCurrencyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondCurrencyCode() {
        return secondCurrencyCode;
    }

    /**
     * ����secondCurrencyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondCurrencyCode(String value) {
        this.secondCurrencyCode = value;
    }

    /**
     * ��ȡrate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * ����rate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

}
