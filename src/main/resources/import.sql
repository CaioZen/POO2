-- Inserção de raças
INSERT INTO raca (idraca, habilidadeespecial, nome, vantagem) VALUES
(1, 'Visão no Escuro, Resistência a Veneno', 'Anão', 'Resistência a veneno'),
(2, 'Velocidade aumentada, Versatilidade', 'Humano', 'Versatilidade'),
(3, 'Visão no Escuro, Resistência a Encantamentos', 'Elfo', 'Imunidade ao Sono Mágico');

-- Inserção de subraças
INSERT INTO subraca (idsubraca, nome, qtde, idraca) VALUES
(1, 'Anão da Colina', 1, 1),
(2, 'Anão da Montanha', 1, 1),
(3, 'Elfo da Floresta', 1, 3),
(4, 'Elfo Drow', 1, 3);

-- Inserção de alinhamentos
INSERT INTO alinhamento (idali, nome, qtde) VALUES
(1, 'Leal e Bom', 1),
(2, 'Caótico e Neutro', 1),
(3, 'Neutro e Mau', 1);

-- Inserção de antecedentes
INSERT INTO antecedente (idante, habilidadeespecial, nome, proficiencia) VALUES
(1, 'Ofício de Ferreiro', 'Artesão de Guilda', 'Intuição, Persuasão'),
(2, 'Conhecimento do Submundo', 'Criminoso', 'Enganação, Furtividade'),
(3, 'Contato Militar', 'Soldado', 'Atletismo, Intimidação');

-- Inserção de classes
INSERT INTO classe (idclass, habilidadeespecial, nome, qtde) VALUES
(1, 'Ataque Extra, Estilo de Luta', 'Guerreiro', 2),
(2, 'Magia, Recuperação Arcana', 'Mago', 2),
(3, 'Ataque Furtivo, Esquiva Sobrenatural', 'Ladino', 2);
