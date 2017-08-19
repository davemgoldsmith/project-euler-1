package cn.edu.deepdive.project.euler;

public class ProjectEuler1 {
	
	public static int sum = 0;
	public static int factorThree = 0;
	public static int factorFive = 0;

	public static void main(String[] args) {
	
		for (int i = 1; i < 1000; i++){
			if (i % 3 == 0){
				factorThree +=1;
				sum +=i;
			}//if
			  if (i % 5 == 0 ){
				factorFive +=1;
				sum +=i;
			  } //if
			  if ((i % 3 == 0) & (i % 5 ==0)){
				  sum -=i;
			  }
			
			
		} //for loop
		
		System.out.println("Number of multiples of 3 :" + factorThree);
		System.out.println("Number of multiples of 5 :" + factorFive);
		System.out.println("Sum of multiples of 3 and 5 :" + sum);
		
		
	}

}
