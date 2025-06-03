-- Inserção de raças
INSERT INTO raca (habilidadeespecial, nome, vantagem) VALUES ('Visão no Escuro, Resistência a Veneno', 'Anão', 'Resistência a veneno');
INSERT INTO raca (habilidadeespecial, nome, vantagem) VALUES ('Velocidade aumentada, Versatilidade', 'Humano', 'Versatilidade');
INSERT INTO raca (habilidadeespecial, nome, vantagem) VALUES ('Visão no Escuro, Resistência a Encantamentos', 'Elfo', 'Imunidade ao Sono Mágico');

-- Inserção de subraças
INSERT INTO subraca (nome, qtde, idraca) VALUES ('Anão da Colina', 0, 1);
INSERT INTO subraca (nome, qtde, idraca) VALUES ('Anão da Montanha', 0, 1);
INSERT INTO subraca (nome, qtde, idraca) VALUES ('Elfo da Floresta', 0, 3);
INSERT INTO subraca (nome, qtde, idraca) VALUES ('Elfo Drow', 0, 3);
INSERT INTO subraca (nome, qtde, idraca) VALUES ('Nenhuma', 0,2 );

-- Inserção de alinhamentos
INSERT INTO alinhamento (nome, qtde) VALUES ('Leal e Bom', 0);
INSERT INTO alinhamento (nome, qtde) VALUES ('Caótico e Neutro', 0);
INSERT INTO alinhamento (nome, qtde) VALUES ('Neutro e Mau', 0);

-- Inserção de antecedentes
INSERT INTO antecedente (habilidadeespecial, nome, proficiencia, qtde) VALUES ('Ofício de Ferreiro', 'Artesão de Guilda', 'Intuição, Persuasão', 0);
INSERT INTO antecedente (habilidadeespecial, nome, proficiencia, qtde) VALUES ('Conhecimento do Submundo', 'Criminoso', 'Enganação, Furtividade', 0);
INSERT INTO antecedente (habilidadeespecial, nome, proficiencia, qtde) VALUES ('Contato Militar', 'Soldado', 'Atletismo, Intimidação', 0);

-- Inserção de classes
INSERT INTO classe (habilidadeespecial, nome, qtde) VALUES ('Ataque Extra, Estilo de Luta', 'Guerreiro', 0);
INSERT INTO classe (habilidadeespecial, nome, qtde) VALUES ('Magia, Recuperação Arcana', 'Mago', 0);
INSERT INTO classe (habilidadeespecial, nome, qtde) VALUES ('Ataque Furtivo, Esquiva Sobrenatural', 'Ladino', 0);
