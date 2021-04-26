package pl.coderslab.ckontrolaprzeplywu;

public class Main06 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=0; i<=n; i++){
			String even = " - parzysta";
			String noteven = " - nieparzysta";
			System.out.print(i);
			if (i%2==0){
				System.out.println(even);
			} else {
				System.out.println(noteven);
			}
		}

		int i = 0;
		while(i<=n){
			String even = " - parzysta";
			String noteven = " - nieparzysta";
			String result = (i%2==0) ? even : noteven;
			System.out.println(i + result);
			i++;
		}

	}

}
