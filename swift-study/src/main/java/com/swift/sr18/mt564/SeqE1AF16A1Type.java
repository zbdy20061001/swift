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
 * <p>SeqE1a_F16a_1_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F16a_1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}MTField">
 *       &lt;choice>
 *         &lt;element name="F16R" type="{urn:swift:xsd:fin.564.2018}F16R_FIA_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F16a_1_Type", propOrder = {
    "f16R"
})
public class SeqE1AF16A1Type
    extends MTField
{

    @XmlElement(name = "F16R")
    @XmlSchemaType(name = "string")
    protected F16RFIAType f16R;

    /**
     * ��ȡf16R���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F16RFIAType }
     *     
     */
    public F16RFIAType getF16R() {
        return f16R;
    }

    /**
     * ����f16R���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F16RFIAType }
     *     
     */
    public void setF16R(F16RFIAType value) {
        this.f16R = value;
    }

}
