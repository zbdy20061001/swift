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
 * <p>SeqB1_F12a_CLAS_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F12a_CLAS_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F12A" type="{urn:swift:xsd:fin.564.2018}F12A_Type"/>
 *         &lt;element name="F12C" type="{urn:swift:xsd:fin.564.2018}F12C_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F12a_CLAS_Type", propOrder = {
    "f12A",
    "f12C"
})
public class SeqB1F12ACLASType
    extends Qualifier
{

    @XmlElement(name = "F12A")
    protected F12AType f12A;
    @XmlElement(name = "F12C")
    protected F12CType f12C;

    /**
     * ��ȡf12A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F12AType }
     *     
     */
    public F12AType getF12A() {
        return f12A;
    }

    /**
     * ����f12A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F12AType }
     *     
     */
    public void setF12A(F12AType value) {
        this.f12A = value;
    }

    /**
     * ��ȡf12C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F12CType }
     *     
     */
    public F12CType getF12C() {
        return f12C;
    }

    /**
     * ����f12C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F12CType }
     *     
     */
    public void setF12C(F12CType value) {
        this.f12C = value;
    }

}
