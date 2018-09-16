import java.util.*;
class matrix
{
void add(int[][] a, int[][] b, int m, int n){
	int i, j;
	int[][] c= new int[m][n];
	for(i=0; i<= m-1; i++){
		for(j=0; j<=n-1; j++){
                    c[i][j]= a[i][j]+ b[i][j];
}
}
display(c, m, n); 
}
void transpose(int[][] a, int m, int n){
	int i, j;
	int[][] trans= new int[n][m];
	for(i=0; i<=m-1; i++){
		for(j=0; j<=n-1; j++){
			trans[i][j]= a[j][i];
}
}
display(trans, m, n);
}
void multiply(int[][] a, int[][] b, int m, int n, int p){
	int i, j, k;
	int[][] c= new int[m][p];
	for(i=0; i<=m-1; i++){
		for(j=0; j<=p-1; j++){
			c[i][j]=0;
			for(k=0; k<=n-1; k++){
				c[i][j]= c[i][j]+a[i][k]*b[k][j];
							}
						}
				}
display(c, m, p);
}
void accept(int[][] a, int m, int n){
	int i, j;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the matrix: ");
	for(i=0; i<=m-1; i++){
		for(j=0; j<=n-1; j++){
			a[i][j]= sc.nextInt();
}
}
}
void display(int[][] a, int m, int n){
	int i, j;
	System.out.println("The matrix is: ");
	for(i=0; i<=m-1; i++){
		for(j=0; j<=n-1; j++){
			System.out.print(a[i][j]+"\t");
}
        System.out.println();
}
}
public static void main(String args[]){
	matrix mx= new matrix();
	Scanner sc= new Scanner(System.in);
	int m, n, p, choice;

	System.out.println("enter the value of m, n, p");
	m= sc.nextInt();
	n= sc.nextInt();
	p= sc.nextInt();

        int[][] a= new int[m][n];
		int[][] b= new int[m][n];
        int[][] c= new int[m][p];

	mx.accept(a, m, n);
	mx.accept(b, m, n);
	mx.accept(c, m, p);

	mx.display(a, m, n);
	mx.display(b, m, n);
	mx.display(c, m, p);

       do{
	 System.out.println("What to do with array: 1.add 2.transpose 3.multiply");
	 choice= sc.nextInt();
	 switch(choice){
		case 1: mx.add(a, b, m, n);
			break;
		case 2: mx.transpose(b, m, n);
			break;
		case 3: mx.multiply(a, c, m, n, p);
			break;
}
}while(choice!=4);
}
}