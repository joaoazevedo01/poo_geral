package EX1_2;

public class Professor {

    protected String nome;
    protected String titulação;
    protected double valorHoraAula;
    protected int totalDeAulas;
    
    /*Construtor*/
    public Professor(String nome, String titulação, double valorHoraAula, int totalDeAulas) {
        setNome(nome);
        setTitulação(titulação);
        setValorHoraAula(valorHoraAula);
        setTotalDeAulas(totalDeAulas);
        
        System.out.println("Professor: " + getNome() + " Adicionado com Sucesso!!");
    }
    /*calcula salario mestre, doutor...*/
    public  double calculaSalario(){
        
        double sb,sal,ha,dsr;
        
        sb = ((this.totalDeAulas * 4.5) * this.valorHoraAula);
        if(getTitulação().equals("Mestre")){
            sb = sb + (sb*3)/100;
            ha = ((sb*5)/100);
            dsr = (sb + ha)/6;
            sal = sb + ha + dsr;
            
            return sal;
        }
        else if("Doutor".equals(getTitulação())){
            sb = sb + (sb*8)/100;
            ha = ((sb*5)/100);
            dsr = (sb + ha)/6;
            sal = sb + ha + dsr;
            
           return sal;
        }
        else{
            ha = ((sb*5)/100);
            dsr = (sb + ha)/6;
            sal = sb + ha + dsr;
            
            return sal;
        }
    }
    /**/
    public void ajustaValorHoraAula(double porcentagem){
        if( porcentagem < 0 || porcentagem > 100){
            System.out.println("Opção inválida, Digite um valor entre 0 e 100!!");
        }else{
            double aux;
            aux = this.valorHoraAula + ((this.valorHoraAula * porcentagem)/100);
            setValorHoraAula(aux);
            System.out.println("Valor alterado com Sucesso!");
        }
    }
    /**/
    public String retornaDados(){
        String txt;
        txt = "Professor: " + getNome() + ", Com a titulação: " + getTitulação() + ", Salário: " + calculaSalario();
        return txt;
    }
/*---------------------------acess------------------------------*/
    
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulação() {
        return titulação;
    }

    public void setTitulação(String titulação) {
        this.titulação = titulação;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public int getTotalDeAulas() {
        return totalDeAulas;
    }

    public void setTotalDeAulas(int totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }

}

