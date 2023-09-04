package pan_download;

import java.util.regex.Pattern;

public class Module3 {
	public String name(String s)
	{
		boolean a=Pattern.matches("[a-zA-Z]+", s);
		if(a==true)
				return "success";
		else
				return "name is required";
	}
	
	public String dob(String d)
	{
		boolean a=Pattern.matches("[0-3]{1}[0-9]{1}[-][0-1]{1}[0-9]{1}[-][0-9]{4}", d);
		if(d=="")
			return "DOB is required";
		else if(a==true)
			return "success";
		else
			return "invalid DOB";
	}
	
	public String gender(String g)
	{
		String gen[]= {"Male","Female","Other"};
		for(int i=0;i<gen.length;i++)
		{
			if(g.equals(gen[i]))
				return "success";
		}
		if(g=="")
			return "gender is required";
		else
			return "";
	}
	
	public String pan(String p)
	{
		boolean a=Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}",p);
		if(p=="")
			return "PAN number is required";
		else if(a==true)
			return "success";
		else
			return "invalid PAN number";
	}
}
