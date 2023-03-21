public class Empregado {
    private String nome;
    private int idade;
    private int tipo;
    private double salario, comissao, bonus;

    public double calculaSalario(){
        if (tipo == 1){
            return salario;
        } else if (tipo == 2){
            return salario + salario * comissao;
        } else if (tipo == 3){
            return salario + bonus;
        } else {
            return 0.0;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}

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
        //mostra valores
        System.out.println(e1.calculaSalario());
        System.out.println(e2.calculaSalario());
        System.out.println(e3.calculaSalario());
    }
}
