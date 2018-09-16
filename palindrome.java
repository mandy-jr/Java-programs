import java.util.*;
class palindrome{
	public static void main(String args[]){
		String s, rev;
		int i, n;
		boolean flag=true;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string:");
	s= sc.nextLine();
	n= s.length();
		
	char[] str= new char[n];
	char[] Rev= new char[n];
	str= s.toCharArray();
	for(i=0; i<str.length; i++){
		Rev[i]= str[n-i-1];
}
	for(i=0; i<=n-1; i++){
		if(Rev[i] != str[i]){
			flag=false;
			break;
}
}
	if(flag==true){
		System.out.println("String is palindrome");
}
	else{
		System.out.println("String not palindrome");
}
}
}