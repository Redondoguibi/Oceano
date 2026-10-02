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

### Identidade
- **Decidido:** o pilar principal do mod é **exploração misteriosa**.
- **Decidido:** curiosidade, descoberta e sensação de desconhecido devem ser motores centrais da experiência.
- **Decidido:** "mob temático" significa uma criatura original do mod baseada em um arquétipo animal, e não uma reprodução de uma espécie real.

### Estrutura de conteúdo
- **Decidido:** o mod está planejado em 3 updates temáticos.
- **Decidido:** cada update representa um conjunto temático de biomas/oceanos e seu conteúdo associado.
- **Decidido:** os updates não são capítulos obrigatórios de progressão linear.
- **Decidido:** a arquitetura deve ser modular.

### Update 1 — Abyssal Ocean
- **Decidido:** corresponde ao lançamento inicial do mod e ainda não possui nome próprio.
- **Decidido:** seu tema central são cristais abissais.
- **Decidido:** o `Abyssal Ocean` substitui parcialmente o oceano profundo vanilla e é raro.
- **Decidido:** chega aproximadamente a Y=0.
- **Decidido:** possui paredes verticais moderadas.
- **Decidido:** cristais abissais roxos geram em pequenos aglomerados no chão.
- **Decidido:** os cristais exigem nível diamante para mineração.
- **Decidido:** cada aglomerado contém um `magic_abyssal_crystal`, mais útil/importante que os blocos comuns.
- **Decidido:** o bioma não possui uma grande ameaça central como conceito.

### Update 2 — Kelp Forest
- **Decidido:** usa algas vanilla crescendo do fundo até próximo da superfície.
- **Decidido:** é muito denso e possui baixa visibilidade interna.
- **Decidido:** algas desaceleram o jogador, mas muito menos que uma teia.
- **Decidido:** terá ruínas próprias semelhantes em conceito às ruínas submarinas, mas não vanilla.
- **Decidido:** terá um caranguejo temático.
- **Decidido:** terá uma piranha elétrica.
- **Decidido:** a piranha elétrica terá integração com Iron's Spellbooks permitindo coletar sua aura elétrica com uma garrafa.
- **Decidido:** terá um tubarão temático.
- **Em decisão futura:** Kraken pertence ao Update 2 ou Update 3.

### Update 3 — Navegação, clima e ilhas
- **Decidido:** eventos podem ocorrer em qualquer oceano, inclusive vanilla.
- **Decidido:** eventos obedecem condições como tempo em alto-mar e distância até terra/superfície próxima.
- **Decidido:** momentos de escuridão lembram o efeito Darkness, mas sem pulsação.
- **Decidido:** tempestades afetam fortemente o gameplay e alteram probabilidades de mobs, ilhas e outros eventos.
- **Decidido:** ilhas são estruturas geradas conforme a exploração do oceano.
- **Decidido:** a maioria das ilhas persiste depois de gerada.
- **Decidido:** pelo menos uma ilha planejada desaparece.
- **Decidido:** ilhas possuem categorias internas que não precisam ser explicitadas ao jogador.

## Em aberto

- Utilidade exata dos cristais abissais.
- Estruturas e mobs do Abyssal Ocean.
- Detalhes das ruínas e mobs da Kelp Forest.
- Destino do Kraken.
- Catálogo e regras completas dos eventos climáticos.
- Tipos de ilhas e conteúdo de cada uma.
- Progressão global.
- Itens, loot e equipamentos.
- Direção artística e sonora.
