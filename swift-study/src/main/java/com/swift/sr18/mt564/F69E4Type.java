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
 * <p>F69E_4_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F69E_4_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="DateCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_340_Type"/>
 *         &lt;element name="Date" type="{urn:swift:xsd:fin.564.2018}DateTime_YYYYMMDD_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F69E_4_Type", propOrder = {
    "dateCode",
    "date"
})
public class F69E4Type
    extends FieldOption
{

    @XmlElement(name = "DateCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec340Type dateCode;
    @XmlElement(name = "Date", required = true)
    protected String date;

    /**
     * ��ȡdateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec340Type }
     *     
     */
    public Code4Ec340Type getDateCode() {
        return dateCode;
    }

    /**
     * ����dateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec340Type }
     *     
     */
    public void setDateCode(Code4Ec340Type value) {
        this.dateCode = value;
    }

    /**
     * ��ȡdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * ����date���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}