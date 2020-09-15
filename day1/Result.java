class Result{
	public static void main(String args[]){
		for(int i=0;i<args.length;i++){
			int x=Integer.parseInt(args[i]);
			if(x>70)
				System.out.println("FCD");
			else if(x>60)
				System.out.println("FC");
			else if(x>50)
				System.out.println("SC");
			else if(x>35)
				System.out.println("PASS");
			else
				System.out.println("FAIL");
		}
	}
}