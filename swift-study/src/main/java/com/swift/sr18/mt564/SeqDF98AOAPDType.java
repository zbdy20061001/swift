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
 * <p>SeqD_F98a_OAPD_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F98a_OAPD_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F98A" type="{urn:swift:xsd:fin.564.2018}F98A_Type"/>
 *         &lt;element name="F98B" type="{urn:swift:xsd:fin.564.2018}F98B_25_Type"/>
 *         &lt;element name="F98C" type="{urn:swift:xsd:fin.564.2018}F98C_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F98a_OAPD_Type", propOrder = {
    "f98A",
    "f98B",
    "f98C"
})
public class SeqDF98AOAPDType
    extends Qualifier
{

    @XmlElement(name = "F98A")
    protected F98AType f98A;
    @XmlElement(name = "F98B")
    protected F98B25Type f98B;
    @XmlElement(name = "F98C")
    protected F98CType f98C;

    /**
     * ��ȡf98A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F98AType }
     *     
     */
    public F98AType getF98A() {
        return f98A;
    }

    /**
     * ����f98A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F98AType }
     *     
     */
    public void setF98A(F98AType value) {
        this.f98A = value;
    }

    /**
     * ��ȡf98B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F98B25Type }
     *     
     */
    public F98B25Type getF98B() {
        return f98B;
    }

    /**
     * ����f98B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F98B25Type }
     *     
     */
    public void setF98B(F98B25Type value) {
        this.f98B = value;
    }

    /**
     * ��ȡf98C���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F98CType }
     *     
     */
    public F98CType getF98C() {
        return f98C;
    }

    /**
     * ����f98C���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F98CType }
     *     
     */
    public void setF98C(F98CType value) {
        this.f98C = value;
    }

}
