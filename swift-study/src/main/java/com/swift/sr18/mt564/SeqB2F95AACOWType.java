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
 * <p>SeqB2_F95a_ACOW_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB2_F95a_ACOW_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F95P" type="{urn:swift:xsd:fin.564.2018}F95P_12_Type"/>
 *         &lt;element name="F95R" type="{urn:swift:xsd:fin.564.2018}F95R_4_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_F95a_ACOW_Type", propOrder = {
    "f95P",
    "f95R"
})
public class SeqB2F95AACOWType
    extends Qualifier
{

    @XmlElement(name = "F95P")
    protected F95P12Type f95P;
    @XmlElement(name = "F95R")
    protected F95R4Type f95R;

    /**
     * ��ȡf95P���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F95P12Type }
     *     
     */
    public F95P12Type getF95P() {
        return f95P;
    }

    /**
     * ����f95P���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F95P12Type }
     *     
     */
    public void setF95P(F95P12Type value) {
        this.f95P = value;
    }

    /**
     * ��ȡf95R���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F95R4Type }
     *     
     */
    public F95R4Type getF95R() {
        return f95R;
    }

    /**
     * ����f95R���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F95R4Type }
     *     
     */
    public void setF95R(F95R4Type value) {
        this.f95R = value;
    }

}
