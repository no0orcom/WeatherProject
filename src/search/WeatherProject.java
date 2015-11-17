package search; 
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document; 

public class WeatherProject { 
public static void main(String[] args) throws IOException { 
Display disp = new Display();
System.out.println("Enter 1 for Riyadh, 2 for Makkah , 3 for Jeddah ");
Scanner in = new Scanner(System.in);
int x;
 
x=in.nextInt();
switch(x){
    case 1:
 Document doc = generateXML("1939753");
        disp.getConditions(doc);break;
        case 2:
 doc = generateXML("1939897");
            disp.getConditions(doc);break;
             case 3:
 doc = generateXML("1939873");
            disp.getConditions(doc);break;

}
 } 
public static Document generateXML(String code) throws IOException { 
String url = null; String XmlData = null; // creating the URL 
url = "http://weather.yahooapis.com/forecastrss?w=" + code;
 URL xmlUrl = new URL(url); InputStream in = xmlUrl.openStream(); // parsing the XmlUrl 
 Document doc = parse(in); return doc; }
 
 public static Document parse(InputStream is) { 
 Document doc = null; 
 DocumentBuilderFactory domFactory; 
 DocumentBuilder builder; 
 try { 
 domFactory = DocumentBuilderFactory.newInstance(); 
 domFactory.setValidating(false); domFactory.setNamespaceAware(false); 
 builder = domFactory.newDocumentBuilder(); doc = builder.parse(is); } 
 catch (Exception ex) { System.err.println("unable to load XML: " + ex); } return doc; } }
