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
 * <p>SeqC_F36a_QINT_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqC_F36a_QINT_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F36B" type="{urn:swift:xsd:fin.564.2018}F36B_7_Type"/>
 *         &lt;element name="F36E" type="{urn:swift:xsd:fin.564.2018}F36E_1_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F36a_QINT_Type", propOrder = {
    "f36B",
    "f36E"
})
public class SeqCF36AQINTType
    extends Qualifier
{

    @XmlElement(name = "F36B")
    protected F36B7Type f36B;
    @XmlElement(name = "F36E")
    protected F36E1Type f36E;

    /**
     * ��ȡf36B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F36B7Type }
     *     
     */
    public F36B7Type getF36B() {
        return f36B;
    }

    /**
     * ����f36B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F36B7Type }
     *     
     */
    public void setF36B(F36B7Type value) {
        this.f36B = value;
    }

    /**
     * ��ȡf36E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F36E1Type }
     *     
     */
    public F36E1Type getF36E() {
        return f36E;
    }

    /**
     * ����f36E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F36E1Type }
     *     
     */
    public void setF36E(F36E1Type value) {
        this.f36E = value;
    }

}
