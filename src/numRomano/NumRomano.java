package numRomano;

//Este programa recebe um inteiro decimal e o transforma em romano (1 - 50)

public class NumRomano {

	public static String transformarDR(int numero) {
		String resultado = "";
		
		//Transforma o inteiro em String para utilizar o charAt.
		String num = ""+numero;
		
		//Se o numero for maior que 9 pega o primeiro digito do número
		if(numero > 9){
			num = num.charAt(0)+"";
			if(num.equals("1")){
				resultado+="X";
			}else if(num.equals("2")){
				resultado+="XX";
			}else if(num.equals("3")){
				resultado+="XXX";
			}else if(num.equals("4")){
				resultado+="XL";
			}else{
				resultado+="L";
			}
			//pega o segundo digito do número
			num = (""+numero).charAt(1)+"";
		}
		
		if(num.equals("1")){
			resultado+="I";
		}else if(num.equals("1")){
			resultado+="I";
		}else if(num.equals("2")){
			resultado+="II";
		}else if(num.equals("3")){
			resultado+="III";
		}else if(num.equals("4")){
			resultado+="IV";
		}else if(num.equals("5")){
			resultado+="V";
		}else if(num.equals("6")){
			resultado+="VI";
		}else if(num.equals("7")){
			resultado+="VII";
		}else if(num.equals("8")){
			resultado+="VIII";
		}else if(num.equals("9")){
			resultado+="IX";
		}
		return resultado;
	}
}
