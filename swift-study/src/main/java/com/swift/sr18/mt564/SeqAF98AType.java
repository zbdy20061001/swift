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
 * <p>SeqA_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqA_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="PREP" type="{urn:swift:xsd:fin.564.2018}SeqA_F98a_PREP_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqA_F98a_Type", propOrder = {
    "prep"
})
public class SeqAF98AType
    extends ISO15022Field
{

    @XmlElement(name = "PREP")
    protected SeqAF98APREPType prep;

    /**
     * ��ȡprep���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqAF98APREPType }
     *     
     */
    public SeqAF98APREPType getPREP() {
        return prep;
    }

    /**
     * ����prep���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqAF98APREPType }
     *     
     */
    public void setPREP(SeqAF98APREPType value) {
        this.prep = value;
    }

}
