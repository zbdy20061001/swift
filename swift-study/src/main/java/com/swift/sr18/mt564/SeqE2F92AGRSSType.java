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
 * <p>SeqE2_F92a_GRSS_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE2_F92a_GRSS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92F" type="{urn:swift:xsd:fin.564.2018}F92F_Type"/>
 *         &lt;element name="F92H" type="{urn:swift:xsd:fin.564.2018}F92H_Type"/>
 *         &lt;element name="F92J" type="{urn:swift:xsd:fin.564.2018}F92J_26_Type"/>
 *         &lt;element name="F92K" type="{urn:swift:xsd:fin.564.2018}F92K_8_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE2_F92a_GRSS_Type", propOrder = {
    "f92F",
    "f92H",
    "f92J",
    "f92K"
})
public class SeqE2F92AGRSSType
    extends Qualifier
{

    @XmlElement(name = "F92F")
    protected F92FType f92F;
    @XmlElement(name = "F92H")
    protected F92HType f92H;
    @XmlElement(name = "F92J")
    protected F92J26Type f92J;
    @XmlElement(name = "F92K")
    protected F92K8Type f92K;

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
     * ��ȡf92H���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92HType }
     *     
     */
    public F92HType getF92H() {
        return f92H;
    }

    /**
     * ����f92H���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92HType }
     *     
     */
    public void setF92H(F92HType value) {
        this.f92H = value;
    }

    /**
     * ��ȡf92J���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92J26Type }
     *     
     */
    public F92J26Type getF92J() {
        return f92J;
    }

    /**
     * ����f92J���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92J26Type }
     *     
     */
    public void setF92J(F92J26Type value) {
        this.f92J = value;
    }

    /**
     * ��ȡf92K���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92K8Type }
     *     
     */
    public F92K8Type getF92K() {
        return f92K;
    }

    /**
     * ����f92K���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92K8Type }
     *     
     */
    public void setF92K(F92K8Type value) {
        this.f92K = value;
    }

}
