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
 * <p>SeqC_F98a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqC_F98a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="EXPI" type="{urn:swift:xsd:fin.564.2018}SeqC_F98a_EXPI_Type"/>
 *         &lt;element name="POST" type="{urn:swift:xsd:fin.564.2018}SeqC_F98a_POST_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqC_F98a_Type", propOrder = {
    "expi",
    "post"
})
public class SeqCF98AType
    extends ISO15022Field
{

    @XmlElement(name = "EXPI")
    protected SeqCF98AEXPIType expi;
    @XmlElement(name = "POST")
    protected SeqCF98APOSTType post;

    /**
     * ��ȡexpi���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF98AEXPIType }
     *     
     */
    public SeqCF98AEXPIType getEXPI() {
        return expi;
    }

    /**
     * ����expi���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF98AEXPIType }
     *     
     */
    public void setEXPI(SeqCF98AEXPIType value) {
        this.expi = value;
    }

    /**
     * ��ȡpost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqCF98APOSTType }
     *     
     */
    public SeqCF98APOSTType getPOST() {
        return post;
    }

    /**
     * ����post���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqCF98APOSTType }
     *     
     */
    public void setPOST(SeqCF98APOSTType value) {
        this.post = value;
    }

}
