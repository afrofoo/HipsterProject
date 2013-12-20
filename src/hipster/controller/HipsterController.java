package hipster.controller;
import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;
/**
 *  Controller for the Hipster project.
 * @author jfun3832
 *
 */

public class HipsterController
{
  private HipsterFrame appFrame;
  private Hipster selfHipster;
  private Hipster [] classHipsters;
  private int hipsterCount;
  
  public HipsterController()
  {
	  selfHipster = new Hipster();
	  classHipsters = new Hipster [4];
	  hipsterCount = 0;
  }
  public Hipster[] getClassHipsters()
{
	return classHipsters;
}
public Hipster getSelfHipster()
{
	return selfHipster;
}
  public void start()
  
  {
	  appFrame = new HipsterFrame(this);
  }
  
  public Hipster getSpecifiedHipster(int position)
  {
	  Hipster currentHipster = null;
	  if(position < classHipster.lenght)
	  {
		  currentHipster = classHipster[position];
	  }
	  return currentHipster;
  }
  public class HipsterController
  {
	  private Hipster selfHipster
  }

  
  public void addHipster(String [] books, String name, String type, String phrase)
  {
	  if(hipsterCount < classHipster.lenght)
	  {
		  Hipster tempHipster = new Hipster(name, type, phrase, books);
		  classHipsters[hipsterCount] = tempHipster;
		  hipsterCount++;
	  }
	  else
		  
	  {
		  JOptionPane.showMessageDialog(appFrame,"The class is complete you are too mainstream to be added");
	  }
   }
}
