class TaxCalculation{
	public static void main(String args[]){
		int amount=Integer.parseInt(args[0]);
		String ch=args[1];
		int res=0;
		switch(ch){
			case "KARNATAKA":
			res=amount-(amount*10)/100;
			break;

			case "TAMIL NADU":
			res=amount-(amount*15)/100;
			break;

			case "TELANGANA":
			res=amount-(amount*8)/100;
			break;

			case "MAHARASHTRA":
			res=amount-(amount*20)/100;
			break;

			case "RAJASTHAN":
			res=amount-(amount*9)/100;
			break;
		}
			System.out.println("TAX CALCULATION FOR "+ch+" IS : "+res);
	}
}