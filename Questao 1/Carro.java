public class Carro {
    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;
    private boolean ligado;

    public Carro(String modelo, double aceleracao) {
        this.modelo = modelo;
        this.aceleracao = aceleracao;
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }

    public void acelerar() {
        if (ligado) {
            velocidade += aceleracao;
            System.out.println("Acelerando. Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro está desligado. Não é possível acelerar.");
        }
    }

    public void desacelerar() {
        if (ligado && velocidade > 0) {
            velocidade -= aceleracao;
            System.out.println("Desacelerando. Velocidade atual: " + velocidade);
        } else {
            System.out.println("O carro está parado ou desligado. Não é possível desacelerar.");
        }
    }

    public void virarDireita() {
        System.out.println("Virando à direita.");
    }

    public void virarEsquerda() {
        System.out.println("Virando à esquerda.");
    }

    public void subirMarcha() {
        if (ligado && marcha < 5) {
            marcha++;
            System.out.println("Subindo marcha. Marcha atual: " + marcha);
        } else {
            System.out.println("Não é possível subir mais a marcha.");
        }
    }

    public void descerMarcha() {
        if (ligado && marcha > 0) {
            marcha--;
            System.out.println("Descendo marcha. Marcha atual: " + marcha);
        } else {
            System.out.println("Não é possível descer mais a marcha.");
        }
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Marcha: " + marcha);
        System.out.println("Carro " + (ligado ? "ligado" : "desligado"));
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca", 10.0);
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.subirMarcha();
        meuCarro.exibirInfo();
        meuCarro.virarEsquerda();
        meuCarro.desligar();
    }
}
