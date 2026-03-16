package ProjetoGeral;

public class Visualizacao {
    private Espectador escrito;
    private Video video;

    public Visualizacao(Espectador escrito, Video video) {
        this.escrito = escrito;
        this.video = video;
        this.escrito.setTotAssistido(this.escrito.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }
     // sobreGarga
    public void avaliar(){
       this.video.setAvaliacao(5);
    }
    public void avaliar(int nota){
       this.video.setAvaliacao(nota);
    }
    public void avaliar(float porc){
       int tot = 0;
       if (porc <= 20){
           tot = 3;
       }else if (porc <= 50){
           tot = 5;
       }else if (porc <= 90){
           tot = 8;
       }else{
           tot = 10;
       }
       this.video.setAvaliacao(tot);
    }

    public Espectador getEscrito() {
        return escrito;
    }
    public void setEscrito(Espectador escrito) {
        this.escrito = escrito;
    }
    public Video getVideo() {
        return video;
    }
    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizaçã o: " + "escrito: " + escrito + ", video: " + video;
    }
}

