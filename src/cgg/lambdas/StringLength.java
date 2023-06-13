package cgg.lambdas;

public class StringLength {

	public static void main(String[] args) {

		LengthOfString ls = str-> System.out.println("Lenght of given String is : "+str.length());
		
		ls.length("Rajashekar");
	}

}