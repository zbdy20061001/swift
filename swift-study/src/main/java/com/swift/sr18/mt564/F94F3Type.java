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
 * <p>F94F_3_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F94F_3_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="PlaceCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_283_Type"/>
 *         &lt;element name="IdentifierCode" type="{urn:swift:xsd:fin.564.2018}Identifier_BICFIOrNonFI_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F94F_3_Type", propOrder = {
    "placeCode",
    "identifierCode"
})
public class F94F3Type
    extends FieldOption
{

    @XmlElement(name = "PlaceCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec283Type placeCode;
    @XmlElement(name = "IdentifierCode", required = true)
    protected String identifierCode;

    /**
     * ��ȡplaceCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec283Type }
     *     
     */
    public Code4Ec283Type getPlaceCode() {
        return placeCode;
    }

    /**
     * ����placeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec283Type }
     *     
     */
    public void setPlaceCode(Code4Ec283Type value) {
        this.placeCode = value;
    }

    /**
     * ��ȡidentifierCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierCode() {
        return identifierCode;
    }

    /**
     * ����identifierCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierCode(String value) {
        this.identifierCode = value;
    }

}
