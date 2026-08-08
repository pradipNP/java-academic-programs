package Practice.lab8String;

class CheckArgumentException extends Exception{
	String s;
	int x;
	CheckArgumentException(String s,int x){
		this.s=s;
		this.x=x;
	}
	public String toString(){
		return "Check Argument Exception Caught: "+s+" with length of no. of argument passed "+x;
	}
}
class lab8_4{
	static void compute(String[] arr) throws CheckArgumentException{
		int s=0; 
		int x= arr.length;
		int a[]= new int[10];
		if(x<4)
			throw new CheckArgumentException("no. less than 4",x);
		else{
			for(int i=0;i<x;i++){
				 a[i]=Integer.parseInt(arr[i]);
				s= s+ a[i]*a[i];
			}
			System.out.println("Addition of squares of all argument = "+s);
		}
	}
	public static void main(String[] args){
		try{
			compute(args);
		}
		catch(CheckArgumentException e){
			System.out.println(e);
		}
	}
}