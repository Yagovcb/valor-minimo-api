# Olá! Eu sou o Yago Castelo Branco :man_technologist:


### Sobre mim

#### Sou Engenheiro de software sênior e Arquiteto de software

- Meu nome é Yago, Sou engenheiro de software e atualmente moro no Brasil.
- Trabalho com software a mais de 6 anos, e possuo experiecia com diversas tecnologias.
##

## ⚠ Pré requisitos para rodar o projeto

* Java 17
* Maven

## ⚠ Sobre o projeto
Esse é um projeto que foi criado para resolver um teste tecnico que continha o seguinte enunciado


```
Pedro é um estudante de ciências da computação e fez um programa financeiro para a empresa de seu tio, no entanto algumas transações financeiras estão sendo rejeitadas por falta de saldo na conta, isso traz transtornos para o tio de Pedro que não ficou muito feliz com ele.
Ajude o coitado do Pedro a descobrir a quantidade de dinheiro necessária antes de qualquer transação para que todas as transações sejam concluidas independente da ordem das transações. Sabendo que:
* Recebe uma matriz 2D onde "transacoes[i] = [custo[i], cashback[i]]".
* A matriz possui as transações onde cada transação deve ser concluida uma vez em qualquer ordem.
* Você tem "dinheiro" com uma certa quantia e para completar cada transação, "dinheiro >= custo[i]" deve ser verdadeiro".
* E após realizar cada transação "dinheiro" se torna "dinheiro - custo[i] + cashback[i]".
Dado isso, você precisa retornar a quantia minima de dinheiro necessária antes de qualquer transação para que todas as transaçães possam ser concluidas independente da ordem das transações.
Um exemplo pra facilitar:
  Entrada: transacoes = [[2,1] , [5,0] , [4,2]];
  Saida: 10
  Explicação: Começa
  ndo com dinheiro = 10, as transação podem ser efetuadas em qualquer ordem.
Mais um exemplo:
  Entrada: transacoes = [[3,0] , [0,3]]
  Saida: 3
  Explicação:
  Se as transação são na ordem [[3,0] , [0,3]], o minimo de dinheiro necessário para completa-las é 3 e na outra possivel ordem também.
A interpretação das questões são parte integrante da avaliação.
Boa sorte 
```

Portanto, a API tem como principal responsabilidade demonstrar qual é o valor minimo para a realizacao da sequencia de transações

## 📌 Como usar?

Para rodar o projeto, escreva o comando abaixo no diretorio raiz:

``
mvn spring-boot:run
``

## 📲 Serviços disponiveis para teste

### Retorna valor minimo

Method: POST
URL: http://localhost:8080/api/dinheirominimo
Request Body: 
```
{
    "transacoes": "{3,0} , {0,3}"
}
```
Obs.: O caracteres necessitam ser numéricos inteiros, sendo o número da esquerda, valor de custo e o da direita, cashback.
##

Obrigado por testar minh API

##
<h4><b><samp>Quer falar comigo? pode acessar atraves das redes abaixo:</samp></b></h4>

[![Github Badge](https://img.shields.io/badge/-Github-000?style=flat-square&logo=Github&logoColor=white&link=https://github.com/Yagovcb)](https://github.com/Yagovcb)
[![Gmail](https://img.shields.io/badge/yago.vcb@hotmail.com-FFFEEE?style=flat-square&logo=gmail&logoColor=red)](mailto:yago.vcb@hotmail.com)
[![Twitter](https://img.shields.io/badge/@Yagovcb-1DA1F2?style=flat-square&logo=twitter&logoColor=white)](https://twitter.com/Yagovcb)
[![Linkedin](https://img.shields.io/badge/Yago_do_Valle_Castelo_Branco-0077b5?style=flat-square&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/yagovcb/)
[![Medium](https://img.shields.io/badge/@yagovcb-black?style=flat-square&logo=medium&logoColor=white)](https://medium.com/@yagovcb)


![](https://visitor-badge.glitch.me/badge?page_id=Yagovcb.Yagovcb)
