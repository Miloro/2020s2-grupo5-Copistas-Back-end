package com.unq.copistas;

import com.unq.copistas.model.*;
import com.unq.copistas.repository.ClienteRepository;
import com.unq.copistas.repository.HojaDeRutaRepository;
import com.unq.copistas.repository.LibroRepository;
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

    public FakeData(ClienteRepository clienteRepository, HojaDeRutaRepository hojaDeRutaRepository,LibroRepository libroRepository ) {
        this.clienteRepository = clienteRepository;
        this.hojaDeRutaRepository = hojaDeRutaRepository;
        this.libroRepository = libroRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cliente cliente1 = new Cliente("cliente1","cliente1",2,2,"cliente1","cliente1","cliente1",2,3,"cliente1",LocalDate.now(),Sexo.HOMBRE,"cliente1");
        Cliente cliente2 = new Cliente("cliente2","cliente2",2,2,"cliente2","cliente2","cliente2",2,3,"cliente2",LocalDate.now(),Sexo.HOMBRE,"cliente2");
        clienteRepository.save(cliente1);
        clienteRepository.save(cliente2);
        Libro libro1 = new Libro("libro1","libro1","libro1","libro1","libro1","libro1","libro1");
        Libro libro2 = new Libro("libro2","libro2","libro2","libro2","libro2","libro2","libro2");

        libroRepository.save(libro1);
        libroRepository.save(libro2);

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

        Hoja hoja = new Hoja(cliente1,cliente2,libro1,iteraciones);
        Hoja hoja2 = new Hoja(cliente2,cliente1,libro2,iteraciones2);
        iteracion1Libro1.setHoja(hoja);
        iteracion2Libro1.setHoja(hoja);
        iteracion3Libro1.setHoja(hoja);

        iteracion1Libro2.setHoja(hoja2);
        iteracion2Libro2.setHoja(hoja2);
        iteracion3Libro2.setHoja(hoja2);
        iteracion4Libro2.setHoja(hoja2);
        iteracion5Libro2.setHoja(hoja2);
        iteracion6Libro2.setHoja(hoja2);

        hojaDeRutaRepository.save(hoja);
        hojaDeRutaRepository.save(hoja2);

    }
}
