
public class Main7 {

	public static void main(String[] args) {
		int nr1;
		int nr2;
		int result;
		nr1 = 7;
		nr2 = 4;
		result = nr1 + nr2;
		System.out.println(result);
		nr1 = 10;
		nr2 = 4;
		result = nr1 + nr2;
		System.out.println(result);
		/* Wynik jest inny ponieważ zmodyfikowaliśmy wartość zmiennej nr1 poprez ponowne przypisanie (operator przypisania)
		 Zmienna została już utworzona,ale została wstawiona inna wartość.  */
	}

}
