package java101;

import java.util.Scanner;

public class HoroscopeCalculator {

	public static void main(String[] args) {
		int month, day;
		String sign = "";
		boolean isError = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What month were you born? : ");
		month = input.nextInt();
		
		System.out.println("What day were you born? : ");
		day = input.nextInt();
		
		// with If - Else
		
		if (month >= 1 && month <= 12) {		
			if (month == 1) {
				if (day >= 1 && day <= 31) {
					if (day <=21) {
						sign = "**Capricorn**";
					} else {
						sign = "**Aquarius**";
					}
				} else {
					isError = true;
				}
			}			
			else if (month == 2) {
				if (day >= 1 && day <= 28) {
					if (day <=19) {
						sign = "**Aquarius**";
					} else {
						sign = "**Pisces**";
					}
				} else {
					isError = true;
				}
			}
			else if (month == 3) {
				if (day >= 1 && day <= 31) {
					if (day <=20) {
						sign = "**Pisces**";
					} else {
						sign = "**Aries**";
					}
				} else {
					isError = true;
				}
			}
			else if (month == 4) {
				if (day >= 1 && day <= 30) {
					if (day <=20) {
						sign = "**Aries**";
					} else {
						sign = "**Taurus**";
					}
				} else {
					isError = true;
				}
			}		
			else if (month == 5) {
				if (day >= 1 && day <= 31) {
					if (day <=21) {
						sign = "**Taurus**";
					} else {
						sign = "**Gemini**";
					}
				} else {
					isError = true;
				}
			}		
			else if (month == 6) {
				if (day >= 1 && day <= 30) {
					if (day <=22) {
						sign = "**Gemini**";
					} else {
						sign = "**Cancer**";
					}
				} else {
					isError = true;
				}
			}
			else if (month == 7) {
				if (day >= 1 && day <= 31) {
					if (day <=22) {
						sign = "**Cancer**";
					} else {
						sign = "**Leo**";
					}
				} else {
					isError = true;
				}
			}	
			else if (month == 8) {
				if (day >= 1 && day <= 31) {
					if (day <=22) {
						sign = "**Leo**";
					} else {
						sign = "**Virgo**";
					}
				} else {
					isError = true;
				}
			}		
			else if (month == 9) {
				if (day >= 1 && day <= 30) {
					if (day <=22) {
						sign = "**Virgo**";
					} else {
						sign = "**Libra**";
					}
				} else {
					isError = true;
				}
			}
			else if (month == 10) {
				if (day >= 1 && day <= 31) {
					if (day <=22) {
						sign = "**Libra**";
					} else {
						sign = "**Scorpio**";
					}
				} else {
					isError = true;
				}
			}	
			else if (month == 11) {
				if (day >= 1 && day <= 30) {
					if (day <=21) {
						sign = "**Scorpio**";
					} else {
						sign = "**Sagittarius**";
					}	
				} else {
					isError = true;
				}
			}	
			else if (month == 12) {
				if (day >= 1 && day <= 31) {
					if (day <=21) {
						sign = "**Sagittarius**";
					} else {
						sign = "**Capricorn**";
					}
				} else {
					isError = true;
				}
			}
		} else {
			isError = true;
		}
		
		if (isError) {
			System.out.println("Wrong enterence! Please make sure that you entered valid MONTH or DAY");
		} else {
			System.out.println("Your horoscome is : " + sign);
		}
		
		
		/*
		// with Switch - Case
		
		switch (month) {
		case 1:
			if (day >= 1 && day <= 31) {
				if (day <=21) {
					sign = "**Capricorn**";
				} else {
					sign = "**Aquarius**";
				}
			} else {
				isError = true;
			}
			break;
		case 2:
			if (day >= 1 && day <= 28) {
				if (day <=19) {
					sign = "**Aquarius**";
				} else {
					sign = "**Pisces**";
				}
			} else {
				isError = true;
			}			
			break;
		case 3:
			if (day >= 1 && day <= 31) {
				if (day <=20) {
					sign = "**Pisces**";
				} else {
					sign = "**Aries**";
				}
			} else {
				isError = true;
			}			
			break;
		case 4:
			if (day >= 1 && day <= 30) {
				if (day <=20) {
					sign = "**Aries**";
				} else {
					sign = "**Taurus**";
				}
			} else {
				isError = true;
			}			
			break;
		case 5:
			if (day >= 1 && day <= 31) {
				if (day <=21) {
					sign = "**Taurus**";
				} else {
					sign = "**Gemini**";
				}
			} else {
				isError = true;
			}			
			break;
		case 6:
			if (day >= 1 && day <= 30) {
				if (day <=22) {
					sign = "**Gemini**";
				} else {
					sign = "**Cancer**";
				}
			} else {
				isError = true;
			}			
			break;
		case 7:
			if (day >= 1 && day <= 31) {
				if (day <=22) {
					sign = "**Cancer**";
				} else {
					sign = "**Leo**";
				}
			} else {
				isError = true;
			}			
			break;
		case 8:
			if (day >= 1 && day <= 31) {
				if (day <=22) {
					sign = "**Leo**";
				} else {
					sign = "**Virgo**";
				}
			} else {
				isError = true;
			}			
			break;
		case 9:
			if (day >= 1 && day <= 30) {
				if (day <=22) {
					sign = "**Virgo**";
				} else {
					sign = "**Libra**";
				}
			} else {
				isError = true;
			}			
			break;
		case 10:
			if (day >= 1 && day <= 31) {
				if (day <=22) {
					sign = "**Libra**";
				} else {
					sign = "**Scorpio**";
				}
			} else {
				isError = true;
			}		
			break;
		case 11:
			if (day >= 1 && day <= 30) {
				if (day <=21) {
					sign = "**Scorpio**";
				} else {
					sign = "**Sagittarius**";
				}	
			} else {
				isError = true;
			}		
			break;
		case 12:
			if (day >= 1 && day <= 31) {
				if (day <=21) {
					sign = "**Sagittarius**";
				} else {
					sign = "**Capricorn**";
				}
			} else {
				isError = true;
			}		
			break;
		default:
			isError = true;
		}
		
		if (isError) {
			System.out.println("Wrong enterence! Please make sure that you entered valid MONTH or DAY");
		} else {
			System.out.println("Your horoscome is : " + sign);
		}
		
		*/		
		
	}

}
