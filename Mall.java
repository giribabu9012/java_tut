import java.util.*;
class Mall
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
{
		System.out.println("\t\t\t WELCOME TO FORUM MALL\t\t\t");
		System.out.println("CHOOSE YOUR SHOP:");
		System.out.println("\t\t\t1.RARE RABBIT \n2.CELIO \n3.JACK n JONES");
		System.out.println("\t\t\t WHAT YOU WANT FROM THESE SHOPS:");
		int a =sc.nextInt();
		Thread.sleep(5000);
		switch(a)
		{
			case 1:
				System.out.println("WELCOME TO RARE RABBIT");
				System.out.println("COLLECTIONS OF RARE RABBIT:\n 1.Dyes T-Shirt \n2.Baggy Mens \n3.Cord-Set");
				System.out.println("SELECT YOUR WEAR:");
				int b=sc.nextInt();
				switch(b)
			{
					case 1:
						double c=999.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double d=sc.nextInt();
					double e=c*d;
					System.out.println("PRICE OF DYES T-SHIRT:"+e);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm=sc.next().charAt(0);
					if(product_confirm=='S' || product_confirm=='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode=sc.nextInt();
						if(payment_mode==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+e);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bill=sc.nextDouble();
							if(e==user_enter_bill)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp=sc.nextInt();
								if(sys_otp==user_otp)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
								}
							}
						}
						if(payment_mode==2)
						{
							//PHONEPE
						}
					
					else if(product_confirm=='n'|| product_confirm=='N')
				{
						System.out.println("\t\t\tPRODUCT DENIED");
						break;
					}
			}
				break;
		}
			
	
		case 2:
		{
			System.out.println("YOU SELECTED WEAR:");
						double f=1299.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double g=sc.nextDouble();
					double h=f*g;
					System.out.println("PRICE OF BAGGY MENS:"+h);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm1=sc.next().charAt(0);
					if(product_confirm1=='S' || product_confirm1=='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode1=sc.nextInt();
						if(payment_mode1==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+h);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bills=sc.nextDouble();
							if(h==user_enter_bills)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp1=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp1=sc.nextInt();
								if(sys_otp1==user_otp1)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
							}
						}
						
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
									break;
								}
							}
		}
				
				case 3:{
						double i=799.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double j=sc.nextDouble();
					double k=i*j;
					System.out.println("PRICE OF CORD-SET:"+k);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm2=sc.next().charAt(0);
					if(product_confirm2=='S' || product_confirm2=='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode2=sc.nextInt();
						if(payment_mode2==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+k);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bill2=sc.nextDouble();
							if(k==user_enter_bill2)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp2=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp2=sc.nextInt();
								if(sys_otp2==user_otp2)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
								}
							}
					
				break;
				}
					default:{
						System.out.println("DRESS NOT AVAILABLE:");
				break;}
			}
		}
		case 2:
						{
				System.out.println("WELCOME TO CELIO");
				System.out.println("COLLECTIONS OF CELIO:\n 1.HALF SLEEVE SHIRTS \n2.JEANS");
				System.out.println("SELECT YOUR WEAR:");
				int b1=sc.nextInt();
				switch(b1)
			{
					case 1:{
						double c1=899.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double d1=sc.nextInt();
					double e1=c1*d1;
					System.out.println("PRICE OF HALF SLEEVE SHIRT:"+e1);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm3=sc.next().charAt(0);
					if(product_confirm3=='S' || product_confirm3=='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode3=sc.nextInt();
						if(payment_mode3==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+e1);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bill3=sc.nextDouble();
							if(e1==user_enter_bill3)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp3=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp3=sc.nextInt();
								if(sys_otp3==user_otp3)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
								}
							}
							
						}
						if(payment_mode3==2)
						{
							//PHONEPE
						}
					}
					else if(product_confirm3=='n'|| product_confirm3=='N')
				{
						System.out.println("\t\t\tPRODUCT DENIED");
					}
				break;}
				
				case 2:{
						double f4=1299.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double g4=sc.nextDouble();
					double h4=f4*g4;
					System.out.println("PRICE OF JEANS:"+h4);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm4=sc.next().charAt(0);
					if(product_confirm4=='S' || product_confirm4='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode4=sc.nextInt();
						if(payment_mode4==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+h4);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bill4=sc.nextDouble();
							if(h4==user_enter_bill4)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp4=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp4=sc.nextInt();
								if(sys_otp4==user_otp4)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
									break;
								}
							}
					break;
						}
					}
				
					default:{
						System.out.println("DRESS NOT AVAILABLE:");
				break;}
							}
							
							case 3:
				{
				System.out.println("WELCOME TO JACK N JONES");
				System.out.println("COLLECTIONS OF JACk N JONES:\n 1.SHOES \n2.SLIDES");
				System.out.println("SELECT YOUR WEAR:");
				int b5=sc.nextInt();
				switch(b5)
			{
					case 1:
						double c5=3799.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double d5=sc.nextInt();
					double e5=c5*d5;
					System.out.println("PRICE OF SHOES:"+e5);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm5=sc.next().charAt(0);
					if(product_confirm5=='S' || product_confirm5=='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode5=sc.nextInt();
						if(payment_mode5==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+e5);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bill5=sc.nextDouble();
							if(e5==user_enter_bill5)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp5=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp5=sc.nextInt();
								if(sys_otp5==user_otp5)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
								}
							}
							
						}
						if(payment_mode5==2)
						{
							//PHONEPE
						}
					}
					else if(product_confirm5=='n'|| product_confirm5=='N')
				{
						System.out.println("\t\t\tPRODUCT DENIED");
					}
				break;}
			}
			
				case 2:
				{
					System.out.println("you selected  WEAR:");
					double c6=1999.0;
					System.out.println("QUANTITY OF AN WEAR:");
					double d6=sc.nextInt();
					double e6=c6*d6;
					System.out.println("PRICE OF SLIDES:"+e6);
					System.out.println("ENTER 'S' TO CONFIRM OR 'N' TO BE REJECTED:");
					char product_confirm6=sc.next().charAt(0);
					if(product_confirm6=='S' || product_confirm6=='s')
					{
						System.out.println("\t\t\tREDIRECTING TO THE PAYMENT METHOD");
						Thread.sleep(3000);
						System.out.println("\t\t\tSELECT THE MODE OF PAYMENT");
						System.out.println("\t\t\t1.GPAY");
						System.out.println("\t\t\t1.PHONEPE");
						int payment_mode6=sc.nextInt();
						if(payment_mode6==1)
						{
							System.out.println("\t\t\t********GPAY********");
							System.out.print("PLEASE ENTER YOUR TOTAL BILL:"+e6);
							System.out.print("ENTER THE TOTAL AMOUNT:");
							double user_enter_bill6=sc.nextDouble();
							if(e6==user_enter_bill6)
							{
								System.out.println("\t\t\tSENDING OTP TO YOUR REGISTERED NUMBER");
								int sys_otp6=(int)(Math.random()*9999+9999);
								Thread.sleep(4000);
								System.out.println("ENTER THE OTP");
								Thread.sleep(3000);
								int user_otp6=sc.nextInt();
								if(sys_otp6==user_otp6)
								{
									System.out.println("\t\t\tVERIFY YOUR OTP");
									Thread.sleep(3000);
									System.out.println("\t\t\tPRODUCT PURCHASED");
								}
								else
								{
									System.out.println("\t\t\tPRODUCT DENIED");
								}
							}
							
						}
						if(payment_mode6==2)
						{
							//PHONEPE
						}
					}
					else if(product_confirm6=='n'|| product_confirm6=='N')
				{
						System.out.println("\t\t\tPRODUCT DENIED");
					}
				break;
				}
							
							
								default:{
						System.out.println("PRODUCT NOT AVAILABLE:");
							break;
							}
		
	        }
      }
}
}
}
					
			
				
					

		 		