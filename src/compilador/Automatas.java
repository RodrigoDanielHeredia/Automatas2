package compilador;
//Clase en donde se alojan los métodos pertenecientes a cada autómata diseñado previamente
public class Automatas 
{
    public boolean AutomataInicio(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'I'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'n'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 'i'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'c'){
                        estado = 4;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    if(caracter == 'i'){
                        estado = 5;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 5:
                    if(caracter == 'o'){
                        estado = 6;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 6:
                        estado = 6;
                        respuesta = false;
                    break;

            }
        }
        return respuesta;
    }
    
    public boolean AutomataEntero(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'e'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'n'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 't'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'e'){
                        estado = 4;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    if(caracter == 'r'){
                        estado = 5;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 5:
                    if(caracter == 'o'){
                        estado = 6;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 6:
                        estado = 6;
                        respuesta = false;
                    break;

            }
        }
        return respuesta;
    }
     
    public boolean AutomataDecimal(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'd'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'e'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 'c'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'i'){
                        estado = 4;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    if(caracter == 'm'){
                        estado = 5;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 5:
                    if(caracter == 'a'){
                        estado = 6;
                        
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 6:
                    if(caracter == 'l'){
                        estado = 7;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 7:
                        estado = 7;
                        respuesta = false;
                        System.out.println("7");
                    break;

            }
        }
        return respuesta;
    }
    
    public boolean AutomataCadena(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'c'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'a'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 'd'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'e'){
                        estado = 4;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    if(caracter == 'n'){
                        estado = 5;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 5:
                    if(caracter == 'a'){
                        estado = 6;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 6:
                        estado = 6;
                        respuesta = false;
                    break;

            }
        }
        return respuesta;
    }
    
    public boolean AutomataBooleano(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'b'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'o'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 'o'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'l'){
                        estado = 4;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    if(caracter == 'e'){
                        estado = 5;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 5:
                    if(caracter == 'a'){
                        estado = 6;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 6:
                    if(caracter == 'n'){
                        estado = 7;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 7:
                    if(caracter == 'o'){
                        estado = 8;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 8:
                        estado = 8;
                        respuesta = false;
                    break;

            }
        }
        return respuesta;
    }
    
    public boolean AutomataMientras(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'm'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'i'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 'e'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'n'){
                        estado = 4;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    if(caracter == 't'){
                        estado = 5;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 5:
                    if(caracter == 'r'){
                        estado = 6;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 6:
                    if(caracter == 'a'){
                        estado = 7;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 7:
                    if(caracter == 's'){
                        estado = 8;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 8:
                        estado = 8;
                        respuesta = false;
                    break;

            }
            if(estado==15){
                i=temp.length();
            }           
        }
        return respuesta;
    }
      
    public boolean AutomataPara(String par1){
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i = 0; i<temp.length();i++){
            char caracter=temp.charAt(i);
            
            
            switch(estado){
                case 0:
                    if(caracter == 'p'){
                        estado = 1;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 1:
                    if(caracter == 'a'){
                        estado = 2;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 2:
                    if(caracter == 'r'){
                        estado = 3;
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 3:
                    if(caracter == 'a'){
                        estado = 4;
                        respuesta=true; //Aqqui le puse true porque si ya esta en el estado 5 y da true va a ir al estado 6 que es el final entonces por logica es verdadero
                                        //ya que tuve un problema porque "o" es el ultimo caracter entonces ya no va a poder ir al case 6
                    }
                    else{
                        estado=15;
                    }
                    break;
                case 4:
                    estado = 4;
                    respuesta = false;
                    break;
            }

        }
        return respuesta;
    }
    
    public boolean AutomataSi(String par1)
    {
        boolean respuesta = false;
        String temp=par1;
        int estado = 0;
        for(int i = 0;i < temp.length();i++)
        {
            char caracter = temp.charAt(i);
            
            switch(estado)
            {
                case 0:
                {
                    if(caracter == 's')
                        estado = 1;
                    else
                        estado = 3;
                }break;
                case 1:
                {
                    if(caracter == 'i')
                    {
                        estado = 2;
                        respuesta = true;
                    }
                    else
                        estado = 3;
                }break;
                default:
                {
                    estado = 3;
                    respuesta = false;
                }
            }
        }
        return respuesta;
    }
    
    public boolean AutomataCaracter(String par1)
    {
        boolean respuesta = false;
        String temp=par1;
        int estado = 0;
        char caracter = ' ';
        for(int i = 0; i < temp.length(); i++)
        {
            caracter = temp.charAt(i);
            switch(estado)
            {
                case 0:
                {
                    if(caracter == 'C')
                        estado = 1;
                    else
                        estado = 9;
                }break;
                
                case 1:
                {
                    if(caracter == 'a')
                        estado = 2;
                    else
                        estado = 9;
                }break;
                
                case 2:
                {
                    if(caracter == 'r')
                        estado = 3;
                    else
                        estado = 9;
                }break;
                
                case 3:
                {
                    if(caracter == 'a')
                        estado = 4;
                    else
                        estado = 9;
                }break;
                
                case 4:
                {
                    if(caracter == 'c')
                        estado = 5;
                    else
                        estado = 9;
                }break;
                
                case 5:
                {
                    if(caracter == 't')
                        estado = 6;
                    else
                        estado = 9;
                }break;
                
                case 6:
                {
                    if(caracter == 'e')
                        estado = 7;
                    else
                        estado = 9;
                }break;
                
                case 7:
                {
                    if(caracter == 'r')
                    {
                        estado = 8;
                        respuesta = true;
                    }
                    else
                        estado = 9;
                }break;
                                
                default:
                {
                    estado = 9;
                    respuesta = false;
                }
            }
        }
        return respuesta;        
    }
    
    public boolean AutomataFin(String par1)
    {
        boolean respuesta = false;
        String temp=par1;
        int estado = 0;
        char caracter = ' ';
        for(int i = 0; i < temp.length(); i++)
        {
            caracter = temp.charAt(i);
            switch(estado)
            {
                case 0:
                {
                    if(caracter == 'F')
                        estado = 1;
                    else
                        estado = 4;
                }break;
                
                case 1:
                {
                    if(caracter == 'i')
                        estado = 2;
                    else
                        estado = 4;
                }break;
                
                case 2:
                {
                    if(caracter == 'n')
                    {
                        estado = 3;
                        respuesta = true;
                    }
                    else
                        estado = 4;
                }break;
                
                default:
                {
                    estado = 4;
                    respuesta = false;
                }
            }
        }
        return respuesta;
    }
    
    public boolean AutomataVariables(String par1)
    {
        boolean respuesta = false;
        String temp=par1;
        int estado = 0;
        char caracter = ' ';
        for(int i = 0; i < temp.length(); i++)
        {
            caracter = temp.charAt(i);
            switch(estado)
            {
                case 0:
                {
                    if(caracter >= 97 && caracter <=122)
                    {
                        estado = 1;
                        respuesta = true;
                    }
                    else
                        estado = 5;
                }break;
                case 1:
                {
                    if(caracter >= 97 && caracter <=122)
                    {
                        estado = 1;
                        respuesta = true;
                    }
                    else
                    {
                        if(caracter >= 48 && caracter <=57)
                        {
                            estado = 2;
                            respuesta = true;
                        }
                        else
                            estado = 5;
                    }
                }break;
                case 2:
                {
                    if(caracter >= 48 && caracter <=57)
                    {
                        estado = 2;
                        respuesta = true;
                    }
                    else
                        estado = 5;
                }break;
                default:
                {
                    estado = 5;
                    respuesta = false;
                }
            }
        }
        return respuesta;
    }
    
    public Operador AutomataOperador(String par1, String descripcion){
        boolean respuesta =false;
        Operador operador = new Operador();
        operador.bandera=false;
        
        switch(par1){
            case "+":
                operador.bandera=true;
                operador.descripcion = "Operador Suma";
                break;
            case "-":
                operador.bandera=true;
                operador.descripcion = "Operador Resta";
                break;
            case "/":
                operador.bandera=true;
                operador.descripcion = "Operador Division";
                break;
            case "*":
                operador.bandera=true;
                operador.descripcion = "Operador Multiplicacion";
                break;
            case "=":
                operador.bandera=true;
                operador.descripcion = "Operador Asignacion";
                break;
        }
        
        
        return operador;
    }
    
    public boolean AutomataRelacion(String par1)
    {
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i =0; i> temp.length(); i++)
        {
            char caracter=temp.charAt(i);
            switch(estado){
                case 0:
                    if(caracter == '='){
                        estado = 1;
                    }
                    else{
                        estado=99;
                    }
                    break;
                case 1:
                    if(caracter == '='){
                        estado = 2;
                        respuesta=true;
                    }
                    else{
                        estado=99;
                    }
                    break;
                default:
                    respuesta=false;
            }
        }
        return respuesta;
    }
    
    public boolean AutomataAsignacion(String par1)
    {
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i =0; i> temp.length(); i++)
        {
            char caracter=temp.charAt(i);
            switch(estado){
                case 0:
                    if(caracter == '='){
                        estado = 1;
                        respuesta=true;
                    }
                    else{
                        estado=99;
                    }
                    break;
                default:
                    estado=99;
                    respuesta=false;
            }
        }
        return respuesta;
    }
    
    public boolean AutomataAnd(String par1)
    {
         boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i =0; i < temp.length(); i++)
        {
            char caracter=temp.charAt(i);
            switch(estado){
                case 0:
                    if(caracter == '&'){
                        estado = 1;
                    }
                    else{
                        estado=99;
                    }
                    break;
                case 1:
                    if(caracter == '&'){
                        estado = 2;
                        respuesta=true;
                    }
                    else{
                        estado=99;
                    }
                    break;
                default:
                    estado=99;
                    respuesta=false;
            }
        }
        return respuesta;
    }
    
     public boolean AutomataOr(String par1)
    {
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i =0; i < temp.length(); i++)
        {
            char caracter=temp.charAt(i);
            switch(estado){
                case 0:
                    if(caracter == '|'){
                        estado = 1;
                        System.out.println("asd");
                    }
                    else{
                        estado=99;
                    }
                    break;
                case 1:
                    if(caracter == '|'){
                        estado = 2;
                        respuesta=true;
                    }
                    else{
                        estado=99;
                    }
                    break;
                default:
                    estado=99;
                    respuesta=false;
            }
        }
        return respuesta;
    }
    
     public boolean AutomataNumeros(String par1)
    {
        boolean respuesta = false;
        String temp;
        temp = par1;
        int estado=0;
        for(int i =0; i < temp.length(); i++)
        {
            char caracter=temp.charAt(i);
            switch(estado){
                case 0:
                    if(caracter == '0'){
                        estado = 1;
                        respuesta=true;
                    }
                    else{
                        if(caracter >=49 && caracter <= 57)
                        {
                            estado=4;
                            respuesta=true;
                        }
                        else
                        {
                            estado=99;
                        }
                    }
                    break;
                case 1:
                    respuesta = false;
                    if(caracter=='.'){
                        estado = 2;
                    }
                    else{
                        estado=99;
                    }
                    break;
                case 2:
                    if(caracter >=48 && caracter <= 57)
                    {
                        estado=3;
                        respuesta=true;
                    }
                    else
                    {
                        estado=99;
                    }
                case 3:
                    if(caracter >=48 && caracter <= 57)
                    {
                        estado=3;
                        respuesta=true;
                    }
                    else
                    {
                        respuesta=false;
                        estado=99;
                    }
                case 4:
                    if(caracter >=48 && caracter <= 57){
                        estado = 4;
                        respuesta=true;
                    }
                    else{
                        if(caracter=='.')
                        {
                            estado=2;
                            respuesta=false;
                        }
                        else
                        {
                          respuesta=false;
                          estado=99;
                        }
                    }
                    break;
                default:
                    estado=99;
                    respuesta=false;
            }
        }
        return respuesta;
    }
}
