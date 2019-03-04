//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.12.05 ʱ�� 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqB2_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqB2_F16a_1_Type"/>
 *         &lt;element name="F95a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F95a_Type" minOccurs="0"/>
 *         &lt;element name="F97a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F97a_Type"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F94a_Type" minOccurs="0"/>
 *         &lt;element name="F93a" type="{urn:swift:xsd:fin.564.2018}SeqB2_F93a_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqB2_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_Type", propOrder = {
    "f16A1",
    "f95A",
    "f97A",
    "f94A",
    "f93A",
    "f16A2"
})
public class SeqB2Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqB2F16A1Type f16A1;
    @XmlElement(name = "F95a")
    protected SeqB2F95AType f95A;
    @XmlElement(name = "F97a", required = true)
    protected SeqB2F97AType f97A;
    @XmlElement(name = "F94a")
    protected SeqB2F94AType f94A;
    @XmlElement(name = "F93a")
    protected List<SeqB2F93AType> f93A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqB2F16A2Type f16A2;

    /**
     * ��ȡf16A1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F16A1Type }
     *     
     */
    public SeqB2F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * ����f16A1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F16A1Type }
     *     
     */
    public void setF16A1(SeqB2F16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * ��ȡf95A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F95AType }
     *     
     */
    public SeqB2F95AType getF95A() {
        return f95A;
    }

    /**
     * ����f95A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F95AType }
     *     
     */
    public void setF95A(SeqB2F95AType value) {
        this.f95A = value;
    }

    /**
     * ��ȡf97A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F97AType }
     *     
     */
    public SeqB2F97AType getF97A() {
        return f97A;
    }

    /**
     * ����f97A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F97AType }
     *     
     */
    public void setF97A(SeqB2F97AType value) {
        this.f97A = value;
    }

    /**
     * ��ȡf94A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F94AType }
     *     
     */
    public SeqB2F94AType getF94A() {
        return f94A;
    }

    /**
     * ����f94A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F94AType }
     *     
     */
    public void setF94A(SeqB2F94AType value) {
        this.f94A = value;
    }

    /**
     * Gets the value of the f93A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f93A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF93A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB2F93AType }
     * 
     * 
     */
    public List<SeqB2F93AType> getF93A() {
        if (f93A == null) {
            f93A = new ArrayList<SeqB2F93AType>();
        }
        return this.f93A;
    }

    /**
     * ��ȡf16A2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB2F16A2Type }
     *     
     */
    public SeqB2F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * ����f16A2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB2F16A2Type }
     *     
     */
    public void setF16A2(SeqB2F16A2Type value) {
        this.f16A2 = value;
    }

}
