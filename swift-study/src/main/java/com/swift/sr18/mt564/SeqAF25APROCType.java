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
 * <p>SeqA_F25a_PROC_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F25a_PROC_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F25D" type="{urn:swift:xsd:fin.564.2018}F25D_95_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F25a_PROC_Type", propOrder = {
    "f25D"
})
public class SeqAF25APROCType
    extends Qualifier
{

    @XmlElement(name = "F25D")
    protected F25D95Type f25D;

    /**
     * ��ȡf25D���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F25D95Type }
     *     
     */
    public F25D95Type getF25D() {
        return f25D;
    }

    /**
     * ����f25D���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F25D95Type }
     *     
     */
    public void setF25D(F25D95Type value) {
        this.f25D = value;
    }

}
