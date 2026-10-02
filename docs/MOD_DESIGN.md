# Oceano — Mod Design Document

> Documento vivo. Atualizado durante a conversa de design antes da implementação principal.

## Estado do projeto

- Plataforma: Minecraft 1.21.1
- Loader: NeoForge 21.1.252
- Java: 21
- Mod ID: `oceano`
- Pacote base: `com.redondoguibi.oceano`
- Estado atual do código: base do MDK configurada, ainda majoritariamente template.

## Objetivo desta fase

Definir completamente o mod antes de implementar em grande escala.

A conversa de design deve fechar, entre outros pontos:

- fantasia central do mod;
- experiência principal do jogador;
- progressão;
- exploração;
- combate;
- criaturas;
- bosses;
- estruturas;
- biomas;
- itens e equipamentos;
- recursos e crafting;
- sistemas especiais;
- integração com o Minecraft vanilla;
- direção visual e sonora;
- dificuldade;
- multiplayer;
- escopo da primeira versão;
- prioridades de implementação.

## Regra de trabalho

1. As decisões são tomadas em conversa.
2. Cada rodada consolida novas decisões neste documento e/ou em documentos auxiliares.
3. Ideias ainda não confirmadas ficam marcadas como **Em aberto**.
4. O Codex só deve implementar como definitivo o que estiver marcado como **Decidido**.
5. No fim, será criado um handoff técnico específico para implementação.
6. O usuário já possui uma visão madura do mod; as perguntas devem **extrair decisões existentes**, não empurrar alternativas ou inventar direção criativa sem pedido.
7. Sempre que possível, o planejamento será conduzido por sistemas concretos e relações entre eles, em vez de perguntas genéricas de “vibe”.

## Conceito central

**Decidido:** Oceano será um mod centrado em **exploração misteriosa**.

O mar deve passar a sensação de que existem lugares, criaturas, vestígios e fenômenos que o jogador ainda não compreende completamente. A descoberta é mais importante do que simplesmente adicionar mais recursos ao oceano.

## Fantasia do jogador

**Decidido:** o jogador deve se sentir como um explorador entrando em regiões desconhecidas e descobrindo segredos gradualmente.

O mod não deve revelar tudo de imediato. A curiosidade deve ser uma motivação central para continuar navegando, mergulhando e investigando.

## Loop principal

**Em aberto.**

## Progressão

**Em aberto.**

## Exploração

**Decidido:** exploração misteriosa é o principal pilar de gameplay.

Ainda precisa ser definido:

- como o jogador entra no conteúdo do mod;
- quais são os primeiros objetivos concretos;
- quais sistemas desbloqueiam acesso a regiões mais perigosas;
- quais tipos de locais e descobertas existem;
- como o jogador é conduzido sem depender de instruções artificiais;
- como exploração, loot, combate e progressão se conectam.

## Combate

**Em aberto.**

## Criaturas e bosses

**Em aberto.**

## Mundo e geração

**Em aberto.**

## Itens, equipamentos e crafting

**Em aberto.**

## Sistemas especiais

**Em aberto.**

## Direção visual

**Decidido:** o padrão visual do Oceano fica em um meio-termo entre vanilla e mods visualmente mais detalhados.

Diretrizes atuais:
- manter leitura e coerência com Minecraft;
- permitir modelos de mobs mais personalizados e trabalhados;
- usar sprites 2D tradicionais para muitos itens;
- permitir efeitos mais fortes quando fazem parte da identidade da mecânica;
- evitar tanto o extremo "quase vanilla" quanto o extremo "hiperdetalhado fora da linguagem do jogo".

**Nota importante sobre o Abyssal Ocean:** Crystal Melodie é referência de atmosfera, água, iluminação e sensação geral, mas **não** do chão/terreno do fundo.

## Direção sonora

**Em aberto.**

## Multiplayer

**Em aberto.**

## Estrutura de updates

**Decidido:** Oceano está planejado em **3 updates temáticos**.

Esses updates não representam fases lineares da progressão. Cada update funciona como um pacote de expansão focado em um conjunto de biomas/oceanos e no conteúdo associado a eles.

A lógica é semelhante a mods que lançam conjuntos temáticos de conteúdo por atualização, mas no Oceano o foco principal são **biomas e ecossistemas**, não conjuntos de bosses.

Cada update pode incluir, conforme definido depois:

- novos biomas oceânicos;
- estruturas;
- criaturas;
- recursos;
- equipamentos;
- loot;
- eventos;
- ambientação própria;
- possíveis bosses ligados ao tema.

A arquitetura do mod deve permitir que novos conjuntos temáticos sejam adicionados sem reestruturar os sistemas centrais.

## Escopo inicial

**Em aberto.**
