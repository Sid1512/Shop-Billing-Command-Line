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
							System.out.println(sbill[count]+" "+qbill[count]+" "+tbill[count]);
							count = count + 1;
						}
						else if(ch>7)
						{
							System.out.println("Wrong choice entered!");
						}
						else
						{
							System.out.println("=========================");
						}
					}
					break;
case 3;
					