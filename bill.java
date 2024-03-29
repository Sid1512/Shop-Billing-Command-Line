import food.*;
import toiletries.*;
import bm.*;
import electronics.*;
import stationary.*;
import homedecor.*;
import getdt.*;
import file_append.*;
import java.util.*;
public class bill extends bm
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		getdt g = new getdt();
		String[] sbill = new String[50];
		int[] tbill = new int[50];
		int[] qbill = new int[50];
		int count = 0,bs = 0,total = 0;
		int p,q,ch,check;
		String tab = "", date = null, time = null;
		while(bs != 6)
		{
			System.out.println("=========="+name+"==========");
			System.out.println("1. Food");
			System.out.println("2. Electronics");
			System.out.println("3. Stationary");
			System.out.println("4. Toiletries");
			System.out.println("5. Home Decor");
			System.out.println("6. Exit & Print Bill");
			System.out.print("Enter your choice = ");
			bs = s.nextInt();
			switch(bs)
			{
				case 1:
					ch = 0;
					food f = new food();
					System.out.println("==========Food==========");
					System.out.println("1. Chips");
					System.out.println("2. Chocolates");
					System.out.println("3. Biscuits");
					System.out.println("4. Cake");
					System.out.println("5. Milk");
					System.out.println("6. Bread");
					System.out.println("7. Delete Last Item");
					System.out.println("8. Exit");
					while(ch != 8)
					{
						System.out.print("Enter your choice (From Food Menu) = ");
						ch = s.nextInt();
						if(ch>8 || ch<1)
							System.out.println("Wrong choice entered!");
						else if(ch<7)
						{
							sbill[count] = f.get_item(ch-1);
							p = f.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							check = 0;
							while(check != 1)
							{
								if(q<1)
								{
									System.out.println("Quantity cant be negative, Please enter quantity again!");
									System.out.print("Quantity = ");
									q = s.nextInt();
									check = 0;
								}
								else if(q>1)
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
									count = count + 1;
									check = 1;
								}
								else
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
									count = count + 1;
									check = 1;
								}
							}
						}
						else if(ch == 7)
						{
							if(count != 0)
							{
								if(qbill[count - 1]>1)
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+"s from your cart!");
								else
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+" from your cart!");
								count = count - 1;
								qbill[count] = 0;
								sbill[count] = null;
								qbill[count] = 0;
							}
							else
							{
								System.out.println("No item in cart!");
							}
						}
						else
							System.out.println("=========================");
					}
					break;
				case 2:
					ch = 0;
					electronics e = new electronics();
					System.out.println("==========Electronics==========");
					System.out.println("1. Headphones");
					System.out.println("2. USB cabel");
					System.out.println("3. Mouse");
					System.out.println("4. Gamepad");
					System.out.println("5. Hard Disk");
					System.out.println("6. Pendrive");
					System.out.println("7. Delete Last Item");
					System.out.println("8. Exit");
					while(ch != 8)
					{
						System.out.print("Enter your choice (From Electronics Menu) = ");
						ch = s.nextInt();
						if(ch>8 || ch<1)
							System.out.println("Wrong choice entered!");
						else if(ch<7)
						{
							sbill[count] = e.get_item(ch-1);
							p = e.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							check = 0;
							while(check != 1)
							{
								if(q<1)
								{
									System.out.println("Quantity cant be negative, Please enter quantity again!");
									System.out.print("Quantity = ");
									q = s.nextInt();
									check = 0;
								}
								else if(q>1)
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
									count = count + 1;
									check = 1;
								}
								else
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
									count = count + 1;
									check = 1;
								}
							}
						}
						else if(ch == 7)
						{
							if(count != 0)
							{
								if(qbill[count - 1]>1)
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+"s from your cart!");
								else
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+" from your cart!");
								count = count - 1;
								qbill[count] = 0;
								sbill[count] = null;
								qbill[count] = 0;
							}
							else
							{
								System.out.println("No item in cart!");
							}
						}
						else
							System.out.println("=========================");
					}
					break;
				case 3:
					ch=0;
					stationary st = new stationary();
					System.out.println("==========Stationary==========");
					System.out.println("1. Notebook");
					System.out.println("2. Pen");
					System.out.println("3. Geometry Box");
					System.out.println("4. Notepad");
					System.out.println("5. Sketch Book");
					System.out.println("6. Sketch pens");
					System.out.println("7. Delete Last Item");
					System.out.println("8. Exit");
					while(ch != 8)
					{
						System.out.print("Enter your choice (From Stationary Menu) = ");
						ch = s.nextInt();
						if(ch>8 || ch<1)
							System.out.println("Wrong choice entered!");
						else if(ch<7)
						{
							sbill[count] = st.get_item(ch-1);
							p = st.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							check = 0;
							while(check != 1)
							{
								if(q<1)
								{
									System.out.println("Quantity cant be negative, Please enter quantity again!");
									System.out.print("Quantity = ");
									q = s.nextInt();
									check = 0;
								}
								else if(q>1)
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
									count = count + 1;
									check = 1;
								}
								else
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
									count = count + 1;
									check = 1;
								}
							}
						}
						else if(ch == 7)
						{
							if(count != 0)
							{
								if(qbill[count - 1]>1)
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+"s from your cart!");
								else
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+" from your cart!");
								count = count - 1;
								qbill[count] = 0;
								sbill[count] = null;
								qbill[count] = 0;
							}
							else
							{
								System.out.println("No item in cart!");
							}
						}
						else
							System.out.println("=========================");
					}
					break;
				case 4:
					ch = 0;
					toiletries t = new toiletries();
					System.out.println("==========Toiletries==========");
					System.out.println("1. Soap");
					System.out.println("2. Shampoo");
					System.out.println("3. Towel");
					System.out.println("4. Handwash");
					System.out.println("5. Brush");
					System.out.println("6. Paste");
					System.out.println("7. Delete Last Item");
					System.out.println("8. Exit");
					while(ch != 8)
					{
						System.out.print("Enter your choice (From Toiletries Menu) = ");
						ch = s.nextInt();
						if(ch>8 || ch<1)
							System.out.println("Wrong choice entered!");
						else if(ch<7)
						{
							sbill[count] = t.get_item(ch-1);
							p = t.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							check = 0;
							while(check != 1)
							{
								if(q<1)
								{
									System.out.println("Quantity cant be negative, Please enter quantity again!");
									System.out.print("Quantity = ");
									q = s.nextInt();
									check = 0;
								}
								else if(q>1)
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
									count = count + 1;
									check = 1;
								}
								else
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
									count = count + 1;
									check = 1;
								}
							}
						}
						else if(ch == 7)
						{
							if(count != 0)
							{
								if(qbill[count - 1]>1)
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+"s from your cart!");
								else
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+" from your cart!");
								count = count - 1;
								qbill[count] = 0;
								sbill[count] = null;
								qbill[count] = 0;
							}
							else
							{
								System.out.println("No item in cart!");
							}
						}
						else
							System.out.println("=========================");
					}
					break;
				case 5:
					ch = 0;
					homedecor h = new homedecor();
					System.out.println("==========HomeDecor==========");
					System.out.println("1. Bedsheet");
					System.out.println("2. Showpiece");
					System.out.println("3. Curtains");
					System.out.println("4. Candles");
					System.out.println("5. Vase");
					System.out.println("6. Lamp");
					System.out.println("7. Delete Last Item");
					System.out.println("8. Exit");
					while(ch != 8)
					{
						System.out.print("Enter your choice (From HomeDecor Menu) = ");
						ch = s.nextInt();
						if(ch>8 || ch<1)
							System.out.println("Wrong choice entered!");
						else if(ch<7)
						{
							sbill[count] = h.get_item(ch-1);
							p = h.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							check = 0;
							while(check != 1)
							{
								if(q<1)
								{
									System.out.println("Quantity cant be negative, Please enter quantity again!");
									System.out.print("Quantity = ");
									q = s.nextInt();
									check = 0;
								}
								else if(q>1)
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
									count = count + 1;
									check = 1;
								}
								else
								{
									qbill[count] = q;
									tbill[count] = p*q;
									System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
									count = count + 1;
									check = 1;
								}
							}
						}
						else if(ch == 7)
						{
							if(count != 0)
							{
								if(qbill[count - 1]>1)
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+"s from your cart!");
								else
									System.out.println("You have deleted "+qbill[count-1]+" "+sbill[count-1]+" from your cart!");
								count = count - 1;
								qbill[count] = 0;
								sbill[count] = null;
								qbill[count] = 0;
							}
							else
							{
								System.out.println("No item in cart!");
							}
						}
						else
							System.out.println("=========================");
					}
					break;
				case 6:
					date = g.GetDate(date);
					time = g.GetTime(time);
					System.out.print("Please enter your Name = ");
					String n = s.next();
					System.out.println("========================= Bill =========================");
					System.out.println(date + "					" + time);
					System.out.println("======================= BIG Mart =======================");
					System.out.print(String.format("%-" + 22 + "s","Item Name"));
					System.out.print(String.format("%-" + 22 + "s","Quantity"));
					System.out.print(String.format("%-" + 22 + "s","Item Total"));
					System.out.println("\n========================================================");
					for(int k = 0; k < count; k++)
					{	
						System.out.print(String.format("%-" + 22 + "s", sbill[k]));
						System.out.print(String.format("%-" + 22 + "d", qbill[k]));
						System.out.print(String.format("%-" + 22 + "d", tbill[k]));
						System.out.println();
					}
					for (int i=0; i<tbill.length; i++)
					{
						total = total + tbill[i];
					}
					System.out.println("========================================================");
					System.out.print(String.format("%" + 33 + "s","Total Amount"));
					System.out.print(String.format("%" + 11 + "s","Rs. "));
					System.out.print(total);
					System.out.println("\n=======================Thank You========================");
					file_append fa = new file_append();
					fa.AppendToFile("data.txt",n,sbill,qbill,tbill,count);
					break;
				default:
					System.out.println("Wrong choice entered!");
			}	
		}
	}
}