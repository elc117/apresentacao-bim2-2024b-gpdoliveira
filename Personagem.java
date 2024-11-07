class Personagem {
    //Atributos de todo objeto da classe Personagem
    private String nome;
    private String habilidade1;
    private String habilidade2;
    private int nivel;
    private int vida;

    //Construtor default de um Personagem
    public Personagem() {
      nome = habilidade1 = habilidade2 = "Default";
      nivel = 0;
      vida = 100;
    };

    //Construtor de um Personagem com parâmetros
    public Personagem(String nome, String habilidade1, String habilidade2, int nivel, int vida) {
      this.nome = nome;
      this.habilidade1 = habilidade1;
      this.habilidade2 = habilidade2;
      this.nivel = nivel;
      this.vida = vida;
    }

    //Método que diminui a vida do Personagem
    public void recebeDano(){
      if (vida>20){
        vida = vida-20;
      } else {
        vida = 0;
      }
    }

    //Método que aumenta a vida do Personagem
    public void recebeCura(){
      vida = vida+30;
    }
    
    //get de Nome
    public String getNome(){
      return nome;
    }
    //set de Nome
    public void setNome(String nome) {
      this.nome = nome;
    }

    //get de H1
    public String getH1(){
      return habilidade1;
    }
    //set de H1
    public void setH1(String habilidade1) {
      this.habilidade1 = habilidade1;
    }

    //get de H2
    public String getH2(){
      return habilidade2;
    }
    //set de H2
    public void setH2(String habilidade2) {
      this.habilidade2 = habilidade2;
    }

    //get de Nível
    public int getNivel(){
      return nivel;
    }
    //set de Nível
    public void setNivel(int nivel) {
      this.nivel = nivel;
    }

    //get de Vida
    public int getVida(){
      return vida;
    }
    //set de Vida
    public void setVida(int vida) {
      this.vida = vida;
    }
  }