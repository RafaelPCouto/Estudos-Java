package isiflix.exceptions;

public class Produto {
    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IsiException("ID não pode ser zero ou negativo");
        }
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.length() == 0) {
            throw new IsiException("Descrição precisa ser obrigatória");
        }
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao=" + descricao +
                '}';
    }
}
