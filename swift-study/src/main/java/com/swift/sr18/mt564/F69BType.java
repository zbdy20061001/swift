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
 * <p>F69B_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F69B_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="Date1" type="{urn:swift:xsd:fin.564.2018}DateTime_YYYYMMDD_Type"/>
 *         &lt;element name="Time1" type="{urn:swift:xsd:fin.564.2018}DateTime_HHMMSS_Type"/>
 *         &lt;element name="Date2" type="{urn:swift:xsd:fin.564.2018}DateTime_YYYYMMDD_Type"/>
 *         &lt;element name="Time2" type="{urn:swift:xsd:fin.564.2018}DateTime_HHMMSS_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F69B_Type", propOrder = {
    "date1",
    "time1",
    "date2",
    "time2"
})
public class F69BType
    extends FieldOption
{

    @XmlElement(name = "Date1", required = true)
    protected String date1;
    @XmlElement(name = "Time1", required = true)
    protected String time1;
    @XmlElement(name = "Date2", required = true)
    protected String date2;
    @XmlElement(name = "Time2", required = true)
    protected String time2;

    /**
     * ��ȡdate1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate1() {
        return date1;
    }

    /**
     * ����date1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate1(String value) {
        this.date1 = value;
    }

    /**
     * ��ȡtime1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime1() {
        return time1;
    }

    /**
     * ����time1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime1(String value) {
        this.time1 = value;
    }

    /**
     * ��ȡdate2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate2() {
        return date2;
    }

    /**
     * ����date2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate2(String value) {
        this.date2 = value;
    }

    /**
     * ��ȡtime2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime2() {
        return time2;
    }

    /**
     * ����time2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime2(String value) {
        this.time2 = value;
    }

}
