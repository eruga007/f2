class test03{
	public static void main(String[] args){
		String s = "s";
		//handle
		try{
            
			int v = Integer.parseInt(s);
			Thread.sleep(2000);
			System.out.println(v);
		// }catch(NumberFormatException e1){
		// 	System.out.println("Invalid!");
		}catch(Exception e3){
            System.out.println("asdsad!");
		}
		//beware: unreachable code in multiple catches
	}
}