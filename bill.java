import food.*;
import toiletries.*;
import bm.*;
import electronics.*;
import stationary.*;
import java.util.Scanner;
public class bill extends bm
{
	public static void main(String args[])
	{
		String[] sbill = new String[50];
		int[] tbill = new int[50];
		int[] qbill = new int[50];
		int count = 0,bs = 0;
		int p,q,ch;
		Scanner s = new Scanner(System.in);
		while(bs != 6)
		{
			System.out.println("=========="+name+"==========");
			System.out.println("1. Food");
			System.out.println("2. Electronics");
			System.out.println("3. Stationary");
			System.out.println("4. Toiletries");
			System.out.println("5. Clothing");
			System.out.println("6. Exit");
			System.out.print("Enter your choice = ");
			bs = s.nextInt();
			switch(bs)
			{
				case 1:
					ch = 0;
					food f = new food();
					System.out.println("==========Food==========");
					System.out.println("1. Chips");
					System.out.println("2. Choclates");
					System.out.println("3. Biscuits");
					System.out.println("4. Cake");
					System.out.println("5. Milk");
					System.out.println("6. Bread");
					System.out.println("7. Exit");
					while(ch != 7)
					{
						System.out.print("Enter your choice = ");
						ch = s.nextInt();
						if(ch<7)
						{
							sbill[count] = f.get_item(ch-1);
							p = f.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							qbill[count] = q;
							tbill[count] = p*q;
							if(q>1)
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
							else
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
							count = count + 1;
						}
						else if(ch>7)
							System.out.println("Wrong choice entered!");
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
					System.out.println("6. Bluetooth Speakers");
					System.out.println("7. Exit");
					while(ch != 7)
					{
						System.out.print("Enter your choice = ");
						ch = s.nextInt();
						if(ch<7)
						{
							sbill[count] = e.get_item(ch-1);
							p = e.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							qbill[count] = q;
							tbill[count] = p*q;
							if(q>1)
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
							else
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
							count = count + 1;
						}
						else if(ch>7)
							System.out.println("Wrong choice entered!");
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
					System.out.println("7. Exit");
					while(ch != 7)
					{
						System.out.print("Enter your choice = ");
						ch = s.nextInt();
						if(ch<7)
						{
							sbill[count] = st.get_item(ch-1);
							p = st.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							qbill[count] = q;
							tbill[count] = p*q;
							if(q>1)
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
							else
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
							count = count + 1;
						}
						else if(ch>7)
							System.out.println("Wrong choice entered!");
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
					System.out.println("7. Exit");
					while(ch != 7)
					{
						System.out.print("Enter your choice = ");
						ch = s.nextInt();
						if(ch<7)
						{
							sbill[count] = t.get_item(ch-1);
							p = t.get_price(ch-1);
							System.out.print("Quantity = ");
							q = s.nextInt();
							qbill[count] = q;
							tbill[count] = p*q;
							if(q>1)
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+"s in your cart!");
							else
								System.out.println("You have added "+qbill[count]+" "+sbill[count]+" in your cart!");
							count = count + 1;
						}
						else if(ch>7)
							System.out.println("Wrong choice entered!");
						else
							System.out.println("=========================");
					}
					break;
				case 5:
					//anchita
					break;
				case 6:
					//thanks,exit
					break;
				default:
					System.out.println("Wrong choice entered!");
			}
		}
	}
}

