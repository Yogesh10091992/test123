package casting;

public class Sample {
	
	  void test1(int d)
	    {
	        System.out.println(d);
	       
	    }     
	}
	class primitive {
	    public static void main(String[] args) {
	        System.out.println("Program starts");
	        Sample s=new Sample();
	       // int res=(int)s.test1();
	        s.test1(7);
	       // System.out.println("raturn value="+res);
	        System.out.println("Program ends");
	         
	    }
	}
	
	
	

	
	


