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
 * <p>SeqD_F90a_MAXP_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqD_F90a_MAXP_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F90A" type="{urn:swift:xsd:fin.564.2018}F90A_2_Type"/>
 *         &lt;element name="F90B" type="{urn:swift:xsd:fin.564.2018}F90B_7_Type"/>
 *         &lt;element name="F90E" type="{urn:swift:xsd:fin.564.2018}F90E_8_Type"/>
 *         &lt;element name="F90L" type="{urn:swift:xsd:fin.564.2018}F90L_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqD_F90a_MAXP_Type", propOrder = {
    "f90A",
    "f90B",
    "f90E",
    "f90L"
})
public class SeqDF90AMAXPType
    extends Qualifier
{

    @XmlElement(name = "F90A")
    protected F90A2Type f90A;
    @XmlElement(name = "F90B")
    protected F90B7Type f90B;
    @XmlElement(name = "F90E")
    protected F90E8Type f90E;
    @XmlElement(name = "F90L")
    protected F90LType f90L;

    /**
     * ��ȡf90A���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F90A2Type }
     *     
     */
    public F90A2Type getF90A() {
        return f90A;
    }

    /**
     * ����f90A���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F90A2Type }
     *     
     */
    public void setF90A(F90A2Type value) {
        this.f90A = value;
    }

    /**
     * ��ȡf90B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F90B7Type }
     *     
     */
    public F90B7Type getF90B() {
        return f90B;
    }

    /**
     * ����f90B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F90B7Type }
     *     
     */
    public void setF90B(F90B7Type value) {
        this.f90B = value;
    }

    /**
     * ��ȡf90E���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F90E8Type }
     *     
     */
    public F90E8Type getF90E() {
        return f90E;
    }

    /**
     * ����f90E���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F90E8Type }
     *     
     */
    public void setF90E(F90E8Type value) {
        this.f90E = value;
    }

    /**
     * ��ȡf90L���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F90LType }
     *     
     */
    public F90LType getF90L() {
        return f90L;
    }

    /**
     * ����f90L���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F90LType }
     *     
     */
    public void setF90L(F90LType value) {
        this.f90L = value;
    }

}
