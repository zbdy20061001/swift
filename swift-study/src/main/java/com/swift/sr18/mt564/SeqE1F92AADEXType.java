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
 * <p>SeqE1_F92a_ADEX_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F92a_ADEX_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92D" type="{urn:swift:xsd:fin.564.2018}F92D_1_Type"/>
 *         &lt;element name="F92K" type="{urn:swift:xsd:fin.564.2018}F92K_6_Type"/>
 *         &lt;element name="F92L" type="{urn:swift:xsd:fin.564.2018}F92L_1_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F92a_ADEX_Type", propOrder = {
    "f92D",
    "f92K",
    "f92L"
})
public class SeqE1F92AADEXType
    extends Qualifier
{

    @XmlElement(name = "F92D")
    protected F92D1Type f92D;
    @XmlElement(name = "F92K")
    protected F92K6Type f92K;
    @XmlElement(name = "F92L")
    protected F92L1Type f92L;

    /**
     * ��ȡf92D���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92D1Type }
     *     
     */
    public F92D1Type getF92D() {
        return f92D;
    }

    /**
     * ����f92D���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92D1Type }
     *     
     */
    public void setF92D(F92D1Type value) {
        this.f92D = value;
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
     * ��ȡf92L���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92L1Type }
     *     
     */
    public F92L1Type getF92L() {
        return f92L;
    }

    /**
     * ����f92L���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92L1Type }
     *     
     */
    public void setF92L(F92L1Type value) {
        this.f92L = value;
    }

}
