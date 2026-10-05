package comportamiento.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class IteratorPattern {

    // Elemento de la coleccion
    static class Libro {
        private final String titulo;
        private final String autor;

        Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        String getTitulo() { return titulo; }
        String getAutor() { return autor; }

        @Override
        public String toString() {
            return "\"" + titulo + "\" (" + autor + ")";
        }
    }

    static class Biblioteca implements Iterable<Libro> {
        private final Libro[] libros;
        private int cantidad = 0;

        Biblioteca(int capacidad) {
            this.libros = new Libro[capacidad];
        }

        void agregar(Libro libro) {
            if (cantidad == libros.length) {
                throw new IllegalStateException("Biblioteca llena");
            }
            libros[cantidad++] = libro;
        }

        int tamanio() { return cantidad; }

        @Override
        public Iterator<Libro> iterator() {
            return new IteradorDirecto();
        }

        Iterator<Libro> inverso() {
            return new IteradorInverso();
        }

        Iterator<Libro> porAutor(String autor) {
            return new IteradorPorAutor(autor);
        }


        private class IteradorDirecto implements Iterator<Libro> {
            private int posicion = 0;

            @Override
            public boolean hasNext() {
                return posicion < cantidad;
            }

            @Override
            public Libro next() {
                if (!hasNext()) throw new NoSuchElementException();
                return libros[posicion++];
            }
        }

        private class IteradorInverso implements Iterator<Libro> {
            private int posicion = cantidad - 1;

            @Override
            public boolean hasNext() {
                return posicion >= 0;
            }

            @Override
            public Libro next() {
                if (!hasNext()) throw new NoSuchElementException();
                return libros[posicion--];
            }
        }

        private class IteradorPorAutor implements Iterator<Libro> {
            private final String autor;
            private int posicion = 0;

            IteradorPorAutor(String autor) {
                this.autor = autor;
                avanzar();
            }

            private void avanzar() {
                while (posicion < cantidad && !libros[posicion].getAutor().equals(autor)) {
                    posicion++;
                }
            }

            @Override
            public boolean hasNext() {
                return posicion < cantidad;
            }

            @Override
            public Libro next() {
                if (!hasNext()) throw new NoSuchElementException();
                Libro actual = libros[posicion++];
                avanzar();
                return actual;
            }
        }
    }

    static void imprimir(String titulo, Iterator<Libro> it) {
        System.out.println(titulo);
        int n = 1;
        while (it.hasNext()) {
            System.out.println("  " + n++ + ". " + it.next());
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        biblioteca.agregar(new Libro("El Aleph", "Borges"));
        biblioteca.agregar(new Libro("Rayuela", "Cortazar"));
        biblioteca.agregar(new Libro("Ficciones", "Borges"));
        biblioteca.agregar(new Libro("Bestiario", "Cortazar"));
        biblioteca.agregar(new Libro("Sobre heroes y tumbas", "Sabato"));

        // 1) Recorrido con while (hasNext/next)
        imprimir("=== Directo ===", biblioteca.iterator());

        // 2) Recorrido inverso
        imprimir("=== Inverso ===", biblioteca.inverso());

        // 3) Filtrado por autor
        imprimir("=== Solo Borges ===", biblioteca.porAutor("Borges"));

        // 4) for-each (posible porque Biblioteca implementa Iterable)
        System.out.println("=== for-each ===");
        for (Libro libro : biblioteca) {
            System.out.println("  " + libro.getTitulo());
        }

        // 5) Caso borde: autor sin libros
        Iterator<Libro> vacio = biblioteca.porAutor("Nadie");
        System.out.println("=== Autor inexistente: hasNext() = " + vacio.hasNext() + " ===");

        // 6) Pasarse del final lanza excepcion
        try {
            vacio.next();
        } catch (NoSuchElementException e) {
            System.out.println("Error esperado: NoSuchElementException");
        }

        // 7) Mini test
        int total = 0;
        for (Libro l : biblioteca) total++;
        int borges = 0;
        Iterator<Libro> it = biblioteca.porAutor("Borges");
        while (it.hasNext()) { it.next(); borges++; }
        System.out.println(total == biblioteca.tamanio() && borges == 2 ? "TEST OK" : "TEST FALLO");
    }
}