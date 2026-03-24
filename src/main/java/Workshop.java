import java.util.List;


public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        if (a >= b && a >= c) return a;
    	if (b >= c) return b;
    	return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
	for (int i=1; i <= limite; i++){
		tabla[i-1]=numero*i;
	}
	return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        int f=1;
	for(int i=n; i>0;i--){
		f=f*i;
	}
        return f;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
	int sum=0;
	for(int i=1;i<=numero;i++){
		int div=numero%i;
		if(div==0){
			sum++;
		}
	}

	if(sum==2){
		return true;
	}
        return false;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        int[] fib = new int[n];
	int a,b,c;
	a=0;
	b=1;
	c=0;
	for(int k=0;k<n;k++){
		fib[k]=c;
		c=a+b;
		if(k>0){
			a=b;
			b=c;
		}
		
	}
        return fib;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int sum=0;
	for(int i=0;i<arreglo.length;i++){
		sum=sum+arreglo[i];
	}
        return sum;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        int sum=0;
	int i;
	for(i=0;i<arreglo.length;i++){
		sum=sum+arreglo[i];
	}
	double div = (double)(sum/i);
        return div;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
	int a=arreglo[0];
	for(int i=0; i<arreglo.length;i++){
		if(a<arreglo[i]){
			a=arreglo[i];
		}
	}
        return a;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        int a=arreglo[0];
	for(int i=0; i<arreglo.length;i++){
		if(a>arreglo[i]){
			a=arreglo[i];
		}
	}
        return a;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for(int i=0;i<arreglo.length;i++){
		if(elemento==arreglo[i]){
			return true;
		}
	}
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        
	for(int i=0; i<arreglo.length; i++){
	int t=0;
		for(int j=i+1;j<arreglo.length;j++){
			t=arreglo[i];
			arreglo[i]=arreglo[j];
			arreglo[j]=t;
		}
		
	}
        return arreglo;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        for(int i=0; i<arreglo.length; i++){
	int t=0;
		for(int j=i+1;j<arreglo.length;j++){
			if(arreglo[i]>arreglo[j]){
				t=arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j]=t;
			}
		}
		
	}
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
	int c=0;
	if(arreglo.length==0){
		return arreglo;
	}
	for(int i=0;i<arreglo.length;i++){
		for(int j=i+1;j<arreglo.length;j++){
			if(arreglo[j]==arreglo[i]){
				c++;
				if(c==arreglo.length-1){
					break;
				}
			}
		}
		if(c==arreglo.length-1){
			break;
		}
	}
	
	int[] arr= new int[arreglo.length-c];
	arr[0]=arreglo[0];

	for(int i=1;i<arr.length;i++){
		for(int j=i+1;j<arreglo.length;j++){
			if(arreglo[j]!=arr[i-1]){
				arr[i]=arreglo[j];
				break;
			}
		}
	}

	return arr;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] arr = new int [arreglo1.length+arreglo2.length];
	for(int i=0;i<arr.length;i++){
		if(i<arreglo1.length){
			arr[i]=arreglo1[i];
		}else{
			arr[i]=arreglo2[i-arreglo1.length];
		}
	}
	
        return arr;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        
	if(posiciones<0){
		for(int i=0; i>posiciones;i--){
			for(int j=0;j<arreglo.length-1;j++){
				int k = arreglo[j];
				arreglo[j]=arreglo[j+1];
				arreglo[j+1]=k;
			}
		}
	}else{
		for(int i=0; i<posiciones;i++){
			for(int j=arreglo.length-1;j>0;j--){
				int k = arreglo[j];
				arreglo[j]=arreglo[j-1];
				arreglo[j-1]=k;
			}

		}
	}
        return arreglo;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        String inv = ""; 
	for(int i=0; i<cadena.length();i++){ 
		inv = cadena.charAt(i)+inv; 
	} 
	return inv; 
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        String inv = "";
	for(int i=0; i<cadena.length();i++){ 
		inv = cadena.charAt(i)+inv;
	} 
    String scadena = cadena.replaceAll(" ","");
    String sinv = inv.replaceAll(" ","");
    scadena=scadena.toLowerCase();
    sinv=sinv.toLowerCase();
	if(sinv.equals(scadena)){
		return true;
	}
        return false;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        return cadena.split("\\s").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
		if(correo.contains(" ")){
			return false;
		} else if (!correo.matches("[a-zA-Z0-9@.-]+")) {
			return false;
		}else if(!correo.contains("@")){
			return false;
		}
		return true;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        int sum=0;
		int c=0;
		for(int n : lista){
			sum +=n;
			c++;
		}
		if(c==0){
			return 0.0;
		}
		double div=(double)(sum/c);
        return div;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
		String binario = "";
		if(numero<0){
			while(Math.abs(numero)>0){
				binario = Math.abs(numero % 2) + binario;
				numero=numero/2;
			}
		binario="-"+binario;
		}else if(numero>0){
			while(numero>0){
				binario =(numero % 2) + binario;
				numero=numero/2;
			}
		}else{
			binario = "0";
		}

        return binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
		String hexa = "";
		if(numero<0){
			while(Math.abs(numero)>0){
				if(Math.abs(numero % 16)>10){
					switch (Math.abs(numero % 16)){
						case 10:
							hexa="A" + hexa;
							break;
						case 11:
							hexa="B" + hexa;
							break;
						case 12:
							hexa="C" + hexa;
							break;
						case 13:
							hexa="D" + hexa;
							break;
						case 14:
							hexa="E" + hexa;
							break;
						case 15:
							hexa="F" + hexa;
							break;
					}
				}else{
					hexa= Math.abs(numero % 16) + hexa;
				}
				numero=numero/16;
			}
			hexa="-"+hexa;
		}else if(numero>0){
			while(numero>0){
				if(Math.abs(numero % 16)>10){
					switch (Math.abs(numero % 16)){
						case 10:
							hexa="A" + hexa;
							break;
						case 11:
							hexa="B" + hexa;
							break;
						case 12:
							hexa="C" + hexa;
							break;
						case 13:
							hexa="D" + hexa;
							break;
						case 14:
							hexa="E" + hexa;
							break;
						case 15:
							hexa="F" + hexa;
							break;
					}
				}else{
					hexa= Math.abs(numero % 16) + hexa;
				}
				numero=numero/16;
			}
		}else{
			hexa = "0";
		}
        return hexa;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra
	
	String comp="";
	switch((int)(Math.random()*5+1)){

		case 1:
			comp="Piedra";
			break;
		case 2:
			comp="Papel";
			break;
		case 3:
			comp="Tijera";
			break;
		case 4:
			comp="Lagarto";
			break;
		case 5:
			comp="Spock";
			break;
	}
	if(comp=="Piedra" && (eleccionUsuario=="Piedra" || eleccionUsuario=="Lagarto")){
		return "Perdiste";
	}else if(comp=="Papel" && (eleccionUsuario=="Piedra" || eleccionUsuario=="Spock")){
		return "Perdiste";
	}else if(comp=="Tijera" && (eleccionUsuario=="Papel" || eleccionUsuario=="Lagarto")){
		return "Perdiste";
	}else if(comp=="Lagarto" && (eleccionUsuario=="Papel" || eleccionUsuario=="Spock")){
		return "Perdiste";
	}else if(comp=="Spock" && (eleccionUsuario=="Tijera" || eleccionUsuario=="Piedra")){
		return "Perdiste";
	}else if(comp.equals(eleccionUsuario)){
		return "Empate";
	}else{
		return "Ganaste";
	}
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return 0.0;
    }

    public String zoodiac(int day, int month) {
        return "";
    }


}

