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
 * <p>SeqD_F69a_CODS_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F69a_CODS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F69A" type="{urn:swift:xsd:fin.564.2018}F69A_Type"/>
 *         &lt;element name="F69B" type="{urn:swift:xsd:fin.564.2018}F69B_Type"/>
 *         &lt;element name="F69C" type="{urn:swift:xsd:fin.564.2018}F69C_4_Type"/>
 *         &lt;element name="F69D" type="{urn:swift:xsd:fin.564.2018}F69D_4_Type"/>
 *         &lt;element name="F69E" type="{urn:swift:xsd:fin.564.2018}F69E_4_Type"/>
 *         &lt;element name="F69F" type="{urn:swift:xsd:fin.564.2018}F69F_4_Type"/>
 *         &lt;element name="F69J" type="{urn:swift:xsd:fin.564.2018}F69J_4_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F69a_CODS_Type", propOrder = {
    "f69A",
    "f69B",
    "f69C",
    "f69D",
    "f69E",
    "f69F",
    "f69J"
})
public class SeqDF69ACODSType
    extends Qualifier
{

    @XmlElement(name = "F69A")
    protected F69AType f69A;
    @XmlElement(name = "F69B")
    protected F69BType f69B;
    @XmlElement(name = "F69C")
    protected F69C4Type f69C;
    @XmlElement(name = "F69D")
    protected F69D4Type f69D;
    @XmlElement(name = "F69E")
    protected F69E4Type f69E;
    @XmlElement(name = "F69F")
    protected F69F4Type f69F;
    @XmlElement(name = "F69J")
    protected F69J4Type f69J;

    /**
     * ��ȡf69A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69AType }
     *     
     */
    public F69AType getF69A() {
        return f69A;
    }

    /**
     * ����f69A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69AType }
     *     
     */
    public void setF69A(F69AType value) {
        this.f69A = value;
    }

    /**
     * ��ȡf69B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69BType }
     *     
     */
    public F69BType getF69B() {
        return f69B;
    }

    /**
     * ����f69B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69BType }
     *     
     */
    public void setF69B(F69BType value) {
        this.f69B = value;
    }

    /**
     * ��ȡf69C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69C4Type }
     *     
     */
    public F69C4Type getF69C() {
        return f69C;
    }

    /**
     * ����f69C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69C4Type }
     *     
     */
    public void setF69C(F69C4Type value) {
        this.f69C = value;
    }

    /**
     * ��ȡf69D���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69D4Type }
     *     
     */
    public F69D4Type getF69D() {
        return f69D;
    }

    /**
     * ����f69D���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69D4Type }
     *     
     */
    public void setF69D(F69D4Type value) {
        this.f69D = value;
    }

    /**
     * ��ȡf69E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69E4Type }
     *     
     */
    public F69E4Type getF69E() {
        return f69E;
    }

    /**
     * ����f69E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69E4Type }
     *     
     */
    public void setF69E(F69E4Type value) {
        this.f69E = value;
    }

    /**
     * ��ȡf69F���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69F4Type }
     *     
     */
    public F69F4Type getF69F() {
        return f69F;
    }

    /**
     * ����f69F���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69F4Type }
     *     
     */
    public void setF69F(F69F4Type value) {
        this.f69F = value;
    }

    /**
     * ��ȡf69J���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F69J4Type }
     *     
     */
    public F69J4Type getF69J() {
        return f69J;
    }

    /**
     * ����f69J���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F69J4Type }
     *     
     */
    public void setF69J(F69J4Type value) {
        this.f69J = value;
    }

}
