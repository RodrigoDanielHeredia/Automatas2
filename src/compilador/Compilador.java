package compilador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Compilador {

    public static void main(String[] args) throws IOException {
        //Declaración e inicialización de Atributos
        TablaSimbolos token = new TablaSimbolos();
        Automatas obj = new Automatas();
        int automata = 0;
        boolean bandera = false;
        String cadena = "";
        String[] palabra;
        String Descripcion = "";
        ArrayList<TablaSimbolos> Tabla = new ArrayList<TablaSimbolos>();
        ArrayList<TablaSimbolos> Error = new ArrayList<TablaSimbolos>();
        //Manejo de archivos para su apertura, escritura y lectura
        File archivo = new File("TablaSimbolos.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        bw.write("");
        BufferedWriter bfw = new BufferedWriter(new FileWriter(archivo, true));

        File error = new File("Error.txt");
        FileReader er = new FileReader(error);
        BufferedReader ebr = new BufferedReader(er);
        BufferedWriter ebw = new BufferedWriter(new FileWriter(error));
        bw.write("");
        BufferedWriter ebfw = new BufferedWriter(new FileWriter(error, true));
        //Identificadores de los tokens
        int OpMat = 100, PalRes = 200, vari = 300, rel = 400, asig = 425, opLog = 450, valorNum = 500, valReal = 501;

        //Archivo contenedor de los programas ejemplos
        File fichero = new File("src\\Programa1.txt");
        Scanner scan = null;
        //Método que al detectar una excepción procede a avisare al usuario
        try {
            scan = new Scanner(fichero);
            //Lectura del archivo para su posterios lectura por líneas y separación por medio de espacios
            while (scan.hasNextLine()) {
                cadena = scan.nextLine();
                palabra = cadena.split(" ");
                //Ciclo que ayuda a evaluar una por una las palabras y simbolos de cada línea leída
                for (int i = 0; i < palabra.length; i++) {
                    //Ciclo de verificación de aprovación o rechazo por medio de una bandera y un contador
                    while (!bandera && automata <= 21) {
                        automata++;
                        switch (automata) {
                            case 1: {
                                bandera = obj.AutomataInicio(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 2: {
                                bandera = obj.AutomataEntero(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 3: {
                                bandera = obj.AutomataDecimal(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 4: {
                                bandera = obj.AutomataCadena(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 5: {
                                bandera = obj.AutomataBooleano(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 6: {
                                bandera = obj.AutomataMientras(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 7: {
                                bandera = obj.AutomataPara(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 8: {
                                bandera = obj.AutomataSi(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 9: {
                                bandera = obj.AutomataCaracter(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 10: {
                                bandera = obj.AutomataFin(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Palabra reservada";
                                }
                            }
                            break;
                            case 11: {
                                bandera = obj.AutomataVariables(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Identificador";
                                }
                            }
                            break;
                            case 12: {
                                String desc = "";
                                Operador operador = new Operador();
                                operador = obj.AutomataOperador(palabra[i], desc);
                                Descripcion = desc;
                                if (operador.bandera) {
                                    bandera = true;
                                    Descripcion = operador.descripcion;
                                }

                            }
                            break;
                            case 13: {
                                bandera = obj.AutomataRelacion(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Operador de relacion";
                                }
                            }
                            break;
                            case 14: {
                                bandera = obj.AutomataAnd(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Operador de relacion";
                                }
                            }
                            break;
                            case 15: {
                                bandera = obj.AutomataOr(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Operador de relacion";
                                }
                            }
                            break;
                            case 16: {
                                bandera = obj.AutomataNumeros(palabra[i]);
                                if (bandera) {
                                    Descripcion = "Numero";
                                }
                            }
                        }
                    }
                    //Verificación de termino del ciclo anterior y proceder a escribir en la tabla de simbolos o de errores
                    if (bandera) {

                        token.Token = palabra[i];
                        token.ID = i;
                        token.Descripcion = Descripcion;
                        String opc = Descripcion;
                        switch (opc) {
                            case "Palabra reservada":
                                PalRes++;
                                token.ID = PalRes;
                                break;
                            case "Operador Asignacion":
                                asig++;
                                token.ID = asig;
                                break;
                            case "Operador Suma":
                                OpMat++;
                                token.ID = OpMat;
                                break;
                            case "Operador Resta":
                                OpMat++;
                                token.ID = OpMat;
                                break;
                            case "Operador Multiplicacion":
                                OpMat++;
                                token.ID = OpMat;
                                break;
                            case "Operador Division":
                                OpMat++;
                                token.ID = OpMat;
                                break;
                            case "Numero":
                                valorNum++;
                                token.ID = valorNum;
                                break;
                            case "Identificador":
                                vari++;
                                token.ID = vari;
                                break;
                            case "Operador de relacion":
                                rel++;
                                token.ID = rel;
                                break;

                        }
                        System.out.println(token.ID + " " + token.Token + " " + token.Descripcion);
                        Tabla.add(token);
                        bandera = false;
                        automata = 0;
                        String registro = "";
                        registro = token.ID + "\t" + token.Token + "\t" + token.Descripcion;
                        bfw.write(registro);
                        bfw.newLine();
                    } else {
                        token.Token = palabra[i];
                        token.ID = i;
                        token.Descripcion = Descripcion;
                        System.out.println("Error: " + token.ID + " " + token.Token);
                        String err = "";
                        err = "Error: " + token.ID + " " + token.Token;
                        ebw.write(err);
                        ebw.newLine();
                        Error.add(token);
                        bandera = false;
                        automata = 0;
                    }
                }

            }
            ebw.close();
            bfw.close();
        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }

    }

}