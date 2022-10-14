//Q.1 write a java program to find the value of specified expression.
// a) (101 + 0)/3
// b)3.0e-6*10000000.1
// c)true&&true
// d)false&&true
// e)((false&&false) ||(true&&true))
// f)((false||false) && (true&&true))
package JavaProgram;

public class FindSpecifiedExpression {

	public static void main(String[] args) {
		int a = 102,b = 54,x = 3;
		double c = 30.6,d = 174.5;
		boolean d1 = true,d2 = true;
		boolean e1 = false,e2 = true;
		boolean f1 = false,f2 = false,f3 =true,f4 = true;
		boolean g1 = false,g2 = false,g3 = true,g4 = true;
		// output the specified expression
		System.out.println("("+a+"+"+b+")/"+x+" = "+((a+b)/x));//Exp
		System.out.println(c+"*"+d+"="+(c*d));//Exp
		System.out.println(d1+"&&"+d2+"="+(d1&&d2));//Exp
    	        System.out.println(e1+"&&"+e2+"="+(e1&&e2));//Exp
		System.out.println("(("+f1+"&&"+f2+") || ("+f3+"&&"+f4+")) = "+((f1&&f2)||(f3&&f4)));//Exp
		System.out.println("(("+g1+"||"+g2+") && ("+g3+"||"+g4+")) = "+((g1||g2)&&(g3||g4)));//Exp

	}

}