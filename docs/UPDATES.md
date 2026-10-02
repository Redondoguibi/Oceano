# Oceano — Estrutura de Updates

Oceano está planejado como uma série de **3 updates temáticos de conteúdo**.

## Filosofia

Cada update introduz um conjunto coerente de biomas oceânicos e o conteúdo que pertence a esse tema.

O foco dos updates é semelhante ao modelo de grandes mods que expandem o jogo por "pacotes" de conteúdo temático. No caso do Oceano, o eixo principal são **biomas e ecossistemas oceânicos**, em vez de coleções de bosses.

## Estrutura esperada de cada update

Cada update pode conter:

- um ou mais biomas oceânicos;
- ambientação própria;
- estruturas e pontos de interesse;
- criaturas;
- recursos;
- loot;
- itens e equipamentos;
- mecânicas específicas;
- eventos;
- possíveis bosses associados ao tema.

## Relação entre updates

- Os updates não são, por definição, capítulos lineares.
- Eles podem coexistir no mesmo mundo.
- A progressão entre eles ainda será definida.
- Sistemas centrais devem ser compartilháveis e extensíveis.
- Conteúdo específico deve permanecer modular.

## Convenção de criaturas "temáticas"

Quando uma criatura é descrita como **temática**, significa que ela é uma criação original do mod inspirada na função ou arquétipo de um animal, mas não pretende ser uma reprodução de uma espécie real.

## Update 1 — Lançamento / Abyssal Ocean

**Nome:** ainda sem nome específico; corresponde ao lançamento inicial do mod.

**Tema central:** cristais abissais.

**Bioma principal:** `Abyssal Ocean`.

**Identidade:** oceano raro e muito profundo, marcado por paredes verticais moderadas e por pequenos aglomerados de cristais abissais roxos crescendo no fundo.

### Entrada no bioma

- O `Abyssal Ocean` não começa diretamente na superfície.
- O jogador pode encontrar a região na superfície, mas precisa descer até uma profundidade/coordenada específica para realmente entrar no bioma.
- O acesso prolongado depende do item **Abyssal Catalyst**.
- Sem o Abyssal Catalyst, o jogador pode permanecer no bioma por aproximadamente **1 minuto contínuo**.
- Aos **30 segundos**, o jogador recebe o efeito de **Náusea** como aviso/penalidade intermediária.
- Ao entrar no bioma, deve ser registrado o último local válido onde o jogador estava antes da entrada.
- Se o minuto se esgotar, o jogador é simplesmente teleportado de volta para esse local registrado.
- Não há efeito adicional especial no teleporte.
- Se o jogador sair do bioma antes do tempo acabar, o contador é resetado.
- Ao entrar novamente sem Catalyst, um novo período de 1 minuto começa do zero.

### Geração e terreno

- O chão/fundo do bioma é formado principalmente por **Pedra Abissal**.
- A Pedra Abissal possui pelo menos uma variante confirmada: **Tijolos de Pedra Abissal**.
- O `Abyssal Ocean` substitui o oceano profundo atual em parte da geração.
- É raro.
- O fundo deve chegar aproximadamente à camada Y=0.
- O relevo inclui paredes verticais, mas sem escala gigantesca; a referência de sensação é algo semelhante a Alex's Caves, porém mais contido.

### Cristais abissais

- São blocos que geram em pequenos formatos/aglomerações de cristal no chão.
- Podem ser minerados com ferramenta de nível diamante.
- Cada aglomerado contém um `magic_abyssal_crystal` em seu interior.
- O `magic_abyssal_crystal` é mais útil/importante do que os blocos comuns do aglomerado.
- Haverá também cristais personalizados raros gigantes.
  - Mantêm a mesma linguagem estrutural dos cristais comuns, mas em escala grande.
  - Servem principalmente para variedade visual e decoração, evitando repetição excessiva do ambiente.

### Abyssal Catalyst

- Item obrigatório para permanecer no Abyssal Ocean por longos períodos.
- É um item **permanente**: não perde durabilidade nem carga pelo uso.
- Basta o item existir em qualquer slot do inventário do jogador; não precisa estar equipado nem segurado.
- Sua receita exige:
  - cristais abissais comuns;
  - **1 `magic_abyssal_crystal`**.
- Até agora, esta é a única utilidade totalmente definida para o `magic_abyssal_crystal`.

### Criaturas e boss

- **Peixe abissal genérico:** fauna básica do bioma.
- **Leviathan:** boss principal associado ao Abyssal Ocean.
  - Possui bastante design já planejado.
  - Será detalhado separadamente em uma etapa própria da conversa.

### Estrutura: navio naufragado personalizado

- Estrutura inspirada no conceito do naufrágio vanilla, mas visualmente e estruturalmente própria.
- Pode conter um mapa especial.
- Esse mapa conduz o jogador até o **Leviathan**.
- Portanto, o navio funciona também como elo entre exploração ambiental e progressão para o boss.

### Água, névoa e visibilidade

- A cor da água não muda conforme o jogador desce.
- A densidade visual da água/névoa subaquática aumenta com a profundidade.
- Consequentemente, a visibilidade diminui progressivamente durante a descida.
- A identidade visual do bioma deve vir da profundidade, densidade, iluminação e elementos abissais, e não de uma troca brusca de cor da água.

### Progressão inicial

- A primeira incursão no Abyssal Ocean deve acontecer **sem** o Abyssal Catalyst.
- O jogador tem até aproximadamente 1 minuto para:
  - minerar cristais abissais comuns;
  - encontrar o `magic_abyssal_crystal` dentro de um aglomerado.
- Com esses materiais, o jogador fabrica o Abyssal Catalyst.
- Depois disso, passa a poder permanecer no bioma livremente.
- Esse é o primeiro pequeno desafio/progresso natural do Abyssal Ocean.

### Perigo

- O bioma não é concebido em torno de uma grande ameaça ambiental ou criatura dominante durante a exploração comum.
- Mistério e exploração são mais importantes do que transformar o local em uma zona de perigo extremo.
- A principal limitação sistêmica é a permanência temporária sem o Abyssal Catalyst.

### Ainda em aberto

- Paleta completa do fundo e da água.
- Aparência exata do peixe abissal.
- Loot do navio.
- Mecânicas e arena do Leviathan.
- Outras utilidades dos cristais.
- Forma exata do mapa do Leviathan.
- Regras precisas de retorno após 1 minuto sem Catalyst.

## Update 2 — Kelp Forest

**Nome:** `Kelp Forest`.

**Tema central:** floresta de algas.

**Bioma principal:** floresta de algas.

**Identidade:** uma região oceânica extremamente densa, formada pelas próprias algas vanilla crescendo do fundo até próximo da superfície e tornando a visão e o deslocamento mais difíceis.

### Vegetação e navegação

- Usa as algas vanilla do Minecraft.
- As algas se estendem do fundo até a camada superficial da água.
- O bioma é muito denso e difícil de enxergar por dentro.
- É possível atravessá-lo normalmente.
- O mod altera o comportamento das algas nesse contexto: contato com elas desacelera o jogador.
- A desaceleração lembra uma teia como conceito, mas deve ser consideravelmente menos intensa.

### Estruturas

- O foco principal são ruínas próprias do mod.
- Elas são próximas das ruínas submarinas vanilla em conceito e escala.
- Têm mais algas e maior presença de blocos como pedregulho com musgo e materiais semelhantes.
- A intenção não é reinventar completamente o conceito das ruínas, mas dar a elas uma identidade própria coerente com a Kelp Forest.

### Criaturas planejadas

- **Caranguejo temático**
  - Vive no fundo do bioma.
  - Locomoção inspirada no comportamento visual/movimento dos mobs do mod Nyl's Spiders.
  - Não escala paredes.
  - A referência principal é o jeito de andar, não o comportamento completo de aranha.

- **Piranha elétrica**
  - Peixe de tamanho médio.
  - Hostil ao jogador.
  - Possui uma aura elétrica ao redor do corpo.
  - Aproximar-se dela causa dano elétrico.
  - Também ataca com mordida.
  - O dano total pode resultar da combinação entre mordida e eletricidade.
  - Integração planejada com Iron's Spells 'n Spellbooks:
    - a aura elétrica pode ser coletada com uma garrafa;
    - isso gera uma garrafa elétrica compatível/relacionada ao mod.

- **Tubarão temático**
  - Modelo original e visualmente trabalhado.
  - Criatura personalizada, não reprodução de uma espécie real.
  - IA inicialmente pensada como comportamento aquático relativamente genérico.

- **Kraken**
  - Planejado para o mod.
  - A decisão de pertencimento ao Update 2 ou 3 ainda está aberta.

### Ainda em aberto

- Aparência final dos mobs.
- Spawn e raridade de cada criatura.
- Loot das ruínas.
- Recursos e crafting.
- Detalhes técnicos da integração com Iron's Spellbooks.
- Destino definitivo do Kraken.

## Update 3 — Navegação, clima e ilhas

**Nome:** ainda não definido.

**Tema central:** amplo; focado em tornar as navegações muito mais ricas, variáveis e imprevisíveis.

**Bioma principal:** nenhum bioma novo definido como eixo do update.

**Identidade:** um sistema global de acontecimentos marítimos, clima e ilhas que reage ao contexto da navegação.

### Regras dos eventos

- Eventos podem ocorrer em qualquer oceano, inclusive oceanos vanilla.
- A ocorrência não é puramente aleatória; existem regras e condições.
- Exemplos já confirmados de condições:
  - tempo que o jogador permanece no oceano;
  - distância até a superfície/terra firme mais próxima;
  - outras regras ainda a definir.

### Eventos já planejados

- **Tempestades personalizadas**
  - Afetam fortemente o gameplay, não apenas a aparência.
  - Alteram probabilidades de mobs, ilhas e outros eventos.

- **Momentos de escuridão**
  - Visualmente semelhantes ao efeito `Darkness` do Minecraft.
  - Sem a pulsação característica do efeito vanilla.

- **Kraken**
  - Evento/criatura marítima com maior chance de aparecer durante tempestades.
  - Ainda não está decidido se pertence definitivamente ao Update 2 ou 3.

- **Ilhas**
  - A própria aparição de ilhas faz parte da dinâmica de exploração do update.

- **Infestações de peixes**
  - Grandes ocorrências de peixes durante a navegação.
  - O tipo de peixe pode variar de acordo com o bioma.
  - Há integração planejada com o mod **Aquaculture**.

### Ilhas

As ilhas possuem uma classificação interna que o jogador não precisa conhecer explicitamente. Ele pode aprender padrões apenas por observação e experiência.

Tipos já definidos:

- ilha pequena sem conteúdo especial;
- ilha pequena com baú;
- ilha média sem conteúdo especial;
- ilha média com baú;
- ilha grande com baú;
- **Ilha da Miragem**.

### Ilha da Miragem

- Ilha de tamanho enorme.
- Possui baús.
- É temporária.
- Desaparece após aproximadamente **15 minutos**.
- É, até agora, a ilha confirmada que não permanece no mundo.

### Persistência

- A maioria das ilhas permanece depois de ser gerada.
- A Ilha da Miragem é uma exceção confirmada.
- As ilhas são pensadas como estruturas geradas durante a exploração do mundo/oceano.

### Ainda em aberto

- Catálogo completo de eventos.
- Regras exatas de ativação.
- Efeitos mecânicos completos das tempestades.
- Conteúdo exato de cada categoria de ilha.
- Como a Ilha da Miragem desaparece tecnicamente e o que acontece com jogadores/blocos nela.
- Persistência e sincronização multiplayer.
- Interação com barcos e outros meios de navegação.

## Roteiro de extração

Para cada update, documentar:

1. Nome oficial ou nome provisório.
2. Tema central.
3. Biomas incluídos.
4. Identidade de cada bioma.
5. Estruturas e pontos de interesse.
6. Criaturas e mobs.
7. Bosses, se houver.
8. Recursos e blocos.
9. Itens, equipamentos e loot.
10. Mecânicas exclusivas.
11. Como o jogador encontra ou acessa esse conteúdo.
12. Relação com os outros updates.
13. O que torna o update único dentro do mod.
14. O que é obrigatório para a primeira implementação e o que pode ficar para depois.
