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
 * <p>SeqA_F22a_CAMV_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F22a_CAMV_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F22F" type="{urn:swift:xsd:fin.564.2018}F22F_409_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F22a_CAMV_Type", propOrder = {
    "f22F"
})
public class SeqAF22ACAMVType
    extends Qualifier
{

    @XmlElement(name = "F22F")
    protected F22F409Type f22F;

    /**
     * ��ȡf22F���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F22F409Type }
     *     
     */
    public F22F409Type getF22F() {
        return f22F;
    }

    /**
     * ����f22F���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F22F409Type }
     *     
     */
    public void setF22F(F22F409Type value) {
        this.f22F = value;
    }

}
