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
 * <p>OptionalCode_4Ec_709_4_Type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="OptionalCode_4Ec_709_4_Type">
 *   &lt;restriction base="{urn:swift:xsd:fin.564.2018}Text_4Ec_1_Type">
 *     &lt;enumeration value="ACTU"/>
 *     &lt;enumeration value="INDI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionalCode_4Ec_709_4_Type")
@XmlEnum
public enum OptionalCode4Ec7094Type {

    ACTU,
    INDI;

    public String value() {
        return name();
    }

    public static OptionalCode4Ec7094Type fromValue(String v) {
        return valueOf(v);
    }

}
