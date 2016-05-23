package mbank.szczepan;

 

 class A {
	 void helloA(){
		 System.out.println("Method hello22 in class AA");
	 }
	 void sing(){
		 System.out.println("sisis A");
	 }
 }
 class B extends A{
	 void helloB(){
		 System.out.println("Method hello33 in class BB");
	 }
	 void sing(){
		 System.out.println("sisis B");
	 }
 }
 
 class C extends A{
	 void helloC(){
		  
		 System.out.println("Method helloCC in class CC");
	 }
	 void sing(){
		 System.out.println("sisis CC");
	 }
 }
public class Main1  {
 
	
	class Hello{
		void helloH(){
			System.out.println("Hello in class Hello");
		}
	}
	enum Season {WINTER, SPRING, SUMMER, FALL}
	
 
	public static void main(String[] args)  {
		
		A a = new A(); 
		B b = new B(); 
		C c = new C(); 
        
	 
		
        
	}
 
}

/*		int bin = 0b101; 
int hex = 0xFF; 
int octal = 077; 
long phone = 502_200_110L; */
/*		
String d1 = "2000-01-05"; 
String d = DateFormat.getDateInstance().format(new Date(1900,1,1)); 
System.out.println(d1);
System.out.println(d);
*/
