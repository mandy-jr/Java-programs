class tab5 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++){
			System.out.println(i*5);
		}
	}
}
class tab7 implements Runnable{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(i*7);
		}
	}
}

class tab13 extends Thread{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println(i*13);
		}
	}
}
class multithreading{
	public static void main(String args[]){
		tab5 t5=new tab5();
		tab7 t7=new tab7();
		tab13 t13=new tab13();
		Thread t= new Thread(t7);
		t5.start();
		t.start();
		t13.start();
		
	}
}