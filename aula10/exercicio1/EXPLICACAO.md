# Aula 10 – Sistema de notificações (POO em Java)

## O enunciado
Uma loja online avisa o cliente quando o pedido é confirmado. Hoje o aviso vai por e-mail, mas o dono
vai querer SMS e notificação push em breve. O estagiário escreveu a classe `ConfirmacaoPedido` criando um
`SmtpEmail` dentro dela e chamando `enviar()`: funciona, mas fica grudada no e-mail, e para trocar por SMS
é preciso abrir e editar a classe.

**Missão:** refatorar `ConfirmacaoPedido` para depender de uma interface `Notificador`, recebida pelo
construtor; criar pelo menos 2 implementações (e-mail e SMS); a `Principal` monta e injeta; usar pacotes.
**Demonstração:** dois pedidos, um avisado por e-mail e outro por SMS, sem editar `ConfirmacaoPedido`.

## Como resolvi
```
exercicio1/
├── Principal.java                  (pacote aula10.exercicio1)
├── notificacao/                    (pacote aula10.exercicio1.notificacao)
│   ├── Notificador.java            → interface com o método enviar(mensagem)
│   ├── EmailNotificador.java       → implementa Notificador (imprime [E-MAIL])
│   └── SmsNotificador.java         → implementa Notificador (imprime [SMS])
└── pedido/                         (pacote aula10.exercicio1.pedido)
    └── ConfirmacaoPedido.java      → recebe um Notificador no construtor
```

- `ConfirmacaoPedido` não cria mais o e-mail: recebe um `Notificador` pronto no construtor
  (injeção de dependência). Ela só conhece a interface, não sabe se é e-mail ou SMS.
- A `Principal` decide o canal: cria um `ConfirmacaoPedido` com `EmailNotificador` e outro com `SmsNotificador`.

Saída ao rodar a `Principal`:
```
[E-MAIL] Pedido 1001 confirmado!
[SMS] Pedido 1002 confirmado!
```

## Pergunta: se chegar a notificação push amanhã, quantos arquivos existentes vocês editam?
**Só 1: a `Principal`**, que é onde o push seria criado e injetado. Também é preciso **criar um arquivo novo**,
`PushNotificador.java`, implementando `Notificador`. `ConfirmacaoPedido`, `Notificador`, `EmailNotificador` e
`SmsNotificador` não mudam: o código está aberto para extensão e fechado para modificação (princípio aberto/fechado).

## Pedido ao Gemini
Revise se a solução cumpre todos os itens do enunciado e se a resposta da pergunta está correta.
