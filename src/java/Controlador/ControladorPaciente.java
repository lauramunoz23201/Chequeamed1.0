package Controlador;

import Modelo.PacienteDAO;
import Modelo.Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorPaciente extends HttpServlet {

    PacienteDAO dao = new PacienteDAO();
    Paciente pa = new Paciente();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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
        String accion1 = request.getParameter("accion1");
        switch (accion1) {
            case "Listar":
                List<Paciente> datos1 = dao.listar();
                request.setAttribute("datos1", datos1);
                request.getRequestDispatcher("Listar_paciente.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("Agregar_paciente.jsp").forward(request, response);
                break;
            case "Registrar":
                String id_p = request.getParameter("txtidp");
                String nom_p = request.getParameter("txtnomp");
                String pa_p = request.getParameter("txtpri_apep");
                String sa_p = request.getParameter("txtseg_apep");
                String sexo = request.getParameter("txtsexop");
                String fecha = request.getParameter("txtfechap");
                pa.setId_p(id_p);
                pa.setNom_p(nom_p);
                pa.setPri_ape_p(pa_p);
                pa.setSeg_ape_p(sa_p);
                pa.setSexo(sexo);
                pa.setFecha(fecha);
                dao.agregar(pa);
                request.getRequestDispatcher("Listar_paciente.jsp").forward(request, response);
                break;
            case "Editar":
                String ide = request.getParameter("id");
                Paciente pac = dao.listarId(ide);
                request.setAttribute("paciente", pac);
                request.getRequestDispatcher("Editar.jsp").forward(request, response);
                break;
            case "Actualizar":
                String id_p1 = request.getParameter("txtid1");
                String nom_p1 = request.getParameter("txtnom1");
                String pa_p1 = request.getParameter("txtpri_ape1");
                String sa_p1 = request.getParameter("txtseg_ape1");
                String sexo1 = request.getParameter("txtsexo1");
                String fecha1 = request.getParameter("txtfecha1");
                pa.setId_p(id_p1);
                pa.setNom_p(nom_p1);
                pa.setPri_ape_p(pa_p1);
                pa.setSeg_ape_p(sa_p1);
                pa.setSexo(sexo1);
                pa.setFecha(fecha1);
                dao.actualizar(pa);
                request.getRequestDispatcher("ControladorPaciente?accion1=Listar").forward(request, response);
                break;
            case "Eliminar":
                String id2 = request.getParameter("id");
                dao.eliminar(id2);
                request.getRequestDispatcher("ControladorPaciente?accion1=Listar").forward(request, response);
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
