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
 * <p>SeqB1_F12a_OPST_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F12a_OPST_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F12B" type="{urn:swift:xsd:fin.564.2018}F12B_7_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F12a_OPST_Type", propOrder = {
    "f12B"
})
public class SeqB1F12AOPSTType
    extends Qualifier
{

    @XmlElement(name = "F12B")
    protected F12B7Type f12B;

    /**
     * ��ȡf12B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F12B7Type }
     *     
     */
    public F12B7Type getF12B() {
        return f12B;
    }

    /**
     * ����f12B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F12B7Type }
     *     
     */
    public void setF12B(F12B7Type value) {
        this.f12B = value;
    }

}
