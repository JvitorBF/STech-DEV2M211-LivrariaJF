/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.TLivrariaJF.services;

/**
 *
 * @author João Vitor
 */
public class ServicosFactory {

    private static final ClienteServicos clienteServicos = new ClienteServicos();

    public static ClienteServicos getClienteServicos() {
        return clienteServicos;
    }
    
    private static final EditoraServicos editoraServicos = new EditoraServicos();
    
    public EditoraServicos getEditoraServicos() {
        return editoraServicos;
    }
    
    private static final LivroServicos livroServicos = new LivroServicos();
    
    public static LivroServicos getLivroServicos() {
        return livroServicos;
    }
}
