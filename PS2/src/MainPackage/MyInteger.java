package MainPackage;

public class MyInteger 
{
	
	private int value;

	public int getValue() 
	{
		return value;
	}
	
	public MyInteger(int value) 
	{
		
		this.value = value;
	}
	
	public boolean isEven() 
	{
		
		if (this.getValue() % 2 == 0) 
		{
			
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	
	public static boolean isEven(int value)
	{
		
		if (value % 2 == 0) 
		{
			
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		
		if (myInt.getValue() % 2 == 0) 
		{
			
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	
	public boolean isOdd()
	{
		
		if (this.getValue() % 2 != 0) 
		{
			
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	
	public static boolean isOdd(int value)
	{
		
		if (value % 2 != 0) 
		{
			
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger myInt)
	{
		
		if (myInt.getValue() % 2 != 0) 
		{
			
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	

	public boolean isPrime()
	{
		
		for(int i = 0; i < this.getValue(); i++){
			if((this.getValue() % i) == 0){
				return false;
			}
		}
			return true;
		}
	
	public boolean isPrime(int value)
	{
		
		for(int i = 0; i == this.getValue(); i++){
			if((this.getValue() % i) == 0){
				return false;
			}
		}
			return true;
		}
	
	public boolean isPrime(MyInteger myInt)
	{
		
		for(int i = 0; i == this.getValue(); i++){
			if((this.getValue() % i) == 0){
				return false;
			}
		}
			return true;
		}
	
	public boolean equals(int x){
		
		if(x == this.getValue()){
			return true;
		}
		
		return false;
		
	}
	
	public static int parseint(char[] chars){
		int value = 0;
		
		for(char c : chars){
			value += (int) c;
		}
		
		return value;
	}
	
	
	public static int parseint(String str){
		
		int intValue = Integer.parseInt(str);
		
		return intValue;	
	}
		
}
	
	

