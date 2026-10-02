# Oceano — Decision Log

Registro das decisões de design tomadas antes da implementação.

## Confirmado

### Base técnica
- **Decidido:** Minecraft 1.21.1.
- **Decidido:** NeoForge 21.1.252.
- **Decidido:** Java 21.
- **Decidido:** mod ID `oceano`.
- **Decidido:** pacote base `com.redondoguibi.oceano`.

### Processo
- **Decidido:** o mod será planejado em conversa antes da implementação principal.
- **Decidido:** a documentação será atualizada continuamente no repositório.
- **Decidido:** depois do design, o conteúdo será entregue ao Codex em um handoff consolidado para implementação.
- **Decidido:** o usuário já possui o mod bem planejado mentalmente; o papel da conversa é extrair e formalizar essa visão.
- **Decidido:** as perguntas devem ser específicas, focadas em sistemas e comportamento do mod.
- **Decidido:** a numeração das perguntas é contínua entre updates, sem reiniciar por seção.
- **Decidido:** muitas partes do mod são inspiradas por referências externas já vistas pelo usuário; referências devem ser coletadas quando ajudarem a preservar a intenção visual, mecânica ou atmosférica.
- **Decidido:** referências externas são inspiração, não instrução para cópia literal.

### Identidade
- **Decidido:** o pilar principal do mod é **exploração misteriosa**.
- **Decidido:** curiosidade, descoberta e sensação de desconhecido devem ser motores centrais da experiência.
- **Decidido:** "mob temático" significa uma criatura original do mod baseada em um arquétipo animal, e não uma reprodução de uma espécie real.

### Referências centrais
- **Decidido:** Seaside Story é uma referência importante para o Abyssal Ocean, Kelp Forest e linguagem de criaturas.
- **Decidido:** o bioma **Crystal Melodie** de Seaside Story é a referência visual específica para parte da identidade do Abyssal Ocean.
- **Decidido:** o tubarão de referência da Kelp Forest é o mob raro/especial exclusivo do bioma de floresta de algas do addon Seaside Story, não um tubarão genérico.
- **Decidido:** a atmosfera/tema do Leviathan de Cataclysm é uma referência para o Abyssal Ocean.
- **Decidido:** Blox Fruits é referência principal para tempestades e dinâmica de ilhas do Update 3.
- **Decidido:** o formato dos cristais abissais é criação própria, semelhante a uma pirâmide deformada sem base gigante.
- **Decidido:** a imagem do Abyssal Catalyst foi salva em `docs/assets/abyssal_catalyst.png`.
- **Decidido:** o Kraken ainda não possui referência definida e será desenvolvido mais tarde.

### Estrutura de conteúdo
- **Decidido:** o mod está planejado em 3 updates temáticos.
- **Decidido:** cada update representa um conjunto temático de biomas/oceanos e seu conteúdo associado.
- **Decidido:** os updates não são capítulos obrigatórios de progressão linear.
- **Decidido:** a arquitetura deve ser modular.

### Update 1 — Abyssal Ocean
- **Decidido:** corresponde ao lançamento inicial do mod e ainda não possui nome próprio.
- **Decidido:** seu tema central são cristais abissais.
- **Decidido:** o `Abyssal Ocean` substitui parcialmente o oceano profundo vanilla e é raro.
- **Decidido:** o bioma efetivo começa apenas em uma profundidade específica, não diretamente na superfície.
- **Decidido:** chega aproximadamente a Y=0.
- **Decidido:** possui paredes verticais moderadas.
- **Decidido:** cristais abissais roxos geram em pequenos aglomerados no chão.
- **Decidido:** também existem formações gigantes raras de cristais para variedade visual.
- **Decidido:** os cristais exigem nível diamante para mineração.
- **Decidido:** cada aglomerado contém um `magic_abyssal_crystal`.
- **Decidido:** o `magic_abyssal_crystal` é necessário para fabricar o **Abyssal Catalyst**.
- **Decidido:** sem o Abyssal Catalyst, o jogador pode permanecer no bioma por cerca de 1 minuto e depois é devolvido ao ponto anterior à entrada.
- **Decidido:** haverá um peixe abissal genérico.
- **Decidido:** haverá o boss **Leviathan**.
- **Decidido:** haverá um navio naufragado personalizado.
- **Decidido:** o navio pode fornecer um mapa que leva ao Leviathan.

### Update 2 — Kelp Forest
- **Decidido:** usa algas vanilla crescendo do fundo até próximo da superfície.
- **Decidido:** é muito denso e possui baixa visibilidade interna.
- **Decidido:** algas desaceleram o jogador, mas muito menos que uma teia.
- **Decidido:** terá ruínas próprias semelhantes em conceito às ruínas submarinas vanilla, mas com maior presença de algas e blocos musgosos.
- **Decidido:** terá um caranguejo temático que vive no fundo e se move de forma inspirada em Nyl's Spiders, sem escalar paredes.
- **Decidido:** terá uma piranha elétrica de tamanho médio.
- **Decidido:** a piranha ataca com mordida e também causa dano elétrico por proximidade.
- **Decidido:** a piranha elétrica terá integração com Iron's Spellbooks permitindo coletar sua aura elétrica com uma garrafa.
- **Decidido:** terá um tubarão temático com modelo original e IA aquática relativamente genérica.
- **Em decisão futura:** Kraken pertence ao Update 2 ou Update 3.

### Update 3 — Navegação, clima e ilhas
- **Decidido:** eventos podem ocorrer em qualquer oceano, inclusive vanilla.
- **Decidido:** eventos obedecem condições como tempo em alto-mar e distância até terra/superfície próxima.
- **Decidido:** momentos de escuridão lembram o efeito Darkness, mas sem pulsação.
- **Decidido:** tempestades afetam fortemente o gameplay e alteram probabilidades de mobs, ilhas e outros eventos.
- **Decidido:** o Kraken tem maior chance de aparecer durante tempestades.
- **Decidido:** existirão infestações de peixes que variam por bioma e possuem integração planejada com Aquaculture.
- **Decidido:** ilhas são estruturas geradas conforme a exploração do oceano.
- **Decidido:** categorias já planejadas incluem ilhas pequenas/médias/grandes, com ou sem baús conforme o tipo.
- **Decidido:** a **Ilha da Miragem** é enorme, possui baús e desaparece após aproximadamente 15 minutos.
- **Decidido:** a maioria das outras ilhas persiste.
- **Decidido:** ilhas possuem categorias internas que não precisam ser explicitadas ao jogador.

## Em aberto

- Receita completa do Abyssal Catalyst.
- Aparência e comportamento do peixe abissal.
- Detalhamento completo do Leviathan.
- Loot do navio e das ilhas.
- Aparência final dos mobs da Kelp Forest.
- Destino definitivo do Kraken.
- Catálogo e regras completas dos eventos climáticos.
- Progressão global.
- Direção artística e sonora.
