public class SmartTV {
    boolean estado;
    int canal; 
    int volume; 
    final int maxVolume = 100; 
    final int minVolume = 0; 
    final int maxCanal = 999; 
    final int minCanal = 1;   

    public SmartTV(){
        this.estado = false; 
        this.canal = minCanal; 
        this.volume = minVolume; 
    }

    public void ligar(){
        if(!this.estado){
            System.out.println("Ligando a TV");
            this.estado = true; 
        }else{
            System.out.println("A TV já está ligada");
        }
    }

    public void desligar(){
        if(this.estado){
            System.out.println("Desligando a TV");
            this.estado = false; 
        }else{
            System.out.println("A TV já está desligada");
        }
    }

    public void conferir_estado(){
        System.out.printf("A TV está %s%n", this.estado ? "Ligada" : "Desligada"); 
        System.out.printf("Canal atual: %d%n", this.canal);
        System.out.printf("Volume atual: %d%n", this.volume);
    }

    public void aumentar_volume(){
        if (this.volume < this.maxVolume){
            this.volume++; 
            System.out.printf("Volume aumentado para: %d%n", this.volume);
        }else{
            System.out.println("O Volume já está no máximo");
        }
    }

    public void diminuir_volume(){
        if (this.volume > this.minVolume){
            this.volume--; 
            System.out.printf("Volume diminuído para: %d%n", this.volume);
        }else{
            System.out.println("O Volume já está no mínimo");
        }
    }

    public void aumentar_canal(){
        if (this.canal < this.maxCanal){
            this.canal++; 
            System.out.printf("Canal aumentado para: %d%n", this.canal);
        }else{
            System.out.println("O Canal já está no máximo");
        }
    }

    public void diminuir_canal(){
        if (this.canal > this.minCanal){
            this.canal--; 
            System.out.printf("Canal diminuído para: %d%n", this.canal);
        }else{
            System.out.println("O Canal já está no mínimo");
        }
    }
}
