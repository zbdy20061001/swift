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
 * <p>SeqE_F36a_FOLQ_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F36a_FOLQ_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F36B" type="{urn:swift:xsd:fin.564.2018}F36B_4_Type"/>
 *         &lt;element name="F36C" type="{urn:swift:xsd:fin.564.2018}F36C_5_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F36a_FOLQ_Type", propOrder = {
    "f36B",
    "f36C"
})
public class SeqEF36AFOLQType
    extends Qualifier
{

    @XmlElement(name = "F36B")
    protected F36B4Type f36B;
    @XmlElement(name = "F36C")
    protected F36C5Type f36C;

    /**
     * ��ȡf36B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F36B4Type }
     *     
     */
    public F36B4Type getF36B() {
        return f36B;
    }

    /**
     * ����f36B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F36B4Type }
     *     
     */
    public void setF36B(F36B4Type value) {
        this.f36B = value;
    }

    /**
     * ��ȡf36C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F36C5Type }
     *     
     */
    public F36C5Type getF36C() {
        return f36C;
    }

    /**
     * ����f36C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F36C5Type }
     *     
     */
    public void setF36C(F36C5Type value) {
        this.f36C = value;
    }

}