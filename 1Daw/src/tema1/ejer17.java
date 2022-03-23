package tema1;

public class ejer17 {
	public static void main(String[] args) {
		
		int a,b,c,d,e;
		
		
		a=(int)(Math.random()*49+1);
		
		System.out.println(a);
		
		b=(int)(Math.random()*100+1);
		if(b%2==0) {
			System.out.println(b);
		}
		else
		{
			System.out.println(b+1);
		}
		
		c=(int)(Math.random()*10+1);
		System.out.println(c);
		
		
		d=(int)(Math.random()*(-100+1)-50);
		System.out.println(d);
		
		e=(int)(Math.random()*(200+1)-100);
		System.out.println(e);
		
		
	}

}
