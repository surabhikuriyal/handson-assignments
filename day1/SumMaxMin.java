class SumMaxMin{
	public static void main(String args[]){
		int sum=0,max=0,min=0,x;
		max=Integer.parseInt(args[0]);
		min=max;
		sum=max;
		for(int i=1;i<args.length;i++){
			x=Integer.parseInt(args[i]);
			sum+=x;
			if(max<x)
				max=x;
			if(min>x)
				min=x;
		}
		System.out.println("SUM = "+sum+" MAX = "+max+" MIN = "+min);
	}
}