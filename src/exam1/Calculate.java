package exam1;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		System.out.println("请输入工资：");
		Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
		System.out.println("所需要缴纳的税费为: "+cal(salary));
		input.close();
	}

	private static double cal(double salary) {
		if(salary-3500>0){salary -= 3500;}else{salary=0;}
		if(salary<1500)return salary*0.03;
		if(salary>1500&&salary<4500){
			return salary*0.1;
		}
		if(salary>4500&&salary<9000){
			return salary*0.2;
		}
		if(salary>9000&&salary<35000){
			return salary*0.25;
		}
		if(salary>35000&&salary<55000){
			return salary*0.3;
		}
		if(salary>55000&&salary<80000){
			return salary*0.35;
		}
		if(salary>80000){
			return salary*0.45;
		}
		return -1;
	}

}
