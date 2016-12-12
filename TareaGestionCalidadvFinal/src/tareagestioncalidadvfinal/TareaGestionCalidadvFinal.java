/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagestioncalidadvfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JOSESTALIN
 */
public class TareaGestionCalidadvFinal {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        // TODO code application logic here
        Scanner entradax =new Scanner(System.in);
        System.out.println("-----TAREA DE GESTION DE CALIDAD------");
        System.out.println("INTEGRANTES:\n* PROAÑO MOLINA \n* ECHEVERRIA SUAREZ\n* PILAY ANCHUNDIA");
        System.out.printf("Presione enter para continuar...");                 
        System.out.println("\n1.-\n3.-\n5.-\n7.-\n9.-"
                + "\n11.-\n13.-\n15.-\n17.-\n19.-\n21.-\n23.-\n25.-\n27.-\n29.-\n31.-\n33.-\n35.-\n37.-\n39.-\nSELECCIONE EL NUMERO DEL EJERCICIO A REALIZAR:");
       opcion=entradax.nextInt();
       switch(opcion)
       {
           case 1:

           Ejercicio1();
       break;
           case 3:
          Ejercicio3();
       break;
           case 5:
          Ejercicio5();
       break;
           case 7:
          Ejercicio7();
       break;
           case 9:
          Ejercicio9();
       break;
           case 11:
          Ejercicio11();
       break;
           case 13:
          Ejercicio13();
       break;
           case 15:
          Ejercicio15();     
       break;
           case 17:
          Ejercicio17();
       break;
           case 19:
           Ejercicio19();
       break;
           case 21:
           Ejercicio21();
       break;
        
           case 23:
           Ejercicio23();
       break;
           case 25:
           Ejercicio25();
       break;
           case 27:
               Ejercicio27();
               //LLeva tiempo e investigar
       break;
           case 29:
               Ejercicio29();
       break;
           case 31:
               Ejercicio31();
       break;
           case 33:
                 Ejercicio33();
       break;
           case 35:
               Ejercicio35();
       break;
           case 37:
                Ejercicio37();
       break;
           case 39:
               Ejercicio39();
       break;
           default:
               System.out.println("Ud ingreso un numero invalido");
               break;
               
       }
    }


      public static void Ejercicio1(){
        System.out.println("Ingresar los lados de un triángulo \n(validar que se forme un triángulo), luego pida al usuario (ingrese) cual sería el área de ese triángulo.\nMuestre en cuanto porcentaje se equivocó el usuario, si es menos del 5% imprima \"usted es una calculadora!!!\", si es entre 5% y 20%, imprima \"Bien, bien, no muy bien pero bien\", si supera el 25% imprima \"sería bueno hacer más cálculos mentales\". ");
        Scanner ingreso = new Scanner(System.in);
        double ladoA=0, ladoB=0, ladoC=0, areaU, semip=0, areaR, porcentajeEstimado, error;
        int porcentajeTotal = 100;
        int bandera =0;
        while(bandera==0){
            System.out.println("Ingrese el primer lado:");
            ladoA = ingreso.nextDouble();
            System.out.println("Ingrese el segundo lado:");
            ladoB = ingreso.nextDouble();
            System.out.println("Ingrese el tercer lado:");
            ladoC = ingreso.nextDouble();
            if (((ladoA+ladoB)>ladoC)&&((ladoA+ladoC)>ladoB)&&((ladoB+ladoC)>ladoA)) {
                bandera = 1;
            }else{
                System.out.println("Estos lados no forman un triángulo, ingrese sus lados nuevamente");
            }
        }
        System.out.println("Ingrese su el área de su triángulo");
        areaU=ingreso.nextDouble();
        try{
            semip=(ladoA+ladoB+ladoC)/2;
            areaR=Math.sqrt(semip*(semip-ladoA)*(semip-ladoB)*(semip-ladoC));
            porcentajeEstimado = (areaU*porcentajeTotal)/areaR;
            error = porcentajeTotal - porcentajeEstimado;
            if (error < 0) {
                error = error*(-1);
            }
            if (error <=5 && error>=0) {
                System.out.println("Usted es una calculadora!!");
            }else{
                if ((error > 5)&&(error < 20)) {
                    System.out.println("Bien, bien, no muy bien pero bien");
                }else{
                    if (error > 25) {
                        System.out.println("sería bueno hacer más cálculos mentales");
                    }else{
                        System.out.println("Su porcentaje de error es de: "+error+"%");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error "+e);
        }
    }
    
    public static void Ejercicio3(){
        System.out.println("Algoritmo que reciba como entrada dos valores: a y b, donde a < b. Este algoritmo debe generar como salida los múltiplos de A que son menores que B.");
        Scanner ingreso = new Scanner(System.in);
        int valora=0, valorb=0, bandera=0, contador = 1, acumulador=0;
        System.out.println("Ingrese el valor de A");
        valora= ingreso.nextInt();
        while(valora>=valorb){    
            System.out.println("Ingrese el valor de B");
            valorb = ingreso.nextInt();
            if (valora>=valorb) {
                System.out.println("Ingrese un valor mayor al valor de A");
            }
        }
        System.out.println("Los multiplos de A menores que B son: ");
        while(bandera == 0){
            acumulador = valora*contador;
            System.out.println(acumulador);
            contador++;
            if ((valora*contador)>=valorb) {
                bandera=1;
            }
        }
    }
    
    public static void Ejercicio5(){
        System.out.println("Algoritmo que dado un número (>10 y < 1000)  calcula y muestra la suma de sus dígitos.");
        Scanner ingreso = new Scanner(System.in);
        int numero=0,suma=0, segundodigito,tercerdigito;
        String cadena;
        while(numero<10 || numero>1000){
            System.out.println("Ingrese su valor:");
            numero=ingreso.nextInt();
        }
        try{
        cadena = Integer.toString(numero);
        if (cadena.length()==2) {
            String cadena2 = Integer.toString(numero);
            cadena2 = cadena2.substring(1);
            System.out.println(cadena2);
            segundodigito = Integer.parseInt(cadena2);
            suma=Integer.parseInt(cadena.substring(0,1))+segundodigito;
        }
        }catch(Exception e){
            System.out.println(e);
        }
        try{
        cadena = Integer.toString(numero);
        if (cadena.length()==3) {
            String cadena2 = Integer.toString(numero);
            cadena2 = cadena2.substring(1);
            String cadena3 = cadena2.substring(0,1);
            cadena2 = cadena2.substring(1);
            segundodigito = Integer.parseInt(cadena2);
            tercerdigito = Integer.parseInt(cadena3);
            suma=Integer.parseInt(cadena.substring(0,1))+segundodigito+tercerdigito;
        }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Suma "+suma);
    }
        public static void Ejercicio7(){
        System.out.println("Algoritmo que determine los números automórficos menores que 1000. \nUn número se dice automórfico si su cuadrado termina en los mismos dígitos que el número original, por ejemplo 762 = 5776. ");
        int bandera=0;
        double cociente=0;
        int  numeroCifras=0,multiplicador = 5;
        while(bandera==0){
            String cadena = String.valueOf(multiplicador);
            numeroCifras = cadena.length();
            cociente = ((Math.pow(multiplicador, 2))-multiplicador)/(Math.pow(10, numeroCifras));
            if (esEntero(cociente)) {
                System.out.println(multiplicador);
            }
            multiplicador++;
            if ((((Math.pow(multiplicador, 2))-multiplicador)/(Math.pow(10, numeroCifras)))>1000) {
                bandera=1;
            }
        }
    }
        
    
     public static void  Ejercicio9()
    {
        System.out.println("Algoritmo que muestre cuales y cuantos son los números primos comprendidos entre 1 y 1000.");
        String ini="(1";
        for (int i = 2; i < 1000; i++) {
            if (esPrimo(i)) {
                 if (ini.equals(""))
                {
                     ini+=""+i;
                }else
                {
                ini+=","+i;
                }
               
            }
            
        }
        ini+=")";
        System.out.println(ini);
      
    }
          public static void  Ejercicio11()
    {
        System.out.println("Algoritmo para calcular y visualizar la suma de números pares comprendidos entre 20 y N (ambos incluidos).");
        String ini="(";
   
         Scanner entrada1=new Scanner(System.in);  
        System.out.println("Ingrese el Numero hasta el cuall quiere que se muestre los numeros pares desde 0");
        int op=Integer.parseInt(entrada1.next());
        for (int i = 0; i < op; i++) {
            if (esPar(i)) {
                if (ini.equals(""))
                {
                     ini+=""+i;
                }else
                {
                ini+=","+i;
                }
                
               
            }
            
        }
        ini+=")";
        System.out.println(ini);
      
    }
             
         public static void Ejercicio13()
    {
        System.out.println("Algoritmo que calcule mn  (n > 0 y entero) sin utilizar potencia.");
        int base,potencia,total=1;
        Scanner entr=new Scanner(System.in);
        System.out.println("Ingrese una base");
        base=entr.nextInt();
        System.out.println("Ingrese la potencia");
        
        potencia=entr.nextInt();
        for (int i = 0; i < potencia; i++) {
            total*=base;
        }
        //total=(int)Math.pow(base,potencia);
        System.out.println(" 99EL total de "+base+" elevado a la "+potencia+" es = "+total);
        
          
    }
        public static void Ejercicio15()
    {
        System.out.println(" Algoritmo que calcule m x n (m >= 0 , n>= 0, ambos enteros) sin utilizar la operación de multiplicación.");
       int valora,valorb,total=0;
       Scanner entr=new Scanner(System.in);
        System.out.println("Calcular m*n");
        System.out.println("Ingrese el valor de m");
        valora=entr.nextInt();
        System.out.println("Ingrese el valor de n");        
        valorb=entr.nextInt();
        for (int i = 0; i < valorb; i++) {
            total+=valora;
        }
        //total=(int)Math.pow(base,potencia);
        System.out.println(" EL total de "+valora+" multiplicado por "+valorb+" es = "+total);
        
          
    }
        public static void  Ejercicio17(){
            System.out.println(" Haga un algoritmo  que reciba un valor n entero y …..  \n" +
"\na) si n_0 calcule n! \nb) si n<0 escriba un mensaje de error y no calcule nada. ");
        Scanner ingreso = new Scanner(System.in);
        int numero=0, contador=0,bandera=0, total=1;
        System.out.println("Ingrese su valor");
        numero = ingreso.nextInt();
        if (numero==0) {
            total =1;
            System.out.println(total);
        }else{
            if (numero>0) {
                while(bandera==0){
                    contador++;
                    total = total*contador;
                    if (contador==numero) {
                        bandera=1;
                    }            
                }
                System.out.println(total);
            }else{
                if (numero<0) {
                    System.out.println("Error en procesar la información");
                }
            }
        }
    }
    public static void Ejercicio19()
    {
        System.out.println("Algoritmo que ingrese un entero positivo (no > 256). Calcular y mostrar su equivalente a binario.");
       int numero,exp,digito,bin;
       double binario;
       Scanner entr=new Scanner(System.in);
        System.out.println("Calcular el binario de un numero");
        do
        {            
        System.out.println("Ingrese el valor (NO MAYOR A 256)");
        numero=entr.nextInt();
        }while(numero>256||numero<0);
         exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        bin=(int) Math.floor(binario);
       // System.out.printf("Binario: %.0f %n", binario);
        System.out.println(" EL Binario de "+numero+" es "+bin);
        
          
    }
         public static void Ejercicio21()
    {
        System.out.println("Algoritmo que determine si un número (>=100 y < 1000) es o no M-alternante.  \nUn número entero positivo se dice M-alternante Si, el primer dígito es “par” entonces los \n" +
         "2 dígitos siguientes deben ser impares.  \nSi, el primer dígito es “impar” entonces los 2 dígitos siguientes deben ser pares.");
        String digito1,digito2,digito3;
         Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 cifras");
        int number=entrada.nextInt();
        while((number<100)||(number>999))
        {
            System.out.println("Ingrese un numero correcto");
            number=entrada.nextInt();
        }
        String numtext=String.valueOf(number);
        digito1=numtext.substring(0,1);
        digito2=numtext.substring(1,2);
        digito3=numtext.substring(2,3);
        if (esPar(Integer.parseInt(digito1))&&!esPar(Integer.parseInt(digito2))&&!esPar(Integer.parseInt(digito3))||!esPar(Integer.parseInt(digito1))&&esPar(Integer.parseInt(digito2))&&esPar(Integer.parseInt(digito3))) {
            System.out.println("Su Numero es  M-alternante");
        }else
        {
            System.out.println("Su Numero NO es  M-alternante");
        }       
        
        
        
      //  System.out.println("digito#1 es   "+digito1+"digito#2 "+digito2+"digito#3 "+digito3);
        
      
        
        
    }
    public static void  Ejercicio23()
    {
        System.out.println("Determinar si un alumno aprueba o reprueba una asignatura en la carrera de ingeniería en sistema de la FACCI. \nIngresará sus dos calificaciones parciales");
        double nota1,nota2;
        Scanner entrada1=new Scanner(System.in);
        System.out.println("Determinar si aprueba o reprueba una Asignatura");
        System.out.println("Ingrese nota del Primer Parcial");
        nota1= entrada1.nextInt();
       while(nota1>10)
       {
           System.out.println("Ingrese una nota correcta");
           nota1= entrada1.nextInt();
       };         
            
        System.out.println("Ingrese nota del Segundo Parcial");
        nota2= entrada1.nextInt();
         while(nota2>10)
       {
           System.out.println("Ingrese una nota correcta");
           nota2= entrada1.nextInt();
       }; 
        double total=nota1+nota2;
        if (total>=14) {
            System.out.println("Su nota Final es "+total+" Por lo Cual Usted ha Aprobado la MAteria");
           
        }else
        {
           System.out.println("Su nota Final es "+total+" Por lo Cual Usted ha Reprobado la MAteria");
        }
    }
       public static void  Ejercicio25()
    {
        System.out.println("En una guardería hay  N niños de 1, 2 y 3 años. Los niños de 1 año consumen 6 pañales al día, los niños de 2 años consumen 3 pañales diarios y los niños de 3 años consumen 2 pañales diarios. \nSe desea conocer el consumo total de pañales diarios.");
        int nino1,nino2,nino3,total;
        Scanner entrada1=new Scanner(System.in);
        System.out.println("Determinar el consumo total de Pañales diarios");
        System.out.println("Ingrese el numero de niños de 1 año de edad");
        nino1= entrada1.nextInt();
        System.out.println("Ingrese el numero de niños de 2 año de edad");
        nino2= entrada1.nextInt();
        System.out.println("Ingrese el numero de niños de 3 año de edad");
        nino3= entrada1.nextInt();
        total=(nino1*6)+(nino2*3)+(nino3*2);
        System.out.println("El uso total de Pañales es de "+total+" Pañales");
    }
     public static void  Ejercicio27()
    {
        System.out.println("Las elecciones presidenciales están próximas a realizarse en el país");        
        int personas,voto,part1=0,part2=0,part3=0,sivotan=0,novotan;
        String partfav="";
        double abstenciones,porcv1,porcv2,porcv3;
        String resp;
        Scanner entrada1=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a votar");
        personas= entrada1.nextInt();
        for (int i = 1; i < personas; i++) {
             System.out.println("VOTANTE #"+i);
             System.out.println("Va a votar? \n1.-Si \n2.-No");
             resp=entrada1.next();
             if (resp.equals("1")||resp.equals("si")||resp.equals("SI")||resp.equals("Si")||resp.equals("sI")) 
             {
                 System.out.println("Por que Partido votara? \n1.- Partido 2\n2.- Partido 2\n3.- Partido 3");
                 voto=entrada1.nextInt();
                 while(voto>3&&voto<1)
                 {
                     System.out.println("Voto no valido, elija un numero de partido");
                 }
                 switch(voto)
                 {
                     case 1:
                         part1++;
                         break;
                     case 2:
                         part2++;
                         break;
                     case 3:
                         part3++;
                         break;
                 }
                 sivotan++;
            }
             
        }
        novotan=sivotan-personas;
        abstenciones=(100*novotan)/personas;
        porcv1=(100*part1)/sivotan;
        porcv2=(100*part2)/sivotan;
        porcv3=(100*part3)/sivotan;       
        System.out.println("El "+abstenciones+"% de los Votantes decidieron no votar");
        System.out.println("El partido 1 tiene el "+porcv1+"% de votos a favor");
        System.out.println("El partido 2 tiene el "+porcv2+"% de votos a favor");
        System.out.println("El partido 3 tiene el "+porcv3+"% de votos a favor");
         if (part1>part2&&part1>part3) 
        {
         //partfav="1";   
            System.out.println("El partido Favorito es el Partido Uno con un total de "+personas+"Votantes y  tiene un total"
                    + "de votos de "+part1+" que corresponde al "+porcv1+"% a favor");
        }else if (part2>part1&&part2>part3)
        {
         //partfav="2";
             System.out.println("El partido Favorito es el Partido Dos con un total de "+personas+" Votantes tiene un total"
                    + "de votos de "+part2+" que corresponde al "+porcv2+"% a favor");
        }else if (part3>part1&&part3>part2) {
             //partfav="3";
              System.out.println("El partido Favorito es el Partido Tres con un total de "+personas+"Votantes  tiene un total"
                    + "de votos de "+part3+" que corresponde al "+porcv3+"% a favor");
        }else if (part1==part2&&part2==part3) {
            //partfav="1,2,3";
             System.out.println("Los tres Partidos empataron en votos con un total de "+part1);
        }else if (part1==part2&&part2>part3) {
          //  partfav="1,2";
            System.out.println("El partido Uno y el partido Dos empataron en votos con un total de "+part1+" Por lo tanto son los favoritos");
        }else if (part2==part3&&part3>part1) {
          //  partfav="2,3";
           System.out.println("El partido Dos y el partido Tres empataron en votos con un total de "+part2+" Por lo tanto"
                   + " son los favoritos");
      
        }else if (part1==part3&&part3>part2) {
            partfav="1,3";
            System.out.println("El partido Uno y el partido Tres empataron en votos con un total de "+part3+" Por lo tanto"
                   + " son los favoritos");
                  
        }
        

    }
              public static void  Ejercicio29()
    {
        System.out.println("La presión, volumen y temperatura de una masa de aire se relacionan por la fórmula: \nMasa= presión * volumen/ 0.37*(temperatura+460) ");
        double presion,temp,vol,total;
        Scanner entrada1=new Scanner(System.in);
        System.out.println("Determinar la masa total");
        System.out.println("Ingrese el valor de presion");
        presion= entrada1.nextDouble();
        System.out.println("Ingrese el valor de temperatura");
        temp= entrada1.nextDouble();
        System.out.println("Ingrese el valor de volumen");
        vol= entrada1.nextDouble();
        total=(presion*vol/0.37/(temp+460));
        System.out.println("La masa total de  es  "+total);
    }
        public static void  Ejercicio31()
    {
        System.out.println("Realice un programa que de cómo resultado la suma del cuadrado y el cubo de los N primeros números.");
        int valor,total=0;
        String resp="n";
        Scanner entrada1=new Scanner(System.in);        
        do{
        System.out.println("Ingrese el valor");        
        valor=entrada1.nextInt();
        total=total+(valor*valor);
            System.out.println("Lleva "+total);
            System.out.println("Ingrese S si desea seguir ingresando, caso contrario cualquier otra tecla");
            resp=entrada1.next();
        }while(resp.equals("S")||resp.equals("s"));
    }
        
        public static void  Ejercicio33()
    {
        System.out.println("Algoritmo que muestre los 100 primeros términos de la serie de Fibonnacci (1, 2, 3, 5, 8, 13, 21…..) ");
        int valor1=1,valor2=1,valor3,total,nnn,contador=0;
        String suce="(1,1",su2;
        System.out.println("Ingrese el numero de terminos que quiere mostrar en sucecion fibonacci");
        Scanner entrada1=new Scanner(System.in);     
        nnn=entrada1.nextInt();
     //   System.out.println("1,1");
        while((nnn-2)>contador){
        valor3=valor1+valor2;
        valor1=valor2;
        valor2=valor3;      
        su2=String.valueOf(valor3);
        suce=suce+","+su2;
            contador++;
        };
        System.out.println(suce+")");
    }
         public static void Ejercicio35()
    {
        System.out.println("Diseñar a un programa que ingrese un valor positivo, \ncomo proceso determine si el último digito del valor ingresado es o no un número primo.  ");
        String digito1,digito2,digito3;
         Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int number=entrada.nextInt();
        while((number<0))
        {
            System.out.println("Ingrese un numero correcto");
            number=entrada.nextInt();
        }
        String numtext=String.valueOf(number);
        int caracter=numtext.length();
        digito1=numtext.substring(caracter-1,caracter);
        System.out.println("este es el ulitmo" +digito1);
        if (esPrimo(Integer.parseInt(digito1))) {
            System.out.println("El ultimo digito de tu valor es "+digito1+",Por lo tanto es Primo");
        }else
        {
             System.out.println("El ultimo digito de tu valor es "+digito1+",Por lo tanto NO es Primo");
        }
       /* if (EsPar(digito1)&&!EsPar(digito2)&&!EsPar(digito3)||!EsPar(digito1)&&EsPar(digito2)&&EsPar(digito3)) {
            System.out.println("Su Numero es  M-alternante");
        }else
        {
            System.out.println("Su Numero NO es  M-alternante");
        }   
*/
    }
         
        public static void  Ejercicio37()
    {
        System.out.println("Realizar un programa que permita pedir N números naturales POSITIVOS,  \ndetermine y muestre cuantos números ingresados son “números perfectos”.");
        List<Integer> listaingresada = new ArrayList<Integer>();
         List<Integer> listaperfectos = new ArrayList<Integer>();
        int valor,total=0,contador=0,suma = 0;
        String mostrar="";
      
        String resp="n";
        Scanner entrada1=new Scanner(System.in);   
        do{
        System.out.println("Ingrese el valor");        
        valor=entrada1.nextInt();
        listaingresada.add(valor);
        contador++;
            System.out.println("Ingrese S si desea seguir ingresando, caso contrario cualquier otra tecla");
            resp=entrada1.next();
        }while(resp.equals("S")||resp.equals("s"));        
        for (int i = 0; i < contador; i++) {
            
           // System.out.println("ssss"+listaingresada.get(i));
           int valorq=listaingresada.get(i);
             for (i = 1; i < valorq; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
            if (valorq % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == valorq) {  // si el numero es igual a la suma de sus divisores es perfecto
           // System.out.println("Perfecto");
            mostrar+=valorq;
        } else {
            System.out.println("No es perfecto");

        }
           
        }
        System.out.println("Los numeros perfectos son  "+mostrar);

       
    }
        public static void  Ejercicio39()
    {
        System.out.println("Se reciben tres enteros positivos en forma ascendente a _ b _ c.");
        int valora,valorb,valorc,total=0;
        double resul;
        int area,s;
        String resp="n",nombretriangu;
        Scanner entrada1=new Scanner(System.in);      
        System.out.println("Ingrese el valor de A");        
        valora=entrada1.nextInt();
        System.out.println("Ingrese el valor de B");        
        valorb=entrada1.nextInt();
        System.out.println("Ingrese el valor de C");        
        valorc=entrada1.nextInt();
        if ((valora+valorb)>valorc)
        {
            if (valora==valorb&&valora==valorc) {
                nombretriangu="Equilátero";
            }else if(valora==valorb||valora==valorc||valorb==valorc)
            {
                nombretriangu="Isósceles";
            }else
            {
                 nombretriangu="Escaleno";
            }
           s=(valora+valorb+valorc)/2; 
           area=s*(s-valora)*(s-valorb)*(s-valorc);
           resul= Math.sqrt(area);
            System.out.println("El resultado es "+resul+" Y el trinagulo es "+nombretriangu);
        }else
        {
            System.out.println("Las longitudes ingresadas no cumplen con la formula de (a+b)>c");
        }
    }
         public static boolean esPrimo(int n) 
    {
        //Comprobamos si es múltiplo de 2
        if (n%2==0) return false;
        //Si no es múltiplo de 2, comprobamos si es divisible por algún número impar
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
              public static boolean esPar(int va)
    {
      if(va % 2 == 0) {
            return true;
        } else {
            return false;
        }        
    }

    
    public static boolean esEntero(double numero){
        if (numero % 1 == 0) {
            return true;
        }
        else{
            return false;
        }
    }

        
      
}
  
