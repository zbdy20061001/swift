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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SeqA1_F16a_2_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA1_F16a_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}MTField">
 *       &lt;choice>
 *         &lt;element name="F16S" type="{urn:swift:xsd:fin.564.2018}F16S_LINK_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA1_F16a_2_Type", propOrder = {
    "f16S"
})
public class SeqA1F16A2Type
    extends MTField
{

    @XmlElement(name = "F16S")
    @XmlSchemaType(name = "string")
    protected F16SLINKType f16S;

    /**
     * ��ȡf16S���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F16SLINKType }
     *     
     */
    public F16SLINKType getF16S() {
        return f16S;
    }

    /**
     * ����f16S���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F16SLINKType }
     *     
     */
    public void setF16S(F16SLINKType value) {
        this.f16S = value;
    }

}