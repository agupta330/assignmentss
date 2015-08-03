import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationsonCSV 
{
	public static void main(String args[]) throws IOException
	{
		File infile=new File("D:/SortedData2.csv");
		String idno="";
		String id,firstname,lastname,age,email,country,ipaddress,order,color=" ";
		OperationsonCSV j = new OperationsonCSV();
		System.out.println("Enter the option from below");
		System.out.println("===========================");
		System.out.println("1.Adding of records");
		System.out.println("2.Deletion of records");
		System.out.println("3.Showing of records");	
		System.out.println("===========================");	
		Scanner in =new Scanner(System.in);
		int options=in.nextInt();
		
		switch(options)
		{
		case 1:
			System.out.println("Adding of Records.Enter from below options");
			System.out.println("============================================");
			System.out.println("1.Adding the record above a particular ID");
			System.out.println("2.Adding the record below a particular ID");
			System.out.println("3.Adding the record based on lineno/position");	
			System.out.println("============================================");
			int options1=in.nextInt();
			switch (options1)
			{
			
			case 1:
				
				System.out.println("Enter the id no above which you want to enter the record");
				idno=in.next();
					
				System.out.println("Enter Id");
				id=in.next();
				System.out.println("Enter FirstName");
				firstname=in.next();	
				System.out.println("Enter Lastname");
				lastname=in.next();
				System.out.println("Enter Age");
				age=in.next();
				System.out.println("Enter Email");
				email=in.next();
				System.out.println("Enter Country");
				country=in.next();
				System.out.println("Enter IP address");
				ipaddress=in.next();
				System.out.println("Enter order");
				order=in.next();
				System.out.println("Enter color");
				color=in.next();
				System.out.println("Records updated");
				
				try 
				{
					j.insertRecordAboveId(infile, idno, id,firstname,lastname,age,email,country,ipaddress,order,color);
			    }
				
				catch (Exception e) 
				{
				   e.printStackTrace();
			    }

				break;
			
			case 2:
				
				System.out.println("Enter the id no below which you want to enter the record");
				idno=in.next();
					
				System.out.println("Enter Id");
				id=in.next();
				System.out.println("Enter FirstName");
				firstname=in.next();	
				System.out.println("Enter Lastname");
				lastname=in.next();
				System.out.println("Enter Age");
				age=in.next();
				System.out.println("Enter Email");
				email=in.next();
				System.out.println("Enter Country");
				country=in.next();
				System.out.println("Enter IP address");
				ipaddress=in.next();
				System.out.println("Enter order");
				order=in.next();
				System.out.println("Enter color");
				color=in.next();
				System.out.println("Records updated");
				
				
				try 
				{
					j.insertRecordBelowId(infile, idno, id,firstname,lastname,age,email,country,ipaddress,order,color);
			    }
				
				catch (Exception e) 
				{
				   e.printStackTrace();
			    }
				
				break;
				
			case 3:
				System.out.println("Enter the line no at which you want to enter the record");
				int lineno;
				lineno=in.nextInt();
				lineno++;
				
				System.out.println("Enter Id");
				id=in.next();
				System.out.println("Enter FirstName");
				firstname=in.next();	
				System.out.println("Enter Lastname");
				lastname=in.next();
				System.out.println("Enter Age");
				age=in.next();
				System.out.println("Enter Email");
				email=in.next();
				System.out.println("Enter Country");
				country=in.next();
				System.out.println("Enter IP address");
				ipaddress=in.next();
				System.out.println("Enter order");
				order=in.next();
				System.out.println("Enter color");
				color=in.next();
				System.out.println("Records updated");
				//String lineToBeInserted="Hello World";
				
				
				try 
				{				
				    j.insertRecordAtLineno(infile, lineno, id,firstname,lastname,age,email,country,ipaddress,order,color);
			    }
				catch (Exception e) 
				{
				   e.printStackTrace();
			    }
				
				break;
				
			default:
				System.out.println("Wrong Option Entered");
				break;
			}
			
			break;
		
		case 2:
			System.out.println("Deletion of Records.Enter from below options");
			System.out.println("============================================");
			System.out.println("1.Deleting the record based on a particular ID");
			System.out.println("2.Deleting the record based on lineno/position");	
			System.out.println("============================================");
			int options2=in.nextInt();
			switch (options2)
			{
			case 1:
				System.out.println("Enter ID to remove that record from CSV File");
		 		id = in.next ();
		 		File tempFile = new File(infile + "temp.csv");
		 		BufferedReader br = new BufferedReader (new FileReader(infile));
		 		PrintWriter Pwr = new PrintWriter(new FileWriter (tempFile));
		 		String line = null;

		 		//read from original, write to temporary and trim space, while Id not found
		 		while((line = br.readLine()) !=null) 
		 		{
		 			if(line.trim().startsWith(id))
		 			{
		 				continue;   
		 			}
		 			else
		 			{
		 				Pwr.println(line);
		 				Pwr.flush();
		 			}
		 		}
		 		// close readers and writers
		 		br.close();
		 		Pwr.close();
		 		in.close();

		 		// delete original file before renaming temp
		 		infile.delete();

		 		// rename temp file back to original file
		 		if(tempFile.renameTo(infile))
		 		{
		        System.out.println("Update succesful");
		 		}
		 		else
		 		{
		        System.out.println("Update failed");
		 		}
		 
				break;
			
			case 2:
				
				System.out.println("Please enter the lineno(record) you want to delete");
				int lineNum=in.nextInt();
				lineNum++;
				File tempFile1 = new File(infile + "temp.csv");
		 		BufferedReader in1 = new BufferedReader (new FileReader(infile));
		 		PrintWriter out = new PrintWriter(new FileWriter (tempFile1));
				
				//BufferedReader in1 = new BufferedReader(new FileReader(infile));
			  
			    //PrintWriter out = null ;
			    //PrintWriter out = new PrintWriter (new FileWriter ("D:/Data.csv"));
			   
			    String line1 = null;
			    //int lineNum = 0;
			    int i=0;
			   
			    while( (line1 = in1.readLine()) != null)
			    {
			    i++;
			    	if(lineNum==i)
			    	{
			    		continue;
			    	}
			        else
			        {
			        	out.println(line1);
			            out.flush();
			        }
			  	}
			    // close readers and writers
			    in1.close();
			    out.close();
			    in.close();
			    
			    // delete original file before renaming temp
			    infile.delete();
			    
			    // rename temp file back to original file
			    if(tempFile1.renameTo(infile))
			    {
			    	System.out.println("Update succesful");
			 	}
			    else
			    {
			    	System.out.println("Update failed");
			    } 
			    break;
			
			default:
				System.out.println("Wrong Option Entered");
				break;
				}
		
			break;
			
		case 3:
				System.out.println("Showing of Records.Enter from below options");
				System.out.println("============================================");
				System.out.println("1.Showing the record based on a particular ID");
				System.out.println("2.Showing the record based on lineno/position");
				System.out.println("3.Showing the Complete Records");
				System.out.println("============================================");
				int options3=in.nextInt();
				switch (options3)
				{
				case 1:
					System.out.print("Please enter the ID to see that particular record");
					String id1=in.next();
					String line1="";
					BufferedReader br1 = new BufferedReader(new FileReader(infile));
					
					while ((line1 = br1.readLine()) != null)
					{
				        String strar[] = line1.split(",");
				        
				            if(id1.equalsIgnoreCase(strar[0]))
				            {
				                System.out.println(line1);
				            }   	
					}
					break;
					
				case 2:
					System.out.print("Please enter the line no/position to see that particular record");
				 	System.out.println();
					int lineno=in.nextInt();
				    BufferedReader br = new BufferedReader(new FileReader(infile));
				    List<String> lines = new ArrayList<>();
				    String line = "";
				    
				    while ((line = br.readLine()) != null) 
				    {
				        lines.add(line);
				    }
				    System.out.println("Searching Complete");
				    System.out.println(lines.get(lineno));
					break;
					
				case 3:
					System.out.println("Showing Complete Records line by line");
				 	String line2 = "";
				 	BufferedReader br2 = new BufferedReader(new FileReader(infile));
				    while ((line2 = br2.readLine()) != null) 
				    {
				        //lines.add(line);
				    	System.out.println(line2);
				    }
					break;
					
				default:
					System.out.println("Wrong Option Entered");
					break;
				}
				break;
				
			default:
				System.out.println("Wrong Option Entered");
				break;
				
		}
	}

	
	
	
	public void insertRecordAboveId(File inFile, String idno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
		       throws Exception {
		 
			 // temp file
		     File outFile = new File("$$$$$$$$.tmp");
		
		     // input
		     FileInputStream fis  = new FileInputStream(inFile);
		     BufferedReader in = new BufferedReader
		         (new InputStreamReader(fis));
		 
		     // output        
		     FileOutputStream fos = new FileOutputStream(outFile);
		     PrintWriter out = new PrintWriter(fos);
		 
		     String thisLine = "";
		     //int i =1;
		     while ((thisLine = in.readLine()) != null) {
		    	 String strar[] = thisLine.split(",");
		    	 if(idno.equalsIgnoreCase(strar[0])) 
		    	  
		    	 {
		    		out.print(id);
		    	   out.print(",");
		    	   out.print(firstname);
		    	   out.print(",");
		    	   out.print(lastname);
		    	   out.print(",");
		    	   out.print(age);
		    	   out.print(",");
		    	   out.print(email);
		    	   out.print(",");
		    	   out.print(country);
		    	   out.print(",");
		    	   out.print(ipaddress);
		    	   out.print(",");
		    	   out.print(order);
		    	   out.print(",");
		    	   out.print(color);
		    	   out.println(",");
		    	  
		    	   }
		    	
		       out.println(thisLine);
		    	
		       //i++;
		       }
		    out.flush();
		    out.close();
		    in.close();
		     
		    inFile.delete();
		    outFile.renameTo(inFile);
		  }
	
	
	
	public void insertRecordAtLineno(File inFile, int lineno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
		       throws Exception {
		 
			 // temp file
		     File outFile = new File("$$$$$$$$.tmp");
		
		     // input
		     FileInputStream fis  = new FileInputStream(inFile);
		     BufferedReader in = new BufferedReader
		         (new InputStreamReader(fis));
		 
		     // output        
		     FileOutputStream fos = new FileOutputStream(outFile);
		     PrintWriter out = new PrintWriter(fos);
		 
		     String thisLine = "";
		     int i =1;
		     while ((thisLine = in.readLine()) != null) {
		       if(i == lineno) 
		    	   {
		    	   out.print(id);
		    	   out.print(",");
		    	   out.print(firstname);
		    	   out.print(",");
		    	   out.print(lastname);
		    	   out.print(",");
		    	   out.print(age);
		    	   out.print(",");
		    	   out.print(email);
		    	   out.print(",");
		    	   out.print(country);
		    	   out.print(",");
		    	   out.print(ipaddress);
		    	   out.print(",");
		    	   out.print(order);
		    	   out.print(",");
		    	   out.print(color);
		    	   out.println(",");
		    	   
		    	   }
		       
		       out.println(thisLine);
		       i++;
		       }
		    out.flush();
		    out.close();
		    in.close();
		     
		    inFile.delete();
		    outFile.renameTo(inFile);
		  }

	
	public void insertRecordBelowId(File inFile, String idno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
		       throws Exception {
		 
			 // temp file
		     File outFile = new File("$$$$$$$$.tmp");
		
		     // input
		     FileInputStream fis  = new FileInputStream(inFile);
		     BufferedReader in = new BufferedReader
		         (new InputStreamReader(fis));
		 
		     // output        
		     FileOutputStream fos = new FileOutputStream(outFile);
		     PrintWriter out = new PrintWriter(fos);
		 
		     String thisLine = "";
		     //int i =1;
		     while ((thisLine = in.readLine()) != null) {
		    	 String strar[] = thisLine.split(",");
		    	 if(idno.equalsIgnoreCase(strar[0])) 
		    	   {
		       	   out.println(thisLine);
		    	   out.print(id);
		    	   out.print(",");
		    	   out.print(firstname);
		    	   out.print(",");
		    	   out.print(lastname);
		    	   out.print(",");
		    	   out.print(age);
		    	   out.print(",");
		    	   out.print(email);
		    	   out.print(",");
		    	   out.print(country);
		    	   out.print(",");
		    	   out.print(ipaddress);
		    	   out.print(",");
		    	   out.print(order);
		    	   out.print(",");
		    	   out.print(color);
		    	   out.println(",");
		    	   
		    	   }
		    	 else
		    	 {
		       out.println(thisLine);
		    	 }
		       //i++;
		       }
		    out.flush();
		    out.close();
		    in.close();
		     
		    inFile.delete();
		    outFile.renameTo(inFile);
		  }


}
