import java.util.Arrays;
import java.util.List;

public class TesteEmpregado {
    public static void main(String[] args){
        Empregado e1 = new Empregado();
        Empregado e2 = new Empregado();
        Empregado e3 = new Empregado();
        //configurando tipo dos empregados
        e1.setTipo(1);
        e2.setTipo(2);
        e3.setTipo(3);
        //configurando alguns valores
        e1.setSalario(2000);
        e2.setSalario(1700);
        e2.setComissao(0.2); //20% de comissão
        e3.setSalario(1500);
        e3.setBonus(400);
        //adicionando todo mundo em uma lista
        List <Empregado> emps = Arrays.asList(e1, e2, e3);
        //mostra valores
        // System.out.println(e1.calculaSalario());
        // System.out.println(e2.calculaSalario());
        // System.out.println(e3.calculaSalario());
        for (Empregado e: emps){
            System.out.println(e.calculaSalario());
        }
    }
}
