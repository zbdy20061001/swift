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
 * <p>SeqD_F94a_MET3_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F94a_MET3_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F94E" type="{urn:swift:xsd:fin.564.2018}F94E_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F94a_MET3_Type", propOrder = {
    "f94E"
})
public class SeqDF94AMET3Type
    extends Qualifier
{

    @XmlElement(name = "F94E")
    protected F94EType f94E;

    /**
     * ��ȡf94E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F94EType }
     *     
     */
    public F94EType getF94E() {
        return f94E;
    }

    /**
     * ����f94E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F94EType }
     *     
     */
    public void setF94E(F94EType value) {
        this.f94E = value;
    }

}
