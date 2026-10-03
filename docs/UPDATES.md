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
- Cada aglomerado contém **exatamente 1** `magic_abyssal_crystal` em seu interior.
- O `magic_abyssal_crystal` é mais útil/importante do que os blocos comuns do aglomerado.
- Haverá também cristais personalizados raros gigantes.
  - Mantêm a mesma linguagem estrutural dos cristais comuns, mas em escala grande.
  - Servem principalmente para variedade visual e decoração, evitando repetição excessiva do ambiente.

### Abyssal Catalyst

- Item obrigatório para permanecer no Abyssal Ocean por longos períodos.
- É um item **permanente**: não perde durabilidade nem carga pelo uso.
- Basta o item existir em qualquer slot do inventário do jogador; não precisa estar equipado nem segurado.
- Receita exata do Abyssal Catalyst:
  - Linha 1: vazio | cristal abissal | `magic_abyssal_crystal`
  - Linha 2: vazio | graveto | cristal abissal
  - Linha 3: graveto | vazio | vazio
- Em notação compacta:
  - `a c m`
  - `a s c`
  - `s a a`
  - onde `m` = `magic_abyssal_crystal`, `c` = cristal abissal, `s` = graveto, `a` = vazio.
- Até agora, esta é a única utilidade totalmente definida para o `magic_abyssal_crystal`.

### Criaturas e boss

- **Peixe abissal genérico:** fauna básica do bioma.
- **Leviathan:** boss principal associado ao Abyssal Ocean.
  - Possui bastante design já planejado.
  - Será detalhado separadamente em uma etapa própria da conversa.

### Estrutura: navio naufragado personalizado

- Estrutura inspirada no conceito do naufrágio vanilla, mas visualmente e estruturalmente própria.
- Possui **75% de chance** de conter um mapa especial.
- Esse mapa conduz o jogador até a **estrutura onde o Leviathan nasce**.
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

### Geração

- A Kelp Forest é rara, mas não extremamente rara.
- É **mais comum que o Abyssal Ocean**.
- Pode gerar apenas em oceanos vanilla que naturalmente possuem algas.
- A profundidade é normal para um oceano vanilla; o bioma não depende de um relevo especialmente profundo.

### Vegetação e navegação

- Usa as algas vanilla do Minecraft.
- As algas se estendem do fundo até a camada superficial da água.
- O bioma é muito denso e difícil de enxergar por dentro.
- É possível atravessá-lo normalmente.
- O mod altera o comportamento das algas **globalmente**, não apenas dentro da Kelp Forest.
- Contato com algas desacelera o jogador.
- A desaceleração lembra uma teia como conceito, mas deve ser consideravelmente menos intensa.
- **Barcos também são desacelerados** ao atravessar algas.

### Estruturas

- O foco principal são ruínas próprias do mod.
- Elas são próximas das ruínas submarinas vanilla em conceito e escala.
- Têm mais algas e maior presença de blocos como pedregulho com musgo e materiais semelhantes.
- A intenção não é reinventar completamente o conceito das ruínas, mas dar a elas uma identidade própria coerente com a Kelp Forest.
- O loot segue o mesmo padrão das ruínas vanilla; não há loot exclusivo planejado para elas neste momento.
- Essas ruínas devem gerar **levemente mais frequentemente** do que ruínas vanilla equivalentes.

### Criaturas planejadas

- **Caranguejo temático**
  - Vive no fundo do bioma.
  - É **passivo**.
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
    - o jogador segura uma garrafa e usa **clique direito** na piranha;
    - a aura elétrica é coletada;
    - isso gera uma garrafa elétrica compatível/relacionada ao mod.

- **Tubarão temático**
  - Modelo original e visualmente trabalhado.
  - Criatura personalizada, não reprodução de uma espécie real.
  - É um mob **raro e forte**, mas ainda tratado como criatura normal do bioma, não como boss.
  - Referência de papel: algo semelhante a uma serpente marinha do Ice and Fire — ameaça forte e rara, porém parte natural do mundo.
  - Possui **150 pontos de vida**.
  - IA inicialmente pensada como comportamento aquático relativamente genérico.

- **Kraken**
  - Planejado para o mod.
  - A decisão de pertencimento ao Update 2 ou 3 ainda está aberta.

### Progressão e papel do bioma

- Por enquanto, a Kelp Forest **não possui boss, objetivo principal ou progressão própria**.
- Seu papel é principalmente enriquecer a exploração com ambientação, mobs, ruínas e comportamento distinto das algas.

### Relação entre criaturas e recursos

- O caranguejo, a piranha elétrica e o tubarão não possuem relação especial entre si planejada no momento.
- Não há cadeia alimentar ou sistema ecológico específico confirmado entre eles.
- A garrafa elétrica é um item de integração interessante, mas **não é um recurso central/importante da progressão**.
- Por enquanto, não há outro recurso exclusivo importante da Kelp Forest definido.

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

Tamanhos aproximados:

- **pequena:** cerca de 20 blocos;
- **média:** cerca de 50 blocos;
- **grande:** cerca de 100 blocos.

Tipos já definidos:

- ilha pequena sem conteúdo especial;
- ilha pequena com baú;
- ilha média sem conteúdo especial;
- ilha média com baú;
- ilha grande com baú;
- **Ilha da Miragem**.

Regras de raridade:

- quanto maior e/ou mais recompensadora a ilha, mais rara ela tende a ser;
- uma **ilha pequena com baú é mais rara que uma ilha média sem baú**;
- portanto, tamanho e presença de recompensa são fatores independentes na raridade;
- a **Ilha da Miragem** deve ser tratada como se estivesse aproximadamente **duas categorias de raridade além da ilha grande com baú**;
- os pesos exatos ainda serão confirmados.

Loot:

- ilhas com baú usam loot equivalente ao de um **baú de tesouro**;
- não há loot exclusivo próprio das ilhas normais definido neste momento.

Visual e estrutura:

- ilhas normais possuem aparência **natural e comum**, coerente com ilhas Minecraft: areia, terra, vegetação e materiais naturais;
- elas não descem como uma grande massa de pedra até o fundo do oceano;
- visualmente, ficam como uma massa de terreno que **“flutua” na superfície da água**, sem coluna rochosa de sustentação até o fundo.

### Ilha da Miragem

- Ilha de tamanho enorme.
- Possui baús.
- É temporária.
- O contador de aproximadamente **15 minutos começa no momento em que a ilha é gerada**, e não quando um jogador chega perto.
- Ao fim do tempo, a ilha desaparece completamente.
- Jogadores que estiverem sobre/nela no momento simplesmente **caem na água**.
- Blocos colocados pelo jogador na ilha **não desaparecem junto com ela**.
- É, até agora, a ilha confirmada que não permanece no mundo.

### Persistência

- A maioria das ilhas permanece depois de ser gerada.
- A Ilha da Miragem é uma exceção confirmada.
- As ilhas são pensadas como estruturas geradas durante a exploração do mundo/oceano.


### Sistema de navegação e elegibilidade de eventos

Um jogador entra no estado de **navegação marítima elegível para eventos** quando:

- está em um **bioma composto predominantemente por água**, em vez de depender de uma lista fixa de biomas vanilla;
- está dentro de um **barco**;
- o barco está **em movimento**, e não parado;
- permanece nessa condição por aproximadamente **5 minutos** antes de eventos começarem a poder ocorrer.

Essa detecção por característica do bioma é intencional para oferecer **compatibilidade indireta com mods que adicionam oceanos/biomas aquáticos**.

Também é desejável detectar quando o jogador está apenas **dando muitas voltas na mesma região**, para evitar que circular artificialmente em um espaço pequeno seja equivalente a navegação real.
- Se o sistema detectar navegação em círculos/repetição excessiva:
  - o contador de elegibilidade é **zerado**;
  - o contador permanece **pausado** enquanto o comportamento continuar.
- A heurística exata de detecção ainda está em aberto.

A condição de afastamento funciona por **continuidade de biomas aquáticos**, não por detectar geometricamente uma ilha/terra física.
- Limite confirmado: aproximadamente **500 blocos** percorridos/mantidos dentro de biomas compostos predominantemente por água.
- Se o percurso/contexto entrar em um bioma que **não** seja composto predominantemente por água, essa condição é bloqueada/interrompida.
- Isso também evita depender de uma lista fixa de ilhas ou terrenos e favorece compatibilidade indireta com mods de oceano.

### Concorrência de eventos

- Mais de um evento pode estar ativo ao mesmo tempo.
- Uma **tempestade aumenta a chance de outros eventos ocorrerem** enquanto está ativa.
- Isso permite combinações como tempestade + infestação de peixes + Kraken.
- A duração de tempestades é **aleatória**, variando aproximadamente entre **3 e 10 minutos**.

### Tempestades

Durante uma tempestade:

- há muitos **raios vanilla reais** caindo nas proximidades;
- eles funcionam como raios normais do Minecraft, podendo atingir entidades e causar seus efeitos normais;
- referência atual de intensidade: aproximadamente **1 raio a cada 10 segundos por grupo de jogadores**;
- o fog/nevoeiro fica **mais denso**, reduzindo a visibilidade;
- a tempestade aumenta a chance de outros eventos marítimos;
- o Kraken só pode aparecer durante tempestades, embora continue sendo **muito raro**.

### Evento de escuridão

- A duração é **aleatória**, variando aproximadamente entre **2 e 5 minutos**.
- O efeito escurece a visão de todos os jogadores em um raio de aproximadamente **150 blocos**.
- Não altera outras mecânicas diretamente; é um evento principalmente de pressão/atmosfera.
- Quando a escuridão termina, **obrigatoriamente é disparado imediatamente algum outro evento que não seja uma tempestade**.
- A ausência de intervalo é intencional para deixar a transição mais dramática e impedir que o jogador saiba exatamente quando a escuridão terminou.

### Infestação/aglomeração de peixes

- O evento gera uma **aglomeração em massa de peixes próxima ao jogador**.
- A composição depende do bioma.
- O perigo depende das criaturas disponíveis naquele bioma.
- Exemplo: na Kelp Forest, uma infestação pode incluir muitas piranhas e se tornar perigosa.
- O sistema deve permitir integração com fauna de outros mods quando aplicável, incluindo a integração já planejada com Aquaculture.
- O evento não possui um despawn especial ao terminar: os peixes gerados **continuam existindo normalmente no mundo**.

### Kraken

- O Kraken permanece planejado, mas seu detalhamento completo será feito **mais tarde**.
- Quando for implementado no sistema de eventos:
  - só poderá aparecer durante uma **tempestade ativa**;
  - mesmo durante tempestades, sua chance deverá continuar **muito baixa**.
- O Update 3 não deve ficar bloqueado conceitualmente pela falta de detalhes do Kraken nesta etapa.


### Multiplayer e agrupamento de eventos

- Jogadores suficientemente próximos compartilham o mesmo contexto de eventos marítimos.
- Distância de agrupamento: aproximadamente **150 blocos entre jogadores**.
- Jogadores dentro desse limite devem perceber/participar do mesmo evento relevante, em vez de cada um possuir uma tempestade ou escuridão completamente independente.
- Um jogador que entre no grupo dentro dos 150 blocos **participa dos eventos do grupo mesmo que ainda não tenha cumprido individualmente os 5 minutos de navegação**.
- Se os jogadores se afastarem além desse limite, passam a ser tratados como **grupos separados**.
- Um evento compartilhado em andamento também deve ser **separado entre os novos grupos**, em vez de ficar associado somente a um deles.
- O comportamento técnico exato da clonagem/divisão do estado do evento ainda pode ser refinado.

### Geração de ilhas

- Ilhas de eventos só podem surgir em **chunks novos**, ainda não explorados/gerados.
- O sistema não deve criar uma ilha retroativamente em área marítima já explorada.

### Ainda em aberto

- Pesos exatos de cada categoria de ilha.
- Raridade específica da Ilha da Miragem.
- Heurística exata para detectar navegação em círculos.
- Regras de repetição/cooldown entre eventos iguais.
- Persistência e sincronização multiplayer em casos-limite.
- Detalhamento final do Kraken.

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


### Sistema de sorteio de eventos marítimos

Sistema aprovado para a lógica-base de sorteio dos eventos marítimos.

Depois de o grupo ficar elegível (5 min de navegação válida + 500 blocos da terra):

1. O sistema faz uma tentativa de evento a cada **45 segundos**.
2. A chance-base começa em **10%**.
3. Cada tentativa sem evento aumenta a chance em **+2 pontos percentuais**, até um teto de **30%**.
4. Quando um evento acontece, a chance volta para 10%.
5. Eventos possuem pesos diferentes; eventos raros podem ter peso muito menor que eventos comuns.
6. Durante tempestades:
   - a chance de novos eventos pode ser multiplicada por cerca de **1,75x**;
   - eventos compatíveis podem ocorrer simultaneamente.
7. O Kraken continua usando uma regra própria:
   - só entra no pool se houver tempestade;
   - mesmo assim recebe um peso extremamente baixo.
8. O evento de escuridão mantém sua regra especial:
   - ao terminar, força um sorteio entre eventos válidos **excluindo tempestade**.
9. Eventos de ilha só entram no sorteio quando houver possibilidade real de geração em chunks novos.

Objetivo da proposta:
- evitar longos períodos sem nada acontecer;
- manter imprevisibilidade;
- permitir sobreposição durante tempestades;
- não transformar o oceano em uma sequência constante de eventos.


### Repetição de eventos

- O **mesmo tipo de evento não deve ocorrer duas vezes seguidas** para o mesmo grupo.
- Após um evento, esse tipo fica temporariamente excluído do próximo sorteio elegível.
- Depois de outro evento diferente ocorrer, ele pode voltar normalmente ao pool.

### Catálogo atual de eventos

Até o momento, o catálogo confirmado do Update 3 contém:

- tempestade;
- escuridão;
- infestação/aglomeração de peixes;
- ilhas marítimas;
- Kraken, condicionado a tempestade.

Não há outros tipos de evento planejados no momento.
