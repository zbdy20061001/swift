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
 * <p>F95R_4_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F95R_4_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="DataSourceScheme" type="{urn:swift:xsd:fin.564.2018}Identifier_FIN_8c_Type"/>
 *         &lt;element name="ProprietaryCode" type="{urn:swift:xsd:fin.564.2018}Text_FIN_34x_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F95R_4_Type", propOrder = {
    "dataSourceScheme",
    "proprietaryCode"
})
public class F95R4Type
    extends FieldOption
{

    @XmlElement(name = "DataSourceScheme", required = true)
    protected String dataSourceScheme;
    @XmlElement(name = "ProprietaryCode", required = true)
    protected String proprietaryCode;

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
     * ��ȡproprietaryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryCode() {
        return proprietaryCode;
    }

    /**
     * ����proprietaryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryCode(String value) {
        this.proprietaryCode = value;
    }

}
