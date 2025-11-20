public class Main {
    public static void main(String[] args) {
        var pesquisaBinaria = new PesquisaBinaria();
        pesquisaBinaria.Inserir(50);
        pesquisaBinaria.Inserir(30);
        pesquisaBinaria.Inserir(70);
        pesquisaBinaria.Inserir(20);
        pesquisaBinaria.Inserir(40);
        pesquisaBinaria.Inserir(60);
        pesquisaBinaria.Inserir(80);
        pesquisaBinaria.Inserir(75);
        pesquisaBinaria.TravessiaEmOrdemRecuservamente(pesquisaBinaria.raiz);
        System.out.println();
        pesquisaBinaria.TravessiaPreOrdemRecursivamente(pesquisaBinaria.raiz);
        System.out.println();
        pesquisaBinaria.TravessiaPosOrdemRecursivamente(pesquisaBinaria.raiz);
        System.out.println();
        System.out.println("Removendo 20 Folha");
        pesquisaBinaria.Deletar(20);
        pesquisaBinaria.TravessiaEmOrdemRecuservamente(pesquisaBinaria.raiz);
        System.out.println();
        System.out.println("Removendo 80 No com 1 filho - 75");
        pesquisaBinaria.Deletar(80);
        pesquisaBinaria.TravessiaEmOrdemRecuservamente(pesquisaBinaria.raiz);
        System.out.println();
        System.out.println("Removendo 70 No com 2 filhos - 60 e 75");
        pesquisaBinaria.Deletar(70);
        pesquisaBinaria.TravessiaEmOrdemRecuservamente(pesquisaBinaria.raiz);
        System.out.println();
    }
}