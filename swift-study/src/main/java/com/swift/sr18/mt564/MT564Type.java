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
 * <p>MT564_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MT564_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Message">
 *       &lt;sequence>
 *         &lt;element name="SeqA" type="{urn:swift:xsd:fin.564.2018}SeqA_Type"/>
 *         &lt;element name="SeqB" type="{urn:swift:xsd:fin.564.2018}SeqB_Type"/>
 *         &lt;element name="SeqC" type="{urn:swift:xsd:fin.564.2018}SeqC_Type" minOccurs="0"/>
 *         &lt;element name="SeqD" type="{urn:swift:xsd:fin.564.2018}SeqD_Type" minOccurs="0"/>
 *         &lt;element name="SeqE" type="{urn:swift:xsd:fin.564.2018}SeqE_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeqF" type="{urn:swift:xsd:fin.564.2018}SeqF_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT564_Type", propOrder = {
    "seqA",
    "seqB",
    "seqC",
    "seqD",
    "seqE",
    "seqF"
})
public class MT564Type
    extends ISO15022Message
{

    @XmlElement(name = "SeqA", required = true)
    protected SeqAType seqA;
    @XmlElement(name = "SeqB", required = true)
    protected SeqBType seqB;
    @XmlElement(name = "SeqC")
    protected SeqCType seqC;
    @XmlElement(name = "SeqD")
    protected SeqDType seqD;
    @XmlElement(name = "SeqE")
    protected List<SeqEType> seqE;
    @XmlElement(name = "SeqF")
    protected SeqFType seqF;

    /**
     * ��ȡseqA���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAType }
     *     
     */
    public SeqAType getSeqA() {
        return seqA;
    }

    /**
     * ����seqA���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAType }
     *     
     */
    public void setSeqA(SeqAType value) {
        this.seqA = value;
    }

    /**
     * ��ȡseqB���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqBType }
     *     
     */
    public SeqBType getSeqB() {
        return seqB;
    }

    /**
     * ����seqB���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBType }
     *     
     */
    public void setSeqB(SeqBType value) {
        this.seqB = value;
    }

    /**
     * ��ȡseqC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCType }
     *     
     */
    public SeqCType getSeqC() {
        return seqC;
    }

    /**
     * ����seqC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCType }
     *     
     */
    public void setSeqC(SeqCType value) {
        this.seqC = value;
    }

    /**
     * ��ȡseqD���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDType }
     *     
     */
    public SeqDType getSeqD() {
        return seqD;
    }

    /**
     * ����seqD���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDType }
     *     
     */
    public void setSeqD(SeqDType value) {
        this.seqD = value;
    }

    /**
     * Gets the value of the seqE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqEType }
     * 
     * 
     */
    public List<SeqEType> getSeqE() {
        if (seqE == null) {
            seqE = new ArrayList<SeqEType>();
        }
        return this.seqE;
    }

    /**
     * ��ȡseqF���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqFType }
     *     
     */
    public SeqFType getSeqF() {
        return seqF;
    }

    /**
     * ����seqF���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqFType }
     *     
     */
    public void setSeqF(SeqFType value) {
        this.seqF = value;
    }

}
