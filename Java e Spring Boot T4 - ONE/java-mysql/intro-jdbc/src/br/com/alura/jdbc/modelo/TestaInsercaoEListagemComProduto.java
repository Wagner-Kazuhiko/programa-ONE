package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.dao.ProdutoDAO;

import java.sql.*;
import java.util.List;

public class TestaInsercaoEListagemComProduto {
    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Cômoda", "Cômoda vertical");

        try(Connection connection = new ConnectionFactory().recuperarConexao()){

            ProdutoDAO produtoDao = new ProdutoDAO(connection);
            produtoDao.salvar(comoda);
            List<Produto> listaDeProdutos = produtoDao.listar();
            listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
        }

        System.out.println(comoda);

    }
}
