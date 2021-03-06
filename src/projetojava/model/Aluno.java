package projetojava.model;

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;



public class Aluno extends Pessoa{

	
	/* atributos*/
	private String dataMatricula;
	private Curso curso;
	
	
	/*lista de disciplinas do aluno*/
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	/* construtor*/
    public Aluno() { 
		
		
	}

  
    
    
    /* getters setters */
	public String getDataMatricula() {
		return dataMatricula;
	}


	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
		
	}
	
    
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}




	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

//----------------------------------


	/*calcula e retorna a media das disciplinas*/
	public double mediAluno() {
		
	double mediaNota=0;
	
	     for(int i=0; i<= this.disciplinas.size();i++) {
	
		     mediaNota += this.disciplinas.get(i).getNotaDisciplina();
	    }
		
	 return mediaNota / this.disciplinas.size();
	}


   //------

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}


    //------

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", disciplinas=" + disciplinas + "]";
	}

	
	//-----
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
