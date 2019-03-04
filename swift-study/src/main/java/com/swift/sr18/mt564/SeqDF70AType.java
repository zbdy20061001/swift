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
 * <p>SeqD_F70a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F70a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="OFFO" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_OFFO_Type"/>
 *         &lt;element name="WEBB" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_WEBB_Type"/>
 *         &lt;element name="NAME" type="{urn:swift:xsd:fin.564.2018}SeqD_F70a_NAME_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F70a_Type", propOrder = {
    "offo",
    "webb",
    "name"
})
public class SeqDF70AType
    extends ISO15022Field
{

    @XmlElement(name = "OFFO")
    protected SeqDF70AOFFOType offo;
    @XmlElement(name = "WEBB")
    protected SeqDF70AWEBBType webb;
    @XmlElement(name = "NAME")
    protected SeqDF70ANAMEType name;

    /**
     * ��ȡoffo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF70AOFFOType }
     *     
     */
    public SeqDF70AOFFOType getOFFO() {
        return offo;
    }

    /**
     * ����offo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF70AOFFOType }
     *     
     */
    public void setOFFO(SeqDF70AOFFOType value) {
        this.offo = value;
    }

    /**
     * ��ȡwebb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF70AWEBBType }
     *     
     */
    public SeqDF70AWEBBType getWEBB() {
        return webb;
    }

    /**
     * ����webb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF70AWEBBType }
     *     
     */
    public void setWEBB(SeqDF70AWEBBType value) {
        this.webb = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF70ANAMEType }
     *     
     */
    public SeqDF70ANAMEType getNAME() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF70ANAMEType }
     *     
     */
    public void setNAME(SeqDF70ANAMEType value) {
        this.name = value;
    }

}
