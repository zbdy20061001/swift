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
 * <p>SeqB1_F12a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqB1_F12a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CLAS" type="{urn:swift:xsd:fin.564.2018}SeqB1_F12a_CLAS_Type"/>
 *         &lt;element name="OPST" type="{urn:swift:xsd:fin.564.2018}SeqB1_F12a_OPST_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqB1_F12a_Type", propOrder = {
    "clas",
    "opst"
})
public class SeqB1F12AType
    extends ISO15022Field
{

    @XmlElement(name = "CLAS")
    protected SeqB1F12ACLASType clas;
    @XmlElement(name = "OPST")
    protected SeqB1F12AOPSTType opst;

    /**
     * ��ȡclas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F12ACLASType }
     *     
     */
    public SeqB1F12ACLASType getCLAS() {
        return clas;
    }

    /**
     * ����clas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F12ACLASType }
     *     
     */
    public void setCLAS(SeqB1F12ACLASType value) {
        this.clas = value;
    }

    /**
     * ��ȡopst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqB1F12AOPSTType }
     *     
     */
    public SeqB1F12AOPSTType getOPST() {
        return opst;
    }

    /**
     * ����opst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqB1F12AOPSTType }
     *     
     */
    public void setOPST(SeqB1F12AOPSTType value) {
        this.opst = value;
    }

}
