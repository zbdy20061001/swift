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
 * <p>F36B_4_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F36B_4_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="QuantityTypeCode" type="{urn:swift:xsd:fin.564.2018}Code_4Ec_274_Type"/>
 *         &lt;element name="Quantity" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F36B_4_Type", propOrder = {
    "quantityTypeCode",
    "quantity"
})
public class F36B4Type
    extends FieldOption
{

    @XmlElement(name = "QuantityTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected Code4Ec274Type quantityTypeCode;
    @XmlElement(name = "Quantity", required = true)
    protected String quantity;

    /**
     * ��ȡquantityTypeCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Code4Ec274Type }
     *     
     */
    public Code4Ec274Type getQuantityTypeCode() {
        return quantityTypeCode;
    }

    /**
     * ����quantityTypeCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Code4Ec274Type }
     *     
     */
    public void setQuantityTypeCode(Code4Ec274Type value) {
        this.quantityTypeCode = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

}
