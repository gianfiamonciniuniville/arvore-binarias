public class PesquisaBinaria {
    No raiz;

    public PesquisaBinaria() {
        raiz = null;
    }

    public void Inserir(int valor) {
        raiz = InserirRecursivamente(raiz, valor);
    }

    private No InserirRecursivamente(No atual, int valor) {
        if (atual == null)
            return new No(valor);

        if (valor < atual.valor) {
            atual.esquerdo = InserirRecursivamente(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = InserirRecursivamente(atual.direito, valor);
        }
        return atual;
    }

    public void Deletar(int valor) {
        raiz = DeletarRecursivamente(raiz, valor);
    }

    private No DeletarRecursivamente(No atual, int valor) {
        if (atual == null) {
            return null;
        }

        if (valor < atual.valor) {
            atual.esquerdo = DeletarRecursivamente(atual.esquerdo, valor);
        } else if (valor > atual.valor) {
            atual.direito = DeletarRecursivamente(atual.direito, valor);
        } else {
            if (atual.esquerdo == null)
                return atual.direito;
            if (atual.direito == null)
                return atual.esquerdo;

            atual.valor = EncontrarMenorValor(atual.esquerdo);
            atual.direito = DeletarRecursivamente(atual.direito, atual.valor);
        }
        return atual;
    }

    private int EncontrarMenorValor(No raiz) {
        return raiz.esquerdo == null ? raiz.valor : EncontrarMenorValor(raiz.esquerdo);
    }

    public void TravessiaEmOrdemRecuservamente(No no) {
        System.out.print("TravessiaEmOrdem --> ");
        if (no != null) {
            TravessiaEmOrdemRecuservamente(no.esquerdo);
            System.out.print(no.valor + " ");
            TravessiaEmOrdemRecuservamente(no.direito);
        }
    }

    public void TravessiaPreOrdemRecursivamente(No no) {
        System.out.print("TravessiaPreOrdem --> ");
        if (no != null) {
            System.out.print(no.valor + " ");
            TravessiaPreOrdemRecursivamente(no.esquerdo);
            TravessiaPreOrdemRecursivamente(no.direito);
        }
    }

    public void TravessiaPosOrdemRecursivamente(No no) {
        System.out.print("TravessiaPosOrdem --> ");
        if (no != null) {
            TravessiaPosOrdemRecursivamente(no.esquerdo);
            TravessiaPosOrdemRecursivamente(no.direito);
            System.out.print(no.valor + " ");
        }
    }
}