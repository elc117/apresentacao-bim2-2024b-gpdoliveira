# Classes em Java

# Atividade
  - Criar uma classe com atributos, construtores, get, set e métodos próprios.
  - Testar a classe criada e instanciar objetos, chamando os métodos implementados.

# Classe Personagem
  - Baseada em jogos onde existem personagens, que seriam de uma mesma classe, mas que se diferenciam por seus atributos, como nome, nível e habilidades. Desta forma, cada personagem com sua individualidade seria um objeto.
  - Métodos de receber dano e cura simulam um jogo onde há combate entre times de jogadores, como Valorant, Fortnite e outros jogos de tiro em equipe.

# Código de Personagem
  - Criar a definir a classe Personagem com os atributos nome, habilidade 1, habilidade 2, nível e vida.
  - Estabelecer construtores:
      - O primeiro define atributos default para criar um Personagem sem definir parâmetros.
      - O segundo recebe os atributos a serem colocados no novo Personagem para criar um objeto personalizado.
  - Os métodos simulam a alternância da vida de um Personagem em combate, o Personagem pode receber 20 de dano ou ser curado em 30 de vida.
  - Get e Set: foram criados manualmente os métodos Get e Set para cada atributo. O método Get retorna o valor do atributo e o método Set alltera o valor do atributo.

# Código de TestPersonagem
  - Criar uma função main.
  - Instanciar dois Personagens: Robin e um default.
  - Altera o nome do p1 para "Ravena".
  - Causa dano ao personagem 1.
  - Cura o personagem 2.

# Executando o código
  - Para executar o código, segui os passos do material da professora, primeiro compilar o arquivo utilizando javac Personagem.java e javac TestPersonagem.java, e depois executar o código de teste utilizando java TestPersonagem.

# Considerações
  - Encontrei várias semelhanças entre Java e C ao pesquisar algummas partes do código, como a parte de condições com if.
  - Utilizar IDEs com geradores de Getters e Setters pode ser útil ao definir Gets e Sets mais rapidamente.
  - Levei um tempo para entender como funcionavam as chamadas e os retornos das funções com relação aos métodos. As demais chamadas foram bem parecidas com C.
  - Tudo no Java são classes (prints, strings, etc.).
