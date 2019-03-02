class validation
{//class start
int dd,mm,yy;
int a[]={0,31,28,30,31,30,31,30,31,30,31,30,31};

public Aspirin()
		{ //function open
					dd=06; mm=05; yy=2014;
		}//functtion closed
boolean validate_pattern(String s)
	{//pattern validation open
				if(ch.charAt(2) && ch.charAt(5)=='/')
													{//if open
															for (i=0;i<a.length;i++)
																	{//for open
							ch=s.charAt(i);
							if(ch.charAt(i)!=2 && ch.charAt(i)==5)
																						{//if open
						if (!Character.isDigit(ch))
					return true;
						else
						return false;
								}// if closed
		}//for closed
						}if closed
								}//pattern validation closed
		boolean validate_day(int d)
				{// day validation start
					if (d<=a[mm])
					return true;
							else
					return false;
											}//day validation complete
	boolean validate_months(int m)
					{//month validation start
								


												}// month validation finished
boolan validate_year(int y)
		{// validation start




				}//validation complete


	
		public static void main(String sss[])
			{//main open
							String a="06/05/1999";
							Aspirin ob= new Aspirin();
							if(!ob.validate_pattern(v)) 
												System.out.print ln("invalid pattern........................");
						if(!ob.validate_day(31))
							System.out.print("invalid day.........................");
						else
							System.out.println("Valid day.......................");
			}//class closed 					

		}//main closed


	