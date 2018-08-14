
package beans;

import clases.Papeleria;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "papeleriaBean")
@RequestScoped
public class papeleriaBean {

     private Papeleria papeleria = new Papeleria();
     private  static List<Papeleria> lstPapelerias = new ArrayList();
    
  public papeleriaBean(){
      
  }
  public Papeleria getPapeleria(){
      return papeleria;
  }
  public void setPapeleria(Papeleria Papeleria){
   this.papeleria = papeleria;   
  }
  public List<Papeleria> getLstPapelerias(){
      return lstPapelerias;
    }
     public void SetLstPapelerias(List<Papeleria> lstpapelerias){
      papeleriaBean.lstPapelerias = lstPapelerias;
    }
  
    public void registrarPapeleria(){
    papeleriaBean.lstPapelerias.add(this.papeleria);
  }
  
    public void eliminarPapeleria(Papeleria per){
        papeleriaBean.lstPapelerias.remove(per);
    }
}