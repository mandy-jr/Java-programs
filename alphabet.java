import java.util.*;
class alphabet{
	public static void main(String args[]){
	int v=0, c=0, d=0, spa=0, sp=0, n, i;
	String s;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string: ");
	s= sc.nextLine();
	n= s.length();
	char[] str= new char[n];

	str= s.toCharArray();
	for(i=0; i<str.length; i++){
	if((str[i]=='A')||(str[i]=='E')||(str[i]=='I')||(str[i]=='O')||(str[i]=='U')||(str[i]=='a')||(str[i]=='e')||(str[i]=='i')||(str[i]=='o')||(str[i]=='u')){
		v++;
}
	else if(str[i]>='B' && str[i]<='Z' || str[i]>='b' && str[i]<='z'){
		c++;
}
	else if(str[i]==' '){
		spa++;
}	
	else if(str[i]>='0' && str[i]<='9'){
		d++;
}		
	else{
		sp++;
}
}	
System.out.println("vowels: "+ v+"\n consonants: "+ c+"\n spaces: "+ spa+"\n digits: "+ d+ "\n special: "+sp);
}
}