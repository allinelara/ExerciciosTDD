package FizzBuzz;

public class FizzBuzz {

	public static String verificaNum(int num) {
		if(num % 15 == 0){
			return "FizzBuzz";
		}else if(num % 3 == 0){
			return "Fizz";
		}else if(num % 5 == 0){
			return "Buzz";
		}
			return num+"";
	}
	
	public static String[] arrayDeStrings (int num){
		String[] resultado = new String[num];
		for(int i = 0; i<num;i++){
			resultado[i] = verificaNum(i+1);
		}
		return resultado;
	}

}
