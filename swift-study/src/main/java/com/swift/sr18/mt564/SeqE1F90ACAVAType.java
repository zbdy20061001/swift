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
 * <p>SeqE1_F90a_CAVA_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE1_F90a_CAVA_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}Qualifier">
 *       &lt;choice>
 *         &lt;element name="F90B" type="{urn:swift:xsd:fin.564.2018}F90B_6_Type"/>
 *         &lt;element name="F90E" type="{urn:swift:xsd:fin.564.2018}F90E_8_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE1_F90a_CAVA_Type", propOrder = {
    "f90B",
    "f90E"
})
public class SeqE1F90ACAVAType
    extends Qualifier
{

    @XmlElement(name = "F90B")
    protected F90B6Type f90B;
    @XmlElement(name = "F90E")
    protected F90E8Type f90E;

    /**
     * ��ȡf90B���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link F90B6Type }
     *     
     */
    public F90B6Type getF90B() {
        return f90B;
    }

    /**
     * ����f90B���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link F90B6Type }
     *     
     */
    public void setF90B(F90B6Type value) {
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

}
