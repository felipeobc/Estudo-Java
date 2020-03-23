public static void main(String[] args) {
    menu();

}

static String[] nomes = new String[10];


public static void menu() {
    Scanner ler = new Scanner(System.in);
    int opcao = 0;
    do {
        System.out.println(" ******Gerenciamento de Lista de Nomes ******");
        System.out.println(" * 1 -> Adicionar um novo nome *");
        System.out.println(" * 2 -> Apresentar os nomes *");
        System.out.println(" * 3 -> Pesquisar um nome *");
        System.out.println(" * 4 -> Remover um nome *");
        System.out.println(" * 0 -> Sair *");
        System.out.println(" ********************************************");
        System.out.print("Informe somente uma das opções acima: ");
        opcao = ler.nextInt();
        Scanner nome;
        switch (opcao) {
            case 1:
                System.out.print("Informe um nome: ");
                nome = new Scanner(System.in);
                if (!cadastro(nome.nextLine())) { // caso o metodo cadastrar retorne false
                    System.out.println("VETOR CHEIO, NÃO PODE SER ADICIONADO OUTRO NOME");
                }
                opcao = 0;
                break;
            case 2:
                apresentar();
                opcao = 0;
                break;
            case 3:
                System.out.print("Informe um nome: ");
                nome = new Scanner(System.in);
                boolean existe = pesquisar(nome.nextLine());
                System.out.println("Resultado: " + existe);
                opcao = 0;
                break;
            case 4:
                System.out.print("Informe um nome: ");
                nome = new Scanner(System.in);
                boolean operacao = apagar(nome.nextLine());
                System.out.println("Resultado: " + operacao);
                opcao = 0;
                break;
            case 0:
                System.out.println("****** FIM DO PROGRAMA ******");
                System.exit(0);
            default:
                System.out.print(" Essa não é uma opcao Válida ");
                break;
        }
    } while (true);
}

public static boolean cadastro(String nome) {
    boolean operacao = false;
    for (int i = 0; i < nomes.length; i++) {
        if (nomes[i] == null) { // verifica se é diferente de vazio, provavelmente vc n precisa desta linha
            nomes[i] = nome;
            operacao = true;
            break;
        }
    }
    return operacao;
}

public static void apresentar() {
    for (int i = 0; i < nomes.length; i++) {
        if (nomes[i] != null) { // verifica se é diferente de vazio, provavelmente vc n precisa desta linha
            System.out.println(i + 1 + ": " + nomes[i] + "");
        }
    }
}

public static boolean pesquisar(String nome) {
    for (int i = 0; i < nomes.length; i++) {
        if (nome.equals(nomes[i])) {
            return true;
        }
    }
    return false;
}

public static boolean apagar(String nome) {
    boolean resultado = false;
    if (pesquisar(nome)) { // utilizará da metodo pesquisar parasaber se o nome existe
        for (int i = 0; i < nomes.length; i++) {
            if (nome.equals(nomes[i])) {
                nomes[i]=null;
                return true;
            }
        }
    }else{
        System.out.println("Este nome não esta na lista");
    }
    return resultado;
}