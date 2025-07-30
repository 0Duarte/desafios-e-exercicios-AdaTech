public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 59.90, 10);
        Produto p2 = new Produto("Teclado", 129.90);

        p1.exibirResumo();
        System.out.println("---");
        p2.exibirResumo();
        System.out.println("Adicionando 5 ao estoque do teclado...");
        p2.adicionarEstoque(5);
        p2.exibirResumo();
        System.out.println("Vendendo 3 mouses...");
        boolean venda = p1.vender(3);
        System.out.println("Venda realizada? " + venda);
        p1.exibirResumo();
        System.out.println("Tentando vender 20 teclados...");
        boolean venda2 = p2.vender(20);
        System.out.println("Venda realizada? " + venda2);
        p2.exibirResumo();
    }
}