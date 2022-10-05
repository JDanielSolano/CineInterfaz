package Proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Inventario {

    static Persona persona[] = new Persona[10];
    static int cont = 0;

    void agregar(String nombre, String apellido, String email, String direccion, int id, String tel) {
        //                agregar(p.getNombre(),p.getApellido(),p.getEmail(),p.getDireccion(),p.getId(),p.getTel());
        try {
            File bloc = new File("basededatos.txt");
            java.io.BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bloc, true));
            bufferedWriter.newLine();
            bufferedWriter.append(nombre);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.append(apellido);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.append(email);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.append(direccion);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.append("" + id);
            bufferedWriter.flush();
            bufferedWriter.newLine();
            bufferedWriter.append(tel);
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void imprima() {

        String msj = "";

        for (int i = 0; i < persona.length; i++) {
            if (persona[i] != null) {
                msj += persona[i];
            }
        }
        try {
            File file = new File("./Clientes.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(msj);
            bw.close();
            System.out.println("Listo");
        } catch (IOException e) {
        }
    }

}
