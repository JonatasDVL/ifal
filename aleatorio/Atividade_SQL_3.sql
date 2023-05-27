CREATE DATABASE Exercicio;

CREATE TABLE Tb_Modelo(
Codigo INT PRIMARY KEY,
Descricao VARCHAR(45));

CREATE TABLE Tb_Marca(
Codigo INT PRIMARY KEY,
Descricao VARCHAR(45));

CREATE TABLE Tb_Cliente(
Codigo INT PRIMARY KEY,
Nome VARCHAR(45));

CREATE TABLE Tb_Vendedor(
Codigo INT PRIMARY KEY,
Nome VARCHAR(45));


CREATE TABLE Tb_Produto(
Codigo INT PRIMARY KEY,
Descricao VARCHAR(45),
Preco DECIMAL(10),
Tb_Modelo_Codigo INT, FOREIGN KEY (Tb_Modelo_Codigo) REFERENCES Tb_Modelo(Codigo),
Tb_Marca_Codigo INT, FOREIGN KEY (Tb_Marca_Codigo) REFERENCES Tb_Marca(Codigo));

CREATE TABLE Tb_Compra_Venda(
Codigo INT PRIMARY KEY,
Data DATE,
Tb_Cliente_Codigo INT, FOREIGN KEY (Tb_Cliente_Codigo) REFERENCES Tb_Cliente(Codigo),
Tb_Vendedor_Codigo INT, FOREIGN KEY (Tb_Vendedor_Codigo) REFERENCES Tb_Vendedor(Codigo));

CREATE TABLE Tb_Item(
Codigo INT PRIMARY KEY,
Quantidade INT,
Tb_Produto_Codigo INT, FOREIGN KEY (Tb_Produto_Codigo) REFERENCES Tb_Produto(Codigo),
Tb_Compra_Venda_Codigo INT, FOREIGN KEY (Tb_Compra_Venda_Codigo) REFERENCES Tb_Compra_Venda(Codigo));

INSERT INTO Tb_Modelo(Codigo, Descricao)
VALUES (1, 'Natural'), (2, 'Fitness'), (3, 'Toxic');

INSERT INTO Tb_Marca(Codigo, Descricao)
VALUES (1, 'Natureba'), (2, 'AgroToxic'), (3, 'Veneninho');

INSERT INTO Tb_Cliente(Codigo, Nome)
VALUES (1, 'Karl Max'), (2, 'Márcia Ana Clara'), (3, 'Eduarda'), (4, 'Zacquiel'), 
(5, 'Mary Jane') ;

INSERT INTO Tb_Vendedor(Codigo, Nome)
VALUES (1, 'Matheus'), (2, 'Lavínia'), (3, 'Jônatas');

INSERT INTO Tb_Produto (Codigo, Descricao, Preco, Tb_Modelo_Codigo, Tb_Marca_Codigo)
VALUES (1, 'Maçã', '1.00', 1, 1),(2, 'Pera' , '1.50', 2, 1), (3,'Jaca', '25.00', 2, 2),
(4,'Melancia', '27.00', 3, 2), (5,'Laranja', '0.75', 3, 2),(6,'Limão', '0.50', 1, 2), 
(7,'Banana', '0.25', 1, 1), (8,'Uva', '11.00', 3, 2), (9,'Carambola', '4.00', 3, 3), 
(10, 'Oxicoco', '6.50', 3, 3);

INSERT INTO Tb_Compra_Venda (Codigo, Data, Tb_Cliente_Codigo, Tb_Vendedor_Codigo)
VALUES (1, '2021-03-03', 5, 1), (2, '2021-03-05', 5, 3), (3, '2021-03-09', 5, 1), 
(4, '2021-03-13', 2, 3), (5, '2021-03-15', 1, 1), (6, '2021-03-17', 4, 3), (7, '2021-03-21', 4, 3), 
(8, '2021-03-24', 3, 1), (9, '2021-03-27', 4, 2), (10, '2021-03-31', 3, 1);

INSERT INTO Tb_Item (Codigo, Quantidade, Tb_Produto_Codigo, Tb_Compra_Venda_Codigo)
VALUES (1, 4, 1, 3),(2, 7, 7, 2),(3, 2, 4, 5),(4, 9, 5, 1), (5,7,3,4), (6,2,6,7), (7,5,2,9), (8,6,9,6), (9,4,8,10), (10,1,10,8);


/* a) Mostre todos os produtos com suas respectivas marcas e modelos. */

SELECT Tb_Produto.Codigo AS 'Código da fruta', Tb_Produto.Descricao AS 'Nome da fruta',
Tb_Marca.Descricao AS 'Nome da marca', Tb_Modelo.Descricao AS 'Nome do modelo'
FROM Tb_Produto
INNER JOIN Tb_Marca ON Tb_Produto.Tb_Marca_Codigo = Tb_Marca.Codigo
INNER JOIN Tb_Modelo ON Tb_Produto.Tb_Modelo_Codigo  = Tb_Modelo.Codigo
ORDER BY Tb_Produto.Codigo;


/* b) Mostre todos os vendedores que efetuaram alguma venda. */

SELECT Tb_Vendedor.Codigo AS 'Código do Vendedor', Tb_Vendedor.Nome AS 'Nome do Vendedor'
FROM Tb_Vendedor
INNER JOIN Tb_Compra_Venda ON Tb_Compra_Venda.Codigo = Tb_Vendedor.Codigo;


/* c) Mostre quais produtos (contendo marca, modelo) determinado cliente comprou. */

SELECT Tb_Cliente.Nome AS 'Nome do cliente', Tb_Produto.Descricao AS 'Nome da fruta',
Tb_Marca.Descricao AS 'Nome da marca', Tb_Modelo.Descricao AS 'Nome do modelo'
FROM Tb_Cliente
INNER JOIN Tb_Compra_Venda ON Tb_Compra_Venda.Tb_Cliente_Codigo = Tb_Cliente.Codigo
INNER JOIN Tb_Item ON Tb_Item.Tb_Compra_Venda_Codigo = Tb_Compra_Venda.Codigo
INNER JOIN Tb_Produto ON Tb_Item.Tb_Produto_Codigo = Tb_Produto.Codigo
INNER JOIN Tb_Marca ON Tb_Produto.Tb_Marca_Codigo = Tb_Marca.Codigo
INNER JOIN Tb_Modelo ON Tb_Produto.Tb_Modelo_Codigo = Tb_Modelo.Codigo
WHERE Tb_Cliente.Codigo = 5;


/* d) Mostre quantas vendas determinado vendedor fez.*/

SELECT Tb_Vendedor.Codigo AS 'Código do vendedor', Tb_Vendedor.Nome AS 'Nome do vendedor', 
COUNT(Tb_Compra_Venda.Tb_Vendedor_Codigo) AS 'Quantidade de vendas'
FROM Tb_Vendedor
INNER JOIN Tb_Compra_Venda ON Tb_Vendedor.Codigo = Tb_Compra_Venda.Tb_Vendedor_Codigo 
WHERE Tb_Vendedor.Codigo = 3;


/* e) Mostre o vendedor que mais vendeu. */

SELECT Tb_Vendedor.Codigo AS 'Código do vendedor', Tb_Vendedor.Nome AS 'Nome do vendedor', 
COUNT(Tb_Compra_Venda.Tb_Vendedor_Codigo) AS 'Quantidade de vendas'
FROM Tb_Vendedor
INNER JOIN Tb_Compra_Venda ON Tb_Vendedor.Codigo = Tb_Compra_Venda.Tb_Vendedor_Codigo 
GROUP BY Tb_Vendedor.Codigo
ORDER BY COUNT(Tb_Compra_Venda.Tb_Vendedor_Codigo) DESC 
LIMIT 1;


/* f) Mostre quanto determinado cliente gastou em todas suas compras. */

SELECT Tb_Cliente.Nome AS 'Nome do cliente', SUM(Tb_Produto.Preco * Tb_Item.Quantidade) AS 'Valor total das compras'
FROM  Tb_Cliente
INNER JOIN Tb_Compra_Venda ON Tb_Compra_Venda.Tb_Cliente_Codigo = Tb_Cliente.Codigo
INNER JOIN Tb_Item ON Tb_Item.Tb_Compra_Venda_Codigo = Tb_Compra_Venda.Codigo  
INNER JOIN Tb_Produto ON Tb_Produto.Codigo = Tb_Item.Tb_Produto_Codigo 
WHERE Tb_Cliente.Codigo = 1;

SELECT Tb_Cliente.Nome AS 'Nome do cliente', SUM(Tb_Produto.Preco * Tb_Item.Quantidade) AS 'Valor total das compras'
FROM  Tb_Cliente
INNER JOIN Tb_Compra_Venda ON Tb_Compra_Venda.Tb_Cliente_Codigo = Tb_Cliente.Codigo
INNER JOIN Tb_Item ON Tb_Item.Tb_Compra_Venda_Codigo = Tb_Compra_Venda.Codigo  
INNER JOIN Tb_Produto ON Tb_Produto.Codigo = Tb_Item.Tb_Produto_Codigo 
group by Tb_Cliente.Codigo;
