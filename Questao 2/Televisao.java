public class Televisao {
    private int tamanhoTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public Televisao(int tamanhoTela, String marca, int voltagem) {
        this.tamanhoTela = tamanhoTela;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = 1;
    }

    public void ligar() {
        int consumo = tamanhoTela * voltagem;
        System.out.println("A televisão da marca " + marca + " está ligada. Consumo: " + consumo + " watts.");
    }

    public void desligar() {
        System.out.println("A televisão foi desligada.");
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume mínimo atingido.");
        }
    }

    public void subirCanal() {
        if (canal < 100) {
            canal++;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Já está no canal máximo.");
        }
    }

    public void descerCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Já está no canal mínimo.");
        }
    }

    public static void main(String[] args) {
        Televisao minhaTV = new Televisao(50, "Sony", 220);
        minhaTV.ligar();
        minhaTV.aumentarVolume();
        minhaTV.subirCanal();
        minhaTV.diminuirVolume();
        minhaTV.descerCanal();
        minhaTV.desligar();
    }
}
