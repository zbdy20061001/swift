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
 * <p>F28E_2_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F28E_2_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="PageNumber" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_5n_Type"/>
 *         &lt;element name="ContinuationIndicator" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_333_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F28E_2_Type", propOrder = {
    "pageNumber",
    "continuationIndicator"
})
public class F28E2Type
    extends FieldOption
{

    @XmlElement(name = "PageNumber", required = true)
    protected String pageNumber;
    @XmlElement(name = "ContinuationIndicator", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec333Type continuationIndicator;

    /**
     * ��ȡpageNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * ����pageNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

    /**
     * ��ȡcontinuationIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec333Type }
     *     
     */
    public Code4Ec333Type getContinuationIndicator() {
        return continuationIndicator;
    }

    /**
     * ����continuationIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec333Type }
     *     
     */
    public void setContinuationIndicator(Code4Ec333Type value) {
        this.continuationIndicator = value;
    }

}
