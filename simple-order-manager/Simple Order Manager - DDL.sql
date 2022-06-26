CREATE TABLE Cliente (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255),
    sobrenome VARCHAR(255),
    email VARCHAR(255),
    telefone VARCHAR(255),
    dataNascimento DATETIME,
    PRIMARY KEY(id)
);

CREATE TABLE Endereco (
    id INT AUTO_INCREMENT,
    estado VARCHAR(255),
    cidade VARCHAR(255),
	cep VARCHAR(255),
	rua VARCHAR(255),
	bairro VARCHAR(255),
	numero VARCHAR(255),
	comentario VARCHAR(255),
	tipo VARCHAR(255),
	cliente_id INT,
	PRIMARY KEY(id)
);

CREATE TABLE Pedido (
    id INT AUTO_INCREMENT,
    estado VARCHAR(255),
    tipoPagamento ENUM('boleto','cartao','pix'),
    precoTotal DOUBLE,
	cliente_id INT,
	endereco_id INT,
    PRIMARY KEY(id)
);

CREATE TABLE Produto (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255),
    preco DOUBLE,
    quantidade DOUBLE,    
    descricao VARCHAR(255),
    imagem BLOB,
	categoria_id INT,
    PRIMARY KEY(id)
);

CREATE TABLE Categoria (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255),
	PRIMARY KEY(id)
);

CREATE TABLE Pedido_Produto (
	pedido_id INT,
	produto_id INT,
    preco DOUBLE,
    quantidade DOUBLE,    
    PRIMARY KEY(pedido_id, produto_id)
);

ALTER TABLE Endereco ADD FOREIGN KEY (cliente_id) REFERENCES Cliente(id);
ALTER TABLE Pedido ADD FOREIGN KEY (cliente_id) REFERENCES Cliente(id);
ALTER TABLE Pedido ADD FOREIGN KEY (endereco_id) REFERENCES Endereco(id);
ALTER TABLE Produto ADD FOREIGN KEY (categoria_id) REFERENCES Categoria(id);
ALTER TABLE Pedido_Produto ADD FOREIGN KEY (pedido_id) REFERENCES Pedido(id);
ALTER TABLE Pedido_Produto ADD FOREIGN KEY (produto_id) REFERENCES Produto(id);