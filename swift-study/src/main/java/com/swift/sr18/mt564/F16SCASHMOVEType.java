//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.05 时间 12:24:35 AM CST 
//


package com.swift.sr18.mt564;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>F16S_CASHMOVE_Type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="F16S_CASHMOVE_Type">
 *   &lt;restriction base="{urn:swift:xsd:fin.564.2018}EndBlock_Type">
 *     &lt;enumeration value="CASHMOVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "F16S_CASHMOVE_Type")
@XmlEnum
public enum F16SCASHMOVEType {

    CASHMOVE;

    public String value() {
        return name();
    }

    public static F16SCASHMOVEType fromValue(String v) {
        return valueOf(v);
    }

}
