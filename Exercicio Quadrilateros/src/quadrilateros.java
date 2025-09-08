public class quadrilateros {
    public static void main(String[] args) {
        //Preciso criar um programa que, através de um sobrecarga de métodos, calcule a
        // área dos 3 quadrilateros: quadrado, trapézio, retângulo



    }

    public static float quadrilateros(float lado1, float lado2){
        float area = lado1 * lado2;
        return area;
    }
    public static float quadrilateros(float b1, float b2, float altura){
        float area = (b1 + b2) * altura / 2;
        return area;
    }

}
