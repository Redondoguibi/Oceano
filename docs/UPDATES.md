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

### Geração e terreno

- O `Abyssal Ocean` substitui o oceano profundo atual em parte da geração.
- É raro.
- O fundo deve chegar aproximadamente à camada Y=0.
- O relevo inclui paredes verticais, mas sem escala gigantesca; a referência de sensação é algo semelhante a Alex's Caves, porém mais contido.

### Cristais abissais

- São blocos que geram em pequenos formatos/aglomerações de cristal no chão.
- Podem ser minerados com ferramenta de nível diamante.
- Cada aglomerado contém um `magic_abyssal_crystal` em seu interior.
- O `magic_abyssal_crystal` é mais útil/importante do que os blocos comuns do aglomerado.
- As utilidades e receitas ainda precisam ser detalhadas.

### Perigo

- O bioma não é concebido em torno de uma grande ameaça ambiental ou criatura dominante.
- Mistério e exploração são mais importantes do que transformar o local em uma zona de perigo extremo.

### Ainda em aberto

- Paleta completa do fundo e da água.
- Estruturas.
- Mobs específicos.
- Bosses, se houver.
- Loot.
- Utilidades do cristal comum e do `magic_abyssal_crystal`.
- Progressão associada ao bioma.

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
- Elas devem lembrar a ideia de ruínas submarinas, mas não são as ruínas vanilla.

### Criaturas planejadas

- **Caranguejo temático:** criatura original do mod baseada no arquétipo de um caranguejo.
- **Piranha elétrica:** criatura elétrica com integração planejada ao Iron's Spells 'n Spellbooks.
  - A aura elétrica da criatura poderá ser coletada com uma garrafa.
  - Isso resultará em uma garrafa elétrica relacionada/integrada ao conteúdo do Iron's Spellbooks.
- **Tubarão temático:** criatura original baseada no arquétipo de tubarão.
- **Kraken:** planejado para o mod, mas ainda não foi decidido se pertence ao Update 2 ou ao Update 3.

### Ainda em aberto

- Aparência das ruínas.
- Comportamentos completos dos mobs.
- Spawn e raridade de cada criatura.
- Bosses.
- Loot.
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

### Escuridão

- Haverá momentos/eventos de escuridão.
- O efeito visual é semelhante ao `Darkness` do Minecraft, mas sem a pulsação característica.

### Tempestades

- Tempestades personalizadas afetam fortemente o gameplay, não apenas a aparência.
- Elas podem aumentar ou diminuir probabilidades de:
  - mobs;
  - ilhas;
  - outros acontecimentos/eventos.
- Outros efeitos concretos ainda precisam ser definidos.

### Ilhas

- As ilhas são tratadas como estruturas que surgem/geram no oceano conforme a exploração do mundo.
- A maioria das ilhas é persistente: depois de aparecer/gerar, não desaparece.
- Pelo menos uma ilha planejada é temporária e desaparece.
- Haverá uma organização interna em categorias/tipos.
- Essa classificação não precisa ser apresentada explicitamente ao jogador.
- O jogador poderá perceber padrões e categorias naturalmente com o tempo.

### Ainda em aberto

- Catálogo completo de eventos.
- Regras exatas de ativação.
- Efeitos mecânicos das tempestades.
- Tipos e categorias internas das ilhas.
- Qual ilha desaparece e como isso funciona.
- Conteúdo de cada ilha.
- Relação do Kraken com este update.
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
