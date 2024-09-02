package Jclasse;
public class Aula08 {
    public static void main (){
        OpeTern();
        String();
   }     

public static void String(){
    String nome1 = "Gustavo";
    String nome2 = "Gustavo";
    String Nome3 = new String("Gustavo");
    String res;
    res = (nome1.equals(Nome3)) ? "igual": "diferente";
    
    System.out.println(res);

}
public static void OpeTern(){
        int n1 = 4;
        int n2 = 8;
        int r = (n1>n2) ? n1+n2 : n1+n2;
        System.out.println(r);
}
}
