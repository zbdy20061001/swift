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
 * <p>SeqB2_F93a_SETT_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB2_F93a_SETT_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F93B" type="{urn:swift:xsd:fin.564.2018}F93B_4_Type"/>
 *         &lt;element name="F93C" type="{urn:swift:xsd:fin.564.2018}F93C_6_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB2_F93a_SETT_Type", propOrder = {
    "f93B",
    "f93C"
})
public class SeqB2F93ASETTType
    extends Qualifier
{

    @XmlElement(name = "F93B")
    protected F93B4Type f93B;
    @XmlElement(name = "F93C")
    protected F93C6Type f93C;

    /**
     * ��ȡf93B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F93B4Type }
     *     
     */
    public F93B4Type getF93B() {
        return f93B;
    }

    /**
     * ����f93B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F93B4Type }
     *     
     */
    public void setF93B(F93B4Type value) {
        this.f93B = value;
    }

    /**
     * ��ȡf93C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F93C6Type }
     *     
     */
    public F93C6Type getF93C() {
        return f93C;
    }

    /**
     * ����f93C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F93C6Type }
     *     
     */
    public void setF93C(F93C6Type value) {
        this.f93C = value;
    }

}
