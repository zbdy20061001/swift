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
 * <p>SeqE1a_F12a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1a_F12a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="CLAS" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F12a_CLAS_Type"/>
 *         &lt;element name="OPST" type="{urn:swift:xsd:fin.564.2018}SeqE1a_F12a_OPST_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1a_F12a_Type", propOrder = {
    "clas",
    "opst"
})
public class SeqE1AF12AType
    extends ISO15022Field
{

    @XmlElement(name = "CLAS")
    protected SeqE1AF12ACLASType clas;
    @XmlElement(name = "OPST")
    protected SeqE1AF12AOPSTType opst;

    /**
     * ��ȡclas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF12ACLASType }
     *     
     */
    public SeqE1AF12ACLASType getCLAS() {
        return clas;
    }

    /**
     * ����clas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF12ACLASType }
     *     
     */
    public void setCLAS(SeqE1AF12ACLASType value) {
        this.clas = value;
    }

    /**
     * ��ȡopst���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqE1AF12AOPSTType }
     *     
     */
    public SeqE1AF12AOPSTType getOPST() {
        return opst;
    }

    /**
     * ����opst���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqE1AF12AOPSTType }
     *     
     */
    public void setOPST(SeqE1AF12AOPSTType value) {
        this.opst = value;
    }

}
