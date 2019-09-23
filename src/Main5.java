
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a);
		/* Wartość 1 zostanie zwiększona przed wykonaniem wszystkich innych operacji w tej linii kodu.
		 Najpierw aktualna wartość zmiennej (czyli 1) zostanie zwiększona o jeden, przyjmując wartość 2,
		 a następnie wyświetlona */
		System.out.println(a++);
		/* Wartość zmiennej 2 jest najpierw używana w wyrażeniu, następnie zwiększana o 1,
		tutaj jeszcze nie wyświetlamy wyniku 3, dlatego pojawia się wartość 2. */
		System.out.println(a);
		// Wyświetli 3.
		b=a++;
		// Obecna wartość 3 jest powiększona o 1, ale nie wyświetlana.
		System.out.println(b);
		/* wyświetlana jest  wartość 3, ponieważ najpierw w tym przypadku postinkrementacji
		  wartość a jest przypisywana do b, dopiero potem a jest zwiększane o 1 */
		b=++a;
		// Wartość 4 powiększona jest o 1 czyli 5
		System.out.println(++a);
		//Wyświetli 6 czyli 5 + 1;
	}

}
