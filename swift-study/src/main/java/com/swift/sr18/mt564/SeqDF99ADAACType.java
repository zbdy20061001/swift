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
 * <p>SeqD_F99a_DAAC_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F99a_DAAC_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F99A" type="{urn:swift:xsd:fin.564.2018}F99A_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F99a_DAAC_Type", propOrder = {
    "f99A"
})
public class SeqDF99ADAACType
    extends Qualifier
{

    @XmlElement(name = "F99A")
    protected F99AType f99A;

    /**
     * ��ȡf99A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F99AType }
     *     
     */
    public F99AType getF99A() {
        return f99A;
    }

    /**
     * ����f99A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F99AType }
     *     
     */
    public void setF99A(F99AType value) {
        this.f99A = value;
    }

}
