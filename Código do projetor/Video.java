package ProjetoGeral;

public class Video implements AcessaVideo {
    private String titulo;
    private float avaliacao;
    private float views;
    private double curtida;
    private boolean reproduzindo;

    // Contrutor
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtida = 0;
        this.reproduzindo = false;
    }

    // get é setts
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }
    public float getViews() {
        return views;
    }

    public void setViews(float views) {
        this.views = views;
    }
    public double getCurtida() {
        return curtida;
    }

    public void setCurtida(double curtida) {
        this.curtida = curtida;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
       this.setReproduzindo(false);
    }

    @Override
    public void like() {
       this.setCurtida(curtida + 1);
    }

    @Override
    public String toString() {
        return "\nVideo " + "titulo: " + titulo + ", avaliacao: " + avaliacao + ", views: " + views + ", curtida: " + curtida + ", reproduzindo: " + reproduzindo;
    }
}
