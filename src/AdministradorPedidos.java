
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AdministradorPedidos {
    
       public List<Pedido> obtener() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        SQLQuery query = session.createSQLQuery("select * from Pedido").addEntity(Pedido.class);
        List<Pedido> listado = query.list();
        session.close();
        for(Pedido p : listado){
            System.out.println("Pedido: " + p.getNombreCliente() + p.getHoraPedido() + p.getMinutosPedido() + p.getMinutosDemora() + p.getPrecioFinal());
        }
        return listado;
    }
       
        public Pedido guardar (Pedido pedido){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Pedido grabado = (Pedido) session.merge(pedido);
        session.getTransaction().commit();
        session.close();  
        
        return grabado;
    }
        
        public void borrarPedido(Pedido pedido){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(pedido);
        session.getTransaction().commit();
        session.close();
    }
    
}
