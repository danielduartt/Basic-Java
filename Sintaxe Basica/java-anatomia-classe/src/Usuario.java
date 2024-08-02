public class Usuario {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV(); 
        tv.conferir_estado();
        tv.ligar();
        tv.conferir_estado();
        tv.aumentar_volume();
        tv.aumentar_volume();
        tv.diminuir_volume();
        tv.aumentar_canal();
        tv.aumentar_canal();
        tv.diminuir_canal();
        tv.desligar();
        tv.conferir_estado();
    }
}
