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
 * <p>Code_4Ec_391_Type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="Code_4Ec_391_Type">
 *   &lt;restriction base="{urn:swift:xsd:fin.564.2018}Text_4Ec_1_Type">
 *     &lt;enumeration value="DEFE"/>
 *     &lt;enumeration value="EXIS"/>
 *     &lt;enumeration value="NDEF"/>
 *     &lt;enumeration value="NEIS"/>
 *     &lt;enumeration value="NREF"/>
 *     &lt;enumeration value="REFU"/>
 *     &lt;enumeration value="UKWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Code_4Ec_391_Type")
@XmlEnum
public enum Code4Ec391Type {

    DEFE,
    EXIS,
    NDEF,
    NEIS,
    NREF,
    REFU,
    UKWN;

    public String value() {
        return name();
    }

    public static Code4Ec391Type fromValue(String v) {
        return valueOf(v);
    }

}
