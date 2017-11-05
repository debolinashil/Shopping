import java.lang.*;
import java.lang.NumberFormatException;
import java.io.*;
class OnlineShopping
{
	int yn;
	int choice,ch,ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12,ch13;
	int q,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15;
	String name;
	float total=0;
	OnlineShopping(String nam)
	{
		name=nam;
	}
	
	public void process() throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("WELCOME TO ONLINE SHOPPING!!");
		while(true)
		{
			System.out.println("Select your category:");
			System.out.println("1.MEN");
			System.out.println("2.WOMEN");
			System.out.println("Enter your choice");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
					System.out.println("WELCOME TO MEN's SECTION!!");
					System.out.println("1.FORMAL");
					System.out.println("2.CASUAL");
					System.out.println("Select your choice:");
					ch=Integer.parseInt(br.readLine());
					switch(ch)
					{
						case 1:
							System.out.println("1.Formal Shirt");
							System.out.println("2.Formal Pants");
							System.out.println("enter your choice:");
							ch1=Integer.parseInt(br.readLine());
							switch(ch1)
							{
								case 1:
								System.out.println("Select brand");
								System.out.println("1.Raymond, MRP: Rs.799");
								System.out.println("2.Siarams, MRP: Rs.599");
								System.out.println("Enter your choice:");
								ch2=Integer.parseInt(br.readLine());
								if(ch2==1)
								{
									System.out.println("Enter quantity: ");
									q=Integer.parseInt(br.readLine());
									total=total+(q*799);
								}
								else if(ch2==2)
								{
									System.out.println("Enter quantity: ");
									q1=Integer.parseInt(br.readLine());
									total=total+(q1*599);
								}
									break;
								case 2:
									System.out.println("Select brand");
									System.out.println("1.Raymond, MRP: Rs.1099");
									System.out.println("2.Siarams, MRP: Rs.999");
									System.out.println("Enter your choice:");
									ch3=Integer.parseInt(br.readLine());
									if(ch3==1)
									{
										System.out.println("Enter quantity: ");
										q2=Integer.parseInt(br.readLine());
										total=total+(q2*1099);
									}
									else if(ch3==2)
									{
										System.out.println("Enter quantity: ");
										q3=Integer.parseInt(br.readLine());
										total=total+(q3*999);
									}
									break;
							    default:System.out.println("Invalid");
							}
							break;
						case 2: 
							System.out.println("1.T-Shirt or tees");
							System.out.println("2.Denims");
							System.out.println("Enter your choice:");
							ch4=Integer.parseInt(br.readLine());
							switch(ch4)
							{
								case 1:
									System.out.println("Select brand");
									System.out.println("1.Silver Ounce, MRP: Rs 500");
									System.out.println("2.Adidas, MRP: Rs 900");
									System.out.println("enter your choice: ");
									ch5=Integer.parseInt(br.readLine());
									if(ch5==1)
									{
										System.out.println("Enter quantity: ");
										q4=Integer.parseInt(br.readLine());
										total=total+(q4*500);
									}
									else if(ch5==2)
									{	
										System.out.println("Enter quantity: ");
										q5=Integer.parseInt(br.readLine());
										total=total+(q5*500);
									}

									break;
								case 2:
									System.out.println("Select brand");
									System.out.println("1.Blackbird, MRP: Rs 699");
									System.out.println("2.Pantaloons, MRP: Rs 999");
									System.out.println("enter your choice: ");
									ch6=Integer.parseInt(br.readLine());
									if(ch6==1)
									{
										System.out.println("Enter quantity: ");
										q6=Integer.parseInt(br.readLine());
										total=total+(q6*699);
									}
									else if(ch6==2)
									{	
										System.out.println("Enter quantity: ");
										q7=Integer.parseInt(br.readLine());
										total=total+(q7*999);
									}
									break;
									default:System.out.println("");
							}
							break;
						default: System.out.println("invalid choice");
					}

					break;
				case 2:
						System.out.println("WELCOME TO WOMEN's SECTION!!");
					System.out.println("1.ETHNIC");
					System.out.println("2.WESTERN WEAR");
					System.out.println("Select your choice:");
					ch7=Integer.parseInt(br.readLine());
					switch(ch7)
					{
						case 1:
							System.out.println("1.Sarees");
							System.out.println("2.Salwar");
							System.out.println("enter your choice:");
							ch8=Integer.parseInt(br.readLine());
							switch(ch8)
							{
								case 1:
								System.out.println("Select brand");
								System.out.println("1.Cotton, MRP: Rs.999");
								System.out.println("2.Silks, MRP: Rs.1599");
								System.out.println("Enter your choice:");
								ch9=Integer.parseInt(br.readLine());
								if(ch9==1)
								{
									System.out.println("Enter quantity: ");
									q8=Integer.parseInt(br.readLine());
									total=total+(q8*999);
								}
								else if(ch9==2)
								{
									System.out.println("Enter quantity: ");
									q9=Integer.parseInt(br.readLine());
									total=total+(q9*1599);
								}
									break;
								case 2:
									System.out.println("Select brand");
									System.out.println("1.Patiala, MRP: Rs.1099");
									System.out.println("2.Churidar, MRP: Rs.999");
									System.out.println("Enter your choice:");
									ch10=Integer.parseInt(br.readLine());
									if(ch10==1)
									{
										System.out.println("Enter quantity: ");
										q10=Integer.parseInt(br.readLine());
										total=total+(q10*1099);
									}
									else if(ch10==2)
									{
										System.out.println("Enter quantity: ");
										q11=Integer.parseInt(br.readLine());
										total=total+(q11*999);
									}
									break;
							}
							break;
						case 2: 
							System.out.println("1.T-Shirt or tees");
							System.out.println("2.Denims");
							System.out.println("Enter your choice:");
							ch11=Integer.parseInt(br.readLine());
							switch(ch11)
							{
								case 1:
									System.out.println("Select brand");
									System.out.println("1.Silver Ounce, MRP: Rs 500");
									System.out.println("2.Adidas, MRP: Rs 900");
									System.out.println("enter your choice: ");
									ch12=Integer.parseInt(br.readLine());
									if(ch12==1)
									{
										System.out.println("Enter quantity: ");
										q12=Integer.parseInt(br.readLine());
										total=total+(q12*500);
									}
									else if(ch12==2)
									{	
										System.out.println("Enter quantity: ");
										q13=Integer.parseInt(br.readLine());
										total=total+(q13*500);
									}

									break;
								case 2:
									System.out.println("Select brand");
									System.out.println("1.Blackbird, MRP: Rs 699");
									System.out.println("2.Pantaloons, MRP: Rs 999");
									System.out.println("enter your choice: ");
									ch13=Integer.parseInt(br.readLine());
									if(ch13==1)
									{
										System.out.println("Enter quantity: ");
										q14=Integer.parseInt(br.readLine());
										total=total+(q14*500);
									}
									else if(ch13==2)
									{	
										System.out.println("Enter quantity: ");
										q15=Integer.parseInt(br.readLine());
										total=total+(q15*900);
									}
									break;
							
								default: System.out.println("invalid choice");
						    }
						}
					break;
				
				default: System.out.println("select a valid category!!");
			}
			System.out.println("Want to shop again? If yes press 1 or else 0:");
			yn=Integer.parseInt(br.readLine());
			if(yn==1)
				continue;
			if(yn==0)
				break;
			else
				break;
		}
		
	}
			

	public void bill()
		{
			System.out.println();
			System.out.println();
			System.out.println("-------------------------------BILL-----------------------------------");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Name: "+name+"                         ");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Total Amount: Rs."+total+"             ");
			
		}
}

class Shopping
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	String name=r.readLine();
	OnlineShopping o=new OnlineShopping(name);
	o.process();
	o.bill();
	}
}