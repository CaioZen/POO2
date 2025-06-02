-- Inserção de raças
INSERT INTO raca (habilidadeespecial, nome, vantagem) VALUES
('Visão no Escuro, Resistência a Veneno', 'Anão', 'Resistência a veneno'),
('Velocidade aumentada, Versatilidade', 'Humano', 'Versatilidade'),
('Visão no Escuro, Resistência a Encantamentos', 'Elfo', 'Imunidade ao Sono Mágico');

-- Inserção de subraças
INSERT INTO subraca (nome, qtde, idraca) VALUES
('Anão da Colina', 0, 1),
('Anão da Montanha', 0, 1),
('Elfo da Floresta', 0, 3),
('Elfo Drow', 0, 3),
('Nenhuma', 0,2 );

-- Inserção de alinhamentos
INSERT INTO alinhamento (nome, qtde) VALUES
('Leal e Bom', 0),
('Caótico e Neutro', 0),
('Neutro e Mau', 0);

-- Inserção de antecedentes
INSERT INTO antecedente (habilidadeespecial, nome, proficiencia, qtde) VALUES
('Ofício de Ferreiro', 'Artesão de Guilda', 'Intuição, Persuasão', 0),
('Conhecimento do Submundo', 'Criminoso', 'Enganação, Furtividade', 0),
('Contato Militar', 'Soldado', 'Atletismo, Intimidação', 0);

-- Inserção de classes
INSERT INTO classe (habilidadeespecial, nome, qtde) VALUES
('Ataque Extra, Estilo de Luta', 'Guerreiro', 0),
('Magia, Recuperação Arcana', 'Mago', 0),
('Ataque Furtivo, Esquiva Sobrenatural', 'Ladino', 0);
