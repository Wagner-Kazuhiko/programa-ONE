package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.dao.ProdutoDAO;

import java.sql.*;

public class TestaInsercaoComProduto {
    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda vertical");

        try(Connection connection = new ConnectionFactory().recuperarConexao()){

            ProdutoDAO produtoDao = new ProdutoDAO(connection);
            produtoDao.salvar(comoda);
            //Lista = persistenciaProduto.listar();
        }

        System.out.println(comoda);

    }
}
