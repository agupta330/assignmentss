import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecordFromSortedData 
{
	public static void main(String args[]) throws IOException
	{
		String csv = "D:/SortedData2.csv";
		
		System.out.println("Enter the option from below");
		System.out.println("1.Please enter the record you want to see");
		System.out.println("2.Please enter the record you want to add at the end");
		Scanner in =new Scanner(System.in);
		int options=in.nextInt();
		
		switch(options)
		{
		case 1:  
			System.out.print("Please enter the record you want to see");
		 	System.out.println();
			int lineno=in.nextInt();
		    BufferedReader br = new BufferedReader(new FileReader(csv));
		    List<String> lines = new ArrayList<>();
		    String line = "";
		    
		    while ((line = br.readLine()) != null) 
		    {
		        lines.add(line);
		    }
		    System.out.println("Searching Complete");
		    System.out.println(lines.get(lineno));
		   		    
        break;
		
		case 2:  
			
			String outputFile = "D:/SortedData2.csv";
			String id,firstname,lastname,age,email,country,ipaddress,order,color=" ";
			System.out.print("Please enter the record after you want to ENTER");
			// before we open the file check to see if it already exists
			boolean alreadyExists = new File(outputFile).exists();
				
			try {
				// use FileWriter constructor that specifies open for appending
				FileWriter fw = new FileWriter(outputFile, true);
				
				// if the file didn't already exist then we need to write out the header line
				if (!alreadyExists)
				{
					fw.write("ID");
					fw.write("First Name");
					fw.write("Last Name");
					fw.write("Age");
					fw.write("Email");
					fw.write("Country");
					fw.write("IP Address");
					fw.write("Order");
					fw.write("Color");
					
				}
				// else assume that the file already has the correct header line
			/*	if(lineno1==6)
				{
					fw.append('\n');
				}
			*/
				System.out.println("Enter Id");
				id=in.next();				
				fw.write(id);
				fw.write(",");
				
				System.out.println("Enter FirstName");
				firstname=in.next();				
				fw.write(firstname);
				fw.write(",");
				
				System.out.println("Enter Lastname");
				lastname=in.next();
				fw.write(lastname);
				fw.write(",");
				
				System.out.println("Enter Age");
				age=in.next();
				fw.write(age);
				fw.write(",");
				
				System.out.println("Enter Email");
				email=in.next();
				fw.write(email);
				fw.write(",");
				
				System.out.println("Enter Country");
				country=in.next();
				fw.write(country);
				fw.write(",");
				
				System.out.println("Enter IP address");
				ipaddress=in.next();
				fw.write(ipaddress);
				fw.write(",");
				
				System.out.println("Enter order");
				order=in.next();
				fw.write(order);
				fw.write(",");
				
				System.out.println("Enter color");
				color=in.next();
				fw.write(color);
				fw.write(",");
				System.out.println("Records updated");
				fw.append('\n');
				
				fw.close();
				
				/*
				fw.write("1");
				fw.write(",");
				fw.write("ram");
				fw.write(",");
				fw.write("shyam");
				fw.write(",");
				fw.write("18");
				fw.write(",");
				fw.write("A@email.com");
				fw.write(",");
				fw.write("India");
				fw.write(",");
				fw.write("192.169");
				fw.write(",");
				fw.write("ram");
				fw.write(",");
				fw.write("red");
				fw.write(",");
				fw.close();
				*/
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			
        break;
		}
		
	 	

}
}
