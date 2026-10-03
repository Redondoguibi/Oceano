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
- **Decidido:** o chão/terreno do Crystal Melodie mostrado no vídeo não deve ser reproduzido no Abyssal Ocean.
- **Decidido:** o tubarão de referência da Kelp Forest é o mob raro/especial exclusivo do bioma de floresta de algas do addon Seaside Story, não um tubarão genérico.
- **Decidido:** a atmosfera/tema do Leviathan de Cataclysm é uma referência para o Abyssal Ocean.
- **Decidido:** Blox Fruits é referência principal para tempestades e dinâmica de ilhas do Update 3.
- **Decidido:** o formato dos cristais abissais é criação própria, semelhante a uma pirâmide deformada sem base gigante.
- **Decidido:** a imagem do Abyssal Catalyst foi salva em `docs/assets/abyssal_catalyst.png`.
- **Decidido:** o Kraken ainda não possui referência definida e será desenvolvido mais tarde.

### Direção visual
- **Decidido:** o Oceano deve usar um meio-termo visual entre o Minecraft vanilla e mods mais detalhados/ambiciosos.
- **Decidido:** mobs podem ser mais trabalhados e personalizados que o vanilla, mas sem abandonar completamente a linguagem visual de Minecraft.
- **Decidido:** itens comuns podem continuar usando sprites 2D tradicionais, como o Abyssal Catalyst.
- **Decidido:** efeitos especiais podem ser mais expressivos quando a mecânica pedir, sem transformar todo o mod em algo visualmente exagerado.

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
- **Decidido:** o chão/fundo do Abyssal Ocean é formado principalmente por **Pedra Abissal**.
- **Decidido:** existe uma variante em **Tijolos de Pedra Abissal**.
- **Decidido:** possui paredes verticais moderadas.
- **Decidido:** a cor da água não muda conforme a profundidade.
- **Decidido:** a densidade visual/névoa subaquática aumenta conforme o jogador desce, reduzindo progressivamente a visibilidade.
- **Decidido:** cristais abissais roxos geram em pequenos aglomerados no chão.
- **Decidido:** também existem formações gigantes raras de cristais para variedade visual.
- **Decidido:** os cristais exigem nível diamante para mineração.
- **Decidido:** cada aglomerado contém um `magic_abyssal_crystal`.
- **Decidido:** o `magic_abyssal_crystal` é necessário para fabricar o **Abyssal Catalyst**.
- **Decidido:** a receita do Catalyst é:
  - `a c m`
  - `a s c`
  - `s a a`
  - com `m` = magic crystal, `c` = cristal abissal, `s` = graveto e `a` = vazio.
- **Decidido:** cada aglomerado possui exatamente 1 `magic_abyssal_crystal`.
- **Decidido:** sem o Abyssal Catalyst, o jogador pode permanecer no bioma por cerca de 1 minuto e depois é devolvido ao ponto anterior à entrada.
- **Decidido:** o Abyssal Catalyst é permanente e não perde durabilidade/carga pelo uso.
- **Decidido:** basta ter o Abyssal Catalyst no inventário; não é necessário segurá-lo ou equipá-lo.
- **Decidido:** aos 30 segundos sem Catalyst, o jogador recebe Náusea.
- **Decidido:** o local de retorno é o último local onde o jogador estava antes de entrar no bioma.
- **Decidido:** ao atingir 1 minuto sem Catalyst, ocorre apenas o teleporte de retorno, sem efeito extra.
- **Decidido:** sair do bioma antes do limite reseta completamente o contador; uma nova entrada começa um novo minuto.
- **Decidido:** a progressão inicial do Abyssal Ocean consiste em uma primeira incursão curta sem Catalyst para obter cristais comuns + 1 `magic_abyssal_crystal`, fabricar o Catalyst e então liberar exploração prolongada.
- **Decidido:** haverá um peixe abissal genérico.
- **Decidido:** haverá o boss **Leviathan**.
- **Decidido:** haverá um navio naufragado personalizado.
- **Decidido:** o navio possui 75% de chance de fornecer um mapa.
- **Decidido:** o mapa leva à estrutura onde o Leviathan nasce, não diretamente a uma entidade já existente.
- **Decidido:** a arena do Leviathan fica ainda mais funda que o Abyssal Ocean normal e contém cavernas/buracos laterais.
- **Decidido:** entrar na área de luta spawna o Leviathan e impede a saída normal durante a tentativa.
- **Decidido:** se todos os participantes morrerem, o Leviathan desaparece.
- **Decidido:** quem morrer enquanto ainda houver participantes vivos não pode reentrar naquela tentativa.
- **Decidido:** os 3 "estágios" do Leviathan são apenas marcos de vida/progresso usados para disparar mecânicas; não implicam fases diferentes de IA ou moveset.
- **Decidido:** os checkpoints do ciclo de cristais são 100%, 75%, 50% e 25% da vida.
- **Decidido:** em 100%, surgem 5 cristais especiais, mas não há mini buraco negro.
- **Decidido:** em 75%, 50% e 25%, o Leviathan recua, usa o mini buraco negro e os 5 cristais reaparecem aleatoriamente nas cavernas/buracos.
- **Decidido:** enquanto pelo menos 1 cristal especial estiver vivo, o Leviathan é imortal.
- **Decidido:** ataques confirmados: mordida, raio contínuo, 3 projéteis teleguiados, mini buraco negro no início de cada estágio e investida contextual contra jogadores nas cavernas.
- **Decidido:** a interface deve comunicar separadamente vida do boss e quantidade de cristais vivos.

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
