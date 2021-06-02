package two;
//Same as the previous day, all assignments are completed in this one class, to test any simply uncomment them and run
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class DayTwo {

	public static void main(String[] args) {

		//1
//		for(int i=1; i<=10; i++) {
//			System.out.println(i*1 +"\t" +i*2 +"\t"+ i*3 +"\t" +i*4 +"\t" +i*5 +"\t"+ i*6 +"\t" +i*7 +"\t" +i*8 +"\t" +i*9 +"\t" +i*10);
//		}
		//2
//		int n = 10, first = 0, second = 1;
//	    System.out.println("Fibonacci Series till " + n + " terms:");
//
//	    for (int i = 1; i <= n; ++i) {
//	      System.out.print(first + ", ");
//	      int sum = first + second;
//	      first = second;
//	      second = sum;
//	    }
		//3
//		for(char c = 'a'; c <= 'z'; ++c) {
//			System.out.println(c);
//		}
		//4
//		int num = 1234;
//		int reversed = 0;
//	    while(num != 0) {
//	      int temp = num % 10;
//	      reversed = reversed * 10 + temp;
//	      num /= 10;
//	    }
//
//	    System.out.println("Reversed Number: " + reversed);
		//5
//		int num =5;
//		int temp = num;
//		for(int power = 3; power > 1; power--) {
//			num *= temp;
//		}
//		System.out.println(num);
		
		//6
//		double[] arr = {1,2,3,4,5,7};
//		
//		double sum=0;
//		for(int i =0; i < arr.length; i++) {
//			sum+= arr[i];
//		}
//		System.out.println("The average is " + (sum/arr.length));
//		//7
//		int[][] one = {{1,2},{3,4}};
//		int[][] two = {{2,4},{6,8}};
//		int[][] combo = new int[2][2];
//		int sum = 0;
//		for(int i = 0; i < 2; i++ ) {
//			for(int j = 0; j < 2; j++ ) {
//				combo[i][j] = one[i][j] + two[i][j];
//				sum += combo[i][j];
//			}
//		}
//		System.out.println(combo[0][0] + " : " + combo[0][1] +"\n" + combo[1][0] + " : " + combo[1][1]);
//		System.out.println(sum);
		//8
//		  String str;
//		    int vowel=0,cons=0,numbers=0,spaces=0;
//		     Scanner scan=new Scanner(System.in); 
//		        
//		    System.out.println("Enter the String  ");
//		    str=scan.nextLine();
//		    for(int i=0; i<=str.length()-1; i++){
//		    char ch=str.charAt(i);
//		    if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' 
//		        ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
//		            vowel++;
//		        }
//		        else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){  
//		            cons++;
//		        }
//		        else if(ch>='0' && ch<='9') {
//		            numbers++;
//		        }
//		        else if(ch==' '){ // check spaces
//		            spaces++;
//		        }
//		    }
//		    System.out.println("\nVowels: " + vowel + "\nConsonants: " + cons + "\nDigits: " +numbers + "\nSpaces: " + spaces);

		//9
//		int rows=5;
//		 for(int i = 1; i <= rows; ++i){
//		    for(int j = 1; j <= i; ++j){
//		       System.out.print("*");
//		     }
//		   System.out.println();
//		 }
		//10
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input a sentence");
//		String str = s.nextLine();
//		
//		String[] arr = str.split(" ");
//		System.out.println("The amount of words is: " + arr.length);
		
		//11
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input a sentence");
//		String str = s.nextLine();
//		System.out.println("Input a character");
//		char c = s.nextLine().charAt(0);
//		char[] arr = str.toCharArray();
//
//		for(int i=0; i < arr.length; i++) {
//			if(arr[i] == c) {
//				System.out.println("The character " + c + " occurs at index "+ i);
//			}
//		}
		
		//12
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input a sentence");
//		String str = s.nextLine();
//		String newStr = str.replaceAll(" ", "");
//		String[] arr = str.split(" ");
//		System.out.println(newStr);
		//13
//		Compute add = new Add();
//		UseCompute.useCom(add, 1, 2);
//		Compute sub = new Sub();
//		UseCompute.useCom(sub, 1, 2);
//		Compute div = new Div();
//		UseCompute.useCom(div, 1, 2);
//		Compute mult = new Mult();
//		UseCompute.useCom(mult, 1, 2);
		
		//14
//		Cylinder cyl = new Cylinder(1.5,2.5);
//		System.out.println("The area is: " + cyl.area());
//		System.out.println("The volume is: " + cyl.volume());
//		cyl.setColor("Silver");
//		System.out.println("The color is: " + cyl.color);

		//15
//		int first=0,last=0,comma=0;
//		String hello = "Hello, World!";
//		char[] c = hello.toCharArray();
//		
//		for(int i=0; i< c.length; i++) {
//			if(c[i] == 'o') {
//				first = i;
//				break;
//			}
//		}
//		for(int i = c.length-1; i > 0; i--) {
//			if(c[i] == 'o') {
//				last = i;
//				break;
//			}
//		}
//		for(int i=0; i<c.length; i++) {
//			if(c[i] == ',') {
//				comma = i;
//				break;
//			}
//		}
//		System.out.println("The first o appears at index: " + first +"\nThe last o appears at index: " + last + "\nThe comma appears at index: " + comma);
		//16
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input a sentence");
//		String str = s.nextLine();
//		int largestval = 0;
//		String largestLetter = "";
//		int acount, bcount, ccount, dcount,ecount, fcount, gcount, hcount,icount, jcount, kcount, lcount,mcount, ncount, ocount, pcount,qcount, rcount, scount, tcount,ucount, vcount, wcount, xcount,ycount, zcount;
//		str = str.toLowerCase();
//		acount = str.length() - str.replaceAll("a", "").length();
//		str = str.replaceAll("a", "");
//		if(acount > largestval) {
//			largestval = acount;
//			largestLetter = "a";
//		}
//		bcount = str.length() - str.replaceAll("b", "").length();
//		str = str.replaceAll("b", "");
//		if(bcount > largestval) {
//			largestval = bcount;
//			largestLetter = "b";
//		}
//		ccount = str.length() - str.replaceAll("c", "").length();
//		str = str.replaceAll("c", "");
//		if(ccount > largestval) {
//			largestval = ccount;
//			largestLetter = "c";
//		}
//		dcount = str.length() - str.replaceAll("d", "").length();
//		str = str.replaceAll("d", "");
//		if(dcount > largestval) {
//			largestval = dcount;
//			largestLetter = "d";
//		}
//		ecount = str.length() - str.replaceAll("e", "").length();
//		str = str.replaceAll("e", "");
//		if(dcount > largestval) {
//			largestval = ecount;
//			largestLetter = "d";
//		}
//		fcount = str.length() - str.replaceAll("f", "").length();
//		str = str.replaceAll("f", "");
//		if(fcount > largestval) {
//			largestval = fcount;
//			largestLetter = "f";
//		}
//		gcount = str.length() - str.replaceAll("g", "").length();
//		str = str.replaceAll("g", "");
//		if(gcount > largestval) {
//			largestval = gcount;
//			largestLetter = "g";
//		}
//		hcount = str.length() - str.replaceAll("h", "").length();
//		str = str.replaceAll("h", "");
//		if(hcount > largestval) {
//			largestval = hcount;
//			largestLetter = "h";
//		}
//		icount = str.length() - str.replaceAll("i", "").length();
//		str = str.replaceAll("i", "");
//		if(icount > largestval) {
//			largestval = icount;
//			largestLetter = "i";
//		}
//		jcount = str.length() - str.replaceAll("j", "").length();
//		str = str.replaceAll("j", "");
//		if(jcount > largestval) {
//			largestval = jcount;
//			largestLetter = "j";
//		}
//		kcount = str.length() - str.replaceAll("k", "").length();
//		str = str.replaceAll("k", "");
//		if(kcount > largestval) {
//			largestval = kcount;
//			largestLetter = "k";
//		}
//		lcount = str.length() - str.replaceAll("l", "").length();
//		str = str.replaceAll("l", "");
//		if(lcount > largestval) {
//			largestval = lcount;
//			largestLetter = "l";
//		}
//		mcount = str.length() - str.replaceAll("m", "").length();
//		str = str.replaceAll("m", "");
//		if(mcount > largestval) {
//			largestval = mcount;
//			largestLetter = "m";
//		}
//		ncount = str.length() - str.replaceAll("n", "").length();
//		str = str.replaceAll("n", "");
//		if(ncount > largestval) {
//			largestval = ncount;
//			largestLetter = "n";
//		}
//		ocount = str.length() - str.replaceAll("o", "").length();
//		str = str.replaceAll("o", "");
//		if(ocount > largestval) {
//			largestval = ocount;
//			largestLetter = "o";
//		}
//		pcount = str.length() - str.replaceAll("p", "").length();
//		str = str.replaceAll("p", "");
//		if(pcount > largestval) {
//			largestval = pcount;
//			largestLetter = "p";
//		}
//		qcount = str.length() - str.replaceAll("q", "").length();
//		str = str.replaceAll("q", "");
//		if(qcount > largestval) {
//			largestval = qcount;
//			largestLetter = "q";
//		}
//		rcount = str.length() - str.replaceAll("r", "").length();
//		str = str.replaceAll("r", "");
//		if(rcount > largestval) {
//			largestval = rcount;
//			largestLetter = "r";
//		}
//		scount = str.length() - str.replaceAll("s", "").length();
//		str = str.replaceAll("s", "");
//		if(scount > largestval) {
//			largestval = scount;
//			largestLetter = "s";
//		}
//		tcount = str.length() - str.replaceAll("t", "").length();
//		str = str.replaceAll("t", "");
//		if(tcount > largestval) {
//			largestval = tcount;
//			largestLetter = "t";
//		}
//		ucount = str.length() - str.replaceAll("u", "").length();
//		str = str.replaceAll("u", "");
//		if(ucount > largestval) {
//			largestval = ucount;
//			largestLetter = "u";
//		}
//		vcount = str.length() - str.replaceAll("v", "").length();
//		str = str.replaceAll("v", "");
//		if(vcount > largestval) {
//			largestval = vcount;
//			largestLetter = "v";
//		}
//		wcount = str.length() - str.replaceAll("w", "").length();
//		str = str.replaceAll("w", "");
//		if(wcount > largestval) {
//			largestval = wcount;
//			largestLetter = "w";
//		}
//		xcount = str.length() - str.replaceAll("x", "").length();
//		str = str.replaceAll("x", "");
//		if(xcount > largestval) {
//			largestval = xcount;
//			largestLetter = "x";
//		}
//		ycount = str.length() - str.replaceAll("y", "").length();
//		str = str.replaceAll("y", "");
//		if(ycount > largestval) {
//			largestval = ycount;
//			largestLetter = "y";
//		}
//		zcount = str.length() - str.replaceAll("z", "").length();
//		str = str.replaceAll("z", "");
//		if(zcount > largestval) {
//			largestval = zcount;
//			largestLetter = "z";
//		}
//		System.out.println("A:" + acount 
//				+"\nB:" + bcount
//				+"\nC:" + ccount
//				+"\nD:" + dcount
//				+"\nE:" + ecount
//				+"\nF:" + fcount
//				+"\nG:" + gcount
//				+"\nH:" + hcount
//				+"\nI:" + icount
//				+"\nJ:" + jcount
//				+"\nK:" + kcount
//				+"\nL:" + lcount
//				+"\nM:" + mcount
//				+"\nN:" + ncount
//				+"\nO:" + ocount
//				+"\nP:" + pcount
//				+"\nQ:" + qcount
//				+"\nR:" + rcount
//				+"\nS:" + scount
//				+"\nT:" + tcount
//				+"\nU:" + ucount
//				+"\nV:" + vcount
//				+"\nW:" + wcount
//				+"\nX:" + xcount
//				+"\nY:" + ycount
//				+"\nZ:" + zcount
//				
//				);
//		System.out.println("The largest letter is: " + largestLetter + "\nWith a total count of: "+largestval);
		
		
		
		//17
//		Scanner s = new Scanner(System.in);
//		System.out.println("Input a sentence");
//		String str = s.nextLine();
//		
//		char[] c = str.toCharArray();
//		String rev = "";
//		for(int i=0; i< c.length; i++) {
//			rev = rev + c[i];
//		}
//		System.out.println(str);
//		System.out.println(rev);
//		if(rev.equals(str)) {
//			System.out.println("Yep, its a Palindrome");
//		}else {
//			System.out.println("Nope, it's not a Palindrome");
//		}
		//18
//		String str = "This is an umbrella";
//		
//		String[] arr = str.split(" ");
//		
//		int smallestindex = 10;
//		int smallest = 10;
//		int largest = 0;
//		int largestindex = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].toCharArray().length <= smallest) {
//				smallestindex = i;
//				smallest = arr[i].toCharArray().length;
//			}
//			if(arr[i].toCharArray().length >= largest) {
//				largestindex = i;
//				largest = arr[i].toCharArray().length;
//			}
//			
//		}
//		System.out.println("The smallest word is \"" + arr[smallestindex] + "\" excluding multiple words");
//		System.out.println("The smallest word is \"" + arr[largestindex] + "\" excluding multiple words");

		//19
//		String[] friends = {"Gary","John","David","Amanda","Braxton","Elle","Oni","Nate","Matt","Omar"};
//		Arrays.sort(friends);
//		for(int i=0; i<friends.length; i++) {
//			System.out.println(friends[i]);
//		}
		
		//livelab
//		try {
//			int num1 = 0;
//			int num2 = 2/num1;
//			System.out.println(num2);
//			System.out.println("I tried");
//		}catch(ArithmeticException e) {
//			System.out.println("well that killed it");
//		}
	
	}

}
