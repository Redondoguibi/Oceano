# Oceano — Leviathan

Documento dedicado ao boss **Leviathan**, associado ao Abyssal Ocean.

## Papel no Update 1

- O Leviathan é o boss principal associado ao Abyssal Ocean.
- Existe uma estrutura específica onde ele nasce.
- O navio naufragado personalizado do Abyssal Ocean tem 75% de chance de conter um mapa.
- Esse mapa aponta para a estrutura onde o Leviathan nasce.
- Cataclysm é uma referência ampla para a luta, incluindo mistura de atmosfera, visual, arena e ataques.
- A intenção é usar a referência como inspiração de sensação e ambição, não copiar o boss do Cataclysm.

## Aparência

O Leviathan possui duas referências visuais enviadas pelo usuário.

Características gerais confirmadas pelas referências:

- criatura aquática muito longa;
- corpo escuro, quase preto/roxo;
- cristais roxos/lilases distribuídos principalmente pelo dorso;
- nadadeiras largas;
- cabeça grande e agressiva;
- detalhes luminosos em roxo;
- identidade visual totalmente conectada aos cristais abissais.

As imagens são referências aproximadas, não necessariamente o modelo final.

## Arena / estrutura de bossfight

- A luta acontece em uma região **ainda mais profunda que o Abyssal Ocean normal**.
- Essa região faz parte da estrutura/local do Leviathan.
- Existem vários buracos/cavernas laterais acessíveis ao jogador.
- Essas cavernas fazem parte da arena e não possuem conteúdo comum próprio.
- Ao jogador entrar na área real da bossfight, o Leviathan spawna.
- Depois do início da luta, os participantes não conseguem simplesmente sair da arena.

## Regras de multiplayer e morte

- Se **todos os jogadores participantes** morrerem, o Leviathan desaparece e a tentativa termina.
- Se um jogador morrer enquanto ainda houver outro participante vivo na luta:
  - a luta continua;
  - o jogador morto **não pode retornar à arena naquela tentativa**.
- O sistema precisa manter explicitamente o conjunto de participantes elegíveis durante cada tentativa.

## Estrutura de estágios

- O Leviathan possui **3 estágios**.
- A luta começa já com a mecânica de cristais.
- Ao início da luta e ao início de cada novo estágio:
  - **5 cristais especiais** aparecem aleatoriamente;
  - os locais são escolhidos entre as cavernas/buracos da arena.
- Enquanto **pelo menos 1 desses cristais estiver vivo**, o Leviathan é **imortal**.
- Portanto, cada ciclo exige localizar e destruir os 5 cristais antes de voltar a causar dano real ao boss.
- A interface deve comunicar quantos cristais continuam vivos.
- Antigas bossbars enviadas pelo usuário servem apenas como referência conceitual; não serão reutilizadas literalmente.

## Ataques confirmados

### Mordida

- Ataque corpo a corpo frontal.
- Usa a cabeça/boca do Leviathan.

### Raio contínuo

- O Leviathan dispara um raio sustentado.
- Duração, rastreamento, dano e telegraph ainda precisam ser definidos.

### Três projéteis teleguiados

- O Leviathan dispara **3 bolas/projéteis**.
- Os projéteis perseguem seus alvos.
- Há um modelo/textura/animação de referência já produzidos para esse projétil, chamado **Abyssal Ball**.

Referências técnicas salvas:

- `docs/assets/leviathan/abyssal_ball_model.java`
- `docs/assets/leviathan/abyssal_ball_idle.java`
- `docs/assets/leviathan/abyssal_ball.png`

O modelo exportado possui partes separadas como `body`, `charge` e `root_outline`. A animação idle é loopada e usa rotação contínua do corpo e da parte de carga. Esses arquivos são referência técnica/visual e deverão ser adaptados à arquitetura final do mod e ao NeoForge 1.21.1.

### Mini buraco negro

- Acontece **ao começar cada estágio**.
- É um ataque/transição marcante ligado às mudanças de estágio.
- Mecânica exata de atração, área, duração e dano ainda será definida.

### Investida

- O Leviathan pode avançar rapidamente contra um jogador.
- É usada principalmente quando o jogador está dentro de um dos buracos/cavernas, desde que ele não esteja distante demais.
- Serve para impedir que as cavernas funcionem como zonas completamente seguras.

## Interface

Há duas informações distintas que devem ficar legíveis durante a luta:

1. **Vida do Leviathan**.
2. **Quantidade de cristais especiais restantes**.

As bossbars antigas enviadas anteriormente são somente referência para essa divisão de informação e para a identidade visual roxa/cristalina.

## Referências visuais e técnicas

- Cataclysm: referência ampla de atmosfera, visual, arena e ataques.
- Imagens enviadas do Leviathan: referência aproximada da criatura.
- Bossbars antigas: referência de linguagem visual/interface, não design final.
- Abyssal Ball: modelo, textura e animação já existentes como referência para o ataque de projéteis.

## Ainda em aberto

- tamanho exato do Leviathan;
- vida total;
- dano de cada ataque;
- thresholds que separam os 3 estágios;
- diferenças específicas de comportamento entre estágio 1, 2 e 3;
- funcionamento exato do mini buraco negro;
- duração e rastreamento do raio contínuo;
- velocidade e comportamento dos projéteis teleguiados;
- telegraphs de cada ataque;
- cooldowns e pesos de seleção;
- música e sons;
- loot;
- progressão liberada após a vitória;
- regras para repetir a luta;
- respawn da estrutura/boss;
- comportamento após logout/desconexão durante a luta.
