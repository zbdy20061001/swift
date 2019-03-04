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
 * <p>SeqE_F17a_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SeqE_F17a_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:swift:xsd:fin.564.2018}ISO15022Field">
 *       &lt;choice>
 *         &lt;element name="DFLT" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_DFLT_Type"/>
 *         &lt;element name="STIN" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_STIN_Type"/>
 *         &lt;element name="RCHG" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_RCHG_Type"/>
 *         &lt;element name="CERT" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_CERT_Type"/>
 *         &lt;element name="WTHD" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_WTHD_Type"/>
 *         &lt;element name="CHAN" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_CHAN_Type"/>
 *         &lt;element name="APLI" type="{urn:swift:xsd:fin.564.2018}SeqE_F17a_APLI_Type"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeqE_F17a_Type", propOrder = {
    "dflt",
    "stin",
    "rchg",
    "cert",
    "wthd",
    "chan",
    "apli"
})
public class SeqEF17AType
    extends ISO15022Field
{

    @XmlElement(name = "DFLT")
    protected SeqEF17ADFLTType dflt;
    @XmlElement(name = "STIN")
    protected SeqEF17ASTINType stin;
    @XmlElement(name = "RCHG")
    protected SeqEF17ARCHGType rchg;
    @XmlElement(name = "CERT")
    protected SeqEF17ACERTType cert;
    @XmlElement(name = "WTHD")
    protected SeqEF17AWTHDType wthd;
    @XmlElement(name = "CHAN")
    protected SeqEF17ACHANType chan;
    @XmlElement(name = "APLI")
    protected SeqEF17AAPLIType apli;

    /**
     * ��ȡdflt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ADFLTType }
     *     
     */
    public SeqEF17ADFLTType getDFLT() {
        return dflt;
    }

    /**
     * ����dflt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ADFLTType }
     *     
     */
    public void setDFLT(SeqEF17ADFLTType value) {
        this.dflt = value;
    }

    /**
     * ��ȡstin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ASTINType }
     *     
     */
    public SeqEF17ASTINType getSTIN() {
        return stin;
    }

    /**
     * ����stin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ASTINType }
     *     
     */
    public void setSTIN(SeqEF17ASTINType value) {
        this.stin = value;
    }

    /**
     * ��ȡrchg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ARCHGType }
     *     
     */
    public SeqEF17ARCHGType getRCHG() {
        return rchg;
    }

    /**
     * ����rchg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ARCHGType }
     *     
     */
    public void setRCHG(SeqEF17ARCHGType value) {
        this.rchg = value;
    }

    /**
     * ��ȡcert���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ACERTType }
     *     
     */
    public SeqEF17ACERTType getCERT() {
        return cert;
    }

    /**
     * ����cert���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ACERTType }
     *     
     */
    public void setCERT(SeqEF17ACERTType value) {
        this.cert = value;
    }

    /**
     * ��ȡwthd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17AWTHDType }
     *     
     */
    public SeqEF17AWTHDType getWTHD() {
        return wthd;
    }

    /**
     * ����wthd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17AWTHDType }
     *     
     */
    public void setWTHD(SeqEF17AWTHDType value) {
        this.wthd = value;
    }

    /**
     * ��ȡchan���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17ACHANType }
     *     
     */
    public SeqEF17ACHANType getCHAN() {
        return chan;
    }

    /**
     * ����chan���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17ACHANType }
     *     
     */
    public void setCHAN(SeqEF17ACHANType value) {
        this.chan = value;
    }

    /**
     * ��ȡapli���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SeqEF17AAPLIType }
     *     
     */
    public SeqEF17AAPLIType getAPLI() {
        return apli;
    }

    /**
     * ����apli���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SeqEF17AAPLIType }
     *     
     */
    public void setAPLI(SeqEF17AAPLIType value) {
        this.apli = value;
    }

}
