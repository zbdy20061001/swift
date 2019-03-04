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
 * <p>SeqB1_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqB1_F16a_1_Type"/>
 *         &lt;element name="F94a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F94a_Type" minOccurs="0"/>
 *         &lt;element name="F22a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F22a_Type" minOccurs="0"/>
 *         &lt;element name="F12a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F12a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F11a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F11a_Type" minOccurs="0"/>
 *         &lt;element name="F98a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F98a_Type" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="F92a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F92a_Type" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="F36a" type="{urn:swift:xsd:fin.564.2018}SeqB1_F36a_Type" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqB1_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_Type", propOrder = {
    "f16A1",
    "f94A",
    "f22A",
    "f12A",
    "f11A",
    "f98A",
    "f92A",
    "f36A",
    "f16A2"
})
public class SeqB1Type
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqB1F16A1Type f16A1;
    @XmlElement(name = "F94a")
    protected SeqB1F94AType f94A;
    @XmlElement(name = "F22a")
    protected SeqB1F22AType f22A;
    @XmlElement(name = "F12a")
    protected List<SeqB1F12AType> f12A;
    @XmlElement(name = "F11a")
    protected SeqB1F11AType f11A;
    @XmlElement(name = "F98a")
    protected List<SeqB1F98AType> f98A;
    @XmlElement(name = "F92a")
    protected List<SeqB1F92AType> f92A;
    @XmlElement(name = "F36a")
    protected List<SeqB1F36AType> f36A;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqB1F16A2Type f16A2;

    /**
     * ��ȡf16A1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F16A1Type }
     *     
     */
    public SeqB1F16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * ����f16A1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F16A1Type }
     *     
     */
    public void setF16A1(SeqB1F16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * ��ȡf94A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F94AType }
     *     
     */
    public SeqB1F94AType getF94A() {
        return f94A;
    }

    /**
     * ����f94A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F94AType }
     *     
     */
    public void setF94A(SeqB1F94AType value) {
        this.f94A = value;
    }

    /**
     * ��ȡf22A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F22AType }
     *     
     */
    public SeqB1F22AType getF22A() {
        return f22A;
    }

    /**
     * ����f22A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F22AType }
     *     
     */
    public void setF22A(SeqB1F22AType value) {
        this.f22A = value;
    }

    /**
     * Gets the value of the f12A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f12A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF12A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB1F12AType }
     * 
     * 
     */
    public List<SeqB1F12AType> getF12A() {
        if (f12A == null) {
            f12A = new ArrayList<SeqB1F12AType>();
        }
        return this.f12A;
    }

    /**
     * ��ȡf11A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F11AType }
     *     
     */
    public SeqB1F11AType getF11A() {
        return f11A;
    }

    /**
     * ����f11A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F11AType }
     *     
     */
    public void setF11A(SeqB1F11AType value) {
        this.f11A = value;
    }

    /**
     * Gets the value of the f98A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f98A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF98A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB1F98AType }
     * 
     * 
     */
    public List<SeqB1F98AType> getF98A() {
        if (f98A == null) {
            f98A = new ArrayList<SeqB1F98AType>();
        }
        return this.f98A;
    }

    /**
     * Gets the value of the f92A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f92A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF92A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB1F92AType }
     * 
     * 
     */
    public List<SeqB1F92AType> getF92A() {
        if (f92A == null) {
            f92A = new ArrayList<SeqB1F92AType>();
        }
        return this.f92A;
    }

    /**
     * Gets the value of the f36A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the f36A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getF36A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB1F36AType }
     * 
     * 
     */
    public List<SeqB1F36AType> getF36A() {
        if (f36A == null) {
            f36A = new ArrayList<SeqB1F36AType>();
        }
        return this.f36A;
    }

    /**
     * ��ȡf16A2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F16A2Type }
     *     
     */
    public SeqB1F16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * ����f16A2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F16A2Type }
     *     
     */
    public void setF16A2(SeqB1F16A2Type value) {
        this.f16A2 = value;
    }

}
