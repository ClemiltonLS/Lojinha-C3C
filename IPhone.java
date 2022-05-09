public class IPhone implements Fone {

    @Override
    public void definirProcessador() {
        System.out.println("Processador: M1");        
    }

    @Override
    public void definirArmazenamento() {
        System.out.println("Armazenamento: 128GB");
        
    }

    @Override
    public void definirSO() {
        System.out.println("Sistema iOS");
        
    }
    
}
