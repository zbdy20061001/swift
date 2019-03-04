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
 * <p>SeqE2_F90a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="OFFR" type="{urn:swift:xsd:fin.564.2018}SeqE2_F90a_OFFR_Type"/>
 *         &lt;element name="PRPP" type="{urn:swift:xsd:fin.564.2018}SeqE2_F90a_PRPP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F90a_Type", propOrder = {
    "offr",
    "prpp"
})
public class SeqE2F90AType
    extends ISO15022Field
{

    @XmlElement(name = "OFFR")
    protected SeqE2F90AOFFRType offr;
    @XmlElement(name = "PRPP")
    protected SeqE2F90APRPPType prpp;

    /**
     * ��ȡoffr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F90AOFFRType }
     *     
     */
    public SeqE2F90AOFFRType getOFFR() {
        return offr;
    }

    /**
     * ����offr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F90AOFFRType }
     *     
     */
    public void setOFFR(SeqE2F90AOFFRType value) {
        this.offr = value;
    }

    /**
     * ��ȡprpp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE2F90APRPPType }
     *     
     */
    public SeqE2F90APRPPType getPRPP() {
        return prpp;
    }

    /**
     * ����prpp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE2F90APRPPType }
     *     
     */
    public void setPRPP(SeqE2F90APRPPType value) {
        this.prpp = value;
    }

}
