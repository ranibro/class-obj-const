public class ClasseExterna {
    int numero1;
    int numero2;

    public ClasseExterna(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public class ClasseInterna {
        int numero3;
        int numero4;    

        public void setNumeros(int numero3, int numero4){
            this.numero3 = numero3;
            this.numero4 = numero4;
        }

        public int getnumero1(){
            return numero1;
        }

        public int getnumero2(){
            return numero2;
        }

        public int getnumero3() {
            return numero3;
        }

        public int getnumero4() {
            return numero4;
        }
    }
}
