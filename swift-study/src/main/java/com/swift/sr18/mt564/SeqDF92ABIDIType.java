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
 * <p>SeqD_F92a_BIDI_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F92a_BIDI_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92A" type="{urn:swift:xsd:fin.564.2018}F92A_Type"/>
 *         &lt;element name="F92F" type="{urn:swift:xsd:fin.564.2018}F92F_Type"/>
 *         &lt;element name="F92K" type="{urn:swift:xsd:fin.564.2018}F92K_6_Type"/>
 *         &lt;element name="F92P" type="{urn:swift:xsd:fin.564.2018}F92P_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F92a_BIDI_Type", propOrder = {
    "f92A",
    "f92F",
    "f92K",
    "f92P"
})
public class SeqDF92ABIDIType
    extends Qualifier
{

    @XmlElement(name = "F92A")
    protected F92AType f92A;
    @XmlElement(name = "F92F")
    protected F92FType f92F;
    @XmlElement(name = "F92K")
    protected F92K6Type f92K;
    @XmlElement(name = "F92P")
    protected F92PType f92P;

    /**
     * ��ȡf92A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92AType }
     *     
     */
    public F92AType getF92A() {
        return f92A;
    }

    /**
     * ����f92A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92AType }
     *     
     */
    public void setF92A(F92AType value) {
        this.f92A = value;
    }

    /**
     * ��ȡf92F���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92FType }
     *     
     */
    public F92FType getF92F() {
        return f92F;
    }

    /**
     * ����f92F���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92FType }
     *     
     */
    public void setF92F(F92FType value) {
        this.f92F = value;
    }

    /**
     * ��ȡf92K���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92K6Type }
     *     
     */
    public F92K6Type getF92K() {
        return f92K;
    }

    /**
     * ����f92K���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92K6Type }
     *     
     */
    public void setF92K(F92K6Type value) {
        this.f92K = value;
    }

    /**
     * ��ȡf92P���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92PType }
     *     
     */
    public F92PType getF92P() {
        return f92P;
    }

    /**
     * ����f92P���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92PType }
     *     
     */
    public void setF92P(F92PType value) {
        this.f92P = value;
    }

}
