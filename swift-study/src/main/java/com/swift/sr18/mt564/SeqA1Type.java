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
 * <p>SeqA1_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqA1_F16a_1_Type"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqA1_F22a_Type" minOccurs="0"/>
 *         &lt;element name="F13a" type="{urn:swift:xsd:fin.564.2018}SeqA1_F13a_Type" minOccurs="0"/>
 *         &lt;element name="F20a" type="{urn:swift:xsd:fin.564.2018}SeqA1_F20a_Type"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqA1_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_Type", propOrder = {
    "f16A1",
    "f22A",
    "f13A",
    "f20A",
    "f16A2"
})
public class SeqA1Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqA1F16A1Type f16A1;
    @XmlElement(name = "F22a")
    protected SeqA1F22AType f22A;
    @XmlElement(name = "F13a")
    protected SeqA1F13AType f13A;
    @XmlElement(name = "F20a", required = true)
    protected SeqA1F20AType f20A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqA1F16A2Type f16A2;

    /**
     * ��ȡf16A1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F16A1Type }
     *     
     */
    public SeqA1F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * ����f16A1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F16A1Type }
     *     
     */
    public void setF16A1(SeqA1F16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * ��ȡf22A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F22AType }
     *     
     */
    public SeqA1F22AType getF22A() {
        return f22A;
    }

    /**
     * ����f22A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F22AType }
     *     
     */
    public void setF22A(SeqA1F22AType value) {
        this.f22A = value;
    }

    /**
     * ��ȡf13A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F13AType }
     *     
     */
    public SeqA1F13AType getF13A() {
        return f13A;
    }

    /**
     * ����f13A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F13AType }
     *     
     */
    public void setF13A(SeqA1F13AType value) {
        this.f13A = value;
    }

    /**
     * ��ȡf20A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F20AType }
     *     
     */
    public SeqA1F20AType getF20A() {
        return f20A;
    }

    /**
     * ����f20A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F20AType }
     *     
     */
    public void setF20A(SeqA1F20AType value) {
        this.f20A = value;
    }

    /**
     * ��ȡf16A2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqA1F16A2Type }
     *     
     */
    public SeqA1F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * ����f16A2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqA1F16A2Type }
     *     
     */
    public void setF16A2(SeqA1F16A2Type value) {
        this.f16A2 = value;
    }

}
