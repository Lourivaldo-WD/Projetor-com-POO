package ProjetoGeral;

public class AssistirVideos {
    public void main(String[] args){
        Video v[] = new Video[2];
        v[0] = new Video("Primeiro passos em poo");
        v[1] = new Video("Progrmando com poo");

        Espectador e[] = new Espectador[2];
        e[0] = new Espectador("Louro", 22, "M", "Louro@gmail");
        e[1] = new Espectador("Giseli", 23, "F", "Giseli@gmail");

        Visualizacao vis = new Visualizacao(e[0], v[0]);
        vis.avaliar(90.5f);
        System.out.println(vis.toString());



        /*System.out.println(v[0].toString());
        System.out.println(e[0].toString());
        System.out.println(v[1].toString());
        System.out.println(e[1].toString());*/

    }
}
