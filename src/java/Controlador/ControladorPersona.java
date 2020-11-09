package Controlador;


import Modelo.Persona;
import Modelo.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorPersona extends HttpServlet {

    PersonaDAO dao = new PersonaDAO();
    Persona p = new Persona();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<Persona> datos = dao.listar();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("Listar_usuario.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("Agregar.jsp").forward(request, response);
                break;
            case "Registrar":
                String id = request.getParameter("txtid");
                String nom = request.getParameter("txtnom");
                String pa = request.getParameter("txtpri_ape");
                String sa = request.getParameter("txtseg_ape");
                String correo = request.getParameter("txtcorreo");
                String cargo = request.getParameter("txtcargo");
                String contra = request.getParameter("txtcontra");
                String dir = request.getParameter("txtdir");
                p.setId(id);
                p.setNom(nom);
                p.setPri_ape(pa);
                p.setSeg_ape(sa);
                p.setCorreo(correo);
                p.setCargo(cargo);
                p.setContra(contra);
                p.setDir(dir);
                dao.agregar(p);
                
                if (p.getCargo().equalsIgnoreCase("1")) {
                    request.getRequestDispatcher("Menuenfermera.jsp").forward(request, response);
                }else{
                    if (p.getCargo().equalsIgnoreCase("2")) {
                        request.getRequestDispatcher("Menufamiliar.jsp").forward(request, response);
                    }else{
                        request.getRequestDispatcher("maestras.jsp").forward(request, response);
                    }
                }
                
                //request.getRequestDispatcher("login.jsp").forward(request, response);
                break;
            case "Editar":
                String ide = request.getParameter("id");
                Persona pe = dao.listarId(ide);
                request.setAttribute("persona", pe);
                request.getRequestDispatcher("Editar.jsp").forward(request, response);
                break;
            case "Actualizar":
                String id1 = request.getParameter("txtid1");
                String nom1 = request.getParameter("txtnom1");
                String ape1 = request.getParameter("txtpri_ape1");
                String ape2 = request.getParameter("txtseg_ape1");
                String correo1 = request.getParameter("txtcorreo1");
                String contra1 = request.getParameter("txtcontra1");
                String dir1 = request.getParameter("txtdir1");
                p.setId(id1);
                p.setNom(nom1);
                p.setPri_ape(ape1);
                p.setSeg_ape(ape2);
                p.setCorreo(correo1);
                p.setContra(contra1);
                p.setDir(dir1);
                dao.actualizar(p);
                request.getRequestDispatcher("ControladorPersona?accion=Listar").forward(request, response);
                break;
            case "Eliminar":
                String id2 = request.getParameter("id");
                dao.eliminar(id2);
                request.getRequestDispatcher("ControladorPersona?accion=Listar").forward(request, response);
                break;
            default:
                throw new AssertionError();

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
