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
 * <p>SeqE1_F94a_SAFE_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F94a_SAFE_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F94B" type="{urn:swift:xsd:fin.564.2018}F94B_20_Type"/>
 *         &lt;element name="F94C" type="{urn:swift:xsd:fin.564.2018}F94C_Type"/>
 *         &lt;element name="F94F" type="{urn:swift:xsd:fin.564.2018}F94F_3_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F94a_SAFE_Type", propOrder = {
    "f94B",
    "f94C",
    "f94F"
})
public class SeqE1F94ASAFEType
    extends Qualifier
{

    @XmlElement(name = "F94B")
    protected F94B20Type f94B;
    @XmlElement(name = "F94C")
    protected F94CType f94C;
    @XmlElement(name = "F94F")
    protected F94F3Type f94F;

    /**
     * ��ȡf94B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F94B20Type }
     *     
     */
    public F94B20Type getF94B() {
        return f94B;
    }

    /**
     * ����f94B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F94B20Type }
     *     
     */
    public void setF94B(F94B20Type value) {
        this.f94B = value;
    }

    /**
     * ��ȡf94C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F94CType }
     *     
     */
    public F94CType getF94C() {
        return f94C;
    }

    /**
     * ����f94C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F94CType }
     *     
     */
    public void setF94C(F94CType value) {
        this.f94C = value;
    }

    /**
     * ��ȡf94F���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F94F3Type }
     *     
     */
    public F94F3Type getF94F() {
        return f94F;
    }

    /**
     * ����f94F���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F94F3Type }
     *     
     */
    public void setF94F(F94F3Type value) {
        this.f94F = value;
    }

}
