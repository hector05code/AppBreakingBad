package com.example.t2appv1.model;

import com.example.t2appv1.R;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {



    public static List<Personaje> getPersonajes() {

        ArrayList<Personaje> lista = new ArrayList<Personaje>();


        lista.add(new Personaje(
                "Walter White",
                R.drawable.walterwhite,
                "Walter White, un ex profesor de química en Albuquerque, Nuevo México, se convierte en un fabricante de metanfetamina de alta pureza tras ser diagnosticado con cáncer de pulmón terminal. Inicialmente, su motivo es asegurar el bienestar financiero de su familia, pero a medida que avanza la serie, su personaje se transforma en un despiadado criminal bajo el alias 'Heisenberg'. Con una mente brillante pero moralmente corrupta, Walter se involucra en el tráfico de drogas, enfrentándose a figuras del crimen y poniendo en riesgo su vida y la de sus seres queridos."
        ));

        lista.add(new Personaje(
                "Jesse Pinkman",
                R.drawable.jesse,
                "Jesse Pinkman, un joven problemático que anteriormente era un alumno en la escuela secundaria de Walter White, se convierte en su socio en la fabricación de metanfetamina. A pesar de su actitud rebelde y su pasado lleno de delitos, Jesse es uno de los personajes más humanos de la serie. Se enfrenta a luchas internas constantes relacionadas con su culpabilidad y sus decisiones morales. Su relación con Walter, que en ocasiones es casi paternal, se vuelve más complicada a medida que avanza la historia, mientras lucha por encontrar su propio camino."
        ));

        lista.add(new Personaje(
                "Gustavo Fring",
                R.drawable.gus,
                "Gustavo 'Gus' Fring es un empresario chileno-estadounidense que opera una cadena de restaurantes de comida rápida llamada Los Pollos Hermanos, pero en secreto, lidera uno de los carteles de drogas más poderosos de México. Fring es un hombre calculador, frío y extremadamente inteligente, capaz de mantener una fachada respetable mientras maneja un imperio de drogas. A lo largo de la serie, su lucha contra Walter White se convierte en una de las batallas más intensas por el control del mercado de las metanfetaminas en el suroeste de los Estados Unidos."
        ));

        lista.add(new Personaje(
                "Hank Schrader",
                R.drawable.hank,
                "Hank Schrader es el cuñado de Walter White y un agente de la DEA (Administración para el Control de Drogas). A lo largo de la serie, Hank se presenta como un hombre confiado, audaz y con un sentido del humor rudo. A pesar de sus habilidades en la investigación criminal, está completamente ajeno al hecho de que su propio cuñado es uno de los mayores traficantes de drogas de la región. A medida que la trama avanza, Hank se convierte en una figura clave en la lucha contra el narcotráfico, y su relación con Walter se ve profundamente afectada por la revelación de la verdad."
        ));

        lista.add(new Personaje(
                "Saul Goodman",
                R.drawable.saul,
                "Saul Goodman (cuyo verdadero nombre es James Morgan 'Jimmy' McGill) es un abogado criminalista con una ética profesional muy flexible. Su estilo es exagerado y su vida personal igualmente turbia. A lo largo de la serie, Saul se convierte en el abogado de Walter White y Jesse Pinkman, ayudándoles a evadir la ley con sus métodos poco convencionales. Con su estilo de vida extravagante y sus métodos legales cuestionables, Saul se destaca como uno de los personajes más cómicos, aunque también muestra momentos de vulnerabilidad y arrepentimiento. Saul finalmente se muda a una nueva ciudad, comenzando una nueva vida bajo el seudónimo de 'Gene'."
        ));

        lista.add(new Personaje(
                "Mike Ehrmantraut",
                R.drawable.mike,
                "Mike Ehrmantraut es un ex policía de Filadelfia que trabaja como hombre de confianza para Gustavo Fring. A lo largo de la serie, se muestra como una persona extremadamente calmada, calculadora y eficiente, capaz de manejar situaciones de alto riesgo con una gran destreza. Su lealtad hacia Gus y su habilidad para resolver problemas lo convierten en un personaje crucial en la historia de Breaking Bad. Sin embargo, a medida que avanza la trama, Mike se enfrenta a dilemas morales y su relación con Walter White se vuelve tensa, especialmente cuando Walter pone en peligro la organización de Gus."
        ));

        return lista;
    }





}
