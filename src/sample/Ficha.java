package sample;

public class Ficha {
    public Ficha(){

    }

    public Ficha(int mana, String nome, String classe, int XP,int Int){
        this.mana = mana;
        this.nome = nome;
        this.classe = classe;
        this.XP = XP;
        this.Int = Int;
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

    public boolean getMorto() {
        return Morto;
    }

    public void setMorto(boolean morto) {
        Morto = morto;
    }

    public void setInt(int Int) {
        this.Int = Int;
    }

    public int getInt() {
        return Int;
    }

    private String nome;
    private String classe;
    private int mana;
    private int XP;
    private int Int;
    private boolean Morto = false;

}
