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
 * <p>SeqD_F90a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F90a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="MAXP" type="{urn:swift:xsd:fin.564.2018}SeqD_F90a_MAXP_Type"/>
 *         &lt;element name="MINP" type="{urn:swift:xsd:fin.564.2018}SeqD_F90a_MINP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F90a_Type", propOrder = {
    "maxp",
    "minp"
})
public class SeqDF90AType
    extends ISO15022Field
{

    @XmlElement(name = "MAXP")
    protected SeqDF90AMAXPType maxp;
    @XmlElement(name = "MINP")
    protected SeqDF90AMINPType minp;

    /**
     * ��ȡmaxp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF90AMAXPType }
     *     
     */
    public SeqDF90AMAXPType getMAXP() {
        return maxp;
    }

    /**
     * ����maxp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF90AMAXPType }
     *     
     */
    public void setMAXP(SeqDF90AMAXPType value) {
        this.maxp = value;
    }

    /**
     * ��ȡminp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqDF90AMINPType }
     *     
     */
    public SeqDF90AMINPType getMINP() {
        return minp;
    }

    /**
     * ����minp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqDF90AMINPType }
     *     
     */
    public void setMINP(SeqDF90AMINPType value) {
        this.minp = value;
    }

}
