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
 * <p>F98F_1_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F98F_1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="DataSourceScheme" type="{urn:swift:xsd:fin.564.2018}Identifier_FIN_8c_Type" minOccurs="0"/>
 *         &lt;element name="DateCode" type="{urn:swift:xsd:fin.564.2018}OptionalCode_4Ec_707_Type"/>
 *         &lt;element name="Time" type="{urn:swift:xsd:fin.564.2018}DateTime_HHMMSS_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F98F_1_Type", propOrder = {
    "dataSourceScheme",
    "dateCode",
    "time"
})
public class F98F1Type
    extends FieldOption
{

    @XmlElement(name = "DataSourceScheme")
    protected String dataSourceScheme;
    @XmlElement(name = "DateCode", required = true)
    protected String dateCode;
    @XmlElement(name = "Time", required = true)
    protected String time;

    /**
     * ��ȡdataSourceScheme���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceScheme() {
        return dataSourceScheme;
    }

    /**
     * ����dataSourceScheme���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceScheme(String value) {
        this.dataSourceScheme = value;
    }

    /**
     * ��ȡdateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCode() {
        return dateCode;
    }

    /**
     * ����dateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCode(String value) {
        this.dateCode = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * ����time���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}
