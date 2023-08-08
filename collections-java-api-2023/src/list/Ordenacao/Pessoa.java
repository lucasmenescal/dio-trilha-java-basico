package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>, Comparator<Pessoa> {
  private String nome;
  private Integer idade;
  private Double altura;

  public Pessoa(String nome, Integer idade, Double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public Pessoa() {
  }

  /**
   * Usando Comparator
   * @param p1 - Pessoa 1
   * @param p2 - Pessoa 2
   * @return Comparação entre alturas
  */
  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }

  /**
   * Usando Comparable
   * @param p - Pessoa
   * @return Comparação de idade
   */
  @Override
  public int compareTo(Pessoa p) {
    return Integer.compare(idade, p.getIdade());
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return this.idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Double getAltura() {
    return this.altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  @Override
  public String toString() {
    return "{" +
        " nome='" + getNome() + "'" +
        ", idade='" + getIdade() + "'" +
        ", altura='" + getAltura() + "'" +
        "}";
  }

}
