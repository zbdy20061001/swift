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
 * <p>F35B_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F35B_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="IdentificationOfSecurity" type="{urn:swift:xsd:fin.564.2018}Identifier_Isin_Type" minOccurs="0"/>
 *         &lt;element name="DescriptionOfSecurity" type="{urn:swift:xsd:fin.564.2018}Text_FIN_4M35x_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F35B_Type", propOrder = {
    "identificationOfSecurity",
    "descriptionOfSecurity"
})
public class F35BType
    extends FieldOption
{

    @XmlElement(name = "IdentificationOfSecurity")
    protected String identificationOfSecurity;
    @XmlElement(name = "DescriptionOfSecurity")
    protected TextFIN4M35XType descriptionOfSecurity;

    /**
     * ��ȡidentificationOfSecurity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationOfSecurity() {
        return identificationOfSecurity;
    }

    /**
     * ����identificationOfSecurity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationOfSecurity(String value) {
        this.identificationOfSecurity = value;
    }

    /**
     * ��ȡdescriptionOfSecurity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TextFIN4M35XType }
     *     
     */
    public TextFIN4M35XType getDescriptionOfSecurity() {
        return descriptionOfSecurity;
    }

    /**
     * ����descriptionOfSecurity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TextFIN4M35XType }
     *     
     */
    public void setDescriptionOfSecurity(TextFIN4M35XType value) {
        this.descriptionOfSecurity = value;
    }

}
