//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.12.05 ʱ�� 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>F16R_INTSEC_Type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="F16R_INTSEC_Type">
 *   &lt;restriction base="{urn:swift:xsd:fin.564.2018}BeginBlock_Type">
 *     &lt;enumeration value="INTSEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "F16R_INTSEC_Type")
@XmlEnum
public enum F16RINTSECType {

    INTSEC;

    public String value() {
        return name();
    }

    public static F16RINTSECType fromValue(String v) {
        return valueOf(v);
    }

}
