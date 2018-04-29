class Ex05{
	//Not practical!, for example only
	private static String p="" ;
	public static void doIt()
		throws IllegalStateException
	{
		if(p == ""){
			throw new IllegalStateException("p must be defined first");
		}
		System.out.println(p.length());
	}

	public static void main(String[] args){
		//p = "Hello";
		try{
			doIt();
		}catch(IllegalStateException e){ //or IllegalStateException
			System.out.println("something wrong.");
		}
	}
}