import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXB;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.swift.converter.ErrorReportException;
import com.swift.converter.Xml2MT;
import com.swift.sr18.mt564.F16RGENLType;
import com.swift.sr18.mt564.MT564Type;
import com.swift.sr18.mt564.SeqAF16A1Type;
import com.swift.sr18.mt564.SeqAType;

public class App {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		new App().testDom();

	}

	public void testDom() throws ParserConfigurationException, SAXException, IOException, ErrorReportException {
		// ´´½¨ DocumentBuilder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder(); 
		InputStream is = this.getClass().getClassLoader().getResourceAsStream("fin.564.2018.xsd");
		Document schema = builder.parse(is);
		
		com.swift.sr18.mt564.Document swift = new com.swift.sr18.mt564.Document();
		MT564Type mt564 = new MT564Type();
		swift.setMT564(mt564);
		
		SeqAType seqA = new SeqAType();
		mt564.setSeqA(seqA);
		
		SeqAF16A1Type f16a1 = new SeqAF16A1Type();
		f16a1.setF16R(F16RGENLType.GENL);
		seqA.setF16A1(f16a1);
		
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		JAXB.marshal(swift, os);
		pl(os);
		
		Document doc = builder.parse(new ByteArrayInputStream(os.toByteArray()));
		Xml2MT xml2mt = new Xml2MT(schema);
		
		String content = xml2mt.convert(doc);
	}
	
	public static void pl(Object o) {
		System.out.println(o);
	}
}
