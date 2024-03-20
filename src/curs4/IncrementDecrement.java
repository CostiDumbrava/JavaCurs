package curs4;

/*
 * operator unar -> un operand >> numar++
 * operatori binari -> doi operanzi >> numar1 + numar2
 * operatoprul ternar (operator conditional) -> trei operanzi 
 */

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//num++  --> POST increment 
		//++num  --> PRE increment
		//num--  --> POST decrement
		//--num  --> PRE decrement
		
		//num++ == num = num +1  ==  num += 1    (+= --> operator compus)
		//++num 
		
		int num= 10;
			
		System.out.println("Numar :" + num);
		System.out.println("Numar POST increment :" + num++);  //POST increment inseamna ca face incrementul dupa executia liniei
		System.out.println("Numar :" + num);
		System.out.println("==================");
		
		int num2= 10;
		System.out.println("Numar :" + num2);
		System.out.println("Numar PRE increment :" + ++num2);
		System.out.println("Numar :" + num2);
	}

}
