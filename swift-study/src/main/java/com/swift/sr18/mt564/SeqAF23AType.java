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
 * <p>SeqA_F23a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F23a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}MTField">
 *       &lt;choice>
 *         &lt;element name="F23G" type="{urn:swift:xsd:fin.564.2018}F23G_77_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F23a_Type", propOrder = {
    "f23G"
})
public class SeqAF23AType
    extends MTField
{

    @XmlElement(name = "F23G")
    protected F23G77Type f23G;

    /**
     * ��ȡf23G���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F23G77Type }
     *     
     */
    public F23G77Type getF23G() {
        return f23G;
    }

    /**
     * ����f23G���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F23G77Type }
     *     
     */
    public void setF23G(F23G77Type value) {
        this.f23G = value;
    }

}
