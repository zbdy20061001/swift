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
 * <p>SeqA1_F13a_LINK_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA1_F13a_LINK_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F13A" type="{urn:swift:xsd:fin.564.2018}F13A_Type"/>
 *         &lt;element name="F13B" type="{urn:swift:xsd:fin.564.2018}F13B_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_F13a_LINK_Type", propOrder = {
    "f13A",
    "f13B"
})
public class SeqA1F13ALINKType
    extends Qualifier
{

    @XmlElement(name = "F13A")
    protected F13AType f13A;
    @XmlElement(name = "F13B")
    protected F13BType f13B;

    /**
     * ��ȡf13A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F13AType }
     *     
     */
    public F13AType getF13A() {
        return f13A;
    }

    /**
     * ����f13A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F13AType }
     *     
     */
    public void setF13A(F13AType value) {
        this.f13A = value;
    }

    /**
     * ��ȡf13B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F13BType }
     *     
     */
    public F13BType getF13B() {
        return f13B;
    }

    /**
     * ����f13B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F13BType }
     *     
     */
    public void setF13B(F13BType value) {
        this.f13B = value;
    }

}
