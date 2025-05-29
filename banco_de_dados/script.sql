SELECT * FROM tb_pessoa ORDER BY nome;
DELETE FROM tb_pessoa WHERE cod_pessoa = 4;

-- SELECT * FROM tb_pessoa ORDER BY nome ASC;
-- SELECT * FROM tb_pessoa;

-- --UPDATE
-- UPDATE tb_pessoa SET nome = 'Ana Maria' WHERE cod_pessoa = 1;

-- --CLausula Where
-- SELECT * FROM tb_pessoa WHERE cod_pessoa IN (1, 3);

-- --projecao
-- SELECT nome,email FROM tb_pessoa;

-- CREATE TABLE tb_pessoa(
--     cod_pessoa SERIAL PRIMARY KEY,
--     nome VARCHAR(200) NOT NULL,
--     fone VARCHAR(200) NOT NULL,
--     email VARCHAR(200) NULL
-- );
--INSERT INTO tb_pessoa(nome, fone, email) VALUES ('Ana', '12345678', 'ana@email.com');

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES
-- ('Pedro', '78543772', 'pedro@email.com'),
-- ('Maria', '45634829', 'maria@email.com');

-- SELECT * FROM tb_pessoa