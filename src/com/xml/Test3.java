package com.xml;
//20161109
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test3 {
	public static void main(String[] args) {
		try {
			//Dom Document °´Ã¼¸¦ »ý¼ºÇÏ±âÀ§ÇØ ÆÑÅä¸® »ý¼º
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();
			
			Document xmlDoc = null;
			
			String url = "comment.xml";
				
			if(url.indexOf("http://")!=-1){
				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);
			}else{
				xmlDoc = parser.parse(url);
			}

			String str = "";
			String out = "";
			
			Element	root = xmlDoc.getDocumentElement();
	
			//comment°¹¼ö
			Node total = root.getElementsByTagName("total").item(0);
			str = total.getFirstChild().getNodeValue();

			System.out.println("comment °¹¼ö: "+ str + "°³");
			
			NodeList items = root.getElementsByTagName("comment");
			
			for (int i = 0; i < items.getLength(); i++) {
				Node node = items.item(i);
				NodeList nodeList = node.getChildNodes();
				NamedNodeMap map = node.getAttributes();
				
				out = map.getNamedItem("num").getNodeValue();
				
				for (int j = 0; j < nodeList.getLength(); j++) {
					Node e = nodeList.item(j);
					
					if(e.getNodeType()==Node.ELEMENT_NODE){
						str = e.getChildNodes().item(0).getNodeValue();
						out += " " + str;
					}
				}
				System.out.println(out);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
