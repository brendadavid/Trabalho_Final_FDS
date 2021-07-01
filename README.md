# Trabalho_Final_FDS

Fundamentos de Desenvolvimento de Software

Trabalho Final 2021/1

Objetivo
O objetivo deste trabalho é explorar a aplicação dos conceitos apresentados ao longo do semestre a saber: sistemas de gerência de configuração, sistemas de automação da compilação, desenvolvimento de software em equipe, teste unitário, padrões de projeto e arquitetura de software (em especial arquitetura CLEAN). 
Para tanto os estudantes, organizados em grupos, deverão desenvolver um sistema conforme descrição abaixo. Neste sistema deverão evidenciar sua capacidade de desenvolvimento em equipe e de aplicação dos conceitos apresentados. 
Serão avaliados tanto os artefatos entregues pelo Moodle como a apresentação do sistema feita através do software Zoom em horário a ser agendado com o professor. Os requisitos apresentados são mínimos e os grupos têm a liberdade de propor alterações ou novas funcionalidades. Alterações “drásticas”, entretanto, deverá ser apresentado e aprovado pelo professor até a data definida no cronograma.
Enunciado do problema:
” Encontrou um problema na sua cidade? “
Avise a população e a Prefeitura sobre os problemas da cidade: buracos na rua, trânsito, terrenos com mato alto, saúde, educação, obras paradas e mais.
Este é o lugar para tornar sua reclamação pública. Você mostra o problema, juntos cobramos a Prefeitura.” (App Cidadera, 2015) 
	 
Requisitos funcionais
O sistema deve permitir os seguintes casos de uso por parte de usuários “registrados”:
•	Abrir reclamação. Para abrir uma reclamação o usuário deve informar: um título, uma breve descrição do problema que está relatando, a data, bairro e endereço onde foi verificado o problema. O usuário também deve categorizar o tipo de problema encontrado, como por exemplo: iluminação pública, preservação de vias públicas, preservação de calçadas etc. Opcionalmente o usuário pode adicionar o link para uma imagem. 
•	Atualizar as informações das suas próprias reclamações;
•	Comentar reclamações postadas por outros usuários ou mesmo as suas. Ao comentar uma reclamação o usuário poderá adicionar novas imagens e, também, poderá marcar a reclamação como “Resolvida”. Ao serem cadastradas as reclamações têm sempre o status “Aberta”.

O sistema deve possuir um usuário administrador, que pode realizar as seguintes operações:
•	Acessar um módulo de informações gerenciais que permite gerar:
•	o total de reclamações por categoria/bairro num determinado período
