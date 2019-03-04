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
 * <p>SeqD_F94a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F94a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MEET" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_MEET_Type"/>
 *         &lt;element name="MET2" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_MET2_Type"/>
 *         &lt;element name="MET3" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_MET3_Type"/>
 *         &lt;element name="NPLI" type="{urn:swift:xsd:fin.564.2018}SeqD_F94a_NPLI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F94a_Type", propOrder = {
    "meet",
    "met2",
    "met3",
    "npli"
})
public class SeqDF94AType
    extends ISO15022Field
{

    @XmlElement(name = "MEET")
    protected SeqDF94AMEETType meet;
    @XmlElement(name = "MET2")
    protected SeqDF94AMET2Type met2;
    @XmlElement(name = "MET3")
    protected SeqDF94AMET3Type met3;
    @XmlElement(name = "NPLI")
    protected SeqDF94ANPLIType npli;

    /**
     * ��ȡmeet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94AMEETType }
     *     
     */
    public SeqDF94AMEETType getMEET() {
        return meet;
    }

    /**
     * ����meet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94AMEETType }
     *     
     */
    public void setMEET(SeqDF94AMEETType value) {
        this.meet = value;
    }

    /**
     * ��ȡmet2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94AMET2Type }
     *     
     */
    public SeqDF94AMET2Type getMET2() {
        return met2;
    }

    /**
     * ����met2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94AMET2Type }
     *     
     */
    public void setMET2(SeqDF94AMET2Type value) {
        this.met2 = value;
    }

    /**
     * ��ȡmet3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94AMET3Type }
     *     
     */
    public SeqDF94AMET3Type getMET3() {
        return met3;
    }

    /**
     * ����met3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94AMET3Type }
     *     
     */
    public void setMET3(SeqDF94AMET3Type value) {
        this.met3 = value;
    }

    /**
     * ��ȡnpli���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF94ANPLIType }
     *     
     */
    public SeqDF94ANPLIType getNPLI() {
        return npli;
    }

    /**
     * ����npli���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF94ANPLIType }
     *     
     */
    public void setNPLI(SeqDF94ANPLIType value) {
        this.npli = value;
    }

}
