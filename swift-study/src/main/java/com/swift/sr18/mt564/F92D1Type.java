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
 * <p>F92D_1_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F92D_1_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="Quantity1" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_15d_Type"/>
 *         &lt;element name="Quantity2" type="{urn:swift:xsd:fin.564.2018}Quantity_FIN_15d_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F92D_1_Type", propOrder = {
    "quantity1",
    "quantity2"
})
public class F92D1Type
    extends FieldOption
{

    @XmlElement(name = "Quantity1", required = true)
    protected String quantity1;
    @XmlElement(name = "Quantity2", required = true)
    protected String quantity2;

    /**
     * ��ȡquantity1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity1() {
        return quantity1;
    }

    /**
     * ����quantity1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity1(String value) {
        this.quantity1 = value;
    }

    /**
     * ��ȡquantity2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity2() {
        return quantity2;
    }

    /**
     * ����quantity2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity2(String value) {
        this.quantity2 = value;
    }

}
