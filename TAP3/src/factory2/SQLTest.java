package factory2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase SQLTest que proporciona una interfaz sencilla para interactuar con una base de datos HSQLDB.
 * <p>
 * La clase establece una conexión con la base de datos, ejecuta comandos SQL de consulta y actualización,
 * y permite ver los resultados de las consultas.
 * <p>
 * Cada vez que se ejecuta, la clase crea una tabla si no existe y agrega filas a la misma.
 * Después, realiza una consulta para obtener datos y mostrar los resultados.
 * <p>
 * Autor: Karl Meissner (karl@meissnersd.com)
 */
public class SQLTest {
    // Conexión persistente a la base de datos
    Connection conn; // Nuestra conexión a la base de datos, persiste durante la vida del programa

    /**
     * Constructor que inicializa la conexión con la base de datos.
     *
     * @param db_file_name_prefix Nombre del archivo de la base de datos.
     * @throws Exception Si ocurre un error al cargar el controlador JDBC o al establecer la conexión.
     */
    public SQLTest(String db_file_name_prefix) throws Exception {
        // Cargar el driver JDBC de HSQLDB
        // hsqldb.jar debe estar en el classpath o dentro del jar actual
        Class.forName("org.hsqldb.jdbcDriver");

        // Conectarse a la base de datos. Esto cargará los archivos de la base de datos
        // y arrancará el motor de base de datos si no está en ejecución
        conn = DriverManager.getConnection("jdbc:hsqldb:" + db_file_name_prefix, "sa", "");
    }

    /**
     * Realiza una desconexión limpia de la base de datos, guardando los datos y cerrando la conexión.
     *
     * @throws SQLException Si ocurre un error durante el cierre de la base de datos.
     */
    public void shutdown() throws SQLException {
        Statement st = conn.createStatement();

        // Realizar un apagado limpio de la base de datos
        st.execute("SHUTDOWN");
        conn.close(); // Cerrar la conexión si no hay otras abiertas
    }

    /**
     * Ejecuta una consulta SQL y muestra los resultados.
     *
     * @param expression La consulta SQL a ejecutar.
     * @throws SQLException Si ocurre un error al ejecutar la consulta.
     */
    public synchronized void query(String expression) throws SQLException {
        Statement st = null;
        ResultSet rs = null;

        // Crear una declaración y ejecutar la consulta
        st = conn.createStatement();
        rs = st.executeQuery(expression);

        // Mostrar los resultados de la consulta
        dump(rs);
        st.close(); // Cerrar la declaración (esto también cierra el ResultSet asociado)
    }

    /**
     * Ejecuta una actualización SQL (como INSERT, UPDATE o DELETE).
     *
     * @param expression La instrucción SQL a ejecutar.
     * @throws SQLException Si ocurre un error al ejecutar la actualización.
     */
    public synchronized void update(String expression) throws SQLException {
        Statement st = null;

        // Crear una declaración y ejecutar la actualización
        st = conn.createStatement();

        int i = st.executeUpdate(expression); // Ejecutar la consulta de actualización

        // Comprobar si la actualización ha fallado
        if (i == -1) {
            System.out.println("Error en la base de datos: " + expression);
        }

        st.close();
    }

    /**
     * Muestra los resultados de una consulta SQL.
     *
     * @param rs El ResultSet que contiene los datos de la consulta.
     * @throws SQLException Si ocurre un error al leer los datos del ResultSet.
     */
    public static void dump(ResultSet rs) throws SQLException {
        // Obtener los metadatos de la consulta
        ResultSetMetaData meta = rs.getMetaData();
        int colmax = meta.getColumnCount(); // Número de columnas en el ResultSet
        int i;
        Object o = null;

        // Recorrer el ResultSet y mostrar cada fila
        while (rs.next()) {
            for (i = 0; i < colmax; ++i) {
                o = rs.getObject(i + 1); // Obtener el valor de la columna (índice 1 basado)

                // Imprimir el valor de la columna
                System.out.print(o.toString() + " ");
            }

            // Imprimir una línea de separación entre filas
            System.out.println(" ");
        }
    }

    /**
     * Método principal que ejecuta el flujo de trabajo principal del programa.
     * <p>
     * Crea una base de datos, una tabla y agrega filas. Luego realiza una consulta
     * y muestra los resultados antes de cerrar la base de datos.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        SQLTest db = null;

        try {
            // Crear una nueva instancia de la clase SQLTest con el archivo de base de datos
            db = new SQLTest("db_file");
        } catch (Exception ex1) {
            ex1.printStackTrace(); // Si ocurre un error al iniciar la base de datos
            return; // Terminar el programa
        }

        try {
            // Crear una tabla vacía
            db.update("CREATE TABLE sample_table ( id INTEGER IDENTITY, str_col VARCHAR(256), num_col INTEGER)");
        } catch (SQLException ex2) {
            // Ignorar error si la tabla ya existe
            // ex2.printStackTrace(); // Si se desea depurar el error
        }

        try {
            // Insertar algunas filas en la tabla
            db.update("INSERT INTO sample_table(str_col,num_col) VALUES('Ford', 100)");
            db.update("INSERT INTO sample_table(str_col,num_col) VALUES('Toyota', 200)");
            db.update("INSERT INTO sample_table(str_col,num_col) VALUES('Honda', 300)");
            db.update("INSERT INTO sample_table(str_col,num_col) VALUES('GM', 400)");

            // Realizar una consulta y mostrar los resultados
            db.query("SELECT * FROM sample_table WHERE num_col < 250");

            // Apagar la base de datos y cerrar la conexión al final
            db.shutdown();
        } catch (SQLException ex3) {
            ex3.printStackTrace(); // Si ocurre un error durante la inserción o la consulta
        }
    } // main()
} // class SQLTest
