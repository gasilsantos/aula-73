package lambdas;

interface Calculator{

    //método abstrato
    int calc(int a, int b);

    default int minus(int a, int b){
        return a - b;
    }
}

public class Lambda02 {
    
    public static void main(String[] args) {
        
    //parametros:(a,b)
    //corpo da função(a+b)
    Calculator sum = (a,b) -> a+b;
    Calculator plus = (a,b) -> a*b;
    Calculator min = (a,b) -> a-b;

    //atribuindo a variavel
    int result = min.minus(4,8);
    System.out.println(result);

    System.out.println("Soma:" + sum.calc(4,5));
    System.out.println("Multiplicação:" + plus.calc(4,5));
    System.out.println("Subtração:" + min.minus(4,5));

    }
}
