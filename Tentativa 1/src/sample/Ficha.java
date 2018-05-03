package sample;

public class Ficha {
    public Ficha(){

    }

    public Ficha(int mana, String nome, String classe, int XP){
        this.mana = mana;
        this.nome = nome;
        this.classe = classe;
        this.XP = XP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    private String nome;
    private String classe;
    private int mana;
    private int XP;

}
