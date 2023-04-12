package br.com.alura.jdbc.teste;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaListagemDeCategorias {
    public static void main(String[] args) throws SQLException {

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {

            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> listaDeCategoria = categoriaDAO.listar();
            listaDeCategoria.stream().forEach(ct -> System.out.println(ct.getNome()));

            }
    }
}
