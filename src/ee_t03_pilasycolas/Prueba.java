/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author IngridNiño
 */
public class Prueba {
    private String nomArchivo;
    private int cont;
    private char tipo;
    private Pila p;
    private Cola c;
    private String dato[];
    
    public  void leerArchivo(){
        nomArchivo = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        try{
        BufferedReader br=new BufferedReader(new FileReader(nomArchivo + ".txt"));
        String l;
        l = br.readLine();
        tipo=l.charAt(0);
        while(l!=null){
            if(cont==0){
                if(tipo=='0'){
                p=new Pila<Integer>();
                cont++;
                }else if(tipo=='1'){
                c=new Cola<Integer>();
                cont++;
                }
            }else{
                dato=l.split(" ");
                if(tipo=='0'){
                    if(dato[0].equals("0")){
                        p.push(Integer.parseInt(dato[1]));
                    }else if(l.equals("1")){
                        System.out.println(p.pop());
                    }else if(l.equals("2")){
                        p.peek();
                    }
                }else if (tipo == '1'){
                    if(dato[0].equals("0")){
                        c.insertar(Integer.parseInt(dato[1]));
                    }else if(l.equals("1")){
                        c.eliminar();
                    }
                }
            }
            l=br.readLine();
            
          }
        }catch(IOException e){
        JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public static void main(String[] args) {
        Prueba prueba=new Prueba();
        prueba.leerArchivo();;
    }
}

