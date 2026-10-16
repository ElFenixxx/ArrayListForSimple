public class ArregloAutos {
    public static void main(String[] args) {
        String[] autos = new String[10]; 
        int size = 0;                    
        autos[size++] = "Corvette";
        autos[size++] = "Challenger";
        autos[size++] = "Dodge Viper";
        autos[size++] = "Tsuru";
        autos[size++] = "Chevy";
        System.out.print("Lista inicial: [");
        for (int i = 0; i < size; i++) {
            System.out.print(autos[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println("Total de autos (size): " + size);
        for (int i = 0; i < size; i++) {
            if (autos[i].equals("Corvette")) {
                for (int j = i; j < size - 1; j++) {
                    autos[j] = autos[j + 1];
                }
                autos[--size] = null;
                break;
            }
        }
        System.out.print("\nLista después de eliminar: [");
        for (int i = 0; i < size; i++) {
            System.out.print(autos[i] + (i < size - 1 ? ", " : ""));
        }
        System.out.println("]");
        boolean hay = false;
        for (int i = 0; i < size; i++) {
            if (autos[i].equals("Challenger")) {
                hay = true;
                break;
            }
        }
        System.out.println("¿Hay Challenger?: " + hay);
        System.out.println("Elemento en posición 0: " + autos[0]);
    }
}