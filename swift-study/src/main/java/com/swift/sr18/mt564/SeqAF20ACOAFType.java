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
 * <p>SeqA_F20a_COAF_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F20a_COAF_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F20C" type="{urn:swift:xsd:fin.564.2018}F20C_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F20a_COAF_Type", propOrder = {
    "f20C"
})
public class SeqAF20ACOAFType
    extends Qualifier
{

    @XmlElement(name = "F20C")
    protected F20CType f20C;

    /**
     * ��ȡf20C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F20CType }
     *     
     */
    public F20CType getF20C() {
        return f20C;
    }

    /**
     * ����f20C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F20CType }
     *     
     */
    public void setF20C(F20CType value) {
        this.f20C = value;
    }

}
