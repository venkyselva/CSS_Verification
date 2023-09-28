import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.json.JsonMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONPointer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mysql.cj.xdevapi.JsonArray;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.text.ParseException;  
import com.fasterxml.jackson.core.JsonFactory;  
import com.fasterxml.jackson.core.JsonParseException;  
import com.fasterxml.jackson.core.JsonParser;  
import com.fasterxml.jackson.databind.JsonMappingException;  
import com.fasterxml.jackson.databind.JsonNode;  
import com.fasterxml.jackson.databind.ObjectMapper;  
import io.netty.util.internal.ThreadLocalRandom;


public class Nallas_demo 
{

	public static String Set1 = "Yet to start";
	public static String Set2 = "Yet to start";
	public static JLabel Set_list1;
	public static JLabel Set_list2;
	public static JLabel Status;
	
	public static String[] choices = { "New Browser","Existing Browser"};
	public static String[] type = { "Excel ","CSV"};

	public static JComboBox<String> input_option = new JComboBox<String>(choices);
	public static JComboBox<String> outputfile_type = new JComboBox<String>(type);
	public static String user_status ="Yet to start";
	public static  String  Verification="";
	public static  int Guess_count=0;
	public static JTextField userEnt0;
	public static JTextField userEnt;
	public static JTextField userEnt1;
	public static JTextField primarykey;
	public static  String  input_json1="";
	public static  String  input_json2="";
	public static  String  input_typevalue="";
	public static  String  outpur_typevalue="";
	public static  String filelocation;
	public static int length;
	public static  int count;  
	public static Integer [] int_array;
	public static JButton number;
	public static JButton reset;
	public static String finalvalue="empty";
	public static JPanel mainPanel, subPanel1, subPanel2;
	public static ArrayList<Integer> value = new ArrayList<Integer>();
	public static ArrayList<String> Finaljsoncomparison = new ArrayList<String>();
	public static ArrayList<String> json1keylist= new ArrayList<String>();
	public static ArrayList<String> json2keylist= new ArrayList<String>();
	public static Multimap<String, String[][]> map1 = ArrayListMultimap.create();
	public static Multimap<String, String[][]> map2 = ArrayListMultimap.create();
	public static String [][][] Json2array;
	public static List<String> Primarykeyvalue = new ArrayList<String>();
	public static List<String> final_output = new ArrayList<String>();
	public static String file_content;
	public static String file_content1;
	public static String website="";
	public static String webelemt_xpath="";
	public static String csspror="";
	public static String expval="";
	public static String Actaul_value ="";
	public static String primary_key="";
	public static Boolean status = false;
	public static Boolean filestatus = true;
	public static WebDriver driver;
	@SuppressWarnings("rawtypes")
	Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
	public static ArrayList<String> keylist1= new ArrayList<String>();
	public static ArrayList<String> keylist2= new ArrayList<String>();
	
	public static void main(String[] args) 
	{
					
     try
     {

    	 final JFrame frame = new JFrame();
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setTitle("-----Welcome to NALLAS-----");
 		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
 		

 		//---to identify system resolution----
 		int[] scrn_resln = system_resolution();
 	    int width = scrn_resln[0];
 		 int height = scrn_resln[1];
 		 frame.setSize(width/2,height/2);
 		//---Element initialization----
 		JPanel LeftPanelY = new JPanel();
 		LeftPanelY.setLayout(new BoxLayout(LeftPanelY, BoxLayout.Y_AXIS));
 		
 		JLabel list_labeldrpdown = new JLabel("Select Browser Option");
 		//JLabel list_labeldrpdown1 = new JLabel("Select Ouput File Type");
 		JLabel list_label0 = new JLabel("Webpage link");
 		 JLabel list_label = new JLabel("WebElement Xpath");
 		JLabel list_label1 = new JLabel("CSS Property");
 		JLabel list_label3 = new JLabel("Expected value");
 		JLabel list_label2 = new JLabel(" ");
 		 userEnt0 = new JTextField("", 10);
          userEnt = new JTextField("", 10);
          userEnt1 = new JTextField("", 10);
          primarykey = new JTextField("", 10);
            number = new JButton("Validate");
           reset = new JButton("Reset");
          Set1 ="Yet to Start";
          Set_list1  = new JLabel("<html><br>"+"Status**"+Set1+" --**</html>");
          
          LeftPanelY.add(list_labeldrpdown);
          LeftPanelY.add(input_option);
          
          LeftPanelY.add(list_label2);
         
          LeftPanelY.add(list_label0);
          LeftPanelY.add(userEnt0);
          
          LeftPanelY.add(list_label);
          LeftPanelY.add(userEnt);
          
          LeftPanelY.add(list_label2);
          
          LeftPanelY.add(list_label1);
          LeftPanelY.add(userEnt1);
          
          LeftPanelY.add(list_label2);
          
          LeftPanelY.add(list_label3);
          LeftPanelY.add(primarykey);
          
          LeftPanelY.add(list_label2);
          //LeftPanelY.add(list_labeldrpdown1);
         //LeftPanelY.add(outputfile_type);
          
          LeftPanelY.add(list_label2);
          LeftPanelY.add(number);
          LeftPanelY.add(list_label2);
          LeftPanelY.add(reset);
          LeftPanelY.add(Set_list1);
          LeftPanelY.setPreferredSize(new Dimension(500, 500));
          LeftPanelY.setMaximumSize(new Dimension(500, 500));
          LeftPanelY.setAlignmentX(Component.CENTER_ALIGNMENT);
          frame.getContentPane().add(LeftPanelY);
          //frame.setSize(550, 300);
          frame.setVisible(true);
          //frame.add(pane1);
          //frame.setVisible(true);
         
           number.addActionListener(new ActionListener(){  
 			  public void actionPerformed(ActionEvent e){
 				  reset.setEnabled(true);
 				  userEnt.setEditable(false);
 				 userEnt1.setEditable(false);
 				  number.setEnabled(false);
 				 primarykey.setEnabled(false);
 				input_typevalue = input_option.getSelectedItem().toString();
 				website = userEnt0.getText();
 				webelemt_xpath = userEnt.getText();
 				csspror = userEnt1.getText();
 				expval = primarykey.getText();
 				 Verification ="";
 				 //System.out.println("print" + finalstring +finalstring1 );
 				
 			
					
 				 if(website.equals("") || webelemt_xpath.equals("") || csspror.equals("")||expval.equals(""))
 				 {
 					
					Verification = "Required Field cannot be blank";
				     Set_list1.setText("<html><br>"+"Status: "+ Verification+" --**</html>");
								
 				  }
 				else
 				{
 					//JSONObject json = new JSONObject(file_content);  
 					try
 					{
 					
 						String driverpath = System.getProperty("user.dir");
 						System.out.println("test----"+ driverpath);
 						
 						if(input_typevalue.equalsIgnoreCase("New Browser"))
 						{
 						System.setProperty("webdriver.chrome.driver",driverpath+"\\chromedriver.exe");  
 						ChromeOptions chromeOptions = new ChromeOptions();

 						chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

 						driver = new ChromeDriver(chromeOptions); 
 						
 						driver.get(website);
 						
 						driver.manage().window().maximize();
 						Thread.sleep(5000);
 						}
 						WebElement element = driver.findElement(By.xpath(webelemt_xpath));
 						Actions actn = new Actions(driver);
 						actn.moveToElement(element).perform();
 						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
 						
 						System.out.println("print website " +website );
 						System.out.println("print xpath " +webelemt_xpath );
 						System.out.println("print css " +csspror );
 							String st="";
 							String sts = "";
 							if(!expval.contains(","))
 							{
 								Actaul_value = element.getCssValue(csspror);
 							if(expval.equalsIgnoreCase(Actaul_value))
 									{
 								st = "Success";
 								
 									}
 							else
 							{
 								st = "Failed";
 									
 							}
 							}
 							else
 							{
 								
 								String[] exp = expval.split(",");
 								String[] expcss = csspror.split(",");
 								ArrayList<String> actval = new ArrayList<String>();
 								for(String valexp:expcss)
 								{
 									Actaul_value = element.getCssValue(valexp);
 									actval.add(Actaul_value);
 								}
 								
 								int leng = actval.size();
 								st = "<html>";
 								for(int a =0; a<leng;a++)
 								{
 									String actvallist = actval.get(a);
 									String expvallist = exp[a];
 									String csslist = expcss[a];
 									
 									if(actvallist.equalsIgnoreCase(expvallist))
 									{
 										
 								st += "--"+csslist+"--"+"  Verification Status: "+"(Exp.val:"+expvallist+" Act.val: "+actvallist+ ":) Success"+"<br>";
 								
 									}
 							   else
 							     {
 								  st += "--"+csslist+"--"+"  Verification Status: "+"(Exp.val:"+expvallist+" Act.val: "+actvallist+ ":) Failed"+"<br>";
 									
 							      }
 								}
 								st +="</html>";
 								
 							}
 							sts = "CSS Property Verification Status";
 							String result;
 							if(!expval.contains(","))
 							{
 							 result = "---Expected "+ csspror +": "+expval+ " ---Actual "+ csspror + ": "+Actaul_value+"---"+"Status: "+st;
 							}
 							else
 							{
 								 result = st;
 							}
 							
 							JOptionPane.showMessageDialog(null,result,sts, JOptionPane.PLAIN_MESSAGE);
 						
					} 
 					catch (Exception e1) 
 					{
						// TODO Auto-generated catch block
						Verification = "--System cannot Process your input. Kindly contact Admin--";
		 				Set_list1.setText("<html><br>"+"Status: "+ Verification+" --**</html>");	
					}
 				 }
 				
 			  }});  

           
          reset.addActionListener(new ActionListener(){  
 			  public void actionPerformed(ActionEvent e){
 				 input_option.setSelectedIndex(0);
 				outputfile_type.setSelectedIndex(0);
 				  number.setEnabled(true);
 				  userEnt.setEditable(true);
 				  userEnt.setText("");
 				 userEnt1.setEditable(true);
				  userEnt1.setText("");
				  primarykey.setEnabled(true);
				  primarykey.setText("");
 				  reset.setEnabled(false);
 				 Set1 = "Reset Completed";
 				final_output.clear();
					Set_list1.setText("<html><br>"+"Status: "+ Set1+" --**</html>");
 				  
 			  }});
          
          
	}
	catch(Exception g)
	{
		System.out.println(g.toString());
	}
	}
 	
     
   
     
public static int[] system_resolution()
{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		
		int height = (int)screenSize.getHeight();
		int[] val = {width,height};
		return val;
		
}

}