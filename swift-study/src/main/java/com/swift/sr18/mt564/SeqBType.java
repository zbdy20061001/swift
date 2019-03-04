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
 * <p>SeqB_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Sequence">
 *       &lt;sequence>
 *         &lt;element name="F16a_1" type="{urn:swift:xsd:fin.564.2018}SeqB_F16a_1_Type"/>
 *         &lt;element name="F35a" type="{urn:swift:xsd:fin.564.2018}SeqB_F35a_Type"/>
 *         &lt;element name="SeqB1" type="{urn:swift:xsd:fin.564.2018}SeqB1_Type" minOccurs="0"/>
 *         &lt;element name="SeqB2" type="{urn:swift:xsd:fin.564.2018}SeqB2_Type" maxOccurs="unbounded"/>
 *         &lt;element name="F16a_2" type="{urn:swift:xsd:fin.564.2018}SeqB_F16a_2_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB_Type", propOrder = {
    "f16A1",
    "f35A",
    "seqB1",
    "seqB2",
    "f16A2"
})
public class SeqBType
    extends Sequence
{

    @XmlElement(name = "F16a_1", required = true)
    protected SeqBF16A1Type f16A1;
    @XmlElement(name = "F35a", required = true)
    protected SeqBF35AType f35A;
    @XmlElement(name = "SeqB1")
    protected SeqB1Type seqB1;
    @XmlElement(name = "SeqB2", required = true)
    protected List<SeqB2Type> seqB2;
    @XmlElement(name = "F16a_2", required = true)
    protected SeqBF16A2Type f16A2;

    /**
     * ��ȡf16A1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqBF16A1Type }
     *     
     */
    public SeqBF16A1Type getF16A1() {
        return f16A1;
    }

    /**
     * ����f16A1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBF16A1Type }
     *     
     */
    public void setF16A1(SeqBF16A1Type value) {
        this.f16A1 = value;
    }

    /**
     * ��ȡf35A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqBF35AType }
     *     
     */
    public SeqBF35AType getF35A() {
        return f35A;
    }

    /**
     * ����f35A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBF35AType }
     *     
     */
    public void setF35A(SeqBF35AType value) {
        this.f35A = value;
    }

    /**
     * ��ȡseqB1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1Type }
     *     
     */
    public SeqB1Type getSeqB1() {
        return seqB1;
    }

    /**
     * ����seqB1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1Type }
     *     
     */
    public void setSeqB1(SeqB1Type value) {
        this.seqB1 = value;
    }

    /**
     * Gets the value of the seqB2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seqB2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeqB2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeqB2Type }
     * 
     * 
     */
    public List<SeqB2Type> getSeqB2() {
        if (seqB2 == null) {
            seqB2 = new ArrayList<SeqB2Type>();
        }
        return this.seqB2;
    }

    /**
     * ��ȡf16A2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqBF16A2Type }
     *     
     */
    public SeqBF16A2Type getF16A2() {
        return f16A2;
    }

    /**
     * ����f16A2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqBF16A2Type }
     *     
     */
    public void setF16A2(SeqBF16A2Type value) {
        this.f16A2 = value;
    }

}
