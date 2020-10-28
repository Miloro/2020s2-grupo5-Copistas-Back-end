package com.unq.copistas;

import com.unq.copistas.model.*;
import com.unq.copistas.repository.ClienteRepository;
import com.unq.copistas.repository.HojaDeRutaRepository;
import com.unq.copistas.repository.LibroRepository;
import com.unq.copistas.security.entity.Rol;
import com.unq.copistas.security.enums.RolNombre;
import com.unq.copistas.security.repository.UsuarioRepository;
import com.unq.copistas.security.service.RolService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.unq.copistas.model.EstadoDeIteracion.*;


@Component
public class FakeData implements ApplicationRunner {

    private final ClienteRepository clienteRepository;
    private final HojaDeRutaRepository hojaDeRutaRepository;
    private final LibroRepository libroRepository;
    private final UsuarioRepository usuarioRepository;
    private final RolService rolService;

    public FakeData(ClienteRepository clienteRepository, HojaDeRutaRepository hojaDeRutaRepository, LibroRepository libroRepository, UsuarioRepository usuarioRepository, RolService rolService) {
        this.clienteRepository = clienteRepository;
        this.hojaDeRutaRepository = hojaDeRutaRepository;
        this.libroRepository = libroRepository;
        this.usuarioRepository = usuarioRepository;
        this.rolService = rolService;
    }

    @Override
    public void run(ApplicationArguments args) {

        Cliente cliente1 = new Cliente("cliente1","cliente1",111,1,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.HOMBRE,NivelDiscapacidadVisual.TOTAL);
        Cliente cliente2 = new Cliente("cliente2","cliente2",222,2,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.HOMBRE,NivelDiscapacidadVisual.PARCIAL);
        Cliente cliente3 = new Cliente("cliente3","cliente3",333,3,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.HOMBRE,NivelDiscapacidadVisual.PARCIAL);
        Cliente cliente5 = new Cliente("cliente5","cliente5",555,5,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.NINGUNA);
        Cliente cliente4 = new Cliente("cliente4","cliente4",444,4,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.NINGUNA);
        Cliente cliente6 = new Cliente("cliente6","cliente6",666,6,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.NINGUNA);
        Cliente cliente7 = new Cliente("cliente7","cliente7",777,7,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.TOTAL);
        Cliente cliente8 = new Cliente("cliente8","cliente8",888,8,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.HOMBRE,NivelDiscapacidadVisual.TOTAL);
        Cliente cliente9 = new Cliente("cliente9","cliente9",999,9,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.HOMBRE,NivelDiscapacidadVisual.PARCIAL);
        Cliente cliente10 = new Cliente("cliente10","cliente10",101010,10,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.PARCIAL);
        Cliente cliente11 = new Cliente("cliente11","cliente11",111111,11,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.TOTAL);
        Cliente cliente12 = new Cliente("cliente12","cliente12",121212,12,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.MUJER,NivelDiscapacidadVisual.TOTAL);
        clienteRepository.save(cliente1);
        clienteRepository.save(cliente2);
        clienteRepository.save(cliente3);
        clienteRepository.save(cliente4);
        clienteRepository.save(cliente5);
        clienteRepository.save(cliente6);
        clienteRepository.save(cliente7);
        clienteRepository.save(cliente8);
        clienteRepository.save(cliente9);
        clienteRepository.save(cliente10);
        clienteRepository.save(cliente11);
        clienteRepository.save(cliente12);

        Libro libro1 = new Libro("El señor de los anillos la comunidad del anillos","John Ronald Reuel","Tolkien ","dgasdgs","1412",Idioma.ESPAÑOL,"fantasia",true,true);
        Libro libro2 = new Libro("La llamada de Cthulhu","Howard Phillips","Lovecraft","raspadita","2",Idioma.ESPAÑOL,"terror cosmico",false,true);
        Libro libro3 = new Libro("El caballero de la armadura oxidada","Robert","Fisher","raspadita","2",Idioma.ESPAÑOL,"Fiction",true,true);
        Libro libro4 = new Libro("El fin de la eternidad","Isaac","Asimov","raspadita","2",Idioma.INGLES,"Science Fiction",false,true);
        Libro libro5 = new Libro("Los tigres de Malacia","Emilio","Salgari","raspadita","2",Idioma.INGLES,"Fiction",true,true);
        Libro libro6 = new Libro("El principito","Antoine ","de Saint-Exupéry","raspadita","2",Idioma.ITALIANO,"literatura infantil",false,true);
        Libro libro7 = new Libro("Rayuela","Julio","Cortázar","raspadita","2",Idioma.ITALIANO,"Fiction",false,true);
        Libro libro8 = new Libro("El tunel","Howard Phillips","Ernesto","Sabato","2",Idioma.ESPAÑOL,"Fiction",false,false);
        Libro libro9 = new Libro("Metamorfosis","Franz","Kafka","raspadita","2",Idioma.ALEMAN,"terror",false,false);
        Libro libro10 = new Libro("el hobbit","John Ronald Reuel","Tolkien","raspadita","2",Idioma.ESPAÑOL,"terror cosmico",false,false);
        Libro libro11 = new Libro("El matadero","Esteban","Echeverría","raspadita","2",Idioma.ESPAÑOL,"Fiction",false,false);


        libroRepository.save(libro1);
        libroRepository.save(libro2);
        libroRepository.save(libro3);
        libroRepository.save(libro4);
        libroRepository.save(libro5);
        libroRepository.save(libro6);
        libroRepository.save(libro7);
        libroRepository.save(libro8);
        libroRepository.save(libro9);
        libroRepository.save(libro10);
        libroRepository.save(libro11);


        List<Iteracion> iteraciones = new ArrayList<>();
        Iteracion iteracion1Libro1 = new Iteracion("pepa",LocalDate.now(),DIGITALIZACION);
        Iteracion iteracion2Libro1 = new Iteracion("carlos",LocalDate.now(),CORRECION);
        Iteracion iteracion3Libro1 = new Iteracion("juana",LocalDate.now(),VISADO);
        iteraciones.add(iteracion1Libro1);
        iteraciones.add(iteracion2Libro1);
        iteraciones.add(iteracion3Libro1);

        List<Iteracion> iteraciones2 = new ArrayList<>();
        Iteracion iteracion1Libro2 = new Iteracion("pepa",LocalDate.now(),DIGITALIZACION);
        Iteracion iteracion2Libro2 = new Iteracion("carlos",LocalDate.now(),CORRECION);
        Iteracion iteracion3Libro2 = new Iteracion("juana",LocalDate.now(),VISADO);
        Iteracion iteracion4Libro2 = new Iteracion("ricardo",LocalDate.now(),ENVIO_DE_MAIL);
        Iteracion iteracion5Libro2 = new Iteracion("ruperta",LocalDate.now(),IMPRESION_EN_BRAILE);
        Iteracion iteracion6Libro2 = new Iteracion("cleotilde",LocalDate.now(),ANILLADO);
        iteraciones2.add(iteracion1Libro2);
        iteraciones2.add(iteracion2Libro2);
        iteraciones2.add(iteracion3Libro2);
        iteraciones2.add(iteracion4Libro2);
        iteraciones2.add(iteracion5Libro2);
        iteraciones2.add(iteracion6Libro2);

        List<Iteracion> iteraciones3 = new ArrayList<>();
        Iteracion iteracion1Libro3 = new Iteracion("pepa",LocalDate.now(),DIGITALIZACION);
        Iteracion iteracion2Libro3 = new Iteracion("carlos",LocalDate.now(),CORRECION);
        Iteracion iteracion3Libro3 = new Iteracion("juana",LocalDate.now(),VISADO);
        Iteracion iteracion4Libro3 = new Iteracion("ricardo",LocalDate.now(),ENVIO_DE_MAIL);
        iteraciones3.add(iteracion1Libro3);
        iteraciones3.add(iteracion2Libro3);
        iteraciones3.add(iteracion3Libro3);
        iteraciones3.add(iteracion4Libro3);

        List<Iteracion> iteraciones4 = new ArrayList<>();
        Iteracion iteracion1Libro4 = new Iteracion("pepa",LocalDate.now(),DIGITALIZACION);
        iteraciones4.add(iteracion1Libro4);

        List<Iteracion> iteraciones5 = new ArrayList<>();
        Iteracion iteracion1Libro5 = new Iteracion("pepa",LocalDate.now(),DIGITALIZACION);
        iteraciones5.add(iteracion1Libro5);

        Hoja hoja = new Hoja(cliente1,cliente2,libro1,iteraciones);
        Hoja hoja2 = new Hoja(cliente3,cliente4,libro2,iteraciones2);
        Hoja hoja3 = new Hoja(cliente5,cliente6,libro7,iteraciones3);
        Hoja hoja4 = new Hoja(cliente6,cliente7,libro5,iteraciones4);
        Hoja hoja5 = new Hoja(cliente8,cliente9,libro8,iteraciones5);

        iteracion1Libro1.setHoja(hoja);
        iteracion2Libro1.setHoja(hoja);
        iteracion3Libro1.setHoja(hoja);

        iteracion1Libro2.setHoja(hoja2);
        iteracion2Libro2.setHoja(hoja2);
        iteracion3Libro2.setHoja(hoja2);
        iteracion4Libro2.setHoja(hoja2);
        iteracion5Libro2.setHoja(hoja2);
        iteracion6Libro2.setHoja(hoja2);

        iteracion1Libro3.setHoja(hoja3);
        iteracion2Libro3.setHoja(hoja3);
        iteracion3Libro3.setHoja(hoja3);
        iteracion4Libro3.setHoja(hoja3);

        iteracion1Libro4.setHoja(hoja4);

        iteracion1Libro5.setHoja(hoja5);


        hojaDeRutaRepository.save(hoja);
        hojaDeRutaRepository.save(hoja2);
        hojaDeRutaRepository.save(hoja3);
        hojaDeRutaRepository.save(hoja4);
        hojaDeRutaRepository.save(hoja5);


        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);


    }
}
