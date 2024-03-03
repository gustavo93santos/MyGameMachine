# MyGameMachine

### Requisitos Funcionais Revisados:

1. **Objetos e Classes:**
    - **Jogador:** Armazena informações como nome, histórico de jogadas (vitórias, derrotas), e pontuação total.
    - **Jogo:** Controla a lógica do jogo, incluindo receber entradas do jogador, gerar jogadas do computador, calcular resultados, e atualizar o histórico e pontuação do jogador.
    - **Histórico:** Representa o registro de todas as jogadas, incluindo escolhas do jogador e do computador, e o resultado de cada partida.
    - **Ranking:** Mantém uma lista dos jogadores e suas pontuações, ordenada da mais alta para a mais baixa.
   
2. **Cadastro de Novo Jogador:**
   - O jogador pode cadastrar um novo perfil, fornecendo um nome de jogador único.
   - O nome do jogador será usado como identificador de login.

3. **Login:**
   - Após o cadastro, o jogador pode fazer login fornecendo seu nome de jogador.

4. **Validação de Nome de Jogador:**
   - O sistema deve garantir que o nome de jogador fornecido seja único, para evitar conflitos de login.

5. **Persistência de Dados de Jogadores:**
   - Os dados do jogador, incluindo nome, histórico de jogadas e pontuação, devem ser armazenados de forma que persistam entre as sessões de jogo.

6. **Gerenciamento de Histórico de Jogadas:**
    - Após cada jogo, a jogada é registrada no histórico do jogador, incluindo tanto a escolha do jogador quanto a do computador, e o resultado.
    - O jogador pode solicitar para ver seu histórico de jogadas, que será exibido no terminal.

7. **Visualização do Ranking:**
    - O jogador pode visualizar seu ranking atual, que é determinado pelo número de vitórias ou pela pontuação total acumulada.
    - O ranking é atualizado após cada jogo.

8. **Persistência de Dados (Opcional):**
    - Para um avanço futuro, pode-se considerar a persistência dos dados do jogador (histórico e ranking) em um arquivo ou banco de dados, permitindo que os dados sejam mantidos entre as sessões de jogo.

### Requisitos Não Funcionais Revisados:

1. **Modularidade:**
    - O código deve ser bem organizado, com clara separação de responsabilidades entre as classes, facilitando manutenção e futuras expansões.

2. **Desempenho:**
    - O sistema deve manter um bom desempenho, mesmo com o armazenamento e processamento crescentes do histórico de jogadas e atualizações de ranking.

### Requisitos de Interface Revisados:

1. **Menu de Opções:**
    - O menu principal deve ser expandido para incluir a opção de "Cadastro de Jogador".
    - Além das opções de iniciar um novo jogo ou sair, deve haver opções no menu para o jogador visualizar seu histórico de jogadas e seu ranking. 

2. **Fluxo de Cadastro:**
   - Após selecionar a opção de cadastro de jogador, o jogador deve ser solicitado a fornecer um nome de jogador único.

### Requisitos de Desenvolvimento Revisados:


1. **Gerenciamento de Dados de Jogador:**
   - Implementar um sistema para armazenar e gerenciar os dados de jogador, garantindo a unicidade dos nomes de jogador.

2. **Integração com o Sistema de Jogo:**
   - Integrar o sistema de cadastro de jogador com a lógica existente do jogo, permitindo que os jogadores façam login com seus nomes registrados e acessem suas informações pessoais.
3. **Testes:**
    - Implementar testes unitários para as principais funcionalidades do jogo, garantindo que a lógica do jogo e o gerenciamento de dados do jogador funcionem corretamente sob várias condições.

### Exemplo de Funcionamento no Terminal (Revisado):

```plaintext
Bem-vindo ao Jogo Par ou Ímpar!

Menu:
1. Jogar
2. Ver Histórico de Jogadas
3. Cadastro de Jogador
4. Sair

Escolha uma opção: 3

Digite seu nome de jogador: [nome]
Novo jogador [nome] cadastrado com sucesso!

Menu:
1. Jogar
2. Ver Histórico de Jogadas
3. Cadastro de Jogador
4. Sair

Escolha uma opção: 1

[Jogo prossegue como antes, mas agora associado ao jogador logado]

Menu:
1. Jogar
2. Ver Histórico de Jogadas
3. Cadastro de Jogador
4. Sair

Escolha uma opção: 2

[Histórico de jogadas do jogador logado é exibido]

Menu:
1. Jogar
2. Ver Histórico de Jogadas
3. Cadastro de Jogador
4. Sair

Escolha uma opção: 4

Obrigado por jogar. Até a próxima!
```

A adição de orientação a objetos e funcionalidades de histórico e ranking torna o jogo mais interativo e interessante, promovendo uma experiência de usuário enriquecida.