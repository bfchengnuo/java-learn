package com.imooc.domtest.test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {

	public static void main(String[] args) {
		//创建一个DocumentBuilderFactory的对象
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			//创建DocumentBuilder对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			//通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
			Document document = db.parse("books.xml");
			//获取所有book节点的集合
			NodeList bookList = document.getElementsByTagName("book");
			System.out.println("一共有" + bookList.getLength() + "本书");
			
			for (int i = 0; i < bookList.getLength(); i++) {
				//通过 item(i)方法 获取一个book节点，nodelist的索引值从0开始
				Node book = bookList.item(i);
//				获取book节点的所有属性集合
				NamedNodeMap attrs = book.getAttributes();
//				遍历book的属性
				for (int j = 0; j < attrs.getLength(); j++) {
					//通过item(index)方法获取book节点的某一个属性
					Node attr = attrs.item(j);
					//获取属性名
					System.out.print("属性名：" + attr.getNodeName());
					//获取属性值
					System.out.println("--属性值" + attr.getNodeValue());
				}
				// 另一种方式获取属性
//				Element book = (Element) bookList.item(i);
//				String attrValue = book.getAttribute("id");

				//解析book节点的子节点
				NodeList childNodes = book.getChildNodes();
				//遍历childNodes获取每个节点的节点名和节点值
				for (int k = 0; k < childNodes.getLength(); k++) {
					//区分出text类型的node以及element类型的node
					if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
						//获取了element类型节点的节点名
						System.out.print("第" + (k + 1) + "个节点的节点名：" 
						+ childNodes.item(k).getNodeName());
//						获取了element类型节点的节点值
						System.out.println("--节点值是：" + childNodes.item(k).getFirstChild().getNodeValue());
//						System.out.println("--节点值是：" + childNodes.item(k).getTextContent());
					}
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}  catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
