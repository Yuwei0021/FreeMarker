package context;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;
public class TestFreeMarker {
	
	
	public static void main(String[] args) throws IOException, TemplateException {
		Map<String,String> dataMap = new HashMap<String,String>(); 

		dataMap.put("name", "yuwei");
		dataMap.put("foo", "tutu");
		  
		    Configuration configuration = new Configuration(); 
		    configuration.setDefaultEncoding("utf-8");  
		   
		    configuration.setDirectoryForTemplateLoading(new File("D:/"));  
		      
		   File outFile = new File("D:/test.doc");  
		     
		   Template t =  configuration.getTemplate("ExpressionReplacementInGlobalParagraphsTestXML.ftl","utf-8");  
		   Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"),10240);  
		      t.process(dataMap, out);  
		      out.close();
	}
	
      
}
