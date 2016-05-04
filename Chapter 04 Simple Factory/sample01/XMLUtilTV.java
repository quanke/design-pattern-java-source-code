import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtilTV
{
    //该方法用于从XML配置文件中提取品牌名称，并返回该品牌名称
	public static String getBrandName()
	{
		try
		{
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("configTV.xml")); 
		
			//获取包含品牌名称的文本节点
			NodeList nl = doc.getElementsByTagName("brandName");
            Node classNode=nl.item(0).getFirstChild();
            String brandName=classNode.getNodeValue().trim();
            return brandName;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
