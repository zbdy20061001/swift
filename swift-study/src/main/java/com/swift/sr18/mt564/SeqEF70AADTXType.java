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
 * <p>SeqE_F70a_ADTX_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F70a_ADTX_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F70E" type="{urn:swift:xsd:fin.564.2018}F70E_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F70a_ADTX_Type", propOrder = {
    "f70E"
})
public class SeqEF70AADTXType
    extends Qualifier
{

    @XmlElement(name = "F70E")
    protected F70EType f70E;

    /**
     * ��ȡf70E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F70EType }
     *     
     */
    public F70EType getF70E() {
        return f70E;
    }

    /**
     * ����f70E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F70EType }
     *     
     */
    public void setF70E(F70EType value) {
        this.f70E = value;
    }

}