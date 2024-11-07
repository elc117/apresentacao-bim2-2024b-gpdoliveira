public class TestPersonagem{
    public static void main(String[] args){
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem("Robin","Fogo","Corrida",10,150);

        System.out.println("O nome do personagem é " + p1.getNome());
        p1.setNome("Ravena");
        System.out.println("O novo nome é " + p1.getNome());

        System.out.println("A vida do personagem era " + p2.getVida());
        p2.recebeDano();
        System.out.println("A vida do personagem é " + p2.getVida());

        System.out.println("A vida do personagem era " + p1.getVida());
        p1.recebeCura();
        System.out.println("A vida do personagem é " + p1.getVida());
    }
}