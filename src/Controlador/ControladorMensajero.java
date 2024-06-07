    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package Controlador;

    import DAO.MensajeroDAO;
    import logica.Cliente;
    import logica.Mensajero;

    /**
     *
     * @author diego
     */
    public class ControladorMensajero {

        MensajeroDAO mensajeroDao;

        public ControladorMensajero() {
            mensajeroDao = new MensajeroDAO();
        }

        public int insertarMensajero(String id, String telefono, String email, String direccion, String nombre) {
            Mensajero m = new Mensajero();

            m.setId_mensajero(id);
            m.setTelefono(telefono);
            m.setEmail(email);
            m.setDireccion(direccion);
            m.setNombre(nombre);

            //Se llama al dao para guardar
            int result = mensajeroDao.guardarMensajero(m);
            return result;

        }//end
        public String consultarMensajero(String id){
            String m =mensajeroDao.consultarMensajero(id);
            return m;
        }
        public String listarMensajeros() {
            String m = mensajeroDao.listarMensajeros();
            return m;
        }

        public void ActualizarMensajero(String id, String DatoAActualizar, String dato) {
            mensajeroDao.actualizarMensajero(id, DatoAActualizar, dato);
        }

        public void eliminarMensajero(String id) {
            mensajeroDao.BorrarMensajero(id);
            System.out.println("Se elimino un registro de mensajero");

        }
    }
