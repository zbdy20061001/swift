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
 * <p>F70E_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="F70E_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}FieldOption">
 *       &lt;sequence>
 *         &lt;element name="Narrative" type="{urn:swift:xsd:fin.564.2018}Text_FIN_10M35x_Type"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "F70E_Type", propOrder = {
    "narrative"
})
public class F70EType
    extends FieldOption
{

    @XmlElement(name = "Narrative", required = true)
    protected TextFIN10M35XType narrative;

    /**
     * ��ȡnarrative���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TextFIN10M35XType }
     *     
     */
    public TextFIN10M35XType getNarrative() {
        return narrative;
    }

    /**
     * ����narrative���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TextFIN10M35XType }
     *     
     */
    public void setNarrative(TextFIN10M35XType value) {
        this.narrative = value;
    }

}
