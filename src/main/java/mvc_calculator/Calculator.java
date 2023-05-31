package mvc_calculator;



import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller// we can have more then one controller
public class Calculator {
	/*
	@RequestMapping("add")
	public void add(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result=num1+num2;
		
	resp.getWriter().print("<h1>The Sum Of "+num1+" and "+num2+" is "+result+"</h1>");
	}
	
	@RequestMapping("sub")
	@ResponseBody
	public String Sub(@RequestParam int num1,@RequestParam int num2)
	{
		
		
		int result=num1-num2;
		
	//resp.getWriter().print("<h1>The Sum Of "+num1+" and "+num2+" is "+result+"</h1>");
	return "<h1>The sub Of "+num1+" and "+num2+" is "+result+"</h1>";
	
	}
	//in same html page we get different result.
	
	@RequestMapping("mul")
	
	public ModelAndView Mul(@RequestParam int num1,@RequestParam int num2)
	{
		
		ModelAndView view=new ModelAndView("Result.jsp");//inbuilt class
		view.addObject("res",num1*num2);
		//view.setViewName("Result.jsp");
		return view;
		
	
	}
	*/
@RequestMapping("add")
	
	public ModelAndView Add(@RequestParam int num1,@RequestParam int num2)
	{
		
		ModelAndView view=new ModelAndView();//inbuilt class
		view.addObject("op","sum");
		view.addObject("num1",num1);
		view.addObject("num2",num2);
		//view.addObject("res",num1+num2);
		int res=num1+num2;
		if(res%2==0){
			view.addObject("even",res);
		}
		else{
			view.addObject("odd",res);
		}
		view.setViewName("Result.jsp");
		return view;
		
	
	}
@RequestMapping("sub")

public ModelAndView Sub(@RequestParam int num1,@RequestParam int num2)
{
	
	ModelAndView view=new ModelAndView();//inbuilt class
	view.addObject("op","subtraction");
	view.addObject("num1",num1);
	view.addObject("num2",num2);
	//view.addObject("res",num1-num2);
	int res=num1-num2;
	if(res%2==0){
		view.addObject("even",res);
	}
	else{
		view.addObject("odd",res);
	}
	view.setViewName("Result.jsp");
	return view;
	

}
@RequestMapping("mul")

public ModelAndView Mul(@RequestParam int num1,@RequestParam int num2)
{
	
	ModelAndView view=new ModelAndView();//inbuilt class
	view.addObject("op","multipilication");
	view.addObject("num1",num1);
	view.addObject("num2",num2);
	//view.addObject("res",num1*num2);
	int res=num1*num2;
	if(res%2==0){
		view.addObject("even",res);
	}
	else{
		view.addObject("odd",res);
	}

	view.setViewName("Result.jsp");

	return view;
	

}
	@RequestMapping("div")
	
	public ModelAndView Div(@RequestParam double num1,@RequestParam int num2)
	{
		
		ModelAndView view=new ModelAndView();//inbuilt class
		view.addObject("op","division");
		view.addObject("num1",num1);
		view.addObject("num2",num2);
		//view.addObject("res",num1/num2);
		double res=num1/num2;
		if(res%2==0){
			view.addObject("even",res);
		}
		else{
			view.addObject("odd",res);
		}
		view.setViewName("Result.jsp");
		return view;
	
	
	}

}
