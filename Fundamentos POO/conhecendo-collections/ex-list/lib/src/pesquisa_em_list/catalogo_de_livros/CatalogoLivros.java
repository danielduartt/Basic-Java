package pesquisa_em_list.catalogo_de_livros;
import java.util.ArrayList; 
import java.util.List; 


public class CatalogoLivros {
   private  List<Livro> catalogoLivros; 

   public CatalogoLivros(){
    this.catalogoLivros = new ArrayList<>(); 
   }

   public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));    
   }

   public List<Livro>  pesquisarPorAutor(String autor){
        List<Livro> autores_encontrados = new ArrayList<>(); 
            if (!catalogoLivros.isEmpty()){
                for(Livro l : catalogoLivros){
                    if(l.getAutor().equalsIgnoreCase(autor)){
                        autores_encontrados.add(l);
                    }
                }
            }
            return autores_encontrados; 
        }
    
    public List<Livro> pesquisarPorTitulo(String titulo){
            List<Livro> livrosEncontrados = new ArrayList<>(); 
            if (!catalogoLivros.isEmpty()){
                for(Livro l : catalogoLivros){
                    if(l.getTitulo().equalsIgnoreCase(titulo)){
                        livrosEncontrados.add(l);
                    }
                }
            }
            return livrosEncontrados; 
    }

    public List<Livro> pesquisarPorIntervalo(int anoInicial, int anoFinal){
        List<Livro> listaPorIntervalo = new ArrayList<>(); 
        if(!catalogoLivros.isEmpty()){
            for(Livro l : catalogoLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() < anoFinal){
                    listaPorIntervalo.add(l);
                }
            }
        }
        return listaPorIntervalo; 
    }

   }
