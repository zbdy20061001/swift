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
 * <p>SeqC_F92a_RTUN_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqC_F92a_RTUN_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F92D" type="{urn:swift:xsd:fin.564.2018}F92D_1_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F92a_RTUN_Type", propOrder = {
    "f92D"
})
public class SeqCF92ARTUNType
    extends Qualifier
{

    @XmlElement(name = "F92D")
    protected F92D1Type f92D;

    /**
     * ��ȡf92D���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F92D1Type }
     *     
     */
    public F92D1Type getF92D() {
        return f92D;
    }

    /**
     * ����f92D���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F92D1Type }
     *     
     */
    public void setF92D(F92D1Type value) {
        this.f92D = value;
    }

}
